
public class Circle extends Shape{//Shape를 상속 받는다. 
	private int radius;//circle의 멤버 변수이다. 
	
	public Circle() {//기본 생성자이다. 
	}

	public int getRadius() {//radius는 private이므로 외부에서 접근이 불가능하므로 public 메서드를 통해 값을 알아낸다. 
		return radius;
	}

	public void setRadius(int radius) {//radius는 private이므로 외부에서 접근이 불가능하므로 public 메서드를 통해 값을 수정한다. 
		this.radius = radius;
	}
	
	public void setPoint(int x, int y, int radius)//Shape 클래스에 있던 setPoint 메소드를 오버로딩한 것이다. 
	{
		super.setPoint(x, y);//조상 메소드 호출
		this.radius = radius;
	}
	
	public void display()//display() 메소드 오버라이딩한 것이다. 
	{
		super.display();//조상 메소드 호출한다. 
		System.out.println("Radius r = " + radius);//circle에만 해당하는 값은 따로 처리하여 출력 (추가한 부분이다, 재정의 )
	}

}
