

class Buyer {
	int money, i;//money와 index를 저장할 변수를 선언한다. 
	int bonusPoint = 0;// 보너스 포인트를 선언한다. 
	Product item[] = new Product[10];//product 인스턴스를 배열로 저장한다. 
	
	void buy(Product pd)//product 인스턴스를 매개변수로 메소드 호출한다. (이때, product의 자식들까지 올 수 있다)
	{
		if(pd.price > money)//가지고 있는 돈보다 사고자 하는 pd의 값이 더 크면 살 수 없다. 
		{
			System.out.println("Money is not enough. \n");
		}
		else
		{
			System.out.println("You bought " + pd + "("+pd.price+").");//money가 충분하다면(pd의 가격보다 큰 돈을 가지고 있다면)
			money = money - pd.price;// 가지고 있는 돈에서 pd의 가격만큼 차감하여 money의 상태를 업데이트 한다. 
			bonusPoint = bonusPoint + pd.bonusPoint;//buyer가 가지고 있는 보너스 포인트에서 pd의 보너스 포인트를 더하여 보너스 포인트를 업데이트 한다. 
			item[i++] = pd;//item 리스트에 해당 pd를 저장한다. 
		}
		
		
	}
	
	void summary()
	{
		System.out.print("SHOPPING LIST: ");
		for (int j = 0 ; j < i; j++)
		{
			System.out.print(item[j] + " ");
		}
		System.out.println("\nMONEY LEFT : " + money);
		System.out.println("CURRENT BONUS POINT : " + bonusPoint);
	}

}
