package com.lti.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.app.pojo.Loan;
import com.lti.app.service.LoanService;

@RestController
@RequestMapping("/rest/api")
@CrossOrigin("http://localhost:4200")
public class LoanController 
{
	@Autowired
	LoanService lService;
	
	@GetMapping("/Loan")
	public List<Loan> getLoan()
	{
		return lService.getLoan();
	}
	@PostMapping("/Loan")
	public boolean addLoan(@RequestBody Loan loan)
	{
		return lService.addLoan(loan);
	}

}
