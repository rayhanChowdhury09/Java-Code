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
        
         b1.addQuantity(500);
         b1.sellQuantity(300); 
        System.out.println("---------------");

        Book b2 = new Book("2111","bcg","Ryhan",221.00,23); 
        b2.showDetails();

          b2.showDetails();
          b2.addQuantity(600);
          b2.sellQuantity(350);


   
   Book b3 = new Book();
   b3.setIsbn("2021");
   b3.setBookTitle("DCBA");
   b3.setAuthorName("Jihad");
   b3.setPrice(200)  ;
   b3.setAvailableQuantity(20) ;

        System.out.println(" Isbn is :" + b3.getIsbn());
        System.out.println(" BookTitle :"+b3.getBookTitle());
        System.out.println(" AuthorName :"+b3.getAuthorName());
        System.out.println(" Price : "+ b3.getPrice());
        System.out.println(" AvailableQuantity : "+ b3.getAvailableQuantity());
         
         b3.addQuantity(500);
         b3.sellQuantity(300);
        System.out.println("---------------");

        Book b4 = new Book("2","g","Ryhn",221,21); 
         b4.showDetails();

          b4.showDetails();
          b4.addQuantity(600);
          b4.sellQuantity(350);
     

   Book b5 = new Book();
   b5.setIsbn("2021");
   b5.setBookTitle("DCBA");
   b5.setAuthorName("Jihad");
   b5.setPrice(200)  ;
   b5.setAvailableQuantity(20) ;

        System.out.println(" Isbn is :" + b5.getIsbn());
        System.out.println(" BookTitle :"+b5.getBookTitle());
        System.out.println(" AuthorName :"+b5.getAuthorName());
        System.out.println(" Price : "+ b5.getPrice());
        System.out.println(" AvailableQuantity : "+ b5.getAvailableQuantity());
         
         b5.addQuantity(500);
         b5.sellQuantity(300);
         System.out.println("---------------");



         Book books[] = new Book []{b1,b2,b3,b4,b5};
         for (int i = 0 ;i<books.length; i++)
         {
          System.out.println("`````````````````");
          books[i].showDetails();
         }
        
          }
        }
        