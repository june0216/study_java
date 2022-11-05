import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Week10_1_권지윤 {
	public static void main(String[] args) {
		System.out.println("===================");
		System.out.println("전공 : 기독교학과");
		System.out.println("학번 : 1989001");
		System.out.println("이름 : 권지윤");
		System.out.println("===================");
		
		String fileName;//기존에 있던 파일 이름을 저장할 변수 
		String newFile;//새로 만들어진 파일 이름을 저장할 변수 
		
		System.out.println("File name for input:");
		Scanner sc = new Scanner(System.in);//사용자에게 읽어올 파일 이름을 받아온다. 키보드로 표준 입력에 해당한다. 
		

		while(true)
		{
			fileName = sc.next();
			if(fileName.contains(".dat"))//이 예제는 .dat파일만 취급하므로 파일명에 .dat 확장자가 있어야 한다. 
			{//파일 명이 없는 파일명이면 밑에서 스트림 생성하고 파일을 읽어올 때 예외처리가 되어있으므로 여기서는 파일 형식에 맟는지만 체크해준다. 
				break;
			}
			else
			{
				System.out.println("파일명을 다시 입력해주세요.");
			}
			//파일 확장자명이 ".dat"일 때까지 반복한다. 
		}
		
		System.out.println("File name for output:");
		while(true)
		{
			newFile = sc.next();
			if(fileName.contains(".dat"))//이 예제는 .dat파일만 취급하므로 파일명에 .dat 확장자가 있어야 한다. (최소한의 예외처리)
			{
				break;
			}
			else
			{
				System.out.println("파일명을 다시 입력해주세요.");
			}
			//파일 확장자명이 .dat일 때까지 반복한다. 	
		}
		
		try {//스트림을 2개 열어야 한다. 그 중 쓰기에 대한 try문이다. 
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(newFile));//결과 파일에 저장해야하므로 output 스트림 생성
			
			try{//스트림을 2개 열어야했는데 읽기는 열었고 쓰기가 열어진 상태에서 읽기 위한 스트림을 열 것이고 이에 대한 try문이다. 
				
				ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));//먼저 그리고 이전의 파일을 읽어오기 위해 스트림을 생성한다. 
				System.out.println("The numbers in File, " + fileName);
				try {//readInt를 수행에 대한 try문
					while(true)//EOFException이 발생할 때까지 읽는다. 즉 파일의 끝까지 읽는다. 
					{
						int anInteger = inputStream.readInt();//스트림에서 int형을 읽어온다. 
						System.out.println(anInteger);//읽어온 것을 화면에 출력한다. (콘솔에 출력  - 표준 출력)
						outputStream.writeInt(anInteger*2);//처음에 열어놓은 output 스트림을 통해 파일에 방금 읽어온 수에 2를 곱해서 저장한다. 
						//하나씩 반복한다. 
					}
				}
				catch(EOFException e)//파일을 끝까지 다 읽었을 경우 catch문을 실행하게 된다. (파일의 내용을 다 읽었으므로)
				{
					System.out.println("End of reading from file, " + fileName);
				}
				inputStream.close();//파일을 다 읽었으므로 스트림을 닫는다. 
			}
			catch(FileNotFoundException e)//input Stream에서 예외 발생 시 수행될 부분
			{
				System.out.println("Cannot find the file " + fileName);
				System.exit(1);//파일이 아예없으므로 파일 복사를 수행할 수 없다. 그래서 프로그램을 비정상적으로 종료해야 한다. 
				
			} catch (IOException e) {//input Stream에서 IOException예외 발생 시 수행될 부분
				System.out.println("Problem with input from File " + fileName);
				System.exit(1);//파일을 읽는 것에 문제가 생겼으므로 해당 파일에 대한 처리(파일 내용의 복사)가 불가능하기 때문에 프로그램을 비정상적인 종료를 통해 종료한다.
			}

			
			System.out.println(newFile+" is generated.");//파일을 다 읽었고 동시에 쓰는 것도 다 완료했으므로 새로운 파일이 생성되었다는 것을 출력함
			outputStream.close();//파일에 쓰는 것을 완료했으므로 output 스트림도 닫아주어야 한다. 
			
		}
		catch(IOException e){//outputStream에서 IO 예외가 발생할 시 수행되는 부분이다. 
			System.out.println("Problem with output to file" + fileName);
			System.exit(1);//프로그램을 종료한다- 비정상적인 상황이 발생하여 종료한 것이므로 exit(1)을 통해 종료한다.
			
		}
		

		System.out.println("");//간격을 위해 넣은 문장
		try{//새로 생성된 파일을 읽기 목적으로 다시 input스트림을 연다. 
			
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(newFile));//input 스트림을 열었다. 
			System.out.println("The numbers in new File, " + newFile);
			try {//readInt를 수행하기 위한 try문
				while(true)
				{
					int anInteger = inputStream.readInt();
					System.out.println(anInteger);
				}
			}
			catch(EOFException e)//파일을 끝까지 다 읽었을 경우 readInt에 대한 반복문을 종료하고 catch문을 실행하게 된다. (파일의 내용을 다 읽었으므로)
			{
				System.out.println("End of reading from 2nd File, " + newFile);
			}
			inputStream.close();//파일을 다 읽었으므로 스트림을 끊는다. 
		}
		catch(FileNotFoundException e)//inputStream에서 FileNotFoundException발생할 경우 
		{
			System.out.println("Cannot find the file " + fileName);
			System.exit(1);//프로그램을 종료한다- 비정상적인 상황이 발생하여 종료한 것이므로 exit(1)을 통해 종료한다.
			
		} catch (IOException e) {//inputStream에서 IOException가 발생할 경우
			System.out.println("Problem with input from file " + fileName);
			System.exit(1);//프로그램을 종료한다- 비정상적인 상황이 발생하여 종료한 것이므로 exit(1)을 통해 종료한다.
		}
		
		

		

		
		
		

		

	}
		

		


	}


