package com.inheritance_interface.bll;

public class TestBankAccount {
	public static void main(String[] args) {
		
		BankAccount acc1 = null;
		//
		System.out.println("1. Salary Account");
		System.out.println("***********************************");
		
		acc1 = new SalaryAccount(20000);//balance set
		
		System.out.println("Balance: " + acc1.getBalance());
		
		acc1.deposit(7000);//depositing amount
		
		System.out.println("After depositing the balance: " + acc1.getBalance());//balance after depositing
		
		if(acc1.withdraw(10000)) {//withdrawing amount
			System.out.println("Withdrawal happened successfully.");
		}
		else {
			System.out.println("Insufficient balance.");
		}
		
		System.out.println("After withdrawing the balance: " + acc1.getBalance());//balance after withdrawal
		
		
		
	
		
		System.out.println("2. Saving Account");
		System.out.println("***********************************");
		
		acc1 = new CurrentAccount(30000);//balance set
		
		
		System.out.println("Balance: " + acc1.getBalance());
		
		acc1.deposit(3000);//depositing amount
		
		System.out.println("After depositing the balance: " + acc1.getBalance());//balance after depositing
		
		if(acc1.withdraw(27000)) { //withdrawing amount
			System.out.println("Withdrawal happened successfully.");
		}
		else {
			System.out.println("Insufficient balance.");
		}
		
		System.out.println("After withdrawing the balance: " + acc1.getBalance());//balance after withdrawal
		
		
		
		
		
		
		System.out.println("3. Business Account");
		System.out.println("***********************************");
		
		acc1 = new BusinessAccount(200000);//set balance
	
		
		System.out.println("Balance: " + acc1.getBalance());
		
		acc1.deposit(5000);//depositing amount
		
		System.out.println("After depositing the balance: " + acc1.getBalance());//balance after depositing
		
		
		if(acc1.withdraw(2000)) { //withdrawing amount
			System.out.println("Withdrawal happened successfully.");
		}
		else {
			System.out.println("Insufficient balance.");
		}
		
		System.out.println("After withdrawing the balance: " + acc1.getBalance());//balance after withdrawal
	}	

}
