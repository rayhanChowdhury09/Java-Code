import java.lang.*;

public class Account
{	
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	
	public Account(){ }
	public Account(String accountNumber, String accountHolderName, double balance)
	{
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public void setAccountNumber(String accountNumber){ this.accountNumber = accountNumber; }
	public void setAccountHolderName(String accountHolderName){	this.accountHolderName = accountHolderName;}
	public void setBalance(double balance){	this.balance = balance;	}
	
	public String getAccountNumber(){	return accountNumber;}
	public String getAccountHolderName(){	return accountHolderName;}
	public double getBalance(){	return balance;}
	
	public void showDetails()
	{
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Account Balance: " + balance);
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