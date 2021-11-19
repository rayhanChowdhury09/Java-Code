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
		
		SavingsAccount sa4 = new SavingsAccount("101.101.111114", "OOP1 B", 25000.0, 3.6);
		SavingsAccount sa5 = new SavingsAccount("101.101.111115", "OOP1 A", 15000.0, 4.2);
		
		FixedAccount fa4 = new FixedAccount("201.201.111114", "OOP1 G", 2000000.0, 10);
		FixedAccount fa5 = new FixedAccount("201.201.111115", "OOP1 B", 2100000.0, 8);
		
		SavingsAccount sa6 = new SavingsAccount("101.101.111116", "OOP1 Z", 15000.0, 4.2);
		FixedAccount fa6 = new FixedAccount("201.201.111116", "OOP1 Y", 2000000.0, 10);
		
		Bank b = new Bank("BRAC", "Banani");
		
		b.showDetails();
		
		System.out.println("-------------------------------------------------------");
		if(b.insertAccount(sa1))
		{
			System.out.println("The Account "+ sa1.getAccountNumber() + " has been Inserted");
		}
		else{System.out.println("The Account "+ sa1.getAccountNumber() + " could NOT be Inserted");}
		
		if(b.insertAccount(sa2) ){System.out.println("Account Inserted");}
		else{System.out.println("Can NOT be Inserted");}
		
		if(b.insertAccount(sa3)){System.out.println("Account Inserted");}
		else{System.out.println("Can NOT be Inserted");}
		
		if(b.insertAccount(fa1)){System.out.println("Account Inserted");}
		else{System.out.println("Can NOT be Inserted");}
		
		if(b.insertAccount(fa2) ){System.out.println("Account Inserted");}
		else{System.out.println("Can NOT be Inserted");}
		
		if(b.insertAccount(fa3)){System.out.println("Account Inserted");}
		else{System.out.println("Can NOT be Inserted");}
		
		if(b.insertAccount(sa4)){System.out.println("Account Inserted");}
		else{System.out.println("Can NOT be Inserted");}
		
		if(b.insertAccount(sa5)){System.out.println("Account Inserted");}
		else{System.out.println("Can NOT be Inserted");}
		
		if(b.insertAccount(fa4)){System.out.println("Account Inserted");}
		else{System.out.println("Can NOT be Inserted");}
		
		if(b.insertAccount(fa5)){System.out.println("Account Inserted");}
		else{System.out.println("Can NOT be Inserted");}
		
		if(b.insertAccount(fa6))
		{
			System.out.println("The Account "+ fa6.getAccountNumber() + " has been Inserted");
		}
		else{System.out.println("The Account "+ fa6.getAccountNumber() + " could NOT be Inserted");}
		
		System.out.println("-------------------------------------------------------");
		
		b.showDetails();
		
		System.out.println("-------------------------------------------------------");
		if(b.removeAccount(sa1))
		{
			System.out.println("The Account "+ sa1.getAccountNumber() + " has been Removed");
		}
		else{System.out.println("The Account "+ sa1.getAccountNumber() + " could NOT be Removed");}
		
		if(b.removeAccount(fa3) ){System.out.println("Account Removed");}
		else{System.out.println("Can NOT be Removed");}
		
		if(b.removeAccount(sa6))
		{
			System.out.println("The Account "+ sa6.getAccountNumber() + " has been Removed");
		}
		else{System.out.println("The Account "+ sa6.getAccountNumber() + " could NOT be Removed");}
		System.out.println("-------------------------------------------------------");
		
		b.showDetails();
		
		System.out.println("-------------------------------------------------------");
		Account acc1 = b.searchAccount("101.101.111112");
		
		if(acc1 != null)
		{
			System.out.println("Object Found....");
			acc1.showDetails();
		}
		else
		{
			System.out.println("Object NOT Found....");
		}
		
		Account acc2 = b.searchAccount("201.101.111113");
		
		if(acc2 != null)
		{
			System.out.println("Object Found....");
			acc2.showDetails();
		}
		else
		{
			System.out.println("Object NOT Found....");
		}
		System.out.println("-------------------------------------------------------");
		
		//Account a1 = new Account();
	}
}