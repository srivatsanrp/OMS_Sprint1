package com.cg.oms.entity;

 

import java.util.Date;

 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * Creating Instance variables for orderEntity class
 */
@Entity
@Table(name ="order")
public class OrderEntity {
    @Id
    @Column(name = "order_id", nullable=false, unique=true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderId;
    @Column(name = "customer_id", nullable=false)
    private long customerId;
    @Column(name = "order_date", nullable=false)
    private Date orderDate;
    @Column(name = "order_price", nullable=false)
    private long orderPrice;
    @Column(name = "customer_address", nullable=false)
    private String customerAddress;

 

    /*
     * Creating getters and setters for above variables
    */

 

    public long getorderId() {
        return orderId;
    }

 

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

 

    public long getcustomerId() {
        return customerId;
    }

 

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }
    
    public Date getOrderDate() {
        return orderDate;
    }

 

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

 

    public long getOrderPrice() {
        return orderPrice;
    }

 

    public void setOrderPrice(long orderPrice) {
        this.orderPrice = orderPrice;
    }

 

    public String getCustomerAddress() {
        return customerAddress;
    }

 

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

 

    
    /*
     * ToString method for above variables
     */

 

    @Override
    public String toString() {
        return "omsEntity [orderId=" + orderId + ", customerId=" + customerId + ", orderDate=" + orderDate
                + ", orderPrice=" + orderPrice + ", customerAddress=" + customerAddress + "]";
    }

 

}