

public class Rectangle extends Shape{//Shape 를 상속받는다. 
	private int width;//Rectangle의 멤버변수이다. 
	private int height;
	
	public int getWidth() {//private 이므로 값을 읽어올 수 있도록 public 메서드 선언 
		return width;
	}
	
	public int getHeight()//private 이므로 값을 읽어올 수 있도록 public 메서드 선언 
	{
		return height;
	}
	
	public void setWidth(int width)//private이므로 값을 수정할 수 있도록  public 메서드 선언 
	{
		this.width = width;
	}
	public void setHeight(int height)//private이므로 값을 수정할 수 있도록  public 메서드 선언 
	{
		this.height = height;
	}
	
	public void setPoint(int x, int y, int width, int height)//Shape 클래스에 있던 setPoint 메소드를 오버로딩한 것이다. 
	{
		super.setPoint(x, y);//조상 메소드 호출
		this.width = width;
		this.height = height;
	}
	
	public void display()//display()를 오버라이딩 
	{
		super.display();//조상 메서드 display() 호출한다. (조상 메서드와 동일한 작업의 부분)
		System.out.println("Width: " + width +", "+ "Height: " + height);//Rectangle만의 값을 출력하기 위해 추가한 부분이다. 
	}

}
