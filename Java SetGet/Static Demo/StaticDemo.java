import java.lang.*;

public class StaticDemo
{
	static
	{
		System.out.println("Hello World 3");
		z = 50;
	}
	int x;
	int y;
	static int z;
	
	
	static
	{
		System.out.println("Hello World 1");
	}
	
	public StaticDemo(){ System.out.println("E-SD");	}
	
	public StaticDemo(int a, int b, int c)
	{
		System.out.println("P-SD");
		x = a;
		y = b;
		z = c;
	}
	static
	{
		System.out.println("Hello World 5");
	}
	public void setX(int a){x = a;}
	public void setY(int b){y = b;}
	public void setZ(int c){z = c;}
	
	static
	{
		System.out.println("Hello World 2");
	}
	
	public void show()
	{
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
		System.out.println("Z: " + z);
		System.out.println();
	}
	
	static
	{
		System.out.println("Hello World 4");
	}
	
	public static void initialize(int c){z = c;}
}