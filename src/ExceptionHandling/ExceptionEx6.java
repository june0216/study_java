package ExceptionHandling;

public class ExceptionEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exception e = new Exception("고의로 발생시켰음.");
			throw e;
			//또는 throw new Exception("고의로 발생시켰음.");가능 
			
		}
		catch(Exception e)
		{
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 종료되었습니다. ");

	}

}
