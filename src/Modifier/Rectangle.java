package Modifier;

public class Rectangle extends Shape{
	private int width;
	private int height;
	
	public void setPoint(int x, int y, int width, int height)//메소드 오버로딩
	{
		super.setPoint(x, y);//조상 메소드 호출
		this.width = width;
		this.height = height;
	}
	
	public void display()//오버라이딩 
	{
		super.display();
		System.out.println("Width: " + width +", "+ "Height: " + height);
	}

}
