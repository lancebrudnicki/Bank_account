package com.bankaccount;

public class BankAccount {
	double checkingAccount;
	double savingsAccount;
	private static int accountnumber = 0;
	private static double accountTotalMoney = 0;

	public BankAccount() {
			this(0,0);
	}
	
	public BankAccount(double checkingBalanceparam, double savingsBalanceparam) {
		checkingAccount = checkingBalanceparam;
		savingsAccount = savingsBalanceparam;
		accountnumber++;
		accountTotalMoney = checkingAccount + savingsAccount;
	}

	
	// getters
	public double getCheckingBalance() {
		return checkingAccount;
	}

	public double getSavingsBalance() {
		return savingsAccount;
	}

	// deposit
	public void deposit( String accountName, double amount ) {
		if(accountName == "CheckingAccount") {
			checkingAccount += amount;
			accountTotalMoney += amount;
		}
		else if (accountName == "SavingsAccount") {
			savingsAccount += amount;
			accountTotalMoney += amount;
		}
		else if(accountName != "SavingsAccount" || accountName != "CheckingAcoount") {
			System.out.println("Please tell what account you want to add to by inputing SavingsAccount or CheckingAccount");
		}
	}
	
	public void withdraw(String accountName, double amount) {
		if(accountName == "CheckingAccount") {
				if(checkingAccount < amount) {
					System.out.println("Not enough currency in the account, $5 have been taken from your account");
					checkingAccount -= 5;
					accountTotalMoney -= 5;
				}
				else {
					checkingAccount -= amount;
					accountTotalMoney -= amount;
				}
		}
		else if (accountName == "SavingsAccount") {
				if(savingsAccount < amount) {
					System.out.println("Not enough currency in the account, $5 have been taken from your account");
					checkingAccount -= 5;
					accountTotalMoney -= 5;
				}
				else {
					savingsAccount -= amount;
					accountTotalMoney -= amount;
				}
		}
		else if(accountName != "SavingsAccount" || accountName != "CheckingAcoount") {
			System.out.println("Please tell what account you want to add to by inputing SavingsAccount or CheckingAccount");
		}
	}
	
	public void seeTotal() {
		double checking = getCheckingBalance();
		double savings = getSavingsBalance();
		
		System.out.println("Your checking has " + checking + " Your Savings has " + savings + " Your total amount is " + accountTotalMoney );
		
	}










}
