package com.cg.oms.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.cg.oms.entity.BillEntity;
import com.cg.oms.entity.CustomerEntity;
import com.cg.oms.exception.BillNotFoundException;
import com.cg.oms.exception.NullValueException;

public class BillDaoImpl implements BillDao{

	
private EntityManager entityManager;
	

	public BillDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public long addBill(BillEntity billEntity) {
		entityManager.persist(billEntity);
		return billEntity.getBillNo();
		
	}

	@Override
	public void updateBill(BillEntity billEntity) {
		entityManager.merge(billEntity);
	}

	@Override
	public void removeBill(BillEntity billEntity) {
		entityManager.remove(billEntity);
	}

	@Override
	public List<BillEntity> listByBillNo(Long billno) throws BillNotFoundException, NullValueException {
		
		String jpql = "SELECT billEntity FROM BillEntity billEntity where billEntity.billNo=:bno";
		TypedQuery<BillEntity> query = entityManager.createQuery(jpql, BillEntity.class);
		query.setParameter("bno", billno);
		query.setMaxResults(1);
		List<BillEntity> bill = query.getResultList();
		if (bill == null) {
			throw new BillNotFoundException("Bill not found for given BillNo!");
		}
		return bill;
	}

	@Override
	public List<BillEntity> listAllBills() throws BillNotFoundException, NullValueException {
		String jpql = "SELECT billEntity FROM BillEntity billEntity";
		TypedQuery<BillEntity> query = entityManager.createQuery(jpql, BillEntity.class);
		List<BillEntity> bill = query.getResultList();
		if (bill == null) {
			throw new BillNotFoundException("Bill not found!");
		}
		return bill;
	}

	@Override
	public List<BillEntity> listByDate(Date tempdt) throws BillNotFoundException, NullValueException {
		
		String jpql = "SELECT billEntity FROM BillEntity billEntity where billEntity.orderDate=:odt";
		TypedQuery<BillEntity> query = entityManager.createQuery(jpql, BillEntity.class);
		query.setParameter("odt", tempdt);
		List<BillEntity> bill = query.getResultList();
		if (bill == null) {
			throw new BillNotFoundException("Bill not found on Given Date!");
		}
		return bill;
	}

	@Override
	public void printBill(BillEntity billNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emailBill(BillEntity billNo, CustomerEntity cust) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().commit();
	}

}
