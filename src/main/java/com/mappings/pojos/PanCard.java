package com.mappings.pojos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PanCard {
	
	@Id
	@Column(name="pan_number")
	private String panNumber;
	
	@Column(name="pan_center")
	private String panCenter;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="employee_id", referencedColumnName="empid")
	private Employee emp;
	
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getPanCenter() {
		return panCenter;
	}
	public void setPanCenter(String panCenter) {
		this.panCenter = panCenter;
	}
	
	
	

}
