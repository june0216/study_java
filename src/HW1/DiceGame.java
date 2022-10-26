import java.util.Scanner;

public class DiceGame {
	
	private int diceFace;
	private int userGuess;
	
	public DiceGame() {}//기본 생성자이다. 
	
	
	private int rollDice() {//diceFace에는 아무 값이나 들어갈 수 없으므로 범위를 검증하는 조건을 추가했다. 또한 이 변수는 자동적으로 랜덤 값이 들어가야 하기 때문에 Math.random을 사용했다. 
		int num = (int)(Math.random()*6) + 1; //math.random은 0.0 <= Math.random < 1.0 범위의 double값 난수 반환이다. 주사위 눈을 랜덤으로 반환한다. 
		return num;
	}
	
	private void setUserInput()//setUserGuess와 같은 역할을 한다. userGuess가 될 수 있는 조건이 정해져있기 때문에 아무 값이나 바로 대입할 수 없으므로 조건을 넣어 구성했다. 
	{
		Scanner sc = new Scanner(System.in);// 사용자의 입력을 받기 위해 Scanner 클래스 사용 
		System.out.println("Guess the number! What do you think?");
		while(true)//사용자가 범위에 맞는 값을 입력할 때까지 반복한다. 
		{
			int temp = sc.nextInt();
			if(temp >= 1 && temp <= 6)// 1~6 사이이면 정상적인 값이다. 
			{
				userGuess = temp;//정상적인 값이므로 멤버 변수에 대입한다. 
				break;//사용자에게 묻는 반복문을 종료한다. 
			}
			else
			{
				System.out.println("Input number between 1~6.");//범위밖의 값이므로 이를 출력하고 다시 반복문을 통해 사용자의 입력을 또 받는다. 
			}
			
		}
	}
	private void checkUserGuess()//userGuess 와 diceFace의 값 일치 여부 판별 메서드 
	{
		if(diceFace == userGuess)//유저가 추측한 값과 주사위의 값이 같으면 
		{
			System.out.println("Bingo!");//빙고를 출력한다. 
		}
		else//유저가 추측한 값과 주사위의 값이 다르면 
		{
			System.out.println("Wrong!");//wrong을 출력한다. 
			System.out.println("The face was " + diceFace);//그리고 주사위의 값을 출력하여 정답을 알려준다. 
		}
	}
	
	public void startPlaying()//주사위 게임을 실행하는 메소드 (주사위 던지기 -> 사용자의 추측값 입력 -> 값 비교 후 결과 출력)
	{
		diceFace = rollDice();//diceFace값 생성 후 저장 
		setUserInput();//setUserInput 을 통해 userGuess 값 생성
		checkUserGuess();//결과 출력 
	}
	
	
	
	

}
