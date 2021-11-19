import java.lang.*;

public class Bank
{
	private String name;
	private String branchName;
	private Account accounts[] = new Account [10];
	
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

	public boolean insertAccount(Account a)
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == null)
			{
				accounts[i] = a;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeAccount(Account a)
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == a)
			{
				accounts[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Account searchAccount(String accountNumber)
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				if(accounts[i].getAccountNumber().equals(accountNumber))
				{
					return accounts[i];
				}
			}
		}
		return null;
	}
	
	public void showAllAccounts()
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				accounts[i].showDetails();
			}
		}
	}
	
	public void showDetails()
	{
		System.out.println("Bank Name: " + name);
		System.out.println("Bank Branch: " + branchName);
		System.out.println("//////////////////////////////////");
		System.out.println("### List of Accounts ###");
		this.showAllAccounts();
		System.out.println("//////////////////////////////////");
	}	
}