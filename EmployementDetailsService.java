package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.EmployementDetails;

public interface EmployementDetailsService 
{
	public boolean addEmployementDetails(EmployementDetails employementdetails);
	public List<EmployementDetails> getEmployementDetails();

}
