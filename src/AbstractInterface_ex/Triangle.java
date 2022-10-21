
public class Triangle implements Geometry{//인터페이스 Geometry를 구현한 클래스이다. 
	public double a;//삼각형의 변을 저장하는 변수이다. 
	public double b;//삼각형의 변을 저장하는 변수이다
	public double c;//삼각형의 변을 저장하는 변수이다
	
	
	public Triangle(){}//기본 생성자이다. 
	
	public Triangle(double a, double b, double c)//각 변 a, b, c를 입력받아서 생성하는 생성자이다. 
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double area()//triangle의 넓이를 계산하기 위해서 Geometry의 추상 메소드 area를 이 클래스에 맞게 바디를 구현했다. 
	{
		double s;//넓이 계산을 위해 필요한 변수이다. a, b,c가 double형이므로 (a+b+c)/2의 결과를 저장하기 위해 
		s = (a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));//삼각형의 넓이를 계산하기 위한 것이다. 
		//Math 클래스를 사용하여 절대값을 구한다.  

	}
	
	public double perimeter()//triangle의 둘레를 구하기 위해서 Geometry의 추상 메소드 perimeter를 이 클래스에 맞게 바디를 구현했다. 
	{
		return a+b+c;//둘레는 3개의 변을 더하면 된다. 
	}
	
	public void print()//triangle의 인스턴스 정보를 출력하기 위한 메소드이다. 
	{
		System.out.println("<Triangle>");
		System.out.println("Area: " + area());//triangle의 인스턴스의 area를 출력한다. 
		System.out.println("Circumference: " + perimeter());//triangle의 인스턴스의 circumference를 출력한다.
	}

}
