package com.project.MaintenanceSolutions.modal;

import java.util.Date;

public class ComplainResolve {

	private int resolveid;
	private Date date;
	private String engineerName;
	private int clientMobileNo;
	private String solution;
	private String part;
	private int charges;

	public int getResolveid() {
		return resolveid;
	}

	public void setResolveid(int resolveid) {
		this.resolveid = resolveid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getEngineerName() {
		return engineerName;
	}

	public void setEngineerName(String engineerName) {
		this.engineerName = engineerName;
	}

	public int getClientMobileNo() {
		return clientMobileNo;
	}

	public void setClientMobileNo(int clientMobileNo) {
		this.clientMobileNo = clientMobileNo;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public int getCharges() {
		return charges;
	}

	public void setCharges(int charges) {
		this.charges = charges;
	}

	@Override
	public String toString() {
		return "ComplainResolve [resolveid=" + resolveid + ", date=" + date + ", engineerName=" + engineerName
				+ ", clientMobileNo=" + clientMobileNo + ", solution=" + solution + ", part=" + part + ", charges="
				+ charges + "]";
	}

}
