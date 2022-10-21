package AbstractInterface;

public class Dropship extends Unit{
	int x = 10, y = 20;
	void move(int x, int y)//오버 라이딩
	{
		System.out.println("수송선 (" + x + "," + y + ") 지점으로 이동!");
	}
	
	void load() {}
	void unload() {}

}
