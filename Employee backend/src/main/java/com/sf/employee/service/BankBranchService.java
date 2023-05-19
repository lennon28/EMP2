package com.sf.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.employee.bean.BankBranch;
import com.sf.employee.dao.BankBranchDao;

@Service
public class BankBranchService {
	
	@Autowired
	private BankBranchDao bdao;
	
	public List<BankBranch> getAll(){
		return bdao.getAll();
	}

}
