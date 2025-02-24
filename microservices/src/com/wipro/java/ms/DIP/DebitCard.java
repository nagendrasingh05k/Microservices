package com.wipro.java.ms.DIP;

public class DebitCard implements BankCard {

	public void doTransaction(int amount) {
		
		System.out.println("Transaction done with debit card...");
	}
}
