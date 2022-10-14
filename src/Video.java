
class Video extends Product{

	Video() {
		super(110);//video의 가격은 110이다. 
		//이때, 부모의 생성자를 통해 video의 인스턴스를 초기화한다. 
	}
	public String toString()//object의 toString을 자식 클래스인 Video에서 오버라이딩해서 사용한 것이다. 
	{
		return "Video";
	}
	

}
