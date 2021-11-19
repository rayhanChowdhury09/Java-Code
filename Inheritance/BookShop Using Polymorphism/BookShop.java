import java.lang.*;

 public class BookShop
 {
 	private String name;
 	private Book books[] = new Book[100];

 	public BookShop(){}
 	public BookShop(String name)
 	{
 		this.name = name;
 	}
 	public void setName(String name)
 	  {
 	  	this.name = name;
 	  }
 	public String getName()
 	  {
 	  	return name;
 	  }
    public boolean insertBook(Book b)
	{
		for(int i=0; i<books.length; i++)
		{
			if(books[i] == null)
			{
				books[i] = b;
				return true;
			}
		}
		return false;
	}
 	
 	public boolean removeBook(Book b)
	{
		for(int i=0; i<books.length; i++)
		{
			if(books[i] == b)
			{
				books[i] = null;
				return true;
			}
		}
		return false;
	}
 	
 	public Book searchBook(String isbn)
	{
		for(int i=0; i<books.length; i++)
		{
			if(books[i] != null)
			{
				if(books[i].getIsbn().equals(isbn))
				{
					return books[i];
				}
			}
		}
		return null;
	}

	public void showAllBooks()
	{
		for(int i=0; i<books.length; i++)
		{
			if(books[i] != null)
			{
				books[i].showDetails();
			}
		}
	}
   
    public void showDetails()
	 {
	 	System.out.println("Book Shop name  :"+ name);
	 	System.out.println();

	 	System.out.println("------------BookShop-------------");
	 	this.showAllBooks();
	 	System.out.println();
      

     
  }
 }