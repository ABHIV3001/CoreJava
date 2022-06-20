package GetSet;

public class Account {
	private String number;
	private String accountType;
	private double balance;
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double d) {
		balance = balance+ d;}
	public void  withdraw(double w) {
		balance= balance-w;}
	public void fundTransfer(double f) {
		balance= balance-f;}
	public void payBill(double p) {
		balance = balance -p;}
	}
	
	
	
