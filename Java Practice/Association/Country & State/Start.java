import java.lang.*;
 public class Start 
 {
   public static void main(String args[])
   {

   	
    Country c1 = new Country("Bangladesh","Seikh Hasina",1111,"Asia");    
    State s1   = new State("Dhaka","Rayhan",2222,c1);
    s1.showDetails();
   }
 }
 