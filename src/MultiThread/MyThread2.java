package MultiThread;

public class MyThread2 implements Runnable{//스레드를 시작하는 방법 
	public void run()
	{
		for(int i =0; i < 9; i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

}
