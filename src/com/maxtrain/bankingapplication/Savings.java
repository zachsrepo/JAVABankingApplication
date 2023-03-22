package com.maxtrain.bankingapplication;

public class Savings extends Account{
	public double interestRate = 0.12;
	public double payInterest(int months)throws Exception {
		var interest = getBalance() * (interestRate / 12) * months;
		deposit(interest);
		return interest;
		
		
		
	}
	public Savings() {super();}
	public Savings(String description) {super(description);}
	
}
