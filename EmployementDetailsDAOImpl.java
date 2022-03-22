package com.lti.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.EmployementDetails;

@Repository
public class EmployementDetailsDAOImpl implements EmployementDetailsDAO
{
	@Autowired
	EntityManager eMan;

	@Override
	public boolean addEmployementDetails(EmployementDetails employementdetails) {
		eMan.persist(employementdetails);
		return true;
	}

	@Override
	public List<EmployementDetails> getEmployementDetails() {
		// TODO Auto-generated method stub
		return eMan.createQuery("from EmployementDetails ").getResultList();
	}

	

}
