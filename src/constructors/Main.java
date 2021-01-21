package constructors;

public class Main {

	public static void main(String[] args) {
		// 
		Account bobsAccount = new Account();
		bobsAccount.setNumber("183127232");
		bobsAccount.setBalance(0.00);
		bobsAccount.setCostomerName("Bob Brown");
		bobsAccount.setCostomerPhone("90433");
		bobsAccount.setCostomerEmail("bob@gmail.com");
		
		bobsAccount.withdrawal(100);
		bobsAccount.deposite(100);
		bobsAccount.withdrawal(50);

	}

}
