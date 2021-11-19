import java.lang.*;

public class SavingsAccount extends Account
{
	/*private String accountNumber;
	private String accountHolderName;
	private double balance;*/
	private double interestRate;
	
	public SavingsAccount(){}
	public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate)
	{
		super(accountNumber, accountHolderName, balance);
		this.interestRate = interestRate;
	}
	
	/*public void setAccountNumber(String accountNumber){this.accountNumber = accountNumber; }
	public void setAccountHolderName(String accountHolderName){this.accountHolderName = accountHolderName; }
	public void setBalance(double balance){ this.balance = balance; }*/
	public void setInterestRate(double interestRate){this.interestRate = interestRate;}
	
	/*public String getAccountNumber(){return accountNumber;}
	public String getAccountHolderName(){return accountHolderName;}
	public double getBalance(){return balance;}*/
	public double getInterestRate(){return interestRate;}
	
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Interest Rate: " + interestRate);
		System.out.println();
	}
	/*
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
	*/
}