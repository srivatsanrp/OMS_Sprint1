package com.cg.oms.service;

import java.util.Date;
import java.util.List;

import com.cg.oms.dao.BillDao;
import com.cg.oms.dao.BillDaoImpl;
import com.cg.oms.entity.BillEntity;
import com.cg.oms.entity.CustomerEntity;
import com.cg.oms.exception.BillNotFoundException;
import com.cg.oms.exception.NullValueException;

public class BillServiceImpl implements BillService {

	BillDao billDao = new BillDaoImpl();
	
	@Override
	public long addBill(BillEntity billEntity) {
		billDao.beginTransaction();
		long id = billDao.addBill(billEntity);
		billDao.commitTransaction();
		return id;
	}

	@Override
	public void updateBill(BillEntity billEntity) {
		billDao.beginTransaction();
		billDao.updateBill(billEntity);
		billDao.commitTransaction();
	}

	@Override
	public void removeBill(BillEntity billEntity) {
		billDao.beginTransaction();
		billDao.removeBill(billEntity);
		billDao.commitTransaction();
		
	}

	@Override
	public List<BillEntity> listByBillNo(Long billno)
			throws BillNotFoundException, NullValueException {
		return billDao.listByBillNo(billno);
	}

	@Override
	public List<BillEntity> listAllBills() throws BillNotFoundException, NullValueException {
		return billDao.listAllBills();	
	}

	@Override
	public List<BillEntity> listByDate(Date tempdt) throws BillNotFoundException, NullValueException {
		return billDao.listByDate(tempdt);
	}

	@Override
	public void printBill(BillEntity billNo) {
	
		
	}

	@Override
	public void emailBill(BillEntity billNo, CustomerEntity cust) {
		
	}

}
