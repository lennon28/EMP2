package com.sf.employee.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Bank_Info")
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int BankID;
	@Column
	private String BeneficiaryName;
	@Column
	private String BankBranch;
	@Column
	private String IFSCcode;
	@Column
	private String  NameOfTheBranch;
	@Column
	private String BankAccountNo;
	@Column
	private String BankAmountType;
	public int getBankID() {
		return BankID;
	}
	public void setBankID(int bankID) {
		BankID = bankID;
	}
	public String getBeneficiaryName() {
		return BeneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		BeneficiaryName = beneficiaryName;
	}
	public String getBankBranch() {
		return BankBranch;
	}
	public void setBankBranch(String bankBranch) {
		BankBranch = bankBranch;
	}
	public String getIFSCcode() {
		return IFSCcode;
	}
	public void setIFSCcode(String iFSCcode) {
		IFSCcode = iFSCcode;
	}
	public String getNameOfTheBranch() {
		return NameOfTheBranch;
	}
	public void setNameOfTheBranch(String nameOfTheBranch) {
		NameOfTheBranch = nameOfTheBranch;
	}
	public String getBankAccountNo() {
		return BankAccountNo;
	}
	public void setBankAccountNo(String bankAccountNo) {
		BankAccountNo = bankAccountNo;
	}
	public String getBankAmountType() {
		return BankAmountType;
	}
	public void setBankAmountType(String bankAmountType) {
		BankAmountType = bankAmountType;
	}
	
	

}
