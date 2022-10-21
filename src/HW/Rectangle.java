package HW;

public class Rectangle extends Shape{
	private int width;
	private int height;
	
	public void setPoint(int x, int y, int with, int height)
	{
		x = x;
		y = y;
		this.width = width;
		this.height = height;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Width: " + width + "Height: " + height);
	}

}
