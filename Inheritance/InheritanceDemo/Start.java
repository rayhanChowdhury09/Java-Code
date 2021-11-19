import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		SavingsAccount sa1 = new SavingsAccount();
		sa1.setAccountNumber("111-1111-11");
		sa1.setAccountHolderName("OOP1 G");
		sa1.setBalance(10000.0);
		sa1.setInterestRate(2.7);
		
		SavingsAccount sa2 = new SavingsAccount("111-1111-12", "OOP1 B", 20000.0, 7.5);
		SavingsAccount sa3 = new SavingsAccount("111-1111-13", "OOP1 A", 5000.0, 5.5);
		
		FixedAccount fa1 = new FixedAccount();
		fa1.setAccountNumber("222-1111-11");
		fa1.setAccountHolderName("OOP1 G");
		fa1.setBalance(100000.0);
		fa1.setTenureYear(7);
		
		FixedAccount fa2 = new FixedAccount("222-1111-12", "OOP1 B", 200000.0, 8);
		FixedAccount fa3 = new FixedAccount("222-1111-13", "OOP1 A", 500000.0, 5);
		
		System.out.println("### Savings Accounts ###");
		
		sa1.showDetails();
		sa2.showDetails();
		sa3.showDetails();
		
		System.out.println();
		System.out.println("### Fixed Accounts ###");
		
		fa1.showDetails();
		fa2.showDetails();
		fa3.showDetails();
	}
}