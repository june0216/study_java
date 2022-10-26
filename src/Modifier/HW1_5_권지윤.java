package Modifier;

import java.util.Scanner;

public class HW1_5_권지윤 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
		System.out.println("전공 : 기독교학과");
		System.out.println("학번 : 1989001");
		System.out.println("이름 : 권지윤");
		System.out.println("===================");
		Scanner sc = new Scanner(System.in);//사용자의 입력을 받기 위해 scanner 클래스 사용 
		int menu;//사용자가 원하는 작업 선택 
	
		
	
		Shape[] myShape = new Shape[10];//참조 변수는 부모타입으로 한다. 아직 인스턴스는 없는 상태이다. 
		for(int i = 0; i < 10; i++)// 배열은 최대 10까지라고 했으므로 10개의 요소만 반복문을 돌린다( 그 전에 EXIT을 하면 반복문을 강제 종료한다)
		{
			System.out.println("1.Circle	2.Rectangle		3.Show		4.Exit ");
			menu = sc.nextInt();//사용자가 원하는 번호를 입력 받아 저장한다. 
			if(menu == 1)//사용자가 원하는 것이 1이라면 Circle에 해당하는 것이다. 
			{
				myShape[i] = new Circle();//사용자가 원하는 것에 맞게 circle 인스턴스 생성 (인스턴스틑 Shape의 자식 클래스로 생성한다)
				System.out.print("x = ");
				int x = sc.nextInt();//circle의 x의 값은 int이므로 nextInt로 입력받는다. 
				System.out.print("y = ");
				int y = sc.nextInt();//circle의 y의 값은 int이므로 nextInt로 입력받는다. 
				System.out.print("r = ");
				int r = sc.nextInt();//circle의 r의 값은 int이므로 nextInt로 입력받는다. 
				if(myShape[i] instanceof Circle)//참조 변수 배열의 타입은 Shape이므로 조상이다. 그러므로 자식에서 오버로딩된 함수에 접근할 수 없다. 
				{//하지만 자식 클래스의 setPoint를 사용하기 위해(접근하기 위해) 형변환을 해준다. instanceof로 circle의 인스턴스가 맞는지 확인한 후 형변환한다. 
					Circle c = (Circle)myShape[i];//circle로 형변환
					c.setPoint(x, y, r);//circle의 setPoint메소드를 통해 x, y, z값을 입력한다. 그러면 인스턴스에 값이 대입될 것이다. 
				}
			}
			else if(menu == 2)//사용자가 원하는 번호가 2라면 Rectangle에 해당한다. 
			{
				myShape[i] = new Rectangle();//Rectangle 인스턴스 생성 (인스턴스틑 Shape의 자식 클래스로 생성한다)
				System.out.print("x = ");
				int x = sc.nextInt();//rectangle의 x의 값은 int이므로 nextInt로 입력받는다.
				System.out.print("y = ");
				int y = sc.nextInt();//rectangle의 y의 값은 int이므로 nextInt로 입력받는다.
				System.out.print("w = ");
				int w = sc.nextInt();//rectangle의 w의 값은 int이므로 nextInt로 입력받는다.
				System.out.print("h = ");
				int h = sc.nextInt();//rectangle의 h의 값은 int이므로 nextInt로 입력받는다.
					
				if(myShape[i] instanceof Rectangle)//참조 변수 배열의 타입은 Shape이므로 이를 통해 Rectangle가 오버로딩한 함수에 접근할 수 없다. 
				{//하지만 rectangle에서 오버로딩한 함수에 접근하기 위해 Rectangle로 형변환하여 setPoint에 접근 가능하게 하여 이를 사용한다. 
					Rectangle r = (Rectangle)myShape[i];
					r.setPoint(x, y, w, h);//Rectangle의 setPoint메소드를 통해 x, y, z값을 입력한다. 그러면 인스턴스에 값이 대입될 것이다. 
				}
			}
			else if(menu == 3)//3이면 지금까지 입력했던 값들의 정보를 출력하는 것이다. 
			{
				for(int j = 0; j < i; j++)//지금까지 입력했던 인덱스들을 하나씩 꺼내서 출력한다. 
				{
					myShape[j].display();//display는 오버라이딩했기 때문에 덮어쓴 것이므로 부모타입의 참조변수는 자손 클래스가 오버라이딩한 내용을 출력한다. 
				}
				i--;//배열에 대한 인덱스 하나하나씩 for 문이 돌아가는데 3(출력)을 할 때도 i가 증가하기 때문에 그 인덱스에는 null이 들어가고 다음 인덱스로 넘어간다. 
				//이것을 처리하기 위해 그냥 넘어간 인덱스를 원상태로 돌리는 작업이다.
			}
			else if(menu == 4)//종료
			{
				System.exit(0);//프로그램을 종료한다. 
			}
			else//보기(1~4)에 없는 값은 잘못된 입력으로 간주한다. 
			{
				System.out.println("잘못된 입력입니다. ");
			}
			System.out.println("");
			
		}
				
	
		
		

	}

}
