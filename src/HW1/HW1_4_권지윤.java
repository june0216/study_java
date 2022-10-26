
import java.util.Scanner;

public class HW1_4_권지윤 {

	public static void main(String[] args) {
		System.out.println("===================");
		System.out.println("전공 : 기독교학과");
		System.out.println("학번 : 1989001");
		System.out.println("이름 : 권지윤");
		System.out.println("===================");
		Scanner sc = new Scanner(System.in);//사용자의 입력을 받기 위해 scanner 클래스 사용
		
		System.out.println("How many students are there?");
		int num = sc.nextInt();//학생수를 사용자에게 입력 받음 
		StudentScore[] ss = new StudentScore[num];
		System.out.println("Input the information.");
		System.out.println("");//줄간격을 위해 삽입 
		//각 과목별 합계를 저장하기 위해 각 과목별 전체 합산 점수를 저장할 변수를 선언
		// 합산 후 평균을 구하고 출력해야 하는데 이때, 평균은 소수 둘째짜리 까지 나타내야 하므로 중간에 형변환하지 않고 미리 double형으로 합계를 저장함
		double sumKo = 0; //korean 점수 전체 합계
		double sumMath = 0;//Math 점수 전체 합계
		double sumEng = 0;//English 점수 전체 합계
		
		for(int i = 0; i < num; i++)//사용자가 입력한 학생 수만큼 반복하면서 각 학생의 점수를 입력 받아 저장함 
		{
			sc.nextLine();//앞에서 int형 변수를 입력받았기 때문에 엔터 제거(반복문 처음은 학생수의 nextInt에서 남은 엔터이며 2번째 반복 부터는 english 점수의 nextInt의 엔터를 버림)
			ss[i] = new StudentScore();//인스턴스가 배열의 요소가 가리키는 인스턴스 생성
			System.out.print("ID:");
			ss[i].setId(sc.nextLine());//ID는 String 이기 때문에 nextLine으로 유저의 입력을 받음 
			//ID, Name, Korean, Math, English 변수는 private이기 때문에 set함수를 통해 값을 대입했다. 
			System.out.print("Name:");
			ss[i].setName(sc.nextLine());//Name는 String 이기 때문에 nextLine으로 유저의 입력을 받음 
		
			
			System.out.print("Korean:");//점수는 int형이기 때문에 nextInt로 유저의 입력을 받음 
			ss[i].setKorean(sc.nextInt());
		
			System.out.print("Math:");
			ss[i].setMath(sc.nextInt());//점수는 int형이기 때문에 nextInt로 유저의 입력을 받음 
	
			System.out.print("English:");
			ss[i].setEnglish(sc.nextInt());//점수는 int형이기 때문에 nextInt로 유저의 입력을 받음 
			System.out.println("");//간격을 맞추기 위해 입력 
			
			
			
		}
		System.out.println("NAME			ID		KOREAN		MATH		ENGLISH		SUM		AVG");
		//전체 레코드를 출력한다. 
		for(int i = 0; i < ss.length; i++)//반복문을 통해 학생 한 명씩 정보를 불러온다. 
		{
			ss[i].display();//해당 학생의 정보를 출력한다.
			System.out.println("");
		
			sumKo += ss[i].getKorean();//전체 학생의 korean점수를 구하기 위해 해당 학생의 korean 점수를 sumKo에 누적하여 더한다 
			//이때, korean, math, english는 private 변수이기 때문에 get함수를 통해 값을 읽어왔다. 
			sumMath += ss[i].getMath();//전체 학생의 math점수를 구하기 위해 해당 학생의 math 점수를 sumMath에 누적하여 더한다 
			sumEng += ss[i].getEnglish();//전체 학생의 english점수를 구하기 위해 해당 학생의 english 점수를 sumEng에 누적하여 더한다 
		}
		System.out.printf("%s     			%.2f		%.2f		%.2f", "Subject Avg", sumKo/num, sumMath/num , sumEng/num);//출력 결과에서 간격을 맞추기 위해 서식이 있는 출력을 할 수 있는 printf를 선택했다. 
		
		
		System.out.println("\n \n<Students over the average>");//각 과목별 평균 점수 이상인 학생의 이름을 출력한다. 
		System.out.println("");
		
		
		System.out.println("Korean:");//korean 과목에서 이 과목 평균 점수 이상인 학생을 골라서 출력한다. 
		for(int i = 0; i < ss.length; i++)//반복문을 통해 전체 배열의 원소 즉, 학생을 한 명 한명 평균 점수보다 높은지 확인한다. 
		{
			if(ss[i].getKorean() > sumKo/num)//평균점수보다 높으면 그 학생의 이름을 출력한다. 
			{
				System.out.printf("%s	", ss[i].getName());//출력할 때 여기서 학생들 사이의 간격이 있어서 printf를 통해 서식을 지정하여 간격을 맞추었다. 
				//이름은 private이기 때문에 get함수를 이용하여 값을 확인했다. 
			}
			
		}
		System.out.println("");
		System.out.println("Math:");
		for(int i = 0; i < ss.length; i++)
		{
			if(ss[i].getMath() > sumMath/num)//수학 평균 점수보다 높은 학생의 이름을 출력한다. 
			{
				System.out.printf("%s	", ss[i].getName());
			}
		}
		System.out.println("");
		System.out.println("English:");
		for(int i = 0; i < ss.length; i++)
		{
			if(ss[i].getEnglish() > sumEng/num)//영어 평균 점수보다 높은 학생의 이름을 출력한다. 
			{
				System.out.printf("%s	", ss[i].getName());
			}
		}
		
		
		
		
		


	}

}
