
public class Customer extends Person {
	
	private String customerNumber;
	private Boolean isInMailingList;
	
	public Customer() {
		setCustomerNumber("123456");
		setIsMail(false);
	}
	
	public Customer(String n, String a, String t, String cn, Boolean im) {
		super(n, a, t);
		setCustomerNumber(cn);
		setIsMail(im);
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public Boolean getIsMail() {
		return isInMailingList;
	}

	public void setIsMail(Boolean isMail) {
		this.isInMailingList = isMail;
	}
	
	
}
