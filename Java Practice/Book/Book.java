import java.lang.*;

 public class Book
 {

  private String isbn;
  private String bookTitle;
  private String authorName;
  private double price;
  private int availableQuantity;
  static double discountRate;

    public Book()
  {
  	System.out.println(" Book1");

  }
   public Book(String isbn,String bookTitle,String authorName,double price,int availableQuantity,double discountRate)
   {
   

    this.isbn = isbn;
    this.bookTitle = bookTitle;
    this.authorName = authorName;
    this.price = price;
    this.availableQuantity = availableQuantity;
    this.discountRate = discountRate;

   }


   public void addQuantity(int amount)
 {

  if(amount>0)
  {
    availableQuantity = availableQuantity + amount;
    System.out.println(" Add AvailableQuantity : " + availableQuantity );
  }
  else
  {
    System.out.println(" Add AvailableQuantity :Invalid");
  }
}

public void sellQuantity(int amount)
{
  if(amount>0 && amount<=availableQuantity)
  {
    availableQuantity = availableQuantity - amount;
    System.out.println(" Sell availableQuantity : " + availableQuantity );
  }
  else
  {
   System.out.println(" Sell availableQuantity : Invalid");
  }
} 


     public void showDetails()
     {
    System.out.println("Isbn : " + isbn);
    System.out.println("Book Title: " + bookTitle);
    System.out.println("Author Name: " + authorName);
    System.out.println("Price: " + price +"Taka");
    System.out.println("Available Quantity: " + availableQuantity);
    System.out.println("Doscount Rate: " + discountRate);
  }
 }