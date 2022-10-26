

public class Shape {
	private int x;
	private int y;
	
	public Shape() {}//기본 생성자 
	
	public int getX()//x는 private이기 때문에 외부에서 값을 알 수 없으므로 public메소드를 통해 값을 알아낼 수 있게 한다. 
	{
		return x;
	}

	public int getY() {//y는 private이기 때문에 외부에서 값을 알 수 없으므로 public메소드를 통해 값을 알아낼 수 있게 한다. 
		return y;
	}
	
	public void setX(int x) {//x는 private이기 떄문에 외부에서 수정할 수 없으므로 public 메소드를 통해 수정할 수 있게 했다 
		this.x = x;
	}

	public void setY(int y) {//y는 private이기 떄문에 외부에서 수정할 수 없으므로 public 메소드를 통해 수정할 수 있게 했다 
		this.y = y;
	}
	
	public void setPoint(int x, int y)//x, y를 입력 받아 각각의 값을 대입하는 메서드이다. 
	{
		this.x = x;
		this.y = y;
	}
	
	public void display()//x, y의 값을 출력한다. 
	{
		System.out.println("Point (x, y) = (" + x + "," + y +")");
	}
	

}
