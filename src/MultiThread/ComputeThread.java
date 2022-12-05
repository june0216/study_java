package MultiThread;

public class ComputeThread extends Thread{
	SharedArea1 sharedArea;
	
	public void run() {
		double res = 0.0;
		for(int i = 1; i < 100000; i+=2) {
			if(i/2%2 == 0)
			{
				res += 1.0/i;
			}
			else {
				res -= 1.0/i;
			}
		}
		sharedArea.result = res*4;
		sharedArea.isWritten = true;//작업완료를 알려준다. 
	}

}
