
public class MyThread extends Thread{
	boolean stop;//멈출 조건이 왔는지 공유하기 위한 변수 
	public SharedArea2 sharedArea;//스레드 공유공간이다. 
	
	public MyThread(SharedArea2 sh)//공유 공간을 세팅한다. 
	{
		sharedArea = sh;
	}
	public void setStop(boolean stop)//스레드를 stop시키는 메소드이다. 
	{
		this.stop = stop;
	}
	
	public void run()//오버라이딩한 메소드이다. 
	{
		int i;//시간을 나타내기 위한 변수이다. 
		for(i = 20; i > 0; i--)
		{
			if(stop==true) {
				System.out.println("Timer is stopped."); 
				System.exit(0);//스레드를 멈출 조건이 되면(성공 혹은 실패) 프로그램을 종료한다. 
			}
			sharedArea.word = sharedArea.str[(int)(Math.random()*15)];
			System.out.println(sharedArea.word);//랜덤하게 선택된 문자열을 콘솔에 출력한다
			try
			{
				sleep(1000);//1초를 쉰다. -> 1초에 하나씩 등장할 수 있다. 
			}
			catch(InterruptedException e)//sleep은 예외 핸들링이 필수이다. 
			{
				System.out.println(e.getMessage());
			}
		}
		if(i==0) 
		{
			System.out.println("실패!"); //시간 내 성공하지 못하면 실패를 출력한다. 
		}
		System.exit(0);//프로그램 종료
	}

}
