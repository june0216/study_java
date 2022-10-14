

class Audio extends Product{
	Audio()//video의 가격은 50이다. 
	{
		super(50);//부모 생성자의 생성자를 통해 인스턴스를 초기화 한다.
	}
	
	public String toString()//object의 toString을 자식 클래스인 Audio에서 오버라이딩해서 사용한 것이다. 
	{
		return "Audio";
	}

}
