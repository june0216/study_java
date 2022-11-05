import java.io.Serializable;//객체를 byte sequence로 표현해서 읽고 쓰기 쉽게 하기 위해 

public class Dog extends Pet implements Serializable{//Pet을 상속받음
	private String breed;
	private boolean boosterShot;
	
	public Dog()
	{
		this(null, 0, 0, null, false);//기본 생성자 
	}
	public Dog(String name, int age, double weight, String breed, boolean boosterShot)
	{
		super(name, age, weight);//부모 생성자 이용 
		this.breed = breed;
		this.boosterShot = boosterShot;
	}
	
	public String getBreed() {//private 멤버 변수의 수정을 위해 get함수 
		return breed;
	}
	public void setBreed(String breed) {//private 멤버 변수의 수정을 위해 set함수 
		this.breed = breed;
	}
	public boolean isBoosterShot() {//접종완료인지 여부를 알려주는 함수이다. 접종 완료이면 true, 아니면 false를 반환한다. (일종의 get함수 역할이다)
		return boosterShot;
	}
	public void setBoosterShot(boolean boosterShot) {//private 멤버 변수의 수정을 위해 set함수 
		this.boosterShot = boosterShot;
	}
	
	public String toString()//toString()을 오버라이딩한 함수이다. 
	{
		char shot = 'X';//true와 false를 각각 O,X로 변환해주기 위한 변수이다. 
		if(boosterShot == true)
		{
			shot = 'O';//true이면 O표시를 한다. 
		}
		return (getName()+"\t"+getAge()+"\t"+ getWeight()+"\t" +breed+"\t"+shot);
		//부모의 생성자에서 name과 age, weight는 private이므로 get메소드를 통해 가져왔다. 
			
		
	}

}
