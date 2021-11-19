import java.lang.*;

public class Start
{
  public static void main(String args[])
  {
   
   

    StoryBook s1 =  new StoryBook ("House of Dragon","Before 400 years","Rayhan",500,5000,"A");
    s1.addQuantity(400);
    s1.sellQuantity(200);
    
   
    StoryBook s2 = new StoryBook("Game of Thrones","Finisher","Andrada",600,1000,"B");
         s2.addQuantity(300);
        s2.sellQuantity(100);
 
    StoryBook s3 = new StoryBook("abcd","gghh","ff",200,500,"g");
        s3.addQuantity(300);
        s3.sellQuantity(100);

        StoryBook s4 = new StoryBook("abcd4","gghh4","f4f",200,500,"g4");
        s4.addQuantity(300);
        s4.sellQuantity(100);

       StoryBook s5 = new StoryBook("abcd5","gghh5","f5f",200,500,"g5");
        s5.addQuantity(300);
        s5.sellQuantity(100);





   

     TextBook t1 = new TextBook("Vikings","The Boat Rider","Kali",100,500,5);
       t1.addQuantity(150);
        t1.sellQuantity(250);


    TextBook t2 = new TextBook("The Ragner","Death","Marko",250,466,4);

        t2.addQuantity(350);
        t2.sellQuantity(150);

         TextBook t3 = new TextBook("The Ragner3","Death","Marko",250,466,4);

        t3.addQuantity(350);
        t3.sellQuantity(150);

         TextBook t4 = new TextBook("The Ragner4","Death","Marko",250,466,4);

        t4.addQuantity(350);
        t4.sellQuantity(150);

         TextBook t5 = new TextBook("The Ragner5","Death","Marko",250,466,4);

        t5.addQuantity(350);
        t5.sellQuantity(150);
    
      BookShop b = new BookShop("Good Luck");
      b.showDetails();
      
     System.out.println("------------------------------------------");
        if(b.insertStoryBook(s1)){System.out.println("Book Insertted");}
        else{System.out.println("Can NOT be Inserted");}
         
         System.out.println("------------------------------------------");
        if(b.insertStoryBook(s2)){System.out.println("Book Insertted");}
        else{System.out.println("Can NOT be Inserted");}
       
         System.out.println("------------------------------------------");
        if(b.insertStoryBook(s3)){System.out.println("Book Insertted");}
        else{System.out.println("Can NOT be Inserted");}
    
      System.out.println("------------------------------------------");
        if(b.insertStoryBook(s4)){System.out.println("Book Insertted");}
        else{System.out.println("Can NOT be Inserted");}

          System.out.println("------------------------------------------");
        if(b.insertStoryBook(s5)){System.out.println("Book Insertted");}
        else{System.out.println("Can NOT be Inserted");}

        
        b.showDetails();

          System.out.println("------------------------------------------");
        if(b.insertTextBook(t1)){System.out.println("TextBook Insertted");}
        else{System.out.println("Can NOT be Inserted");}

          System.out.println("------------------------------------------");
        if(b.insertTextBook(t2)){System.out.println("TextBook Insertted");}
        else{System.out.println("Can NOT be Inserted");}

          System.out.println("------------------------------------------");
        if(b.insertTextBook(t3)){System.out.println("TextBook Insertted");}
        else{System.out.println("Can NOT be Inserted");}

          System.out.println("------------------------------------------");
        if(b.insertTextBook(t4)){System.out.println("TextBook Insertted");}
        else{System.out.println("Can NOT be Inserted");}

          System.out.println("------------------------------------------");
        if(b.insertTextBook(t5)){System.out.println("TextBook Insertted");}
        else{System.out.println("Can NOT be Inserted");}

     
        b.showDetails();
        System.out.println("------------------------------------------------");
        if(b.removeStoryBook(s1)){System.out.println("Book Removed");}
        else{System.out.println("Can NOT be Removed");}

        b.showDetails();
        System.out.println("------------------------------------------------");
        if(b.removeTextBook(t1)){System.out.println("TextBook Removed");}
        else{System.out.println("Can NOT be Removed");}
      

        b.showDetails();
        
        System.out.println("-------------------------------------------------");
        StoryBook sb = b.searchStoryBook("House of Dragon");
        
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
        TextBook tb = b.searchTextBook("Vikings");
        
        if(tb != null)
        {
            System.out.println("Object Found....");
            tb.showDetails();
        }
        else
        {
            System.out.println("Object NOT Found....");
        }








    System.out.println(); 
    System.out.println();

    System.out.println("-----------StoryBook-----------");
    System.out.println();
    s1.showDetails();
    

    System.out.println("-----------StoryBook2-----------");
    System.out.println();
    s2.showDetails();
    System.out.println();


    System.out.println("-----------StoryBook3-----------");
    System.out.println();
    s3.showDetails();
    System.out.println();



    System.out.println("-----------StoryBook4-----------");
    System.out.println();
    s4.showDetails();
    System.out.println();



    System.out.println("-----------StoryBook5-----------");
    System.out.println();
    s5.showDetails();
    System.out.println();
    
    System.out.println("-----------TextBook------------");
    System.out.println();
    t1.showDetails();
  

    System.out.println("-----------TextBook2------------");
    System.out.println(); 
    t2.showDetails();
  
    System.out.println("-----------TextBook3------------");
    System.out.println(); 
    t3.showDetails();
    

    System.out.println("-----------TextBook4------------");
    System.out.println(); 
    t4.showDetails();
  

    System.out.println("-----------TextBook5------------");
    System.out.println(); 
    t5.showDetails();
  
    System.out.println("-----------BookShop------------");
    System.out.println();
    b.showDetails();












  }
}