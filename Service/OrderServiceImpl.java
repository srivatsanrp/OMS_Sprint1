package com.cg.oms.service;

import java.util.List;
import com.cg.oms.dao.OrderDAO;
import com.cg.oms.dao.OrderDAOImpl;
import com.cg.oms.entity.OrderEntity;
import com.cg.oms.exception.OrderNotFoundException;

public class OrderServiceImpl implements OrderService {
	  
	OrderDAO orderDAO= new OrderDAOImpl();
	

	@Override
	public long placeOrder(OrderEntity orderEntity) {
		
		orderDAO.beginTransaction();
		long id = orderDAO.placeOrder(orderEntity);
		orderDAO.commitTransaction();
		return id;
	}


		@Override
		public void cancelOrder(OrderEntity orderEntity) {
			orderDAO.beginTransaction();
			orderDAO.cancelOrder(orderEntity);
			orderDAO.commitTransaction();
		
	}

	@Override
	public List<OrderEntity> viewOrder(long orderId) throws OrderNotFoundException {
	return orderDAO.viewOrder(orderId);
	}
}
