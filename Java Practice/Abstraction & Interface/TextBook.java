import java.lang.*;
 public class TextBook extends Book
 {
 	private int standard;
 	
 	public TextBook(){}
 	public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard)

 	{
 	super(isbn,bookTitle,authorName,price ,availableQuantity);
 	this.standard = standard;
 }

 	public void setStandard(int standard)
 	{
 		this.standard = standard;
 	}
 	public int getStandard()
 	{
 		return standard;
 	}
 	public void showDetails()
	{
		//super.showDetails();

		System.out.println(" Isbn is     :" + super.getIsbn());
		System.out.println(" BookTitle   :"+ super.getBookTitle());
		System.out.println(" AuthorName  :"+ super.getAuthorName());
        System.out.println(" Price       : "+ super.getPrice() +"Taka");
        System.out.println(" AvailableQuantity : "+ super.getAvailableQuantity());
		System.out.println(" Standard     : " +standard);
		System.out.println();
	}
 }
