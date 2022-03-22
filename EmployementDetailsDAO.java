package com.lti.app.dao;

import java.util.List;

import com.lti.app.pojo.EmployementDetails;

public interface EmployementDetailsDAO 
{
	public boolean addEmployementDetails(EmployementDetails employementdetails);
	public List<EmployementDetails> getEmployementDetails();

}
