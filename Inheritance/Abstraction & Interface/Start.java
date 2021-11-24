import java.lang.*;

public class Start
{
  public static void main(String args[])
  {
   
                                    //StoryBook//
               
          

    StoryBook s1 =  new StoryBook ("House of Dragon","Before 400 years","Rayhan",500,5000,"A");
        s1.addQuantity(400);
        s1.sellQuantity(200);
    
   
    StoryBook s2 = new StoryBook("Game of Thrones","Finisher","Andrada",600,1000,"B");
        s2.addQuantity(300);
        s2.sellQuantity(100);
 
    StoryBook s3 = new StoryBook("Stranger Things","Ghost","Millie",200,500,"A");
        s3.addQuantity(300);
        s3.sellQuantity(100);

        StoryBook s4 = new StoryBook("Ghost Rider","Bike","Tomas",2000,5020,"B");
        s4.addQuantity(300);
        s4.sellQuantity(100);

    StoryBook s5 = new StoryBook("BattleShip","Adison","War",300,600,"A");
        s5.addQuantity(300);
        s5.sellQuantity(100);

                            //TextBook//


      

    TextBook t1 = new TextBook("Vikings","The Boat Rider","Kali",100,500,5);
       t1.addQuantity(150);
       t1.sellQuantity(250);


    TextBook t2 = new TextBook("The Ragner","Death","Marko",250,466,4);

        t2.addQuantity(350);
        t2.sellQuantity(150);

         TextBook t3 = new TextBook("Squid Gmaes","Death","Marko",2500,46,4);

        t3.addQuantity(350);
        t3.sellQuantity(150);

         TextBook t4 = new TextBook("Money Heist","Money","Denko",320,144,5);

        t4.addQuantity(350);
        t4.sellQuantity(150);

         TextBook t5 = new TextBook("Shadow","Warrior","Jhon",465,135,4);

        t5.addQuantity(350);
        t5.sellQuantity(150);
    
        BookShop b = new BookShop("Good Luck");
        b.showDetails();
                                       //Inserted//
        System.out.println("------------------------------------------");
        if(b.insertBook(s1))
          {
            System.out.println("The Book---->>> "+ s1.getIsbn() + " has been Inserted");
          }
        else
          {
            System.out.println("The Book---->>> "+ s1.getIsbn() + " could NOT be Inserted");
          }
         
         System.out.println("------------------------------------------");
          if(b.insertBook(s2))
          {
            System.out.println("The Book---->>> "+ s2.getIsbn() + " has been Inserted");
          }
        else
          {
            System.out.println("The Book---->>> "+ s2.getIsbn() + " could NOT be Inserted");
          }
       
         System.out.println("------------------------------------------");
        if(b.insertBook(s3))
          {
            System.out.println("The Book---->>> "+ s3.getIsbn() + " has been Inserted"); 
          }
        else
          {
            System.out.println("The Book---->>> "+ s3.getIsbn() + " could NOT be Inserted");

          }
    
      System.out.println("------------------------------------------");
        if(b.insertBook(s4))
          {
            System.out.println("The Book---->>> "+ s4.getIsbn() + " has been Inserted"); 
          }
        else
          {
            System.out.println("The Book---->>> "+ s4.getIsbn() + " could NOT be Inserted");
          }

          System.out.println("------------------------------------------");
        if(b.insertBook(s5))
          {
            System.out.println("The Book---->>> "+ s5.getIsbn() + " has been Inserted"); 
          }
        else
          {
            System.out.println("The Book---->>> "+ s5.getIsbn() + " could NOT be Inserted");
          }

        
        b.showDetails();

          System.out.println("------------------------------------------");
        if(b.insertBook(t1))
          {
            System.out.println("The Book---->>> "+ t1.getIsbn() + " has been Inserted"); 
          }
        else
          {
            System.out.println("The Book---->>> "+ t1.getIsbn() + " could NOT be Inserted");
          }

          System.out.println("------------------------------------------");
        if(b.insertBook(t2))
          {
            System.out.println("The Book---->>> "+ t2.getIsbn() + " has been Inserted"); 
          }
        else
          {
            System.out.println("The Book---->>> "+ t2.getIsbn() + " could NOT be Inserted");
          }

          System.out.println("------------------------------------------");
        if(b.insertBook(t3))
          {
            System.out.println("The Book---->>> "+ t3.getIsbn() + " has been Inserted"); 
          }
        else
          {
            System.out.println("The Book---->>> "+ t3.getIsbn() + " could NOT be Inserted");
          }

          System.out.println("------------------------------------------");
        if(b.insertBook(t4))
          {
            System.out.println("The Book---->>> "+ t4.getIsbn() + " has been Inserted"); 
          }
        else
          {
            System.out.println("The Book---->>> "+ t4.getIsbn() + " could NOT be Inserted");
          }

          System.out.println("------------------------------------------");
        if(b.insertBook(t5))
          {
            System.out.println("The Book---->>> "+ t5.getIsbn() + " has been Inserted"); 
          }
        else
          {
            System.out.println("The Book---->>> "+ t5.getIsbn() + " could NOT be Inserted");
          }

     
        b.showDetails();                   //Removed//
        System.out.println("------------------------------------------------");
        if(b.removeBook(s1))
          {
            System.out.println("The Book---->>> "+ s1.getIsbn() + " has been Removed"); 
          }
        else
          {
            System.out.println("The Book---->>> "+ s1.getIsbn() + " could Not be Removed");
          }

        b.showDetails();
        System.out.println("------------------------------------------------");
        if(b.removeBook(t1))
          {
            System.out.println("The Book---->>> "+ t1.getIsbn() + " has been Removed");
          }
        else
          {
            System.out.println("The Book---->>> "+ t1.getIsbn() + " could Not be Removed");
          }
      

        b.showDetails();
                                            //Search//
        System.out.println("-------------------------------------------------");
        Book sb = b.searchBook("Ghost ");
        
        if(sb != null)
        {
            System.out.println("Object Found....");
            sb.showDetails();
        }
        else
        {
            System.out.println("Object NOT Found....");
        }


       b.showDetails();
        
        System.out.println("-------------------------------------------------");
        Book tb = b.searchBook(" Heist");
        
        if(tb != null)
        {
            System.out.println("Object Found....");
            tb.showDetails();
        }
        else
        {
            System.out.println("Object NOT Found....");
        }
  }
}