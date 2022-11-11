package Collection_ex;
import java.util.*;



public class Week11_1_권지윤 {


	public static void main(String[] args) {
		System.out.println("===================");
		System.out.println("전공 : 기독교학과");
		System.out.println("학번 : 1989001");
		System.out.println("이름 : 권지윤");
		System.out.println("===================");
		
		Scanner sc = new Scanner(System.in);
		
		List<Student>student = new ArrayList<Student>();//ArrayList로 학생 정보 저장 
		String name;//사용자에게 입력받을 이름을 저장할 변수 
		String ID;//사용자에게 입력받을 ID를 저장할 변수 
		int age;//사용자에게 입력받을 나이을 저장할 변수 
		
		System.out.println("Input Student Name, ID, and age. 0 for name to quit.");
		while(true)
		{
			name = sc.next();
			if(name.equals("0"))//이름의 자리에 0을 입력하면 입력받는 것을 종료한다. 
			{
				break;
			}
			ID = sc.next();//ID를 입력받는다. 
			age = sc.nextInt();
			if(age < 0)//나이는 0보다 작을 수 없다. (0살은 미국 나이를 고려하여 0은 가능하다고 가정)
			{
				System.out.println("나이는 0 이하일 수 없습니다. 다시 입력해주세요.");
			}
			else//유효한 값이어야지 생성한다. 
			{
				student.add(new Student(name, ID, age));//학생 인스턴스를 생성하고 이를 student에 추가한다. 
			}
		}//0을 입력할 때까지 학생 생성
		printResult(student);//전체 결과를 출력한다. 
		
		while(true)
		{	
			System.out.println("\nChoose the operation you want.");
			System.out.println("1.add information 2.delete information 3.show list 4.Finish program");
			int n = sc.nextInt();//사용자에게 원하는 작업의 숫자를 입력받는다. 
			if(n == 1)
			{
				addStudent(student);//학생을 추가하는 함수를 호출한다. 
			}
			else if(n == 2)
			{
				deleteStudent(student);//학생을 삭제하는 함수 호출한다. 
			}
			else if(n == 3)//3일 때는 결과를 출력한다. 
			{
				printResult(student);
			}
			else if(n == 4)//4를 입력하면 프로그램을 종료한다. 
			{
				System.exit(0);//시스템을 종료한다. 
			}
			else//1, 2, 3, 4 이외에 수를 입력하면 wrong input을 출력하고 다시 사용자에게 숫자를 입력받는다. 
			{
				System.out.println("Wrong input.");
			}
			
		}
		
	

	}
	
	public static void printResult(List<Student> student)//모든 학생 정보를 출력한다. 
	{
		System.out.printf("%s	%s	%s	%s \n", "NUMBER", "NAME", "ID", "AGE");
		for(int i = 0; i < student.size(); i++)//ArrayList의 size() 함수를 통해 길이를 알 수 있다. 
		{
			System.out.println((i+1)+"\t"+ student.get(i));//인스턴스를 출력한다. toString()함수를 오버라이딩했으므로 학생의 정보들을 하나하나 출력할 것이다. 

		}
	}
	
	public static void deleteStudent(List<Student> Stu) {
		System.out.println("Input Student Number to delete.");
		Scanner sc = new Scanner(System.in);
		int num;//삭제할 학생 number 입력받는다. 
		while(true)//입력받은 num의 범위가 유효한지 확인하기 
		{
			num = sc.nextInt();//번호를 사용자에게 입력받음
			if(num <= 0 || num > Stu.size()) {//학생을 삭제하기 위해서는 값이 존재해야한다. 학생번호가 이미 존재해야 한다. 그래서 Stu 사이즈 크거나 0보다 작은 경우는 불가능하다. 
				System.out.println("현재 입력하신 학생 번호가 없습니다. 다시 입력해주세요.");//다시 입력하게 한다. 
			}
			else
			{
				break;//존재하는 학생이라면 삭제한다. 
			}
		}
		Stu.remove(num-1);//특정 위치의 학생 정보 삭제 (인덱스는 0부터 시작하지만 학생 번호는 1부터 시작하므로 학생 번호와 인덱스는 1차이가 난다. 그래서 -1 연산이 필요하다)
		printResult(Stu);//삭제 후 정보 출력 
	}
	
	public static void addStudent(List<Student> Stu) {
		System.out.println("Input new Student Name, ID, and age, and the location");
		Scanner sc = new Scanner(System.in);
		String newName;//사용자에게 입력받을 이름을 저장할 변수 
		String newID;//사용자에게 입력받을 ID를 저장할 변수
		int newAge;//사용자에게 입력받을 나이를 저장할 변수
		int loc;//사용자에게 입력받을 위치를 저장할 변수
		while(true)//입력받을 loc의 범위를 체크해야 한다. 왜냐하면 학생 번호는 0이거나 그 이하일 수 없기 때문에 학생 번호로 유효하지 않으므로 다시 입력받게 한다. 
		{//또한 나이의 범위도 체크해야 한다. 나이는 0 이하일 수 없기 때문이다. 
			newName = sc.next();//이름은 띄어쓰기가 없으므로 next로 입력받는다. 
			newID = sc.next();//ID도 띄어쓰기가 없으므로 next로 입력받는다. 
			newAge = sc.nextInt();//age는 int이기 때문에 
			loc = sc.nextInt();
			if(loc <= 0)
			{
				System.out.println("학생 number는 1부터 시작이므로 범위에 벗어난 입력입니다. 다시 입력해주세요. ");
			}
			else if(newAge < 0)//나이는 0 보다 작을 수 없다. (0살은 미국 나이를 고려하여 0은 가능하다고 가정)
			{
				System.out.println("나이는 0보다 작을 수 없습니다. 다시 입력해주세요. ");
			}
			else
			{
				break;//loc과 newAge가 적당한 값이므로 입력을 멈추고 값에 대입한다. 
			}
			
		}
		Stu.add(loc-1, new Student(newName, newID, newAge));//특정 위치에 새로운 인스턴스 생성하여 넣기 
		//특정 위치의 학생 정보 삭제 (인덱스는 0부터 시작하지만 학생 번호는 1부터 시작하므로 학생 번호와 인덱스는 1차이가 난다. 그래서 -1 연산이 필요하다)
		printResult(Stu);//학생정보 모두 출력
	}


}
