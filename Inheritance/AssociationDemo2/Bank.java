import java.lang.*;

public class Bank
{
	private String name;
	private String branchName;
	private SavingsAccount savingsAccounts[] = new SavingsAccount[10];
	private FixedAccount fixedAccounts[] = new FixedAccount[10];
	
	public Bank(){}
	public Bank(String name, String branchName)
	{
		this.name = name;
		this.branchName = branchName;
	}
	
	public void setName(String name){this.name = name;}
	public void setBranchName(String branchName){this.branchName = branchName;}
	
	public String getName(){return name;}
	public String getBranchName(){return branchName;}

	boolean insertSavingsAccount(SavingsAccount sa)
	{
		for(int i=0; i<savingsAccounts.length; i++)
		{
			if(savingsAccounts[i] == null)
			{
				savingsAccounts[i] = sa;
				return true;
			}
		}
		return false;
	}
	
	boolean removeSavingsAccount(SavingsAccount sa)
	{
		for(int i=0; i<savingsAccounts.length; i++)
		{
			if(savingsAccounts[i] == sa)
			{
				savingsAccounts[i] = null;
				return true;
			}
		}
		return false;
	}
	
	SavingsAccount searchSavingsAccount(String accountNumber)
	{
		for(int i=0; i<savingsAccounts.length; i++)
		{
			if(savingsAccounts[i] != null)
			{
				if(savingsAccounts[i].getAccountNumber().equals(accountNumber))
				{
					return savingsAccounts[i];
				}
			}
		}
		return null;
	}
	
	void showAllSavingsAccounts()
	{
		for(int i=0; i<savingsAccounts.length; i++)
		{
			if(savingsAccounts[i] != null)
			{
				savingsAccounts[i].showDetails();
			}
		}
	}
	
	boolean insertFixedAccount(FixedAccount fa)
	{
		for(int i=0; i<fixedAccounts.length; i++)
		{
			if(fixedAccounts[i] == null)
			{
				fixedAccounts[i] = fa;
				return true;
			}
		}
		return false;
	}
	
	boolean removeFixedAccount(FixedAccount fa)
	{
		for(int i=0; i<fixedAccounts.length; i++)
		{
			if(fixedAccounts[i] == fa)
			{
				fixedAccounts[i] = null;
				return true;
			}
		}
		return false;
	}
	
	FixedAccount searchFixedAccount(String accountNumber)
	{
		for(int i=0; i<fixedAccounts.length; i++)
		{
			if(fixedAccounts[i] != null)
			{
				if(fixedAccounts[i].getAccountNumber().equals(accountNumber))
				{
					return fixedAccounts[i];
				}
			}
		}
		return null;
	}
	
	void showAllFixedAccounts()
	{
		for(int i=0; i<fixedAccounts.length; i++)
		{
			if(fixedAccounts[i] != null)
			{
				fixedAccounts[i].showDetails();
			}
		}
	}
		
	public void showDetails()
	{
		System.out.println("Bank Name: " + name);
		System.out.println("Bank Branch: " + branchName);
		System.out.println("//////////////////////////////////");
		System.out.println("### Savings Accounts ###");
		this.showAllSavingsAccounts();
		System.out.println("### Fixed Accounts ###");
		this.showAllFixedAccounts();
		System.out.println("//////////////////////////////////");
	}	
}