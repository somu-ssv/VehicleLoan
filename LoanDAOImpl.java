package com.lti.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.Loan;

@Repository
public class LoanDAOImpl implements LoanDAO
{
	@Autowired
	EntityManager eMan;

	@Override
	public boolean addLoan(Loan loan) {
		eMan.persist(loan);
		return true;
	}

	@Override
	public List<Loan> getLoans() {
		return eMan.createQuery("from Loan").getResultList();
	}

	

}
