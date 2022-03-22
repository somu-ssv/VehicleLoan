package com.lti.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employementdetails111")
public class EmployementDetails 
{	
	@Id
	@Column(name="employementid")
	private String employementid;
	@Column(name="typeofemployment")
	private String typeofemployment;
	@Column(name="annualsalary")
	private int annualsalary;
	@Column(name="existingemi")
	private int existingemi;
	
	
	@Override
	public String toString() {
		return "EmployementDetails [employementid=" + employementid + ", typeofemployment=" + typeofemployment
				+ ", annualsalary=" + annualsalary + ", existingemi=" + existingemi + "]";
	}
	public EmployementDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployementDetails(String employementid, String typeofemployment, int annualsalary, int existingemi) {
		super();
		this.employementid = employementid;
		this.typeofemployment = typeofemployment;
		this.annualsalary = annualsalary;
		this.existingemi = existingemi;
	}
	public String getEmployementid() {
		return employementid;
	}
	public void setEmployementid(String employementid) {
		this.employementid = employementid;
	}
	public String getTypeofemployment() {
		return typeofemployment;
	}
	public void setTypeofemployment(String typeofemployment) {
		this.typeofemployment = typeofemployment;
	}
	public int getAnnualsalary() {
		return annualsalary;
	}
	public void setAnnualsalary(int annualsalary) {
		this.annualsalary = annualsalary;
	}
	public int getExistingemi() {
		return existingemi;
	}
	public void setExistingemi(int existingemi) {
		this.existingemi = existingemi;
	}
	
	
	
}
