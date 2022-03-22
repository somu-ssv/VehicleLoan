package com.lti.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.dao.LoanDAO;
import com.lti.app.pojo.Loan;

@Service
@Transactional
public class LoanServiceImpl implements LoanService
{
	@Autowired
	LoanDAO ldao;

	@Override
	public boolean addLoan(Loan loan) {
		// TODO Auto-generated method stub
		return ldao.addLoan(loan);
	}

	@Override
	public List<Loan> getLoan() {
		// TODO Auto-generated method stub
		return ldao.getLoans();
	}
	
	
}
