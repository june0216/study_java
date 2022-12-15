package HW2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HW2_1_권지윤 {

	public static void main(String[] args) {
		System.out.println("===================");
		System.out.println("전공 : 기독교학과");
		System.out.println("학번 : 1989001");
		System.out.println("이름 : 권지윤");
		System.out.println("===================");

		Scanner input = null;//스트림을 저장할 변수이다. 
		PrintWriter output = null;//스트림을 저장할 변수이다. 
		
				
		StringTokenizer tokenizer;//줄 단위로 읽어와서 분리자에 의해 단어를 분리해주는 StringTokenizer를 저장할 변수이다. 
		String token;//각 줄에서 다음 토큰을 가져와서 저장할 변수이다. 
		
		Scanner sc = new Scanner(System.in);//사용자에게 입력받을 스캐너이다. 
		
				
		System.out.println("Input the filename to read.");
		String inputFile = sc.next();//읽을 파일이름을 사용자에게 입력받는다 
		
		System.out.println("Input the filename to write.");
		String outputFile = sc.next();//내용을 쓸 파일의 이름을 사용자에게 입력받는다. 
		try {
			input = new Scanner(new File(inputFile)); //파일에서 일을 때는 new File() 오브젝트를 통해 인자로 전달한다. 
			output = new PrintWriter(outputFile);//스트림을 만든다. 
			
		}
		catch(FileNotFoundException e) { //파일을 열 때 오류가 있으면 해당 예외처리 실행 (파일 존재하는지)
			System.out.println("Error in opening a file. \n");
			System.exit(0);
		}
		catch(IOException e) { //기타 IO문제가 발생하면 경우의 예외 처리
			System.out.println("Exception occurs. \n");
			System.exit(0);
		}
		while(input.hasNextLine())//각 줄에서 token을 가져와서 
		{
			String line = input.nextLine();//줄별로 읽고 
			tokenizer = new StringTokenizer(line, ", \n");//분리자는 콤마와 스페이스와 \n이다. 
			while(tokenizer.hasMoreTokens())//다음 토큰이 존재할 때까지 반복한다. 
			{
				token = tokenizer.nextToken();//다음 토큰을 반환한다. 
				if(token.length() > 4)//4보다 큰 단어라면 
				{
					output.println(token);//파일에 단어를 입력한다
				}
			}
		}
		System.out.println(outputFile +" is generated.");//종료 후 콘솔에 다음을 표시한다. 
		
		sc.close();
		input.close();//스트림을 닫는다. 
		output.close();//스트림을 닫는다. 
		


	}

}
