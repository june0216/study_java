package AbstractInterface;

class Fighter extends Unit2 implements Fightable{
	public void move(int x, int y)
	{
		System.out.println("위치 (" + x + ", " + y + ") 로 이동하랏!");
	}

	public void attack(Unit2 u)
	{
		System.out.println(u+ "공격!!!!");
	}
}
