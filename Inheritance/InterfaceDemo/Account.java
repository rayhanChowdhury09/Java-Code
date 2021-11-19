import java.lang.*;

public abstract class Account implements AccountOperations
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
	
	public abstract void showDetails();
	
	public boolean depositMoney(double amount)
	{
		if(amount>0)
		{
			balance = balance + amount;
			return true;
		}
		return false;
	}
	public boolean withdrawMoney(double amount)
	{
		if(amount>0 && amount<= balance)
		{
			balance = balance - amount;
			return true;
		}
		return false;
	}
}