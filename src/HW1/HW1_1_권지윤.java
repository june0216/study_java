import java.util.Scanner;

public class HW1_1_권지윤 {

	public static void main(String[] args) {
		System.out.println("===================");
		System.out.println("전공 : 기독교학과");
		System.out.println("학번 : 1989001");
		System.out.println("이름 : 권지윤");
		System.out.println("===================");
		Scanner sc = new Scanner(System.in);//사용자의 입력을 받기 위해 scanner 클래스 사용
		
		int h; //사용자가 입력한 hour를 임시 저장할 변수이다. 
		int m;//사용자가 입력한 minute를 임시 저장할 변수이다. 
		
	
		System.out.println("Hour:");
		h = sc.nextInt();//hour를 입력 받는다. 
		
		System.out.println("Minute:");
		m = sc.nextInt();//minute를 입력받는다. 
		
		Time t = new Time();//인스턴스 생성
		t.setTime(h, m);//입력받은 값을 각각 hour와 time에 대입한다. 
		//이 때, 함수 내부에서 h와 m이 조건에 만족한 값인지 확인하는 부분이 있으므로 사용자가 범위에 맞지 않는 값을 입력할 경우 
		//Wrong Input을 출력하게 한다. 
		System.out.println(t.getHourOrMinute('h') + ":" + t.getHourOrMinute('m'));
		//hour의 정보를 받아와서 출력하고 minute의  정보를 받아와서 출력한다. 
		//만약 사용자가 범위에 맞지 않는 값을 입력하면 인스턴스에 값이 대입되지 않으므로 초기화 기본 값인 0이 출력될 것이다. 
		

	}

}
