package com.cg.oms.dao;

import javax.persistence.EntityManager;

import com.cg.oms.entity.LoginEntity;

public class LoginDaoImpl implements LoginDao {

	private EntityManager entityManager;
	
	public LoginDaoImpl(){
		entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public long createLogin(LoginEntity loginEntity) {
		// TODO Auto-generated method stub
		entityManager.persist(loginEntity);
		return loginEntity.getUserId();
	}

	@Override
	public void updateLogin(LoginEntity loginEntity) {
		// TODO Auto-generated method stub
		entityManager.merge(loginEntity);
		
	}

	@Override
	public void deleteLogin(LoginEntity loginEntity) {
		// TODO Auto-generated method stub
		entityManager.remove(loginEntity);
		entityManager.getTransaction().commit();  
		
		
	}

	@Override
	public boolean logIn(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void signUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean forgotPassword(String userName, String newPwd) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changePassword(String userName, String oldPwd, String newPwd) {
		// TODO Auto-generated method stub
		return false;
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
