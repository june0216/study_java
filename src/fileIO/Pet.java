import java.io.Serializable;//객체를 byte sequence로 표현해서 읽고 쓰기 쉽게 하기 위해 

public class Pet implements Serializable{
	private String name;
	private int age;
	private double weight;
	
	public Pet() {
		this(null, 0, 0);
	} //기본 생성자 
	
	public Pet(String initialName, int initialAge, double initialWeight)//생성자이다. 
	{
		name = initialName;
		if(initialAge >= 0)//나이는 항상 0또는 그 이상이어야 한다. 
		{
			age = initialAge;
		}
		else
		{
			System.out.println("ERROR: Negative age is not available!");//잘못된 값이라는 것을 출력하고 
			System.exit(0);//예제6_2번에서 처리한 것과 같이 처리 (프로그램 종료 방식)
			
		}
		if(initialWeight >= 0)//weight는 0부터의 값만 들어올 수 있으므로 조건 처리하여 대입하게 한다. 
		{
			weight = initialWeight;
		}
		else
		{
			System.out.println("ERROR: Negative weight is not available!");//잘못된 값이라는 것을 출력한다. 
			System.exit(0);//예제6_2번에서 처리한 것과 같이 처리 (프로그램 종료 방식) -주어진 과제에서는 그냥 생성할 때 값을 프로그래머가 직접 대입하기 떄문에 
			//이렇게 프로그램이 종료될 일은 없겠지만 혹시 실수를 할 경우를 대비 
		}
	}
	
	public String getName() {//private 멤버 변수의 접근을 위해 get함수 
		return name;
	}
	public void setName(String newName) {//private 멤버 변수의 수정을 위해 set함수 
		name = newName;
	}
	public int getAge() {//private 멤버 변수의 접근을 위해 get함수 
		return age;
	}
	public void setAge(int newAge) {//private 멤버 변수의 수정을 위해 set함수 
		age = newAge;
	}
	public double getWeight() {//private 멤버 변수의 접근을 위해 get함수 
		return weight;
	}
	public void setWeight(double newWeight) {//private 멤버 변수의 수정을 위해 set함수 
		weight = newWeight;
	}
	

}
