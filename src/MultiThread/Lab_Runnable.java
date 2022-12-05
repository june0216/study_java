package MultiThread;

public class Lab_Runnable extends Thread{

	public static void main(String[] args) {
		Thread thread = new Thread(new MyThread2());
		thread.start();
		for(char ch = '!'; ch <= '/'; ch++)
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
