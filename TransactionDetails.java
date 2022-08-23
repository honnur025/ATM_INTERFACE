package com.firstproject.banking;


import java.util.LinkedList;
import java.util.List;

public class TransactionDetails {
	public static List<Transaction> tranList= new LinkedList<Transaction>();
	
	public static void addTran(Transaction t) {
		tranList.add(t);
	}
	public static void showMiniStmt(int actNumber) {
		System.out.println("\n    MiniStatement");
		System.out.println("    -------------");
		//System.out.println();
		for(Transaction t: tranList) {
			if(t.getActNumber()==actNumber) {
				System.out.println(t.getTranNumber()+"-"+t.getTranType()+"-"+t.getActNumber()+"-"+t.getTranAmount());
				System.out.println(t.getBalanceAfterThisTransaction());
			}
		}
	}
}
