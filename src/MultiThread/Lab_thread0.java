package MultiThread;

public class Lab_thread0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread1 thread = new Mythread1();
		thread.start();
		for(char ch = 'A'; ch <= 'Z'; ch++)
		{
			System.out.println(ch);
		}

	}

}
