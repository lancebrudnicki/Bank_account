package com.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount Tim = new BankAccount(1000,1000);
		Tim.deposit("CheckingAccount", 1000);
		Tim.withdraw("checkingAccount",10000);
		Tim.seeTotal();
	}

}
