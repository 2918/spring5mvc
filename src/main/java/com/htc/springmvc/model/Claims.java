package com.htc.springmvc.model;

import java.util.Date;

public class Claims {

	private int claimId;
	private double claimAmount;
	private Date claimDate;
	
	public Claims(){}

	public Claims(int claimId, double claimAmount, Date issueDate) {
		super();
		this.claimId = claimId;
		this.claimAmount = claimAmount;
		this.claimDate = issueDate;
	} 

	public int getClaimId() {
		return claimId;
	}

	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}

	public double getClaimAmount() {
		return claimAmount;
	}

	public void setClaimAmount(double claimAmount) {
		this.claimAmount = claimAmount;
	}

	public Date getIssueDate() {
		return claimDate;
	}

	public void setIssueDate(Date issueDate) {
		this.claimDate = issueDate;
	}

	@Override
	public String toString() {
		return "Claims [claimId=" + claimId + ", claimAmount=" + claimAmount + ", issueDate=" + claimDate + "]";
	}
	
}
