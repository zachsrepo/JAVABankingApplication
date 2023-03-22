package com.maxtrain.bankingapplication;

public class Account {
	private int accountId = 0;
	private String description = "";
	private double balance = 0;
	private static int nextId = 1;
	
	public int getAccountId() {
		return accountId;
	}
	private void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getBalance() {
		return balance;
	}
	private void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double Amount)throws Exception {
		checkAmountGTZero(Amount);
		setBalance(getBalance() + Amount);
	}
	public void withdraw(double Amount)throws Exception{
		checkAmountGTZero(Amount);
		checkInsufficientFunds(Amount);
		setBalance(getBalance() - Amount);	
	}
	public void Transfer(double Amount, Account ToAccount)throws Exception{
		withdraw(Amount);
		ToAccount.deposit(Amount);		
	}
	
	private void checkAmountGTZero(double Amount) throws Exception {
		if(Amount <= 0) {
			throw new Exception("Amount must be positive");
		}
	}
	private void checkInsufficientFunds(double Amount) throws Exception {
		if(Amount > getBalance()) {
			throw new Exception("You have insufficient funds");
		}
	}
	
	
	public String toString() {
		return String.format("%d | %-15s | %,7.2f%n", getAccountId(), getDescription(), getBalance() );
	}
	public Account(String description) {
		setAccountId(nextId++);
		setBalance(0);
		setDescription(description);
	}
	public Account() {
		this ("New Account");
	}

}
