import java.lang.*;

public class Start
{
  public static void main(String args[])
  {


                  //StoryBook//     

    StoryBook b1 = new StoryBook();
    
    b1.setIsbn("Rayhan");
    b1.setBookTitle("The End");
    b1.setAuthorName("Ryhan");
    b1.setPrice(500);
    b1.setAvailableQuantity(5000);
    b1.setCategory("A");
    b1.setDiscountRate(25.50);
    
    System.out.println("Isbn : " + b1.getIsbn());
    System.out.println("Book Title: " + b1.getBookTitle());
    System.out.println("Author Name: " +b1.getAuthorName());
    System.out.println("Price: " + b1.getPrice());
    System.out.println("Available Quantity: " + b1.getAvailableQuantity());
    System.out.println("Category: " + b1.getCategory());
    System.out.println("DiscountRate: " + b1.getDiscountRate());

    b1.addQuantity(500);
    b1.sellQuantity(3000); 
    System.out.println("-----------------------------------");
    StoryBook b2 = new StoryBook("Prova","Home","Es",550,4000,"A",25);
    
    b2.showDetails();
    b2.addQuantity(600);
    b2.sellQuantity(3500);
    

                                 //TextBook//
    System.out.println("-----------------------------------");
    TextBook b3 = new TextBook();
    
    b3.setIsbn("Babor");
    b3.setBookTitle("Java");
    b3.setAuthorName("Ryhan");
    b3.setPrice(1000);
    b3.setAvailableQuantity(5000);
    b3.setStandard(5);
    b3.setDiscountRate(25.51);
    
    System.out.println("Isbn : " + b3.getIsbn());
    System.out.println("Book Title: " + b3.getBookTitle());
    System.out.println("Author Name: " +b3.getAuthorName());
    System.out.println("Price: " + b3.getPrice());
    System.out.println("Available Quantity: " + b3.getAvailableQuantity());
    System.out.println("Standard: " + b3.getStandard());
    System.out.println("DiscountRate: " + b3.getDiscountRate());

    b3.addQuantity(10000);
    b3.sellQuantity(3500); 
    System.out.println("-----------------------------------");
    TextBook b4 = new TextBook("Halima", "Java2","Ryhan",1000,5,4,20);
    
    b4.showDetails();
    b4.addQuantity(10000);
    b4.sellQuantity(3500);

  }
    }  