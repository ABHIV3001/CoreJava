package com.rays.oop;

public class Account {
	private String name;
	private String accountType;
	private double balance;
	
	public void setName(String a) {
	name=a;
		
	}
public String getName() {
	return name;
}
public void setAccounttype(String b) {
	accountType=b;
	
}

public String getAccounttype() {
	return accountType;
}
public void setBalance(double c) {
	balance= c;
}
public double getBalance() {
	return  balance;
}
}
