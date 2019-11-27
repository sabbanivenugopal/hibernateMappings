package com.mappings.pojos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class University {

	@Id
	@Column(name="uni_id")
	private Integer uniId;
	
	@Column(name="u_name")
	private String uniName;
	
	@Column(name="u_location")
	private String uniLocation;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="uni", fetch=FetchType.LAZY)
	//@JoinColumn(name="university_id")
	private List<College> clgList;
	
	
	public List<College> getClgList() {
		return clgList;
	}
	public void setClgList(List<College> clgList) {
		this.clgList = clgList;
	}
	public Integer getUniId() {
		return uniId;
	}
	public void setUniId(Integer uniId) {
		this.uniId = uniId;
	}
	public String getUniName() {
		return uniName;
	}
	public void setUniName(String uniName) {
		this.uniName = uniName;
	}
	public String getUniLocation() {
		return uniLocation;
	}
	public void setUniLocation(String uniLocation) {
		this.uniLocation = uniLocation;
	}
	
}
