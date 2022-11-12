package collection;

import java.util.Scanner;
import java.util.ArrayList;


public class TimeArratList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many time do you want to generate?");
		int n = sc.nextInt();
		ArrayList<Time> t = new ArrayList<Time>();
		int i;
		for(i = 0; i < n; i++)
		{
			t.add(new Time(randNum(24), randNum(60), randNum(60)));
		}
		for(i = 0; i < t.size(); i++)
		{
			System.out.println("<Time " + (i+1) +"> ");
			System.out.println(t.get(i));
		}
		

	}
	public static int randNum(int n)
	{
		return(int)(Math.random()*n);
	}

}
