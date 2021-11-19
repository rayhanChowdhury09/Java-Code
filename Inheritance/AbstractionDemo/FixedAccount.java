import java.lang.*;

public class FixedAccount extends Account
{
	private int tenureYear;
	
	public FixedAccount(){}
	public FixedAccount(String accountNumber, String accountHolderName, double balance, int tenureYear)
	{
		super(accountNumber, accountHolderName, balance);
		this.tenureYear = tenureYear;
	}
	
	public void setTenureYear(int tenureYear){this.tenureYear = tenureYear;}
	public int getTenureYear(){return tenureYear;}
	
	public void showDetails()
	{
		System.out.println("Account Number: " + super.getAccountNumber());   //this.getAcountNumber());//
		System.out.println("Account Holder Name: " + super.getAccountHolderName()); //we can use this too//
		System.out.println("Account Balance: " + super.getBalance());
		System.out.println("Tenure Year: " + tenureYear);
		System.out.println();
	}
}