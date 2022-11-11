package Collection_ex;
import java.util.*;

public class Student {
	String name;
	String ID;
	int age;
	
	public Student() {} //기본 생성자 
	
	public Student(String name, String ID, int age) {//멤버 변수의 값들을 인자로 받아와 초기화하는 생성자이다. 
		this.name = name;
		this.ID = ID;
		this.age = age;
	}
	
	public String toString() {//toString 오버라이딩
		return name+"\t"+ID+"\t"+age;//이름, ID, age정보를 보기 좋게 문자열로 만들어 return 한다. 
	}


	


}
