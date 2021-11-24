package classes;

import java.lang.*;
import interfaces.BookShopOperation;

 public class BookShop implements BookShopOperation
 {
 	private String name;
 	private Book listOfBooks[] = new Book[100];

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
		for(int i=0; i<listOfBooks.length; i++)
		{
			if(listOfBooks[i] == null)
			{
				listOfBooks[i] = b;
				return true;
			}
		}
		return false;
	}
 	
 	public boolean removeBook(Book b)
	{
		for(int i=0; i<listOfBooks.length; i++)
		{
			if(listOfBooks[i] == b)
			{
				listOfBooks[i] = null;
				return true;
			}
		}
		return false;
	}
 	
 	public Book searchBook(String isbn)
	{
		for(int i=0; i<listOfBooks.length; i++)
		{
			if(listOfBooks[i] != null)
			{
				if(listOfBooks[i].getIsbn().equals(isbn))
				{
					return listOfBooks[i];
				}
			}
		}
		return null;
	}

	public void showAllBooks()
	{
		for(int i=0; i<listOfBooks.length; i++)
		{
			if(listOfBooks[i] != null)
			{
				listOfBooks[i].showDetails();
			}
		}
	}
   
    public void showDetails()
	 {
	 	System.out.println("\t/~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~/");
	 	System.out.println("\t/Book Shop name  :"+ name +"  /");
	 	System.out.println("\t/~~~~~~~~~~~~~~~~~~~~~~~~~~~~/");
	 	System.out.println();
       
      System.out.println("/----------------------------------/");
	 	System.out.println("/------------BookShop--------------/");
	 	System.out.println("/----------------------------------/");
	 	this.showAllBooks();
	 	System.out.println();
      

     
  }
 }