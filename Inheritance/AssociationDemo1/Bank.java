import java.lang.*;

public class Bank
{
	private String name;
	private String branchName;
	private Account account;
	
	public Bank(){}
	public Bank(String name, String branchName, Account account)
	{
		this.name = name;
		this.branchName = branchName;
		this.account = account;
	}
	
	public void setName(String name){this.name = name;}
	public void setBranchName(String branchName){this.branchName = branchName;}
	public void setAccount(Account account){this.account = account;}
	
	public String getName(){return name;}
	public String getBranchName(){return branchName;}
	public Account getAccount(){return account;}
	
	public void showDetails()
	{
		System.out.println("Bank Name: " + name);
		System.out.println("Bank Branch: " + branchName);
		System.out.println("### Account ###");
		account.showDetails();
	}	
}