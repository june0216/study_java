package polymorphism;

class Car {
	private String emgType;
	private int number;
	private String carType;
	private String reqPerson;
	
	public Car()//기본 생성자이다. 
	{
		this(null, 0, null, null);
	}
	
	public Car(String emgType, int number, String carType, String reqPerson)
	{//private 변수 4개를 받는 생성자이다. 
		this.emgType = emgType;
		this.number = number;
		this.carType = carType;
		this.reqPerson = reqPerson;
	}
	
	public String getEmgType()//emgType은 private이므로 get함수를 만들어서 외부에서 값을 알 수 있게 했다. 
	{
		return emgType;
	}
	public int getNumber()//number은 private이므로 get함수를 만들어서 외부에서 값을 알 수 있게 했다. 
	{
		return number;
	}
	public String getCarType()//carType은 private이므로 get함수를 만들어서 외부에서 값을 알 수 있게 했다. 
	{
		return carType;
	}
	public String getReqPerson()//reqPerson은 private이므로 get함수를 만들어서 외부에서 값을 알 수 있게 했다. 
	{
		return reqPerson;
	}
	public String getStr()//각각의 멤버변수를 문자열로 만들어서 반환하는 메소드이다. 
	{
		
		return getEmgType() + "		" +getNumber() +"		"+ getCarType()+"		" + getReqPerson();
	}

}
