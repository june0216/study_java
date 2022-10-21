
public class Square implements Geometry{//인터페이스 Geometry를 구현한 클래스이다. 
	double side;//변을 저장하는 변수이다. 
	
	public Square(){}//기본 생성자이다. 
	
	public Square(double side)//side를 매개변수로 받아서 생성하는 생성자이다. 
	{
		this.side =  side;
	}
	
	public double area()//square의 넓이를 계산하기 위해서 Geometry의 추상 메소드 area를 이 클래스에 맞게 바디를 구현했다. 
	{
		return side*side;
	}
	
	public double perimeter()//square의 둘레를 구하기 위해서 Geometry의 추상 메소드 perimeter를 이 클래스에 맞게 바디를 구현했다. 
	{
		return side*4; //사각형의 둘레를 구한다. 
	}
	
	public void print()//square의 인스턴스 정보를 출력하기 위한 메소드이다. 
	{
		System.out.println("<Square>");
		System.out.println("Area: " + area());//square의 인스턴스의 area를 출력한다. 
		System.out.println("Circumference: " + perimeter());//square의 인스턴스의 circumference를 출력한다. 
	}

}
