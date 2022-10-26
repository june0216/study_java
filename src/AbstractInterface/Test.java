package AbstractInterface;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit[] group = new Unit[4];
		
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new Marine();
		group[3] = new Dropship();
		
		for(int i = 0; i < group.length; i++)
		{
			System.out.println("x=" + group[i].x + " y =" + group[i].y);
			group[i].move(100, 200);
		}

	}

}
