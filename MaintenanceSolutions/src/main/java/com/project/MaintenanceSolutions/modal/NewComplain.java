package com.project.MaintenanceSolutions.modal;

import java.util.Date;

public class NewComplain {
	private int complainId;
	private String complainer;
	private String fridgeType;
	private String issue;
	private String email;
	private int mobileNo;
	private String address;
	private Date appDate;
	private String appSlot;

	public int getComplainId() {
		return complainId;
	}

	public void setComplainId(int complainId) {
		this.complainId = complainId;
	}

	public String getComplainer() {
		return complainer;
	}

	public void setComplainer(String complainer) {
		this.complainer = complainer;
	}

	public String getFridgeType() {
		return fridgeType;
	}

	public void setFridgeType(String fridgeType) {
		this.fridgeType = fridgeType;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
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

	public Date getAppDate() {
		return appDate;
	}

	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}

	public String getAppSlot() {
		return appSlot;
	}

	public void setAppSlot(String appSlot) {
		this.appSlot = appSlot;
	}

	@Override
	public String toString() {
		return "NewComplain [complainId=" + complainId + ", complainer=" + complainer + ", fridgeType=" + fridgeType
				+ ", issue=" + issue + ", email=" + email + ", mobileNo=" + mobileNo + ", address=" + address
				+ ", appDate=" + appDate + ", appSlot=" + appSlot + "]";
	}

}
