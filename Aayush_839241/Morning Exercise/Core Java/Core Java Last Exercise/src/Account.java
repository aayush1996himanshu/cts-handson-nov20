
public class Account {

	private int accountNumber;
	private String accountName;
	private int balance;
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", balance=" + balance + "]";
	}
	public Account(int accountNumber, String accountName, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
	}
	public int getaccountNumber() {
		return accountNumber;
	}
	public void setaccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getaccountName() {
		return accountName;
	}
	public void setaccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getbalance() {
		return balance;
	}
	public void setbalance(int balance) {
		this.balance = balance;
	}

}
