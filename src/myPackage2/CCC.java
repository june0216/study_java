package myPackage2;

import poly_ex1.BBB;

public class CCC {
	public static void main(String[] args)
	{
		BBB b = new BBB();
		System.out.println(b.pub_a);
		//System.out.println(b.pro_b); //CCC는 BBB와는 또 다른 클래스이므로 BBB에서 가능했던 것이 접근 불가 -> public 메소드를 이용해 간접적으로 접근할 필요 
		//System.out.println(b.def_c);//패키지가 다르므로 접근 불가능 
		//System.out.println(b.pri_d);//not_visible
		System.out.println(b.getD());
	}

}
