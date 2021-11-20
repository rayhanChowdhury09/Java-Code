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
		System.out.println("E-sb");
	}
	StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category)
    {
		
		this.isbn=isbn;
		this.bookTitle=bookTitle;
		this.authorName=authorName;
		this.price=price;
		this.availableQuantity=availableQuantity;
		this.category=category;
	
	}
	static void setDiscountRate(double rate){
		discountRate=rate;
	} 

	static double getDiscountRate( ){
		return discountRate;
	}
	
	public void setIsbn(String isbn)
	{
		this.isbn=isbn;
	}
	public String getIsbn()
	{
		return isbn;
	}

	public void setBookTitle(String bookTitle)
	{
		this.bookTitle=bookTitle;
	}
	public String getBookTitle()
	{
		return bookTitle;
	}
	public void setAuthorName(String authorName)
	{
		this.authorName=authorName;
	}
	public String getAuthorName()
	{
		return authorName;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public double getPrice()
	{
		return price;
	}
	public void setAvailableQuantity(int availableQuantity)
	{
		this.availableQuantity=availableQuantity;
	}
	public int getAvailableQuantityn()
	{
		return availableQuantity;
	}
	public void setCategory(String category){
		this.category=category;
	}
	public String getCategory( ){
		return category;
	}
	public void addQuantity(int amount)
{
	if(amount>0)
	{
		availableQuantity = availableQuantity + amount;
		System.out.println(" After  add availableQuantity : " + availableQuantity );
	}
	else
	{
		System.out.println("After  add availableQuantity :Invalid");
	}
}

public void sellQuantity(int amount)
{
	if(amount>0 && amount<=availableQuantity)
	{
		availableQuantity = availableQuantity - amount;
		System.out.println("After sall availableQuantity : " + availableQuantity );
	}
	else
	{
		System.out.println("After sall availableQuantity : Invalid");
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
	}
}