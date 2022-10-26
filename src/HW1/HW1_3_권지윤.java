

import java.util.Scanner;

public class HW1_3_권지윤 {

	public static void main(String[] args) {
		System.out.println("===================");
		System.out.println("전공 : 기독교학과");
		System.out.println("학번 : 1989001");
		System.out.println("이름 : 권지윤");
		System.out.println("===================");
		int num;//사용자가 입력할 선택지를 저장할 변수이다. 
		int i;//buyer의 배열의 인덱스를 나타내기 위한 변수이다. 
		
		Scanner sc = new Scanner(System.in);//사용자의 입력을 받기 위해 Scanner클래스 사용했다. 
		Product[] pd = new Product[3];//Product 배열을 생성한다. (Product의 종류는 3가지이므로 이를 고려했다)
	
		pd[0] = new Tv();// tv의 인스턴스를 생성하여 배열에 넣었다. 
		pd[1] = new Computer();// computer의 인스턴스를 생성하여 배열에 넣었다. 
		pd[2] = new Audio();// Audio의 인스턴스를 생성하여 배열에 넣었다. 
		
		
		System.out.println("How many buyers? ");
		num = sc.nextInt();//buyers이 몇명 있는지 사용자에게 입력을 받는다. 
		System.out.println("");
		
		
		Buyer[] buyers = new Buyer[num];//앞에서 사용자가 입력한 숫자만큼 Buyer의 배열을 생성한다. 
		
		for(i = 0; i < buyers.length; i++)//입력받은 숫자의 buyers들이 있고 한 명씩 순서대로 물건을 구입한다. 
		{
			buyers[i] = new Buyer();//buyer의 인스턴스를 생성한다. 
			System.out.println("<Buyer"+ (i+1) +">");//배열은 0번부터들어가지만 0번에 들어있는 buyer를 buyer1로 출력하기 위해 i+1을 통해 표현했다. 
			while(true)//금액을 입력받는 부분이다. 만약 정상적인 범위 내의 입력값이 아니면 입력할 때까지 반복한다. 
			{
				System.out.println("How much money do you have? ");
				if(buyers[i].setMoney(sc.nextInt()))//잘 입력되었으면(true) 돈을 묻는 질문은 그만한다. 
				{
					break;//금액을 묻는 반복문 종료 
				}
			}
			
			
			while(true)//한 명의 buyer가 물건을 사는 과정을 반복문을 통해 실행한다. 
			{
				
				System.out.println("Choose the item. You have "+ buyers[i].getMoney() + "won left. Input 0 to quit");//item을 선택할 떄마다 남은 금액을 보여준다. 
				System.out.println("1. Tv(100)		2. Computer(200) 		3. Audio(50)");
				int menu = sc.nextInt();//사용자가 원하는 항목의 번호를 입력 받는다 그리고 변수에 대입한다. 
				if(menu == 0)//0을 입력하면 프로그램을 반복문을 종료한다 
				{
					break;
				}
				else if(menu == 1 || menu == 2 || menu == 3)//1 혹은 2 혹은 3을 입력하면 물건을 구매한다는 이야기이다. 
				{//사용자가 입력한 값 menu에서 1은 tv, 2는 computer,  3은 Audio를 의미하한다. 
					buyers[i].buy(pd[menu-1]);//배열 pd의 인덱스 0에는 tv, 1에는 computer , 3에는 audio의 인스턴스가 있다. 
					//즉, (menu-1)는 선택한 물건 인스턴스가 있는 pd 배열의 인덱스라고 할 수 있다. 
					//pd[menu-1]이렇게 배열의 인덱스에 접근하면 사용자가 원하는 종류의 인스턴스에 접근할 수 있다. 
					//buy 함수 내에서 이 물건을 살 수 있는지 확인하는 로직이 있는데 만약 금액이 부족하면 부족하다고 출력이 되며 다시 물건의 종류를 고르도록 반복한다. 
				}
				else
				{
					System.out.println("Wrong Input");// 보기에 없는 0, 1,2 ,3 이외의 값을 입력하면 다음과 같이 출력한다. 
				}
			}
			System.out.println("");//간격을 위해 삽입한 문장
				
					
			
						
		}//입력 반복문 종료 
		System.out.println("<Shopping Result>");
		for(int j = 0; j < num ; j++)//buyers에 있는 인스턴스 하나하나씩 꺼내서 정보를 출력한다. 
		{
			System.out.println("<Buyer "+ (j+1) +">");
			buyers[j].summary();//Buyer의 summary함수를 통해 구매 내역, 돈, 보너스 포인트를 출력한다. 
		}
			
			

	}
	
	
		
	
	}
	


