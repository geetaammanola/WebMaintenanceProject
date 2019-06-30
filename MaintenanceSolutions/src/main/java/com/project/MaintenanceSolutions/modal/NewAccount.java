package com.project.MaintenanceSolutions.modal;

public class NewAccount {
	
	private String UserName;
	private int mobileNo;
	private String email;
	private String address;
	private String password;
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "NewAccount [UserName=" + UserName + ", mobileNo=" + mobileNo + ", email=" + email + ", address="
				+ address + ", password=" + password + "]";
	}
	
	

}
