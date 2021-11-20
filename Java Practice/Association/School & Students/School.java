import java.lang.*;
 public class School
 {
 	private String schoolName;
 	private String location;
 	private int code;
 	 public School (String schoolName , String location , int code)
 	 {
 	 	this.schoolName = schoolName;
 	 	this.location = location;
 	 	this.code = code;
  	 }
  	  public void showDetails()
     {  
     	System.out.println();
     	System.out.println("--------School--------");
     	System.out.println();
       System.out.println("School name is    :"+ schoolName);
       System.out.println("Location is       :"+ location);
       System.out.println("Code Number is    :"+ code);
   }
 }