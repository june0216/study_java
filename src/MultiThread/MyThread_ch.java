package MultiThread;

public class MyThread_ch extends Thread{
	public void run()
	{
		for(char ch = 'A'; ch <= 'Z' ; ch++)
		{
			System.out.println(ch);
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
