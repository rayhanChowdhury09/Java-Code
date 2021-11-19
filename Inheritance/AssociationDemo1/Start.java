import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Account a1 = new Account(111111, "OOP1 G", 50000.0);
		
		Bank b1 = new Bank("Brac Bank Ltd.", "Bashundhara R/A", a1);
		
		b1.showDetails();
		
		Account a2 = new Account();
		
		a2.setAccountNumber(22222222);
		a2.setAccountHolderName("DS F");
		a2.setBalance(50000.0);
		
		Bank b2 = new Bank();
		
		b2.setName("Brac Bank Ltd.");
		b2.setBranchName("Banani");
		b2.setAccount(a2);
		
		b2.showDetails();
	}
}