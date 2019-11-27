package com.mappings.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Orders {
	
	@Id
	@GeneratedValue
	private int orderId;
	private String deliveryLoc;
	
	@Column(name="mobile")
	private String mblNum;
	
	@Version
	@Column(name="version")
	private long version;
	
	
	public long getVersion() {
		return version;
	}
	public void setVersion(long version) {
		this.version = version;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getDeliveryLoc() {
		return deliveryLoc;
	}
	public void setDeliveryLoc(String deliveryLoc) {
		this.deliveryLoc = deliveryLoc;
	}
	public String getMblNum() {
		return mblNum;
	}
	public void setMblNum(String mblNum) {
		this.mblNum = mblNum;
	}
	
	
	
}
