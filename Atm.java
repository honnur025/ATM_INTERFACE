package com.firstproject.banking;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		BankApp b1=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("ATM INTERFACE\n -----------");
		while(true) {
			System.out.println("1:Create Account\n2:Deposite\n3:Withdraw\n4:Balance\n5:Mini Statement\n6:Exit");
			int c=sc.nextInt();
			switch(c) {
			case 1:
				System.out.println("Enter Account Number, Customer Name, Account Balance");
				int accNum=sc.nextInt();
				String custName=sc.next();
				double accBal=sc.nextDouble();
				b1 = new BankAccount(accNum, custName, accBal);
				System.out.println("Account Is Created");
				break;
			case 2:
				b1.deposite();
				break;
			case 3:
				b1.withdraw();
				break;
			case 4:
				b1.availableBal();
				break;
			case 5:
				b1.ministatement();
				break;
			case 6:
				System.out.println("Thank You");
				System.exit(0);
			default:
				System.out.println("Invalid Choice");

			}
		}
	}
}
