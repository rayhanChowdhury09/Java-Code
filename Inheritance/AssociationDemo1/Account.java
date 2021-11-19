import java.lang.*;

public class Account
{	
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	public Account()
	{
		System.out.println("E-Account");
	}
	public Account(int accountNumber, String accountHolderName, double balance)
	{
		System.out.println("P-Account");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public void showDetails()
	{
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Account Balance: " + balance);
		System.out.println();
	}
	
	public void depositMoney(double amount)
	{
		if(amount>0)
		{
			balance = balance + amount;
		}
		else
		{
			System.out.println("Can Not Deposit");
		}
	}
	public void withdrawMoney(double amount)
	{
		if(amount>0 && amount<= balance)
		{
			balance = balance - amount;
		}
		else
		{
			System.out.println("Can Not Withdraw");
		}
	}
}