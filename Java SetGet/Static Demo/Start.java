import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		StaticDemo sd1 = new StaticDemo();
		
		sd1.show();
		StaticDemo sd2 = new StaticDemo(1,2,3);
		
		
		sd2.show();
		
		StaticDemo sd3 = new StaticDemo();
		sd3.show();
		
		StaticDemo sd4 = sd2;
		sd4.show();
		
		sd1.setX(10);
		sd1.setY(20);
		sd1.setZ(15);
		
		sd1.show();
		sd2.show();
		
		StaticDemo.initialize(100);
		
		sd1.show();
		sd2.show();
		sd3.show();
	}
}