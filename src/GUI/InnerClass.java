package GUI;
//InnerClass : class의 정의가 다른 클래스 내에 존재 
class OuterClass{
	int x = 200;
	InnerClass IC = new InnerClass();
	
	void methodOC()
	{
		System.out.println("y from innerClass = " + IC.y);// 남의 클래스를 볼 수 없다. -> 바로 y로 접근 불가능하다. (마치 캡슐화 접근하듯)
		//하지만 반대로 이너 클래스에서 해당 메소드를 참조 가능 
		System.out.println();
	}
	
	class InnerClass{
		int y = 400;
		void methodIC()
		{
			System.out.println("x of OuterClass from InnerClass = " + x);
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass(); //outerClass를 통해서만 접근 가능
		System.out.println("oc.x = " + oc.x);
		System.out.println("ic.y = " + ic.y);
		//System.out.println("ic.y = " + ic.x); inner class에서 밖을 볼 수 없다. 
		//System.out.println("ic.y = " + oc.y); 밖에 있는 클래스로 안쪽을 보는 것은 불가능하다. 
		
		oc.methodOC(); 
		ic.methodIC(); 
		System.out.println("oc.ic.y = " + oc.IC.y);
		oc.IC.methodIC();//IC을 통해 접근하여 메소드 실행은 가능
		
		System.out.println(oc.IC.y);
		

	}

}
