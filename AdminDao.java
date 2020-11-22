package com.cg.oms.dao;

import com.cg.oms.exception.AdminNotFoundException;

import java.util.List;
import com.cg.oms.entity.AdminEntity;



public interface AdminDao {
	
	public long createAdmin(AdminEntity AdminEntity);
    public void updateAdmin(AdminEntity adminEntity);
    public void deleteAdmin(AdminEntity adminEntity);
    public List<AdminEntity> listAdmin() throws AdminNotFoundException;
    public void beginTransaction();
    public void commitTransaction();

}
