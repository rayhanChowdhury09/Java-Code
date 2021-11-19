import java.lang.*;

public class Box
{
	private double length;
	private double width;
	private double height;
	
	public void setLength(double l)
	{
		length = l;
	}
	public void setWidth(double w)
	{
		width = w;
	}
	public void setHeight(double h)
	{
		height = h;
	}
	
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	public double getHeight()
	{
		return height;
	}
	
	public static void main(String args[])
	{
		Box b = new Box();
		
		b.setLength(3.1);
		b.setWidth(1.9);
		b.setHeight(1.7);
		
		//System.out.print("Lenght is: " + b.getLength() + "\n");
		System.out.println("Lenght is: " + b.getLength());
		System.out.println("Width is: " + b.getWidth());
		System.out.println("Height is: " + b.getHeight());
	}
}