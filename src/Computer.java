

public class Computer extends Product{//Product를 상속받았다. 
	public Computer()
	{
		super(200);//부모의 생성자를 사용한다. Computer는 가격이 200이므로 이는 고정으로 하고 부모 생성자를 호출한다.
	}
	public String toString()//toString 오버라이딩 
	{
		return "Computer";
	}

}
