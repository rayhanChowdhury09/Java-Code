import java.lang.*;

public class StringDemo
{
	public static void main(String args[])
	{
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Java";
		
		String s4 = new String("Hello");
		String s5 = new String("Hello");
		String s6 = new String("Java");
		
		String s7 = "";
		
		String msg1 = "AIUB" + 20 + 21;
		/*			= "AIUB20" + 21
					= "AIUB2021"
		*/
		System.out.println(msg1);		//AIUB2021
		
		String msg2 = 20 + 21 + "AIUB";
		/*			= 41 + "AIUB"
					= "41AIUB"
		
		*/
		System.out.println(msg2);		//41AIUB
		
		String msg3 = 20 + "AIUB" + 21;
		/*			= "20AIUB" + 21
					= "20AIUB21"
		*/
		System.out.println(msg3);		//20AIUB21
		
		
		/*int l = s2.length();
		System.out.println(l);*/
		
		System.out.println(s2.length());
		System.out.println(msg2.length());
		
		/*boolean flag = s1.isEmpty();
		System.out.println(flag);*/
		
		System.out.println(s1.isEmpty());
		System.out.println(s7.isEmpty());
		
		/*char c = s2.charAt(2);			//Hello
		System.out.println(c);*/
		
		System.out.println(s2.charAt(2));
		
		s2.concat(s3);					//s2+s3
		System.out.println(s2);
		System.out.println(s3);
		
		String s8 = s2.concat(s3);		//String s8 = s2 + s3
		System.out.println(s8);
		System.out.println(s2);
		System.out.println(s3);
		
		
		System.out.println(s8.replace('a', 'i'));
		System.out.println(s8);
		
		s8 = s8.replace('a', 'i');
		System.out.println(s8);
		
		s8 = s8.replace('l', 'm');
		s8 = s2.concat(s3);
		
		s7 = s8.substring(2,6);		//HelloJava
		System.out.println(s8);
		System.out.println(s7);
		
		s8.toLowerCase();
		System.out.println(s8);
		
		s8 = s8.toLowerCase();
		System.out.println(s8);
		
		/*		
		== operator	-> memory location
		equals( ) 	-> value
		*/
		
		if(s1 == s2)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("2");
		}
		
		if(s1.equals(s2))
		{
			System.out.println("3");
		}
		else
		{
			System.out.println("4");
		}
		
		if(s1 == s4)
		{
			System.out.println("5");
		}
		else
		{
			System.out.println("6");
		}
		
		if(s1.equals(s4))
		{
			System.out.println("7");
		}
		else
		{
			System.out.println("8");
		}
		
		if(s5 == s4)
		{
			System.out.println("9");
		}
		else
		{
			System.out.println("10");
		}
		
		if(s5.equals(s4))
		{
			System.out.println("11");
		}
		else
		{
			System.out.println("12");
		}
	}
}