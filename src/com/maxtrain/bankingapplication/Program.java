package com.maxtrain.bankingapplication;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var acct = new Account();
		var save1 = new Savings();
		var save2 = new Savings("new SAVINGS");
		
		try {
			acct.deposit(1001);
			acct.Transfer(1000, save1);
			save1.deposit(1000);
			save1.withdraw(20);
			save1.Transfer(100, save2);
			save1.payInterest(12);
			save2.payInterest(10);

			System.out.println(acct);
			System.out.println(save1);
			System.out.println(save2);
			System.out.printf("%s", acct.toString());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
