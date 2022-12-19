package Final;

import java.util.LinkedList;
import java.util.Scanner;

public class Queue {

	public static void main(String[] args) {
		LinkedList<Integer> Q  = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		while(true)
		{
			System.out.println("Input nums 0 to quit");
			num1 = sc.nextInt();
			if(num1 == 0)break;
			Q.offer(num1);
			
		}
		
		System.out.println("Result");
		
		while(!Q.isEmpty())
		{
			num2 = Q.poll();
			System.out.println(num2);
		}
		


	}

}
