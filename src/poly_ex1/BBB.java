package poly_ex1;

import myPackage1.AAA;

public class BBB extends myPackage1.AAA{
	public void output()
	{
		System.out.println(pub_a);
		System.out.println(pro_b);
		System.out.println(def_c);
		//System.out.println(pri_d);//패키지가 다르므로 접근 불가능
		System.out.println(getD());
	}
	

}
