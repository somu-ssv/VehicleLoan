package com.lti.app.dao;

import java.util.List;

import com.lti.app.pojo.Loan;

public interface LoanDAO 
{
	public boolean addLoan(Loan loan);
	public List<Loan> getLoans();

}
