package poly_ex1;

public class Buyer_main_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer buyer1 = new Buyer();
		Product pd[] = new Product[3];
		
		pd[0] = new Tv();
		pd[1] = new Computer();
		pd[2] = new Audio();
		
		for(int i = 0; i < 3; i++)
		{
			buyer1.buy(pd[i]);
			System.out.println(pd[i]);
			System.out.println("Cost:" + pd[i].price);
		}
		System.out.println("\n Money left : " + buyer1.money);
		System.out.println("Current bonus point : " + buyer1.bonusPoint);
		
		

	}

}
