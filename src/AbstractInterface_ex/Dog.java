
public class Dog extends AbstractPet{//abstract 클래스를 상속받았다. 
	public Dog() {
		super("Dog");//species는 Dog이므로  AbstractPet의 생성자에서 species를 입력받아 생성하는 생성자를 호출한다. 
	}
	
	public void move() {//조상 메소드(추상메소드)를 구현
		System.out.println("run");//dog일 떄 run을 출력한다. 
	}

}
