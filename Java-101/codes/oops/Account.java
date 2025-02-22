package co.edureka.java.oops;

public class Account {
	long acno;
	String name;
	float bal;
	
	public Account(long acno, String name, float bal) {
		super();
		this.acno = acno;
		this.name = name;
		this.bal = bal;
	}

	void deposit(float amt) {
		this.bal += amt;
		System.out.println("Rs."+amt+" Credited | Balance: "+this.bal);
	}
	
	void withdraw(float amt) {
		if(this.bal >= amt) {
			this.bal -= amt;
			System.out.println("Rs."+amt+" Debited | Balance: " + this.bal);
		}else {
			System.err.println("ERROR: INSUFFICIENT BALANCE!!");
		}
	}
	
	void getBalance() {
		System.out.println("A/C NO: "+this.acno+" | NAME: "+this.name + " | BALANCE: "+ this.bal);
	}
}
