package poly;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Tv t)
	{
		money = money - t.price;
		bonusPoint = bonusPoint + t.bonusPoint;
	}
	void buy(Computer c)
	{
		money = money - c.price;
		bonusPoint = bonusPoint + c.bonusPoint;
	}
	void buy(Audio a)
	{
		money = money - a.price;
		bonusPoint = bonusPoint + a.bonusPoint;
	}

}
