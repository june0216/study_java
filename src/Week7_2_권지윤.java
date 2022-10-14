import java.util.Scanner;

public class Week7_2_권지윤 {

	public static void main(String[] args) {
		System.out.println("===================");
		System.out.println("전공 : 기독교학과");
		System.out.println("학번 : 1989001");
		System.out.println("이름 : 권지윤");
		System.out.println("===================");
		Scanner sc = new Scanner(System.in);
		int num;// 사용자의 선택을 입력받을 변수이다. 
		Emergency Emer = new Emergency();//각 인스턴스를 생성한다. 
		
		FireEngine fireEngine = new FireEngine();
		Ambulance ambulance = new Ambulance();
		PoliceCar policeCar = new PoliceCar();
		Emergency emergency = new Emergency();
		
		
		
		while(true)// 프로그램을 반복적으로 실행한다. 
		{
			System.out.println("What kind of Emergency?");
			System.out.println("1. Fire		2.Patient		3.Thief		4.Record		5.End");
			num = sc.nextInt();//사용자가 1~5까지의 선택지 중 하나를 선택하여 숫자를 입력한다. 그리고 num 변수에 대입한다. 
			if(num == 1)//1을 입력한 것은 fireEngine 인스턴스를 선택한 것이다. 
			{
				emergency.EM_Call(fireEngine);// EM_Call 내부에 emgList에 호출한 인스턴스를 대입하는 부분이 있으므로 emgList에 FireEngine 인스턴스가 들어간다. 
			}
			else if(num == 2)//2을 입력한 것은 ambulance 인스턴스를 선택한 것이다. 
			{
				emergency.EM_Call(ambulance);//emgList에 Ambulance 인스턴스가 들어간다.
			}
			else if(num == 3)//3을 입력한 것은 policeCar 인스턴스를 선택한 것이다. 
			{
				emergency.EM_Call(policeCar);//emgList에 PoliceCar 인스턴스가 들어간다.
			}
			else if(num == 4)//4을 입력한 것은 EM_record(지금까지의 리스트들을 출력)을 선택한 것이므로 emergency인스턴스의 메소드를 호출한다
			{
				emergency.EM_record();
			}
			else if(num == 5) {//5를 입력한 것은 프로그램의 반복을 종료한다는 의미이므로 break으로 프로그램을 종료한다. 
				System.out.println("Finished");
				break;
			}
			else
			{//1~5까지의 선택지 이외의 값을 입력하면 다음과 같이 출력되도록 한다. 
				System.out.println("Wrong Input");
			}
			
		}

	}

}
