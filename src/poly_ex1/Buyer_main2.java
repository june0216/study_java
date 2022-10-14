package poly_ex1;

public class Buyer_main2 {
	public static void main(String[] args)
	{
		Buyer buyer1 = new Buyer();
		Product tv1 = new Tv();
		Product cp1 = new Computer();
		Product ad1 = new Audio();
		
		buyer1.buy(tv1);
		buyer1.buy(cp1);
		buyer1.buy(ad1);
		
		System.out.println(tv1);
		System.out.println("Cost:" + tv1.price);
		System.out.println(cp1);
		System.out.println("Cost:" + cp1.price);
		System.out.println(ad1);
		System.out.println("Cost:" + ad1.price);
		System.out.println("\n Money left : " + buyer1.money);
		System.out.println("Current bonus point : " + buyer1.bonusPoint);
		
	}
	
	

}
