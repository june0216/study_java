package poly;

public class Buyer_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer Buyer1 = new Buyer();
		Tv tv = new Tv();
		Computer cp = new Computer();
		Audio ad = new Audio();
		
		Buyer1.buy(tv);
		Buyer1.buy(cp);
		Buyer1.buy(ad);
		
		System.out.println("Money: " + Buyer1.money);
		System.out.println("Bonus Point: " + Buyer1.bonusPoint);
		

	}

}
