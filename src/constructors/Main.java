package constructors;

public class Main {

	public static void main(String[] args) {
		// 
		Account cmanAccount = new Account("189242", 0.00, "Cman", "cmanmmo18@gmail.com", "090898");
		
		//  Account bobsAccount = new Account();
		
		/** bobsAccount.setNumber("183127232");
		  	bobsAccount.setBalance(0.00);
			bobsAccount.setCostomerName("Bob Brown");
			bobsAccount.setCostomerPhone("90433");
			bobsAccount.setCostomerEmail("bob@gmail.com");
			
			bobsAccount.withdrawal(100);
			bobsAccount.deposite(100);
			bobsAccount.withdrawal(50); */
		
		cmanAccount.setNumber("183127232");
		cmanAccount.setBalance(0.00);
		cmanAccount.setCostomerName("Bob Brown");
		cmanAccount.setCostomerPhone("90433");
		cmanAccount.setCostomerEmail("bob@gmail.com");
		
		cmanAccount.withdrawal(100);
		cmanAccount.deposite(100);
		cmanAccount.withdrawal(50);

	}

}
