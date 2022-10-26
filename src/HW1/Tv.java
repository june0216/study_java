

public class Tv extends Product{//Product를 상속받았다. 
	public Tv(){
		super(100);//부모의 생성자를 사용한다. Tv는 가격이 100이므로 이는 고정으로 하고 부모 생성자를 호출한다.
	}
	
	public String toString()//toString()함수 오버라이딩
	{
		return "Tv";
	}

}
