import java.util.Scanner;

public class HW1_2_권지윤 {

	public static void main(String[] args) {
		System.out.println("===================");
		System.out.println("전공 : 기독교학과");
		System.out.println("학번 : 1989001");
		System.out.println("이름 : 권지윤");
		System.out.println("===================");
		Scanner sc = new Scanner(System.in);//사용자의 입력을 받기 위해 scanner 클래스 사용
		String t;
		
		DiceGame d = new DiceGame();//DiceGame 오브젝트를 생성한다. 
		
		while(true)//게임을 실행하는 반복문이다. 
		{
			System.out.println("<< GAME START >>");
			System.out.println("Dice is rolled!!");
			d.startPlaying();//메서드를 실행하면 (주사위 던지기 -> 사용자의 추측값 입력 -> 값 비교 후 결과 출력)이 실행된다. 
			
			while(true)//다시 시도할 것인지에 대한 반복문이다. (잘못된 입력값이 들어올 경우를 고려한 것이다)
			{//잘못된 값이 들어오지 않을 때까지 반복한다.
				System.out.println("Try again?(y/n)");
				t = sc.nextLine();//사용자의 응답을 받아서 저장한다. 
				if(t.equalsIgnoreCase("Y"))//Y또는 y를 입력한 경우 
				{
					System.out.println(""); 
					break;//Y, y를 입력했으므로 올바른 입력값을 입력했으므로 "다시 시도할 것에 대한 반복문"을 종료한다.
				}
				else if(t.equalsIgnoreCase("N"))//n또는 N을 입력한 경우 
				{
					System.out.println("Game finished.");
					System.exit(0);//종료를 원하므로 프로그램을 종료한다. (올바른 입력값이며 종료를 원하므로 프로그램 종료)
				}
				else
				{
					System.out.println("잘못된 입력입니다. ");//Y, y, N, n 이 아닐 경우는 잘못 입력한 값으로 간주되므로 다시 물어본다. 
				}
			}
		}

	}

}
