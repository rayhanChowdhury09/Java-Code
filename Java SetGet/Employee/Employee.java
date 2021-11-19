import java.lang.*;
 public class Employee
 {
  private String name;
  private int id;
  private String salary;
  private String position;

  public void setName(String n)
  {
  	name = n;

  }
  public void setID(int i)
  {
  	id = i;
  }
  public void setSalary(String s)
  {
  	salary = s; 
  }
  public void setPosition(String p)
  {
  	position = p;
  }
  public String getName()
  {
  	return name;
  }
  public int getID()
  {
  	return id;
  }
  public String getSalary()
  {
  	return salary;
  }
  public String getPosition()
  {
  	return position;
  }
  public static void main(String[] args)
   {
  	Employee e = new Employee();

  	e.setName("Rayhan Chowdhury");
  	e.setID(45085);
  	e.setSalary("25000Taka" );
  	e.setPosition("Officer");

  	System.out.println("Name : " + e.getName());
  	System.out.println("ID : " + e.getID());
  	System.out.println("Salary : " + e.getSalary());
  	System.out.println("Position : " + e. getPosition());

  }
 }