package MultiThread;

public class Lab_th_2 {

	public static void main(String[] args) {
		Thread thread1 = new MyThread_num();//부모 클래스로 받았지만 어차피 메소드 오버로딩은 부모가 참조 가능하므로 오버로딩한 run()이 실행될 것이다. 
		Thread thread2 = new MyThread_ch();
		thread1.start();
		thread2.start();

	}

}
