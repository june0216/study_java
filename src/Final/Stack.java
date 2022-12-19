package Final;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Stack {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		while(true)
		{
			System.out.println("1.Push 2.Pop 3.Output 4.Exit");
			num1 = sc.nextInt();
			if(num1 == 1)
			{
				System.out.println("Enter num");
				l.addLast(sc.nextInt());
				
			}
			else if(num1 == 2)
			{
				if(l.isEmpty())
				{
					System.out.println("Empty");
				}
				else
				{
					System.out.println(l.removeLast());
				}
				
			}
			else if(num1 == 3)
			{
				if(l.isEmpty())
				{
					System.out.println("Empty");
				}
				else
				{
					while(!l.isEmpty())
					{
						System.out.println(l.removeLast());
					}
				}
			}
			else if(num1 == 4)
			{
				System.exit(0);
			}
			else
			{
				System.out.println("Wrong");
			}

		}
		


	}

}
