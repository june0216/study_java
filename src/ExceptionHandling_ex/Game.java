package ExceptionHandling_ex;
import java.util.Scanner;

public class Game {
	
	int resultY;//사람이 몇번 우승했는지 저장해놓는 변수이다. 
	int resultC;//컴퓨터가 몇번 우승했는지 저장해놓는 변수이다. 
	int yours;//사람이 낸 것(가위, 혹은 바위, 혹은 보)에 대응되는 숫자를 저장함
	int coms;//컴퓨터가 낸 것(가위, 혹은 바위, 혹은 보)에 대응되는 숫자를 저장함

	public void input()//사용자의 입력을 받는 함수이다. 
	{
		Scanner sc = new Scanner(System.in);
		try {
			yours = sc.nextInt();//사용자의 입력을 받아서 저장한다. 
			if(yours < 1 || yours > 4)//1, 2, 3만 입력 가능하므로 이외의 값들은 예외처리를 해주었다 
				throw new Exception("범위가 잘못되었습니다. ");//예외가 발생할 경우 catch문으로 던져준다. 
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());//Exception에서 보낸 String을 화면에 출력한다. 
		}
		
	}
	
	public void play()//게임 시작 및 반복적으로 가위바위보하다가 최종 결과를 출력하는 부분이다. 
	{
		
		System.out.println("가위바위보 게임을 시작합니다.");
		
		while(true)//먼저 3점이 나올 때까지 반복한다. 
		{
			System.out.println("\n당신의 선택은?(You(" + resultY  + ") - com(" + resultC + "))");//현재의 각자 점수를 보여주기
			input();//사용자로부터 키보드 입력을 받기 
			setComs();//random()을 사용하여 컴퓨터가 정한 숫자 저장하기 
			System.out.println("<You>	<Com>");
			System.out.printf("%s	%s", translate(yours), translate(coms));//각자 무엇을 냈는지 보여주기
			//이때, 저장한 값은 int형이므로 이에 대응하는 문자열을 매칭시켜서 출력시킨다. 
			writeOutput();//각자 낸 것을 비교 후 승자를 출력한다. 
			if(resultC == 3 || resultY == 3)//누가 한 명이 먼저 3점을 가져가서 이기면 
			{
				System.out.println("\nYou(" + resultY  + ")   com(" + resultC + ")");//최종 점수를 출력하고 
				show();//최종 승자를 출력한다. 
				System.out.println("게임을 종료합니다.");
				break;//반복문을 종료한다. 
			}
		}
		
	}
	
	public String translate(int num)//가위 : 1, 바위 : 2, 보 : 3를 문자로 바꾸어주는 함수이다. 
	{
		if(num == 1) {//1은 가위에 해당한다. 
			return "가위";
			
		}
		else if(num ==2)//2는 바위에 해당한다. 
		{
			return "바위";
		}
		else
		{
			return "보";//3은 보에 해당한다. (1, 2에 해당 하지 않으면 3밖에 안남음 -> 범위에 맞지 않는 값을 예외 처리로 막아놓았음)
		}
	}
	
	private void setComs()//컴퓨터가 가위바위보를 랜덤으로 내고 이를 저장하는 함수이다. 
	{
		coms = (int)(Math.random()*3)+1;//1, 2, 3중 랜덤으로 하나 뽑아서 저장한다. (난수 생성을 이용한 것이다)
	}
	
	public void writeOutput()//각자 낸 것을 바탕으로 누가 이겼는지 판별하고 결과를 출력한다. 
	{
		int result = yours - coms;//조건들을 간단하게 하기 위해 연산 결과를 이용했다. 
		if(result == 0)//만약 컴퓨터와 인간이 같은 것을 냈다면 두 개를 뺀 결과가 0일 것이다. 
		{
			System.out.println("\n비김");
		}
		else if(result == -1 || result == 2) //컴터가 이기는 경우는 result를 계산한 결과는 -1, 2, -1이다. (컴퓨터가 바위로 이겼을 때 1 - 2 이므로 result 는 -1), (컴퓨터가 가위로 이겼을 때 result == 3 -1 이므로 2이다. ), (컴퓨터가 보로 이겼을 때 2-3이므로 result의 값은 1이다. )일 때이다. 
		{
			System.out.println("\n컴퓨터 승");
			resultC++;//컴퓨터 점수를 증가시킨다. 
		}
		else if(result == 1 || result == -2)//위의 결과에서 가위바위보 한 각자의 결과를 가지고 result를 계산한 결과를 각각 음수를 취한 것은 사용자가 이겼을 때이다. 
		{
			System.out.println("\n당신 승");
			resultY++;//인간의 점수를 증가시킨다. 
		}
		else {
			System.out.println("잘못된 입력입니다.");//혹시 이상한 숫자가 나올 경우를 대비하여 잘못된 입력이라고 출력하게 한다. 
		}

	}
	
	public void show()//최종 결과를 출력하는 함수이다. 
	{
		if(resultY > resultC)//최종 점수가 인간이 더 클 경우 
		{
			System.out.println("당신이 이겼습니다. ");
		}
		else if(resultY < resultC)//최종 점수가 컴퓨터가 더 클 경우 
		{
			System.out.println("컴퓨터가 이겼습니다. ");
		}
		else//위의 조건들에 해당하지 않으면 두 점수가 동일하다는 것이다. 하지만 프로그램 로직 상 한 명씩만 득점이 가능하기 때문에 둘 다 같이 3점이 될 경우는 없다. 
		{
			System.out.println("잘못된 결과입니다. ");//혹시나 변수의 문제로 인해 같은 값이 나올 수도 있는 경우를 대비하여 이렇게 출력하도록 했다. 
		}
	}

}
