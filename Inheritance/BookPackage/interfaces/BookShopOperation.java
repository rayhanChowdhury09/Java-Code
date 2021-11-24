package interfaces;

import java.lang.*;
import classes.Book;
public interface BookShopOperation

{
	boolean insertBook(Book b);
	boolean removeBook(Book b);
	Book searchBook(String isbn);
	void showAllBooks();
}