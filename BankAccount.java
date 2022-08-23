package com.firstproject.banking;

import java.util.Random;
import java.util.Scanner;

public class BankAccount implements BankApp {
	Scanner sc=new Scanner(System.in);
	private int actNumber;
	private String custName;
	private double actBalance;
	
	public BankAccount() {
		super();
	}
	public BankAccount(int actNumber, String custName, double actBalance) {
		super();
		this.actNumber = actNumber;
		this.custName = custName;
		this.actBalance = actBalance;
	}
	public int getActNumber() {
		return actNumber;
	}
	public void setActNumber(int actNumber) {
		this.actNumber = actNumber;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getActBalance() {
		return actBalance;
	}
	public void setActBalance(double actBalance) {
		this.actBalance = actBalance;
	}
	@Override
	public void createAccount() {
		System.out.println("Enter Account Number, Customer Name, Account Balance");
		int accNum=sc.nextInt();
		String custName=sc.next();
		double accBal=sc.nextDouble();
		BankApp b = new BankAccount(accNum, custName, accBal);
		System.out.println("Account Is Created");
	}
	@Override
	public void deposite() {
		Random r= new Random();
		System.out.println("Enter Deposite Amount");
		double depositeAmount=sc.nextDouble();
		actBalance += depositeAmount;
		
		Transaction t = new Transaction(r.nextInt(), actNumber, depositeAmount, "Deposite", actBalance);
		
		TransactionDetails.addTran(t);
		System.out.println("deposited Succesfully.....");
	}
	@Override
	public void withdraw() {
		Random r= new Random();
		System.out.println("Enter Withdraw Amount");
		double withdrawAmount=sc.nextDouble();
		if(actBalance < withdrawAmount) {
			try {
				throw new InsufficientBalanceException("Insufficient Balance");
			}catch(InsufficientBalanceException e) {
				System.out.println(e.getMessage()+"\n");
			}
		}
		actBalance -= withdrawAmount;
		Transaction t = new Transaction(r.nextInt(), actNumber, withdrawAmount, "Withdraw", actBalance);
		
		TransactionDetails.addTran(t);
		System.out.println("withdraw Succesfully.....");
	}
	@Override
	public void availableBal() {
		System.out.println("Account Balance :"+getActBalance());
	}
	@Override
	public void ministatement() {
		System.out.println("Enter Account Number");
		int accNum=sc.nextInt();
		TransactionDetails.showMiniStmt(accNum);
		System.out.println();
	}
}
