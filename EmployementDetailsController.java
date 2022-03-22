package com.lti.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.app.pojo.EmployementDetails;
import com.lti.app.service.EmployementDetailsService;

@RestController
@RequestMapping("/rest/api")
@CrossOrigin("http://localhost:4200")
public class EmployementDetailsController 
{
	@Autowired
	EmployementDetailsService edService;
	
	@GetMapping("/employementdetails")
	public List<EmployementDetails> getEmployementDetails()
	{
		return edService.getEmployementDetails();
	}
	@PostMapping("/employementdetails")
	public boolean addEmployementDetails(@RequestBody EmployementDetails employementdetails)
	{
		return edService.addEmployementDetails(employementdetails);
	}

}
