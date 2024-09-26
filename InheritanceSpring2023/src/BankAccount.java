
public class BankAccount {
	
	private double balance;
	private int id;
	private String owner;
	
	public BankAccount() {
		balance = 0;
		id = -1; //impossible number
		owner = "Mystery Person";
	}
	
	public BankAccount(double b, int i, String o) {
		balance = b;
		id = i;
		owner = o;
	}
	
	public void deposit(double amt) {
		balance += amt;
	}
	
	public void withdrawal(double amt) {
		balance -= amt;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getId() {
		return id;
	}
	
	public String getOwner() {
		return owner;
	}
	
	
}