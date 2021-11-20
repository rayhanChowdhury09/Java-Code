import java.lang.*;
 public class Country
 {
 	private String countryName;
 	private String primeMinister;
 	private int zipNumber;
 	private  String zone;
 
   public Country(){}
   public Country(String countryName ,String primeMinister, int zipNumber ,String zone )
   {
    this.countryName = countryName;
    this.primeMinister = primeMinister;
    this.zipNumber = zipNumber;
    this.zone  = zone;
   }
     public void showDetails()
     {  
     	System.out.println();
     	System.out.println("--------Country--------");
     	System.out.println();

     	System.out.println("Country Name is  :" + countryName);
     	System.out.println("Prime Minister is:"+ primeMinister);
     	System.out.println("Zip Code is      :"+ zipNumber);
     	System.out.println("The Zone is      :"+ zone);
     }

}