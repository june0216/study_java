
public class Cat extends AbstractPet{//abstract 클래스를 상속받았다. 
	public Cat() {
		super("Cat");//species는 Cat이므로  AbstractPet의 생성자에서 species를 입력받아 생성하는 생성자를 호출한다. 
	}
	
	public void move() {//조상 메소드(추상메소드)를 구현
		System.out.println("jump");//cat일 떄 jump를 출력한다. 
	}

}
