
public class SavingsAccount extends BankAccount {

	private double interestRate;

	public SavingsAccount() {
		interestRate = 0;
	}
	
	public SavingsAccount(double bal, int i, String o, double ir) {
		super(bal, i, o);
		interestRate = ir;
	}
	
	public void addIntereset() {

	}
	
}
