import java.lang.*;
 
 public class Account
 {
   private int accountNumber;
   private String accountHolderName;
   private double balance;

   public void setAccountNumber(int a)
   {
    accountNumber = a;

   }
   public void setAccountHolderName(String n)
   {
   	accountHolderName = n;
   }
   public void setBalance( double b)
   {
   	balance = b;
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

 }