package Final;

public class Mythread implements Runnable{
	public void run()
	{
		for(int i = 0; i < 9; i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(0);
			}
			catch(InterruptedException e)
			{
				
			}
		}
		
	}

}
