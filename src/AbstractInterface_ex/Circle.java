
public class Circle implements Geometry{//인터페이스 Geometry를 구현한 클래스이다. 
	
	public double radius;// circle의 멤버변수이다. 
	public Circle()//circle의 기본 생성자이다. 
	{}
	
	public Circle(double radius)//radius를 매개변수로 받아서 생성하는 생성자이다. 
	{
		this.radius = radius;
	}
	
	public double area()//circle의 넓이를 계산하기 위해서 Geometry의 추상 메소드 area를 이 클래스에 맞게 바디를 구현했다. 
	{
		return radius*radius*PI;//원의 넓이를 구하는 식이다. 이때, 상수 PI를 사용했다. 
	}
	
	public double perimeter()//둘레을 구하기 위해서 Geometry의 추상 메소드 perimeter를 Circle클래스에 맞게 바디를 구현했다. 
	{
		return 2*PI*radius;//원의 지름을 구하는 식. 상수 PI를 사용했다. 
	}
	
	public void print()
	{
		System.out.println("<Circle>");//circle의 인스턴스 정보를 출력하기 위한 메소드이다. 
		System.out.println("Area: " + area());//circle의 area정보를 출력한다. 
		System.out.println("Circumference: " + perimeter());//circle의 circumference의 정보를 출력한다. 
	}

}
