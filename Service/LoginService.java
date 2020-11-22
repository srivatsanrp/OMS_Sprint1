package com.cg.oms.service;

import com.cg.oms.entity.LoginEntity;

public interface LoginService {
	
	
    public long createLogin(LoginEntity loginEntity);
    public void updateLogin(LoginEntity loginEntity);
    public void deleteLogin(LoginEntity loginEntity);
	public boolean logIn(String username, String password);
	public void signUp();
	public boolean forgotPassword(String username,String newpwd);
	public boolean changePassword(String username,String oldpwd,String newpwd);
	
}
