
public class Bird extends AbstractPet{//abstract 클래스를 상속받았다. 
	
	public Bird()//생성자 
	{
		super("Bird");//species는 Bird이므로  AbstractPet의 생성자에서 species를 입력받아 생성하는 생성자를 호출한다. 
	}
	
	public void move() {//조상 메소드(추상메소드)를 구현
		System.out.println("fly");//bird는 fly에 해당하므로 이를 출력한다. 
	}

}
