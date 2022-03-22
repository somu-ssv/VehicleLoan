package com.lti.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loandetails11")
public class Loan 
{	
	@Id
	@Column(name="loanid")
	private String loanid;
	@Column(name="loanamount")
	private String loanamount;
	@Column(name="loantenure")
	private String loantenure;
	@Column(name="rateofinterest")
	private String rateofinterest;
	
	
	@Override
	public String toString() {
		return "Loan [loanid=" + loanid + ", loanamount=" + loanamount + ", loantenure=" + loantenure
				+ ", rateofinterest=" + rateofinterest + "]";
	}
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Loan(String loanid, String loanamount, String loantenure, String rateofinterest) {
		super();
		this.loanid = loanid;
		this.loanamount = loanamount;
		this.loantenure = loantenure;
		this.rateofinterest = rateofinterest;
	}
	public String getLoanid() {
		return loanid;
	}
	public void setLoanid(String loanid) {
		this.loanid = loanid;
	}
	public String getLoanamount() {
		return loanamount;
	}
	public void setLoanamount(String loanamount) {
		this.loanamount = loanamount;
	}
	public String getLoantenure() {
		return loantenure;
	}
	public void setLoantenure(String loantenure) {
		this.loantenure = loantenure;
	}
	public String getRateofinterest() {
		return rateofinterest;
	}
	public void setRateofinterest(String rateofinterest) {
		this.rateofinterest = rateofinterest;
	}
	
	
	
	
	
	
	
	
	
}
