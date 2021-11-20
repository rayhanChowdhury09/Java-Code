import java.lang.*;
 public class StoryBook extends Book
 {
 	private String catagory;
 	
 	public StoryBook(){}
 	public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String catagory)

 	{
 	super(isbn,bookTitle,authorName,price ,availableQuantity);
 	this.catagory = catagory;
 }

 	public void setCatagory(String catagory)
 	{
 		this.catagory = catagory;
 	}
 	public String getCatagory()
 	{
 		return catagory;
 	}
 	public void showDetails()
	{
		//super.showDetails();
        System.out.println(" Isbn is     :" + super.getIsbn());
		System.out.println(" BookTitle   :"+ super.getBookTitle());
		System.out.println(" AuthorName  :"+ super.getAuthorName());
        System.out.println(" Price       : "+ super.getPrice() +"Taka");
        System.out.println(" AvailableQuantity : "+ super.getAvailableQuantity());

		System.out.println(" Catagory     : " +catagory);
		System.out.println();
	}
 }

