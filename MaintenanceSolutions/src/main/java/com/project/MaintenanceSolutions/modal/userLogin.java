package com.project.MaintenanceSolutions.modal;

public class userLogin {
	
	private int userid;
	private String role;
	private String fname;
	private String lname;
	private String email;
	private String password;
	
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
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
		return "userLogin [userid=" + userid + ", role=" + role + ", fname=" + fname + ", lname=" + lname + ", email="
				+ email + ", password=" + password + "]";
	}
	
	
	
	
	
	
	

}
