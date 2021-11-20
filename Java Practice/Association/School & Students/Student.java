import java.lang.*;
 public class Student
 {
 	private String studentName;
 	private int id;
 	private String section;
 	School[] school;

 	public Student(String studentName , int id , String section,School[] school)
 	{
 		this.studentName = studentName;
 		this.id = id;
 		this.section = section;
 		this.school = school;
 	}
 	 public void showDetails()
	 {  
	 	System.out.println(); 
	 	System.out.println("---------School-------");
	 	System.out.println();
     System.out.println("Student name is  : "+ studentName);
     System.out.println("ID number is     :"+ id);
     System.out.println("Section is       :"+ section);
     school.showDetails();
   }
 }