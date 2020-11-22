package com.cg.oms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.cg.oms.entity.AdminEntity;
import com.cg.oms.exception.AdminNotFoundException;

public class AdminDaoImpl implements AdminDao{

	private EntityManager entityManager;
	
	
	public AdminDaoImpl(){
		entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public long createAdmin(AdminEntity adminEntity) {
		// TODO Auto-generated method stub
		
		entityManager.persist(adminEntity);
		return adminEntity.getadminId();
	
	}

	@Override
	public void updateAdmin(AdminEntity adminEntity) {
		// TODO Auto-generated method stub
		entityManager.merge(adminEntity);
		
	}

	@Override
	public void deleteAdmin(AdminEntity adminEntity) {
		// TODO Auto-generated method stub
		entityManager.remove(adminEntity);
		entityManager.getTransaction().commit();  
		
	}

	@Override
	public List<AdminEntity> listAdmin() throws AdminNotFoundException {
		// TODO Auto-generated method stub
		String jpql = "SELECT adminEntity FROM AdminEntity adminEntity";
		TypedQuery<AdminEntity> query = entityManager.createQuery(jpql, AdminEntity.class);
		List<AdminEntity> admin= query.getResultList();
		if (admin== null) {
			throw new AdminNotFoundException("No Admin Found");
		}
		return admin;
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();
		
	}
	
	
	

}
