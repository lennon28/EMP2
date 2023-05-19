package com.sf.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sf.employee.bean.BankBranch;
import com.sf.employee.service.BankBranchService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/Bcontroller")
public class BankBranchController {
	
	@Autowired
	private BankBranchService Bserv;
	
	
	@GetMapping("/get")
	public List<BankBranch> getAll(){
		return Bserv.getAll();
	}

}
