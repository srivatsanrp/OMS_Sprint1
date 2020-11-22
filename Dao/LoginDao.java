package com.cg.oms.dao;

import com.cg.oms.entity.LoginEntity;

public interface LoginDao {
	
	
    public long createLogin(LoginEntity loginEntity);
    public void updateLogin(LoginEntity loginEntity);
    public void deleteLogin(LoginEntity loginEntity);
	public boolean logIn(String userName, String password);
	public void signUp();
	public boolean forgotPassword(String userName,String newPwd);
	public boolean changePassword(String userName,String oldPwd,String newPwd);
	public void beginTransaction();
	public void commitTransaction();
	

}
