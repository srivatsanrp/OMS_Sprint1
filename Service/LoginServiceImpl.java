package com.cg.oms.service;
import com.cg.oms.dao.LoginDao;
import com.cg.oms.dao.LoginDaoImpl;
import com.cg.oms.entity.LoginEntity;

public class LoginServiceImpl implements LoginService {

	LoginDao loginDao= new LoginDaoImpl();
	
	@Override
	public long createLogin(LoginEntity loginEntity) {
		// TODO Auto-generated method stub
		loginDao.beginTransaction();
		long id = loginDao.createLogin(loginEntity);
		loginDao.commitTransaction();
		return id;
	}

	@Override
	public void updateLogin(LoginEntity loginEntity) {
		// TODO Auto-generated method stub
		loginDao.beginTransaction();
		loginDao.updateLogin(loginEntity); 
		loginDao.commitTransaction();

	}

	@Override
	public void deleteLogin(LoginEntity loginEntity) {
		// TODO Auto-generated method stub
		loginDao.beginTransaction();
		loginDao.deleteLogin(loginEntity); 
		loginDao.commitTransaction();

		
	}

	@Override
	public boolean logIn(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void signUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean forgotPassword(String username, String newpwd) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changePassword(String username, String oldpwd, String newpwd) {
		// TODO Auto-generated method stub
		return false;
	}

}
