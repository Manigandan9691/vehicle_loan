package com.lit.appl.vehicleloan.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADMINS")
public class Admin {
	
	@Id
	@Column(name="ADMINID")
	private int addminId;
	
	@Column(name="ADMINUSERNAME")
	private String adminUserName;
	
	@Column(name="PASSWORD")
	private String password;

	public Admin(int addminId, String adminUserName, String password) {
		super();
		this.addminId = addminId;
		this.adminUserName = adminUserName;
		this.password = password;
	}

	public Admin() {
		super();
	}

	public int getAddminId() {
		return addminId;
	}

	public void setAddminId(int addminId) {
		this.addminId = addminId;
	}

	public String getAdminUserName() {
		return adminUserName;
	}

	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [addminId=" + addminId + ", adminUserName=" + adminUserName + ", password=" + password + "]";
	}
	
	

}
