import java.lang.*;

public class Book
{

  private String isbn;
  private String bookTitle;
  private String authorName;
  private double price;
  private int availableQuantity;

  public Book()
  {
  	System.out.println(" Book1");

  }
   public Book(String isbn,String bookTitle,String authorName,double price,int availableQuantity)
   {
    System.out.println(" Book2");

    this.isbn = isbn;
    this.bookTitle = bookTitle;
    this.authorName = authorName;
    this.price = price;
    this.availableQuantity = availableQuantity;

   }
    {
    System.out.println("---------------------------------------");
          } 

    public void setIsbn(String isbn)
    {
      this.isbn= isbn;
    }
     
       public void setBookTitle(String bookTitle)
       {
         this.bookTitle = bookTitle;
       }
        public void setAuthorName(String authorName)
        {
          this.authorName = authorName;
        }
      public void setPrice(double price)
     {
     this.price = price;
      }
     public void setAvailableQuantity(int availableQuantity)
     {
      this.availableQuantity= availableQuantity;
     }
      
      public String getIsbn()
  {
    return isbn;
  }
    public String getBookTitle()
    {
      return bookTitle;
    }
     public String getAuthorName()
     {
      return authorName;
     }
     public double getPrice()
     {
      return price;
     }
     public int getAvailableQuantity()
     {
      return availableQuantity;
     }
     
    public void addQuantity(int amount)
   {
   
    if (amount>0)
     {
      availableQuantity = availableQuantity + amount;
     }
    else 
    {
      System.out.println("invalid");
    }
   }
    public void sellQuantity(int amount )
{
  if(amount>0 && amount<= availableQuantity)
   
   {
    availableQuantity = availableQuantity- amount;

}

else
 {
   System.out.println("invalid");
 }

}
 {
  System.out.println("-----------------------------------------------");
 }


     

      public void showDetails()
  {
        System.out.println(" Isbn is :" + isbn);
        System.out.println(" BookTitle :"+ bookTitle);
        System.out.println(" AuthorName :"+ authorName);
        System.out.println(" Price : "+ price);
        System.out.println(" AvailableQuantity : "+ availableQuantity);

  }



}       