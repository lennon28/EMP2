package com.sf.employee.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Mobile_Registration")
public class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int MobileID;
	@Column
	private String IMEIno1;
	@Column
	private String IMEIno2;
	public int getMobileID() {
		return MobileID;
	}
	public void setMobileID(int mobileID) {
		MobileID = mobileID;
	}
	public String getIMEIno1() {
		return IMEIno1;
	}
	public void setIMEIno1(String iMEIno1) {
		IMEIno1 = iMEIno1;
	}
	public String getIMEIno2() {
		return IMEIno2;
	}
	public void setIMEIno2(String iMEIno2) {
		IMEIno2 = iMEIno2;
	}
	
	

}
