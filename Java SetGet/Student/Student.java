import java.lang.*;

 public class Student
 { 
 
 	  private int id;
      private String name;
 	  private double  cgpa;

 	 
 	    public void setID(int i)
 	    {
 	    	 id = i;

 	    }

       public void setName(String n)  
    {
       name = n;
    } 

         public void setCGPA(double c) 
         {
            cgpa = c;
         } 
        


     

         public int getID()
         {
         	return id;
         }

          public String getName()
      {
          return name;
      }     

        public double getCGPA()
        {
        	return cgpa;
        }


      public static void main( String args[])
      {

       Student s = new Student();


        
        s.setID(45085);
        s.setName("Rayhan Chowdhury");
        s.setCGPA(3.84);

        
        System.out.println(" ID is : " + s.getID());
        System.out.println(" Name is : " + s.getName());
        System.out.println(" CGPA is : " + s.getCGPA());


      }
 }