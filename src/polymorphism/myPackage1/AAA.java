package myPackage1;

public class AAA {
	public String pub_a = "public_var";
	protected String pro_b = "protected_var";//같은 패키지 내 혹은 다른 패키지이지만 상속받은 것만 가능 
	String def_c = "default_var";
	private String pri_d = "private_var";
	
	public String getD()
	{
		return pri_d;
	}

}
