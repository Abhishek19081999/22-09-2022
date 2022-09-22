package com.inheritance_interface.bll;

public class BusinessAccount implements BankAccount{
private double balance;
	
	public BusinessAccount() {
		super();
		
	}
	
	public BusinessAccount(double balance) {//set balance
		super();
		this.balance = balance;
	}


	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void deposit(double amount) {//deposit
			balance += amount;
		
		
	}

	@Override
	public boolean withdraw(double amount) { //withdrawal
		if((balance + 25000) >= amount) {//minimum balance 25000
			balance -= amount;
			return true;
		}
		
		return false;
	}

}
