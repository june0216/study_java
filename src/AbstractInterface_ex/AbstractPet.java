
public abstract class AbstractPet {//추상 클래스를 선언 
	public String species;//pet의 종류를 저장한다. 
	public String name;//이름을 저장한다. 
	public int age;//나이를 저장한다. 
	public AbstractPet() {
	}
	
	public AbstractPet(String species)//생성자이다. 
	{
		this.species = species;//자손 클래스마다 species가 다르므로 생성할 때 매개변수로 받아와서 생성한다. 
	}
	
	public abstract void move();//추상 클래스 내에서만 추상 메소드 가능하다. 

}
