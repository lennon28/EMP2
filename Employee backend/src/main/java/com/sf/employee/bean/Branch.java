package com.sf.employee.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Branch_Table")

public class Branch {
	
	@Id
	
	private String BranchCode;
	@Column
	private String BranchName;
	public String getBranchCode() {
		return BranchCode;
	}
	public void setBranchCode(String branchCode) {
		BranchCode = branchCode;
	}
	public String getBranchName() {
		return BranchName;
	}
	public void setBranchName(String branchName) {
		BranchName = branchName;
	}

	
	

}
