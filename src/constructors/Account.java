package constructors;

public class Account {
	private String number, costomerName, costomerEmail, costomerPhone;
	private double balance;
	
	public Account (String number, double balance, String costomerName, String costomerEmail, String costomerPhone) {
		System.out.println("Constructor with parameter called");
		/** It's better not to call SETTERS or other METHOD in constructor.
		 *  They are better access directly
		 *  @reason
		 *  1. This is the point where the object is being created
		 *  2. Some aspect of the initialization may have not been completed
		 */
		this.number = number;
		this.balance = balance;
		this.costomerName = costomerName;
		this.costomerEmail = costomerEmail;
		this.costomerPhone = costomerPhone;
	}
	
	public Account(String costomerName, String costomerEmail, String costomerPhone) {
		this("83492", 12.23, "Default", "Default", "Default");
		System.out.println("Constructor with require name, email and phone called");
	}
	
	public Account () {
		this("83492", 12.23, "Default", "Default", "Default");
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
