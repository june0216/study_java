package MultiThread;

public class Mythread1 extends Thread{
	public void run()//오버 라이딩
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println(i);
		}
	}

}
