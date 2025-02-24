package com.wipro.java.ms.DIP;

public class ShoppingMall {
	
	private BankCard bankCard;
	
	public ShoppingMall(BankCard bankCard) {
		
		this.bankCard = bankCard;
	}

	
	public void doPayment(Object order, int amount) {
		bankCard.doTransaction(amount);
	}
	
	public void main(String[] args) {
		BankCard bankCard = new CreditCard();
		
		ShoppingMall shoppingmall = new ShoppingMall(bankCard);
		
		shoppingmall.doPayment("Some order", 500);
	}
}
