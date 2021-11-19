import java.lang.*;

 public class StoryBook
 {
    private String isbn;  
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity; 
    private String category;
    static double discountRate;

    public StoryBook()
    {
      System.out.println("               Part_1               ");
    }
    
    {
      System.out.println("............................");
    }
    StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category,double discountRate)
    {
      this.isbn      =isbn;
      this.bookTitle =bookTitle;
      this.authorName=authorName;
      this.price     =price;
      this.availableQuantity=availableQuantity;
      this.category  =category;
      this.discountRate= discountRate;
    }
            
                //DiscountRate//
                 

     static void setDiscountRate(double rate)
    {
      discountRate = rate;
    }
    static double getDiscountRate()
    {
     return discountRate;
    }



                //Set//


    public void setIsbn(String isbn)
    {
      this.isbn = isbn;
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
      this.availableQuantity = availableQuantity;
    }
    public void setCategory(String category)
    {
      this.category = category;
    }
    
                        //Get//                         
 

                   public String  getIsbn()
                   {
                    return isbn;
                   }
                   public String  getBookTitle()
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
                   public String getCategory()
                   {
                    return category;
                   }
                   

                  // Add & Sell Quantity//


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
    System.out.println("Price: " + price);
    System.out.println("Available Quantity: " + availableQuantity);
    System.out.println("Category: " + category);
    System.out.println("Doscount Rate: " + discountRate);
  }

 }