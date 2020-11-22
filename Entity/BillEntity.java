package com.cg.oms.entity;
import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name="Bill")
public class BillEntity {
	/*
	 * following entities for Class BillEntity
	 */
	@Id
    @Column(name="billno", nullable=false, unique=true)
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long billNo;
	
    @Column(name="o_id", nullable=false, unique = true)
	private Long orderId;
  
    @Column(name="total_price", nullable=false)
	private Float totalPrice;
    
    @Column(name="order_date", nullable=false)
	private Date orderDate;
    
    @Column(name="delivery_date", nullable=false)
	private Date expectedDeliveryDate;

    @Column(name="c_phone", nullable=false)
	private String customerPhoneNo;

    @Column(name="c_bill_addr", nullable=false)
    private String customerBillingAddress;
    

    @Column(name="c_ship_addr", nullable=false)
    private String customerShippingAddress;

    @Column(name="payment_method", nullable=false)
    private String paymentMethod;

	/*
	 * Getters and Setters for BillEntity
	 */

	public Long getBillNo() {
		return billNo;
	}



	public void setBillNo(Long billNo) {
		this.billNo = billNo;
	}



	public Long getOrderId() {
		return orderId;
	}



	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}



	public Float getTotalPrice() {
		return totalPrice;
	}



	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}



	public Date getOrderDate() {
		return orderDate;
	}



	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}



	public Date getExpectedDeliveryDate() {
		return expectedDeliveryDate;
	}



	public void setExpectedDeliveryDate(Date expectedDeliveryDate) {
		this.expectedDeliveryDate = expectedDeliveryDate;
	}



	public String getCustomerPhoneNo() {
		return customerPhoneNo;
	}



	public void setCustomerPhoneNo(String customerPhoneNo) {
		this.customerPhoneNo = customerPhoneNo;
	}



	public String getCustomerBillingAddress() {
		return customerBillingAddress;
	}



	public void setCustomerBillingAddress(String customerBillingAddress) {
		this.customerBillingAddress = customerBillingAddress;
	}



	public String getCustomerShippingAddress() {
		return customerShippingAddress;
	}



	public void setCustomerShippingAddress(String customerShippingAddress) {
		this.customerShippingAddress = customerShippingAddress;
	}



	public String getPaymentMethod() {
		return paymentMethod;
	}



	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

    

	/*
	 * Constructor for BillEntity Class
	 * 
	 */	

	public BillEntity(Long orderId, Float totalPrice, Date orderDate, Date expectedDeliveryDate, String customerPhoneNo,
			String customerBillingAddress, String customerShippingAddress, String paymentMethod) {
		super();
		this.orderId = orderId;
		this.totalPrice = totalPrice;
		this.orderDate = orderDate;
		this.expectedDeliveryDate = expectedDeliveryDate;
		this.customerPhoneNo = customerPhoneNo;
		this.customerBillingAddress = customerBillingAddress;
		this.customerShippingAddress = customerShippingAddress;
		this.paymentMethod = paymentMethod;
	}
    
    

	@Override
	public String toString() {
		return "BillEntity [billNo=" + billNo + ", orderId=" + orderId + ", totalPrice=" + totalPrice + ", orderDate="
				+ orderDate + ", expectedDeliveryDate=" + expectedDeliveryDate + ", Phone=" + customerPhoneNo
				+ ", customerBillingAddress=" + customerBillingAddress + ", customerShippingAddress="
				+ customerShippingAddress + "]";
	}


	
	
}
