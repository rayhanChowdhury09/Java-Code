import java.lang.*;
 public class BookShop
 {
 	private String name;
 	private StoryBook storyBooks[] = new StoryBook[100];
 	private TextBook textBooks[] = new TextBook[100];

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

 	 boolean insertStoryBook(Book b)
	{
		for(int i=0; i<storyBooks.length; i++)
		{
			if(storyBooks[i] == null)
			{
				storyBooks[i] = sb;
				return true;
			}
		}
		return false;
	}
	
	boolean removeStoryBook(StoryBook sb)
	{
		for(int i=0; i<storyBooks.length; i++)
		{
			if(storyBooks[i] == sb)
			{
				storyBooks[i] = null;
				return true;
			}
		}
		return false;
	}
	
	StoryBook searchStoryBook(String isbn)
	{
		for(int i=0; i<storyBooks.length; i++)
		{
			if(storyBooks[i] != null)
			{
				if(storyBooks[i].getIsbn().equals(isbn))
				{
					return storyBooks[i];
				}
			}
		}
		return null;
	}
	
	void showAllStoryBook()
	{
		for(int i=0; i<storyBooks.length; i++)
		{
			if(storyBooks[i] != null)
			{
				storyBooks[i].showDetails();
			}
		}
	}
	                              



	    boolean insertTextBook(TextBook tb)
	    {
		for(int i=0; i<textBooks.length; i++)
		{
			if(textBooks[i] == null)
			{
				textBooks[i] = tb;
				return true;
			}
		}
		return false;
	}
	
	boolean removeTextBook(TextBook tb)
	{
		for(int i=0; i<textBooks.length; i++)
		{
			if(textBooks[i] == tb)
			{
				textBooks[i] = null;
				return true;
			}
		}
		return false;
	}
	
	TextBook searchTextBook(String isbn)
	{
		for(int i=0; i<textBooks.length; i++)
		{
			if(textBooks[i] != null)
			{
				if(textBooks[i].getIsbn().equals(isbn))
				{
					return textBooks[i];
				}
			}
		}
		return null;
	}
	
	void showAllTextBook()
	{
		for(int i=0; i<storyBooks.length; i++)
		{
			if(storyBooks[i] != null)
			{
				storyBooks[i].showDetails();
			}
		}
	}

	 public void showDetails()
	 {
	 	System.out.println("Book Shop name  :"+ name);
	 	System.out.println();
	 	System.out.println("------------StoryBook-------------");
	 	this.showAllStoryBook();
	 	System.out.println();

	 	System.out.println("------------TextBook-------------");
	 	this.showAllTextBook();
	 	System.out.println();
	 }
 }