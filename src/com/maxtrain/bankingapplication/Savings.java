package com.maxtrain.bankingapplication;

public class Savings extends Account{
	public double interestRate = 0.12;
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double payInterest(int months)throws Exception {
		var interest = calculateInterest(months);
		deposit(interest);
		return interest;	
	}
	private double calculateInterest(int months) {
		if(months < 1) {
			return 0;
		}
		return getBalance() * (getInterestRate() /12) * months;
	}
	public Savings() {super();}
	public Savings(String description) {super(description);}
	
}
