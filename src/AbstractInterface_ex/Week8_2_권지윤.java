import java.util.Scanner;

public class Week8_2_권지윤 {

	public static void main(String[] args) {
		System.out.println("===================");
		System.out.println("전공 : 기독교학과");
		System.out.println("학번 : 1989001");
		System.out.println("이름 : 권지윤");
		System.out.println("===================");
		Scanner sc = new Scanner(System.in);//사용자의 입력을 받기 위해 scanner 클래스를 사용한다. 
		
		
		System.out.println("Input radius for a circle");
		Circle c = new Circle();//circle 인스턴스를 생성한다. 
		c.radius = sc.nextDouble();//radius는 double이므로 nextDouble로 입력을 받는다. 
		System.out.println("Input length for a square");
		Square s = new Square();//square 인스턴스를 생성한다. 
		s.side = sc.nextDouble();//side는 double형 이므로 nextDouble로 입력을 받는다.
		
		System.out.println("Input a for a triangle");
		Triangle t = new Triangle();//Triangle의 인스턴스 생성한다. 
		t.a = sc.nextDouble();//a변수는 double형이므로 nextDouble로 입력을 받는다.
		
		System.out.println("Input b for b triangle");
		t.b = sc.nextDouble();//위에서 생성한 인스턴스의 b값을 대입한다. b변수도 double 형이므로 nextDouble을 통해 입력을 받는다. 
		
		System.out.println("Input c for c triangle");
		t.c = sc.nextDouble();//위에서 생성한 인스턴스의 c값을 대입한다. c변수도 double형이므로 nextDouble을 통해 입력을 받는다. 
		
		c.print();//Circle에 인스턴스의 area와 circumference를 출력하는 함수를 불러온다. 
		s.print();//Square에 인스턴스의 area와 circumference를 출력하는 함수를 불러온다. 
		t.print();//Triangle에 인스턴스의 area와 circumference를 출력하는 함수를 불러온다. 
		
		

	}

}
