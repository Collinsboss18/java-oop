package constructors;

public class Account {
	private String number, costomerName, costomerEmail, costomerPhone;
	private double balance;
	
	public Account () {
		System.out.println("Empty constructor called");
	}
	
	public void deposite(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("Deposit of " + depositAmount + " made. new balance is " + this.balance);
	}
	
	public void withdrawal(double withdrawalAmount) {
		if (this.balance - withdrawalAmount <= 0) 
			System.out.println("Only " + this.balance + " available. Withdrawal not processed.");
		 else 
			this.balance -= withdrawalAmount;
			System.out.println("Withdrawal of " + withdrawalAmount + " proccessed. Remaining balance = " + this.balance);
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getCostomerName() {
		return costomerName;
	}
	public void setCostomerName(String costomerName) {
		this.costomerName = costomerName;
	}
	
	public String getCostomerEmail() {
		return costomerEmail;
	}
	public void setCostomerEmail(String costomerEmail) {
		this.costomerEmail = costomerEmail;
	}
	
	public String getCostomerPhone() {
		return costomerPhone;
	}
	public void setCostomerPhone(String costomerPhone) {
		this.costomerPhone = costomerPhone;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
