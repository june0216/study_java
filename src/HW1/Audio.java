

public class Audio extends Product{//Product를 상속받았다. 
	public Audio()
	{
		super(50);//부모의 생성자를 사용한다. Audio는 가격이 50이므로 이는 고정으로 하고 부모 생성자를 호출한다. 
	}
	
	public String toString()//toString 오버라이딩한 것이다. 
	{
		return "Audio";
	}

}
