import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Week10_2_권지윤 {

	public static void main(String[] args) {
		System.out.println("===================");
		System.out.println("전공 : 기독교학과");
		System.out.println("학번 : 1989001");
		System.out.println("이름 : 권지윤");
		System.out.println("===================");
		
		String fileName;//파일 이름을 저장할 변수이다. 
		
		System.out.println("Input File name to write Dog data");
		Scanner sc = new Scanner(System.in);//사용자에게 읽어올 파일 이름을 받아온다. 키보드로 표준 입력에 해당한다. 
		
		while(true)
		{
			fileName = sc.next();//사용자에게 파일 이름을 받는다. 
			if(fileName.contains(".dat"))//이 예제는 .dat파일만 취급하므로 파일명에 .dat 확장자이어야 적합한 파일명이다. (최소한의 형식 체크)
			{
				break;
			}
			else
			{
				System.out.println("파일명을 다시 입력해주세요.");
			}
			//파일 확장자명이 .dat일 때까지 반복한다. 
			
		}
		
		Dog[] myDog = new Dog[10];//배열 참조 변수 선언했다. 
		myDog[0] = new Dog("Merry", 3, 2.5, "Bulldog", false);//각 인스턴스를 생성했다. 
		myDog[1] = new Dog("JJong", 5, 5.5, "Mix", false);
		myDog[2] = new Dog("Kong", 4, 3, "Poodle", true);
		myDog[3] = new Dog("Apple", 2, 2.5, "Collie", true);
		myDog[4] = new Dog("Candy", 5, 5.5, "Coca", false);
		myDog[5] = new Dog("Cutie", 7, 2.5, "Chiwawa", true);
		myDog[6] = new Dog("Peace", 3, 2.5, "Huskey", false);
		myDog[7] = new Dog("Lion", 9, 1.5, "Shepard", true);
		myDog[8] = new Dog("Windy", 2, 9, "Jindo", true);
		myDog[9] = new Dog("Sweetie", 1, 2.5, "Maltiz", false);
		
		try {
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));//생성된 myDog Object를 파일에 쓰기 위해 스트림 생성
			outputStream.writeObject(myDog);//Object를 byte sequence로 표현했기 때문에 다음과 같이 파일에 쓰는 과정이 쉬워졌다. 
			outputStream.close();//스트림을 닫는다. 그러면 버퍼에 있는 것들이 다 파일에 써질 것이다. 
		}
		catch(IOException e){//예외처리를 했다. IO과정에서 오류가 났을 경우 이 예외가 실행될 것이다. 
			System.out.println("Problem with output to file" + fileName);
			System.exit(1);//파일에 대한 문제가 있으므로 프로그램을 종료한다- 비정상적인 상황이 발생하여 종료한 것이므로 exit(1)을 통해 종료한다. 
		}
		
		
		
		Dog[] resultDog = null;//readObject의 결과를 다운 캐스팅한 결과를 담을 변수이다. 
		try{
		
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));//input 스트림을 형성한다. 
			resultDog = (Dog[])inputStream.readObject();//readObject를 통해 Object로 반환된 것을 다운 캐스팅하여 resultDog에 대입한다. 
			System.out.printf("%s\t%s\t%s\t%s\t%s\t\n","Name","Age","Weight","Breed","BoosterShot");
			for(int i = 0; i < resultDog.length; i++)
			{
				System.out.println(resultDog[i].toString());//배열 요소 하나씩 꺼내와서 출력한다. 
			}
			
			System.out.println("\nDogs older than 2 years and did not get the boosterShot.");
			for(int i = 0; i < resultDog.length; i++)//2세 초과이면서 예방접종 안한 강아지를 출력하기 위한 반복문이다. 
			{
				if(resultDog[i].getAge() > 2 && resultDog[i].isBoosterShot() == false)
				{
					System.out.printf("%s		%s\n", resultDog[i].getName(),resultDog[i].getBreed() );//조건에 해당하는 강아지의 이름과 종을 출력
				}
			}
			
			inputStream.close();//input 스트림을 닫는다. 
		}
		catch(EOFException e)//try를 진행하다가 파일의 끝에 오게 되면 파일의 끝이라고 예외처리를 해준다. 
		{
			System.out.println("End of File Exception.");
		}
		catch(FileNotFoundException e)//읽어올 파일이 없을 때 예외를 발생시킨다. 
		{
			System.out.println("File not found Exception.");
			System.exit(1);//프로그램을 종료한다- 비정상적인 상황이 발생하여 종료한 것이므로 exit(1)을 통해 종료한다.
			
		} catch (IOException e) {//IO 부분에서 문제가 생길 때 예외처리를 해준다. 
			System.out.println("IO Exception. ");
			System.exit(1);//프로그램을 종료한다- 비정상적인 상황이 발생하여 종료한 것이므로 exit(1)을 통해 종료한다.
		}
		catch(Exception e)//최고 조상 exception에 해당하는데 정확히는 모르지만 예외상황이 발생할 경우 이 catch문을 실행하게 한다. 
		{
			System.out.println("Exception. ");
			System.exit(1);//프로그램을 종료한다- 비정상적인 상황이 발생하여 종료한 것이므로 exit(1)을 통해 종료한다.
		}
		System.out.println("\nProgram finished");//프로그램이 정상적으로 종료 시 출력될 문장이다

	}

}
