
public class Snake extends AbstractPet{//abstract 클래스를 상속받았다. 
	public Snake() {
		super("Snake");//species는 Snake이므로  AbstractPet의 생성자에서 species를 입력받아 생성하는 생성자를 호출한다. 
	}
	
	public void move() {//조상 메소드(추상메소드)를 구현
		System.out.println("crawl");//snake일 떄 crawl을 출력한다. 
	}
	

}
