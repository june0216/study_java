package MultiThread;

public class PrintThread extends Thread{
	SharedArea1 sharedArea;
	public void run()
	{
		while(sharedArea.isWritten != true) continue;//다른 스레드에서 작업이 완료될 때까지 기다린다. 
		System.out.println(sharedArea.result);
	}

}
