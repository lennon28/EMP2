package com.sf.employee.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Role_Info")

public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int RoleID;
	@Column
	private int SIID;
	@Column
	private String RoleCode;
	public int getRoleID() {
		return RoleID;
	}
	public void setRoleID(int roleID) {
		RoleID = roleID;
	}
	public int getSIID() {
		return SIID;
	}
	public void setSIID(int sIID) {
		SIID = sIID;
	}
	public String getRoleCode() {
		return RoleCode;
	}
	public void setRoleCode(String roleCode) {
		RoleCode = roleCode;
	}
	
	
	

}
