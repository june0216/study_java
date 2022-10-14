package polymorphism;
import java.util.Scanner;

public class Week7_1_권지윤 {

	public static void main(String[] args) {
		System.out.println("===================");
		System.out.println("전공 : 기독교학과");
		System.out.println("학번 : 1989001");
		System.out.println("이름 : 권지윤");
		System.out.println("===================");
		int num;//사용자가 입력할 선택지를 저장할 변수이다. 
		
		Buyer Buyer1 = new Buyer();//각각의 인스턴스 생성한다. 
		Tv tv = new Tv();
		Computer cp = new Computer();
		Audio ad = new Audio();
		Video vd = new Video();
		NoteBook nb = new NoteBook();
		
		Product pd = new Product();
		
		System.out.println("How much money do you have? ");
		Scanner sc = new Scanner(System.in);//money를 사용자에게 입력을 받는데 음수를 받는 경우를 제외하기 떄문에 따로 조건을 추가하지 않는다. 
		Buyer1.money = sc.nextInt();//Buyer 멤버변수 money는 사용자의 입력을 받아서 저장한다. 
		
		while(true)//반복문을 계속한다 
		{
			
			System.out.println("What do you want to buy? Input 0 to quit");
			System.out.println("1. Tv(100)		2. Computer(200) 		3. Video(110) 		4.Audio(50)		5.NoteBook(300) ");
			num = sc.nextInt();//사용자가 원하는 항목의 번호를 입력 받는다 그리고 변수에 대입한다. 
			if(num == 0)//0을 입력하면 프로그램을 반복문을 종료한다 
			{
				break;
			}
			
			
			if(num == 1)//1을 입력하면 tv이므로 tv인스턴스의 정보가 필요하다. 
			{
				if(tv.price > Buyer1.money) {
					System.out.println("\nMoney is not enough. \n");
					//tv의 가격보다 Buyer1가 가지고 있는 돈보다 많으면 살 수 없다. 
					break;
				}
				Buyer1.buy(tv);//살 수 있는 상황이면 tv 인스턴스의 메소드를 실행하여 
				// shopping 리스트에 추가하고 보너스 포인트 적립하고 Buyer1의 돈에서 차감한다. 
				
				
			}
			else if(num == 2)//2는 computer이므로 computer의 인스턴스의 정보가 필요하다. 
			{
				if(cp.price > Buyer1.money) {
					System.out.println("\nMoney is not enough. \n");
					break;
					//computer의 가격보다 Buyer1가 가지고 있는 돈보다 많으면 살수 없으므로 반복문을 종료한다.
				}
				
				Buyer1.buy(cp);//computer의 가격보다 Buyer1의 돈이 더 많다면 살 수 있으므로 
				//shopping list에 추가하고 money에서 차감하고 보너스 포인트를 적립하는 과정을 거친다. 
				
				
			}
			else if(num == 3)//3은 video를 사는 상황이므로 video의 인스턴스 정보가 필요하다. 
			{
				if(vd.price > Buyer1.money) {//video의 가격보다 Buyer1가 가지고 있는 돈보다 많으면 살수 없으므로 반복문을 종료한다.
					System.out.println("\nMoney is not enough. \n");
					break;
				}
				
				Buyer1.buy(vd);//video의 가격보다 Buyer1의 돈이 더 많다면 살 수 있으므로 
				//shopping list에 추가하고 money에서 차감하고 보너스 포인트를 적립하는 과정을 거친다. 
				
				
			}
			else if(num == 4) {
				if(ad.price > Buyer1.money) {
					System.out.println("\nMoney is not enough. \n");
					break;
					//video의 가격보다 Buyer1이 가지고 있는 돈보다 많으면 살수 없으므로 반복문을 종료한다.
				}
				Buyer1.buy(ad); //Audio의 가격보다 Buyer1의 돈이 더 많다면 살 수 있으므로 
				//shopping list에 추가하고 money에서 차감하고 보너스 포인트를 적립하는 과정을 거친다. 
				
				
				
			}
			else if(num == 5)
			{
				if(nb.price > Buyer1.money) {
					System.out.println("\nMoney is not enough. \n");
					break;
					//notebook의 가격보다 Buyer1가 가지고 있는 돈보다 많으면 살수 없으므로 반복문을 종료한다.
				}
				Buyer1.buy(nb);//notebook의 가격보다 Buyer1의 돈이 더 많다면 살 수 있으므로 
				//shopping list에 추가하고 money에서 차감하고 보너스 포인트를 적립하는 과정을 거친다. 
				
			}
			else //보기에 제시된 숫자 이외의 수나 다른 것들을 입력하면 다음과 같은 문장을 실행한다. 
			{
				System.out.println("No such item.");
			}
				
		
					
		}
		
		System.out.println("");
		Buyer1.summary();//Buyer1이 샀던 리스트, 남아있는 돈, 보너스 포인트를 출력한다. 
	}
	

}
