package Final;

import java.util.Scanner;

class SharedArea{
	boolean isTrue;
	int i;
	int B;
	int P;
	
	void inB()
	{
		synchronized(this)
		{
			B++;
		}
	}
	
	void inP()
	{
		synchronized(this)
		{
			P++;
		}
	}
	
	int total()
	{
		synchronized(this)
		{
			return B+P;
		}
	}
	
}

class PrintB implements Runnable{
	SharedArea sh;
	int total = 0;
	public void run()
	{
		while(sh.isTrue) {
			System.out.println("B");
			try {
				Thread.sleep(sh.i);
			}
			catch(InterruptedException e)
			{
				
			}
			try {
				synchronized(sh)
				{
					sh.wait();
				}
				
			}
			catch(InterruptedException e)
			{
				
			}

		}
	}
}
class PrintP extends Thread{
	int total = 0;
	SharedArea sh;
	public void run()
	{
		while(sh.isTrue)
		{
			System.out.println("B");
			try {
				Thread.sleep(sh.i);
				
			}
			catch(InterruptedException e)
			{
				
			}
		}
		synchronized(sh)
		{
			sh.notify();
		}
	}
}
public class Multihread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedArea sh = new SharedArea();
		
		PrintB p = new PrintB();
		p.sh = sh;
		
		Thread th = new Thread(p);
		PrintP b = new PrintP();
		
		b.sh = sh;
		
		
		th.start();
		b.start();
		Scanner sc = new Scanner(System.in);
		sh.i = sc.nextInt();		
		
		

	}

}
