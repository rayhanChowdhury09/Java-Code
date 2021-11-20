import java.lang.*;
 public class Employee
 {
    
    private String id;
	 private String name;
	  private String dateOfBirth;
	   private String joiningDate;
	  private String bloodGroup;
	 private String address;
    int monthlySalary;

    public Employee(String id , String name, String dateOfBirth, String joiningDate, String bloodGroup, String address, int monthlySalary)
    {
  this.id = id;
   this.name = name;
    this.dateOfBirth = dateOfBirth; 
     this.joiningDate = joiningDate;
    this.bloodGroup = bloodGroup;
   this.address = address; 
  this.monthlySalary = monthlySalary;
  }
	
	  public void showDetails(){
		    
		     System.out.println("The ID is            :"+ id);
		     System.out.println("The Name is          :"+ name);
           System.out.println("The Date of Birth is :"+ dateOfBirth);
           System.out.println("The Joining date is  :"+ joiningDate);
           System.out.println("The Blood Group is   :"+ bloodGroup);
           System.out.println("The Adress is        :"+ address);
           System.out.println("The Salary is        :"+ monthlySalary +"Taka");

  }

}