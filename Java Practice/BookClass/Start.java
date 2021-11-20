import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		StoryBook b1 = new StoryBook();
		
		b1.setIsbn("jjj");
		b1.setBookTitle("dfdf");
		b1.setAuthorName("dfefgg");
		b1.setPrice(453.23);
		b1.setAvailableQuantity(3452);
		b1.setCategory("a+");
		b1.setDiscountRate(50.33);
		
		System.out.println("Isbn : " + b1.getIsbn());
		System.out.println("Book Title: " + b1.getBookTitle());
		System.out.println("Author Name: " +b1.getAuthorName());
		System.out.println("Price: " + b1.getPrice());
		System.out.println("Available Quantity: " + b1.getAvailableQuantityn());
		System.out.println("Category: " + b1.getCategory());
        System.out.println("DiscountRate: " + b1.getDiscountRate());

		b1.addQuantity(233);
		b1.sellQuantity(2432); 
		System.out.println("-----------------------------------");
		StoryBook b2 = new StoryBook("sdwwd", "OOP1 B","sdfjnej",20000.00,3244,"A");
		
		b2.showDetails();
		b2.addQuantity(2343);
		b2.sellQuantity(24323);
        System.out.println("-----------------------------------");
		TextBook b3 = new TextBook();
		
		b3.setIsbn("jjj");
		b3.setBookTitle("dfdf");
		b3.setAuthorName("dfefgg");
		b3.setPrice(453.23);
		b3.setAvailableQuantity(3452);
		b3.setStandard(344);
		b3.setDiscountRate(50.33);
		
		System.out.println("Isbn : " + b3.getIsbn());
		System.out.println("Book Title: " + b3.getBookTitle());
		System.out.println("Author Name: " +b3.getAuthorName());
		System.out.println("Price: " + b3.getPrice());
		System.out.println("Available Quantity: " + b3.getAvailableQuantityn());
		System.out.println("Standard: " + b3.getStandard());
        System.out.println("DiscountRate: " + b3.getDiscountRate());

		b3.addQuantity(233);
		b3.sellQuantity(2432); 
		System.out.println("-----------------------------------");
		TextBook b4 = new TextBook("sdwwd", "OOP1 B","sdfjnej",20000.00,3244,342);
		
		b4.showDetails();
		b4.addQuantity(2343);
		b4.sellQuantity(24323);

	}
}