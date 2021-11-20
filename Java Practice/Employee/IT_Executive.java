import java.lang.*;
 public class IT_Executive extends Employee
 {
 	
       private int projectBonus;
       private int bonus;
  

 	 public  IT_Executive(String id , String name, String dateOfBirth, String joiningDate, String bloodGroup, String address, int monthlySalary,int projectBonus,int bonus)
 	 {
        super(id,name,dateOfBirth,joiningDate,bloodGroup,address,monthlySalary);
        this.projectBonus = projectBonus;
        this.bonus = bonus;

     }
      
     { 
         
    if (bonus>0)
    
     
     bonus = (monthlySalary + projectBonus);

     
       

     public void showDetails()
     {
         
          System.out.println("Project Bonus is     :" +projectBonus);
          System.out.println("Total Salary         :"+ bonus);
          super.showDetails();
          System.out.println();
     }

     
}