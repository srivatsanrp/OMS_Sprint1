package com.cg.oms.service;
import java.util.Date;
import java.util.List;

import com.cg.oms.entity.BillEntity;
import com.cg.oms.entity.CustomerEntity;
import com.cg.oms.exception.BillNotFoundException;
import com.cg.oms.exception.NullValueException;
public interface BillService {
	
	public long addBill(BillEntity bill);
	
	public void updateBill(BillEntity bill);
	
	public void removeBill(BillEntity bill);
	
	public List<BillEntity> listByBillNo(Long billno) throws BillNotFoundException, NullValueException;
	
	public List<BillEntity> listAllBills() throws BillNotFoundException, NullValueException;
	
	public List<BillEntity> listByDate(Date tempdt)throws BillNotFoundException, NullValueException;
	
	public void printBill(BillEntity billNo);
	
	public void emailBill(BillEntity billNo, CustomerEntity cust);	
}
