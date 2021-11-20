import java.lang.*;
public class State
{
	private  String stateName;
	private String mp;
	private  int postalCode;
	private  Country country;

	 public State(){}
	 public State(String stateName , String mp , int postalCode,Country country)
	 {
	 	this.stateName = stateName;
	 	this.mp = mp;
	 	this.postalCode = postalCode;
	 	this.country = country;
	 }	
	  public void showDetails()
	 {  
	 	System.out.println(); 
	 	System.out.println("---------State-------");
	 	System.out.println();

	 	System.out.println("State Name is    :"+ stateName);
	 	System.out.println("MP is            :"+ mp);
	 	System.out.println("Postal Code is   :"+ postalCode);
	 	country.showDetails();
	 }
}
