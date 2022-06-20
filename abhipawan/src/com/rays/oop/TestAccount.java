package com.rays.oop;

public class TestAccount {
	public static void main(String[] args) {
		
	 
	Account a = new Account();
	
	a.setName("SBI");
	a.setAccounttype("SAVING");
	a.setBalance(500000);
	System.out.println("Acc"
			+ ""
			+ "ount name is "+a.getName());
	System.out.println("Account type is  "+a.getAccounttype());
	System.out.println("Account balance is "
			+ ""+a.getBalance());
}
		
	
}
