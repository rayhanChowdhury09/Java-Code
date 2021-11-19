import java.lang.*;

public class Start
{
  public static void main(String args[])
  {
   
   Book b1 = new Book();
   
   b1.setIsbn("2020");
   b1.setBookTitle("ABCD");
   b1.setAuthorName("Rayhan");
   b1.setPrice(200);
   b1.setAvailableQuantity(23);
  
        System.out.println(" Isbn is :" + b1.getIsbn());
		    System.out.println(" BookTitle :"+b1.getBookTitle());
		    System.out.println(" AuthorName :"+b1.getAuthorName());
        System.out.println(" Price : "+ b1.getPrice());
        System.out.println(" AvailableQuantity : "+ b1.getAvailableQuantity());

        System.out.println("---------------");

        Book b2 = new Book("2111","bcg","Ryhan",221.00,23); 
        b2.showDetails();

  }


}