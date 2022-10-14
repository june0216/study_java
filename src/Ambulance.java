
class Ambulance extends Car{//Car클래스를 상속받는다. 
	
	public Ambulance()//부모 클래스에 변수 4개를 받아서 대입하는 생성자를 호출한다. (각 변수값 초기화)
	{
		super("Patient", 119, "Ambulance", "Doctor");
	}
	public String toString()//부모 클래스의 getStr 메소드를 오버라이딩한다.
	{
		return getStr();
	}

}
