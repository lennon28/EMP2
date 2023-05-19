package com.sf.employee.bean;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_Table")
public class Emp {
	@ManyToOne
	@JoinColumn(name="Branch_ID")
	private Branch branch;
	@Id
	private String EmpCode;
	private String EmpName;
	private Date StartDate;
	private Date EndDate;
	private Boolean Status;
	
	@OneToOne
	@JoinColumn(name="Address_Id")
	private Address address;
	
	@OneToOne
	@JoinColumn(name="Contact_Id")
	private Contact contact;
	
	@OneToOne
	@JoinColumn(name="Bank_Id")
	private Bank bank;
	
	@OneToOne
	@JoinColumn(name="Role_Id")
	private Role role;
	
	
	@OneToOne
	@JoinColumn(name="Mobile_Id")
	private Mobile mobile;


	public Boolean getStatus() {
		return Status;
	}


	public void setStatus(Boolean status) {
		Status = status;
	}


	public Branch getBranch() {
		return branch;
	}


	public void setBranch(Branch branch) {
		this.branch = branch;
	}


	public String getEmpCode() {
		return EmpCode;
	}


	public void setEmpCode(String empCode) {
		EmpCode = empCode;
	}


	public String getEmpName() {
		return EmpName;
	}


	public void setEmpName(String empName) {
		EmpName = empName;
	}


	public Date getStartDate() {
		return StartDate;
	}


	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}


	public Date getEndDate() {
		return EndDate;
	}


	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Contact getContact() {
		return contact;
	}


	public void setContact(Contact contact) {
		this.contact = contact;
	}


	public Bank getBank() {
		return bank;
	}


	public void setBank(Bank bank) {
		this.bank = bank;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	public Mobile getMobile() {
		return mobile;
	}


	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	
	
	
	
	
	

}
