package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.Loan;

public interface LoanService 
{
	public boolean addLoan(Loan loan);
	public List<Loan> getLoan();

}
