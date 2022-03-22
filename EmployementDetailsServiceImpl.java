package com.lti.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.dao.EmployementDetailsDAO;
import com.lti.app.pojo.EmployementDetails;

@Service
@Transactional
public class EmployementDetailsServiceImpl implements EmployementDetailsService
{
	@Autowired
	EmployementDetailsDAO eddao;

	@Override
	public boolean addEmployementDetails(EmployementDetails employementdetails) {
		// TODO Auto-generated method stub
		return eddao.addEmployementDetails(employementdetails);
	}

	@Override
	public List<EmployementDetails> getEmployementDetails() {
		// TODO Auto-generated method stub
		return eddao.getEmployementDetails();
	}

	

	
}
