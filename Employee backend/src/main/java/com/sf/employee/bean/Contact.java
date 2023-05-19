package com.sf.employee.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Contact_Info")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int ContactID;
	@Column
	private String MobileNo;
	@Column
	private String EmailID;
	public int getContactID() {
		return ContactID;
	}
	public void setContactID(int contactID) {
		ContactID = contactID;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	

}
