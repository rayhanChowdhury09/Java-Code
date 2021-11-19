import java.lang.*;

 public class Bank
 {

   private String name;
       private int accountNum;
             private String balance;
                   private String withdraw;

    
    public void setName(String n)
    {
    	name = n;
    }
    
          public void setAccountNum(int a)
        {
        	accountNum = a;
        }
              
                public void setBalacne(String b)
              {
              	balance = b;
              }

                       public void setWithdraw(String w)
                      {
        	            withdraw = w;
                      }

     public String getName()
     {
     	return name;
     }

         public int getAccountNum()
         {
         	return accountNum;
         }  

               public String getBalance()
               {
               	return balance;
               }               

                       public String getWithdraw()
                       {                       
                           return withdraw;
                       }
     
     public static void main(String args[])
     {
     	Bank b = new Bank();

     	b.setName("Rayhan Chowdhury");
     	b.setAccountNum(45285);
     	b.setBalacne("50000Taka");
     	b.setWithdraw("25000Taka");


    System.out.println("Name :" + b.getName());
    System.out.println("AccoutNum :" + b.getAccountNum());
    System.out.println("Balance :" + b.getBalance());
    System.out.println("Withdraw :" + b.getWithdraw()); 	

     }
 }