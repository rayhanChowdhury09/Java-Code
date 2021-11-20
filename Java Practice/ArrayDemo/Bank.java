import java.lang.*;

public class Bank
{
	private Account accounts[] = new Account [5];
	
	public void insertAccount(Account a)
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == null)
			{
				accounts[i] = a;
				break;
			}
		}
	}
	
	public void removeAccount(Account a)
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == a)
			{
				accounts[i] = null;
				break;
			}
		}
	}
	
	public void showAllAccounts()
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				System.out.println(accounts[i]);		//This is a mistake.
			}
		}
	}	
}