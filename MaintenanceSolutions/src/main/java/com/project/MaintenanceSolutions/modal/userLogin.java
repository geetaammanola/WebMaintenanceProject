package com.project.MaintenanceSolutions.modal;

public class userLogin {
	
	private int accountid;
	private String name;
	private String email;
	private String password;
	
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "userLogin [accountid=" + accountid + ", name=" + name + ", email=" + email + ", password=" + password
				+ "]";
	}
	
	
	
	
	

}
