import java.lang.*;
 public class Start {
 	 public static void main(String args[])
 	 {
 	 	Employee e1 = new Employee("21-45085-2","Rayhan Chowdhury","09/12/2000","02/10/2018","A+","NaziRoad,Feni",1500000);
 	 	 
 	 
        
 	    IT_Executive i1 = new IT_Executive("21-45087-2","Petter Parkar","05-5-1999","02-6-2017","B+","Dhaka,Bangladesh",120000,30000);
         i1.addBonus(30000) ; 
 	    
     
     System.out.println(); 
     System.out.println();
    
    System.out.println();
    System.out.println("-----------Employee---------");
    System.out.println();
    e1.showDetails();
    
    System.out.println();
    System.out.println("-----------IT Excutive---------");
    System.out.println();
    i1.showDetails();
    
  }
 }


