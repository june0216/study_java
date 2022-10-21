package HW;

public class StudentScore extends StudentInfomation{ //StudentInformation을 상속받는다. 
	private int korean;//부모에서 상속 받은 변수 이외의 추가 인스턴스 변수들이다. 
	private int math;
	private int english;
	
	//TODO: 생성자 만들기 
	
	public int getKorean()//private인 변수 Korean은 get을 통해서만 값을 알아낼 수 있다. 
	{
		return korean;
	}
	public int getMath()//private인 변수 Math는 get을 통해서만 값을 알아낼 수 있다. 
	{
		return math;
	}
	public int getEnglish()//private인 변수 English는 get을 통해서만 값을 알아낼 수 있다. 
	{
		return english;
	}
	
	public void setKorean(int newKorean)//private인 변수들은 set을 통해서만 값을 수정할 수 있다. 
	{
		korean = newKorean;
	}
	
	public void setMath(int newMath)//private인 변수 Math는 set을 통해서만 값을 수정할 수 있다. 
	{
		math = newMath;
	}
	
	public void setEnglish(int newEnglish)//private인 변수 English는 set을 통해서만 값을 수정할 수 있다. 
	{
		english = newEnglish;
	}
	
	public void display()//부모 메소드 오버 라이딩한다. 
	{
		int sum = korean + math + english;//각 학생별 총점을 알아야 하기 때문에 이를 저장할 변수를 선언한다. 
		double avg = (double)sum/3;//각 학생별 평균 점수를 알아야 하기 때문에 이를 저장할 변수를 선언한다. 
		//이때, 출력된 예시를 보면 평균값은 소수점 둘째짜리까지 나타내야 하기 때문에 형변환을 통해 double형 변수에 저장한다. 
		System.out.println("NAME		ID		KOREAN		MATH		ENGLISH		SUM		AVG");
		System.out.printf("%s		%-1s		%-1s		%-1s		%-1s		%d		%.2f", getName(), getId(), korean, math, english, sum, avg);
		//출력할 때 간격을 일정하게 하기 위해 printf를 통해서 서식을 지정했다. 
		//왼쪽으로 정렬하기 위해 -1을 통해 문자열을 왼쪽으로 정렬했다. 
		
	}
	

	
}
