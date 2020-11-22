package com.cg.oms.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.cg.oms.entity.OrderEntity;
import com.cg.oms.exception.OrderNotFoundException;


public class OrderDAOImpl implements OrderDAO{

	private EntityManager entityManager;
	
	
	public OrderDAOImpl(){
		entityManager = JPAUtil.getEntityManager();
	}


	@Override
	public long placeOrder(OrderEntity orderEntity) {
		entityManager.persist(orderEntity);
		return orderEntity.getorderId();
	}


	@Override
	public void cancelOrder(OrderEntity orderEntity) {
			entityManager.remove(orderEntity);
			entityManager.getTransaction().commit();
			
			
	}


	@Override
	public List<OrderEntity> viewOrder(long orderId) throws OrderNotFoundException{
			String jpql  = "SELECT orderEntity FROM OrderEntity orderEntity where orderEntity.orderId=:oid";
			TypedQuery<OrderEntity> query = entityManager.createQuery(jpql, OrderEntity.class);
			query.setParameter("oid", orderId);
	        query.setMaxResults(1);
			List<OrderEntity> Order= query.getResultList();
		    return Order;
		}
				
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}


}
