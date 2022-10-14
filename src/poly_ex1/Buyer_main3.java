package poly_ex1;

public class Buyer_main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuyerNew buyer1 = new BuyerNew();
		
		Tv tv = new Tv();
		Computer cp = new Computer();
		Product ad = new Audio();
		
		buyer1.buy(tv);
		buyer1.buy(cp);
		buyer1.buy(ad);
		
		buyer1.summary();

	}

}
