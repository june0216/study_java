package collection;

import java.util.*;
public class StackTest {
	//LinkedList를 Stack으로 사용하기 
	//LinkedList는 단 한 번의 참조변경만으로 삭제 가능 (연결리스트를 내부적으로 가지고 있다. )

	public static void main(String[] args) {
		LinkedList<Integer> myStack = new LinkedList<Integer>();
		//int는 변수명인데 클래스로 쓰기 위해서 wrapper class(primitive 타입 데이터를 객체로 다루어야 하는 경우이다)
		Scanner sc = new Scanner(System.in);
		int num;
		while(true)
		{
			System.out.println("Push numbers(0 to quit) : ");
			num = sc.nextInt();
			if(num == 0)
			{
				break;
			}
			myStack.addLast(num); //하나씩 데이터를 넣는다. 
		}
		System.out.println("<Popped Result>");
		while(!myStack.isEmpty())
		{
			int num2 = myStack.removeLast();
			System.out.println(num2);//하나씩 pop한다. 
		}
		

	}

}
