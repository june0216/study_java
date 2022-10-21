package AbstractInterface;

class Tank extends Unit{
	int x = 10, y = 20;
	void move(int x, int y)//오버 라이딩
	{
		System.out.println("탱크 (" + x + "," + y + ") 지점으로 이동!");
	}
	
	void changMode() {}

}
