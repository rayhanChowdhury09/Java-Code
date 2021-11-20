import java.lang.*;

 public class Start 
 {
 	public static void main(String args[])
 	{
 		Book b1 = new Book("Rayhan","Game of Thrones","Dhaka",550,4000,20);

    b1.showDetails();
    b1.addQuantity(600);
    b1.sellQuantity(3500);

    System.out.println("``````````````````````````````");

    Book b2 = new Book("Srabon","House of Dragon","Chittagong",50,40,2);

    b2.showDetails();
    b2.addQuantity(60);
    b2.sellQuantity(35);

    System.out.println("``````````````````````````````");

    
    Book b3 = new Book("Pitter","Home Coming","Feni",5550,400,25);

    b3.showDetails();
    b3.addQuantity(6000);
    b3.sellQuantity(350);

    System.out.println("``````````````````````````````");

    Book b4 = new Book("Oishy","Harry Potter","Uk",4000,2500,50);

    b4.showDetails();
    b4.addQuantity(600);
    b4.sellQuantity(3500);

    System.out.println("``````````````````````````````");

    Book b5 = new Book("Ali","Money Heist","USA",400,200,5);

    b5.showDetails();
    b5.addQuantity(200);
    b5.sellQuantity(350);

    System.out.println("``````````````````````````````");

   Book b6 = new Book("Alizen","Money Heist 2","USA",400,200,5);

    b6.showDetails();
    b6.addQuantity(200);
    b6.sellQuantity(350);

    System.out.println("``````````````````````````````");



    Book books[] = new Book []{b1,b2,b3,b4,b5,b6};
    for (int i = 0 ;i<books.length; i++)
  {
   System.out.println("`````````````````");
   books[i].showDetails();
  } 
 }
}