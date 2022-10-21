package HW;

public class Shape {
	private int x;
	private int y;
	
	public Shape() {}//기본 생성자 
	
	public int getX()
	{
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void setX(int x) {//this 확인 필요 
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void setPoint(int x, int y)
	{
		this.x = x;
		this.y = y; //다시 확인 필요 ..
	}
	
	public void display()
	{
		System.out.println("Point (x, y) = (" + x + "," + y +")");
	}
	

}
