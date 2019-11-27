package com.mappings.pojos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {

	@Id
	@GeneratedValue
	private Integer empId;
	
	private String empName;
	
	@Column(name="salary")
	private String empSal;
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="emp")
	//@JoinColumn(name="employee_id")
	private PanCard pcard;
	
	
	
	
	public PanCard getPcard() {
		return pcard;
	}
	public void setPcard(PanCard pcard) {
		this.pcard = pcard;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpSal() {
		return empSal;
	}
	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}
	
	
	
}
