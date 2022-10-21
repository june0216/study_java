package HW;

public class Circle extends Shape{
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void setPoint(int x, int y, int radius)
	{
		
		this.radius = radius;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Radius r = " + radius);
	}

}
