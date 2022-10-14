

class Tv extends Product{//product를 상속 받는다. 
	Tv(){
		super(100);//tv는 가격이 100이므로 이를 기반으로 인스턴스를 생성한다. 
		//이때, 부모의 생성자를 통해 인스턴스를 초기화한다. 
	}
	
	public String toString()//object의 toString을 자식 클래스인 Tv에서 오버라이딩해서 사용한 것이다. 
	{
		return "Tv";
	}

}
