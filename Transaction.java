package com.firstproject.banking;

public class Transaction {
	private int tranNumber;
	private int actNumber;
	private double tranAmount;
	private String tranType;
	private double balanceAfterThisTransaction;
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transaction(int tranNumber, int actNumber, double tranAmount, String tranType,
			double balanceAfterThisTransaction) {
		super();
		this.tranNumber = tranNumber;
		this.actNumber = actNumber;
		this.tranAmount = tranAmount;
		this.tranType = tranType;
		this.balanceAfterThisTransaction = balanceAfterThisTransaction;
	}
	public int getTranNumber() {
		return tranNumber;
	}
	public void setTranNumber(int tranNumber) {
		this.tranNumber = tranNumber;
	}
	public int getActNumber() {
		return actNumber;
	}
	public void setActNumber(int actNumber) {
		this.actNumber = actNumber;
	}
	public double getTranAmount() {
		return tranAmount;
	}
	public void setTranAmount(double tranAmount) {
		this.tranAmount = tranAmount;
	}
	public String getTranType() {
		return tranType;
	}
	public void setTranType(String tranType) {
		this.tranType = tranType;
	}
	public double getBalanceAfterThisTransaction() {
		return balanceAfterThisTransaction;
	}
	public void setBalanceAfterThisTransaction(double balanceAfterThisTransaction) {
		this.balanceAfterThisTransaction = balanceAfterThisTransaction;
	}
	
	
}
