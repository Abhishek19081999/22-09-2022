package com.inheritance_interface.bll;

public class SalaryAccount implements BankAccount{
private double balance;
	
	public SalaryAccount() {
		super();
		
	}
 //set balance
	public SalaryAccount(double balance) {
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
	public boolean withdraw(double amount) {//withdrawal
		if(balance >= amount) {//minimum balance=0	
			balance -= amount;
			return true;
		}
		
		return false;
	}

}
