package com.wipro.java.ms.DIP;

public class CreditCard implements BankCard {

	public void doTransaction(int amount) {
		
		System.out.println("Transaction done by CreditCard...");
	}
}
