package AbstractInterface;

public class Test2 {
	public static void main(String[] args)
	{
		Fighter f = new Fighter();
		
		if(f instanceof Unit2)
		{
			System.out.println("f는 Unit 클래스의 자식");
		}
		if(f instanceof Fightable)
		{
			System.out.println("f는 Fightable 인터페이스를 구현");
		}
		if(f instanceof Movable)
		{
			System.out.println("f는 Moveable 인터페이스를 구현");
		}
		if(f instanceof Attackable)
		{
			System.out.println("f는 Attackable 인터페이스를 구현");
		
		}
		f.move(100, 200);
		f.attack(new Unit2());
	}

}
