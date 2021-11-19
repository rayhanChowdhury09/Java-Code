import java.lang.*;

public class SavingsAccount extends Account
{
	private double interestRate;
	
	public SavingsAccount(){}
	public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate)
	{
		super(accountNumber, accountHolderName, balance);
		this.interestRate = interestRate;
	}
	
	public void setInterestRate(double interestRate){this.interestRate = interestRate;}
	public double getInterestRate(){return interestRate;}
	
	public void showDetails()
	{
		System.out.println("Account Number: " + this.getAccountNumber());
		System.out.println("Account Holder Name: " + this.getAccountHolderName());
		System.out.println("Account Balance: " + this.getBalance());
		System.out.println("Interest Rate: " + interestRate);
		System.out.println();
	}
}