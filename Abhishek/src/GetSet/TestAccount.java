package GetSet;

public class TestAccount {
	public static void main(String[] args) {
		
	Account a=new  Account();
	
	a.setNumber("144801503894");
	a.setAccountType("Saving");
	a.setBalance(10000);
	a.deposit(3000);
	a.withdraw(10000);
	a.fundTransfer(1000);
	a.payBill(199);
	
	System.out.println("Account No."+a.getNumber());
	System.out.println("Account Type"+ a.getAccountType());
	System.out.println("My total balance"+ a.getBalance());
	
	}

}
