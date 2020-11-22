package com.cg.oms.dao;
import java.util.List;
import com.cg.oms.entity.OrderEntity;
import com.cg.oms.exception.OrderNotFoundException;

public interface OrderDAO {
	 
	long placeOrder(OrderEntity orderEntity);
	void cancelOrder(OrderEntity orderEntity);
    void beginTransaction();
	void commitTransaction();
	List<OrderEntity> viewOrder(long orderId) throws OrderNotFoundException;
	

}
