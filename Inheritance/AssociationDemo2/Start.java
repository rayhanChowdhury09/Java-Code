import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		SavingsAccount sa1 = new SavingsAccount("101.101.111111", "OOP1 G", 20000.0, 4.6);
		SavingsAccount sa2 = new SavingsAccount("101.101.111112", "OOP1 B", 25000.0, 3.6);
		SavingsAccount sa3 = new SavingsAccount("101.101.111113", "OOP1 A", 15000.0, 4.2);
		
		FixedAccount fa1 = new FixedAccount("201.201.111111", "OOP1 G", 2000000.0, 10);
		FixedAccount fa2 = new FixedAccount("201.201.111112", "OOP1 B", 2100000.0, 8);
		FixedAccount fa3 = new FixedAccount("201.201.111113", "OOP1 A", 2000500.0, 5);
		
		Bank b = new Bank("BRAC", "Banani");
		
		b.showDetails();
		
		System.out.println("-------------------------------------------------------");
		if(b.insertSavingsAccount(sa1)){System.out.println("Account Insertted");}
		else{System.out.println("Can NOT be Inserted");}
		
		if(b.insertSavingsAccount(sa2) ){System.out.println("Account Insertted");}
		else{System.out.println("Can NOT be Inserted");}
		
		if(b.insertSavingsAccount(sa3)){System.out.println("Account Insertted");}
		else{System.out.println("Can NOT be Inserted");}
		System.out.println("-------------------------------------------------------");
		
		b.showDetails();
		
		System.out.println("-------------------------------------------------------");
		if(b.insertFixedAccount(fa1)){System.out.println("Account Insertted");}
		else{System.out.println("Can NOT be Inserted");}
		
		if(b.insertFixedAccount(fa2) ){System.out.println("Account Insertted");}
		else{System.out.println("Can NOT be Inserted");}
		
		if(b.insertFixedAccount(fa3)){System.out.println("Account Insertted");}
		else{System.out.println("Can NOT be Inserted");}
		System.out.println("-------------------------------------------------------");
		
		b.showDetails();
		
		System.out.println("-------------------------------------------------------");
		if(b.removeSavingsAccount(sa1)){System.out.println("Account Removed");}
		else{System.out.println("Can NOT be Removed");}
		
		if(b.removeFixedAccount(fa3) ){System.out.println("Account Removed");}
		else{System.out.println("Can NOT be Removed");}
		System.out.println("-------------------------------------------------------");
		
		b.showDetails();
		
		System.out.println("-------------------------------------------------------");
		SavingsAccount sa = b.searchSavingsAccount("101.101.111112");
		
		if(sa != null)
		{
			System.out.println("Object Found....");
			sa.showDetails();
		}
		else
		{
			System.out.println("Object NOT Found....");
		}
		
		FixedAccount fa = b.searchFixedAccount("201.101.111113");
		
		if(fa != null)
		{
			System.out.println("Object Found....");
			fa.showDetails();
		}
		else
		{
			System.out.println("Object NOT Found....");
		}
		System.out.println("-------------------------------------------------------");

	}
}