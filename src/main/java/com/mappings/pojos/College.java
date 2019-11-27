package com.mappings.pojos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class College {

	@Id
	@GeneratedValue
	@Column(name="clg_id")
	private Integer clgId;
	
	@Column(name="clg_name")
	private String clgName;
	
	@Column(name="clg_loc")
	private String clgLocation;
	
	@Column(name="established")
	private String established;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="university_id")
	private University uni;
	
	
	
	public University getUni() {
		return uni;
	}
	public void setUni(University uni) {
		this.uni = uni;
	}
	public Integer getClgId() {
		return clgId;
	}
	public void setClgId(Integer clgId) {
		this.clgId = clgId;
	}
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	public String getClgLocation() {
		return clgLocation;
	}
	public void setClgLocation(String clgLocation) {
		this.clgLocation = clgLocation;
	}
	public String getEstablished() {
		return established;
	}
	public void setEstablished(String established) {
		this.established = established;
	}
	
	
}
