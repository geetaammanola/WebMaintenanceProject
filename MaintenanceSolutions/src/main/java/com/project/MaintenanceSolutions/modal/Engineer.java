package com.project.MaintenanceSolutions.modal;


public class Engineer {
	private int engineerId;
	private String name;
	private String email;
	private int mobileNo;
	private String address;

	public int getEngineerId() {
		return engineerId;
	}

	public void setEngineerId(int engineerId) {
		this.engineerId = engineerId;
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

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Engineer [engineerId=" + engineerId + ", name=" + name + ", email=" + email + ", mobileNo=" + mobileNo
				+ ", address=" + address + "]";
	}

}
