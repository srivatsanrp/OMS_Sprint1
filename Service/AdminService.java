package com.cg.oms.service;
import com.cg.oms.exception.AdminNotFoundException;
import java.util.*;
import com.cg.oms.entity.CustomerEntity;

import com.cg.oms.entity.AdminEntity;


public interface AdminService {
	
    public long createAdmin(AdminEntity AdminEntity);
    public void updateAdmin(AdminEntity adminEntity);
    public void deleteAdmin(AdminEntity adminEntity);
    public List<CustomerEntity> listAdmin() throws AdminNotFoundException;
	
}
