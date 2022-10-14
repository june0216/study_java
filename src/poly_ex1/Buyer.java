package poly_ex1;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	public void buy(Product pd)
	{
		if(pd.price > money)
		{
			System.out.println("Money is not enough. \n");
			System.exit(0);
		}
		money = money - pd.price;
		bonusPoint = bonusPoint + pd.bonusPoint;
	}

}
