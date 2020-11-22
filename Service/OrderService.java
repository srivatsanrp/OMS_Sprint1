package com.cg.oms.service;
import java.util.*;

import com.cg.oms.entity.OrderEntity;
import com.cg.oms.exception.OrderNotFoundException;

public interface OrderService {
	
	  public long placeOrder(OrderEntity orderEntity);
      public void cancelOrder(OrderEntity orderEntity);
      public List<OrderEntity>viewOrder(long orderId) throws OrderNotFoundException;
      
}
