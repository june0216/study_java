package poly_ex1;

public class BuyerNew {
	int money = 1000, i;
	int bonusPoint = 0;
	Product item[] = new Product[10];
	
	public void buy(Product pd)
	{
		if(pd.price > money)
		{
			System.out.println("Money is not enough. \n");
			System.exit(0);
		}
		System.out.println("You bought " + pd + "("+pd.price+")");
		money = money - pd.price;
		bonusPoint = bonusPoint + pd.bonusPoint;
		item[i++] = pd;
		
	}
	
	void summary()
	{
		System.out.println("Shopping list:");
		for (int j = 0 ; j < i; j++)
		{
			System.out.println(item[j] + " ");
			System.out.println("\n Money left : " + money);
			System.out.println("Current bonus point : " + bonusPoint);
		}
	}

}
