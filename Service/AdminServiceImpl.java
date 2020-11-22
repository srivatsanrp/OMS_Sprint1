package com.cg.oms.service;

import java.util.List;

import com.cg.oms.dao.AdminDao;
import com.cg.oms.dao.AdminDaoImpl;
import com.cg.oms.entity.AdminEntity;
import com.cg.oms.entity.CustomerEntity;
import com.cg.oms.exception.AdminNotFoundException;

public class AdminServiceImpl implements AdminService {
  
	AdminDao adminDao= new AdminDaoImpl();
	
	@Override
	public long createAdmin(AdminEntity adminEntity) {
		// TODO Auto-generated method stub
		adminDao.beginTransaction();
		long id = adminDao.createAdmin(adminEntity);
		adminDao.commitTransaction();
		return id;
	}

	@Override
	public void updateAdmin(AdminEntity adminEntity) {
		// TODO Auto-generated method stub
		adminDao.beginTransaction();
		adminDao.updateAdmin(adminEntity);
		adminDao.commitTransaction();
		
	}

	@Override
	public void deleteAdmin(AdminEntity adminEntity) {
		// TODO Auto-generated method stub
		adminDao.beginTransaction();
		adminDao.deleteAdmin(adminEntity); 
		adminDao.commitTransaction();

		
	}

	@Override
	public List<CustomerEntity> listAdmin() throws AdminNotFoundException {
		// TODO Auto-generated method stub
		return listAdmin();
	}

}
