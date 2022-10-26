
public class Buyer {
	
	private int money, i;//i는 item 배열의 인덱스를 나타내기 위한 변수이다. 
	int bonusPoint;
	Product item[] = new Product[10];//Buyer가 산 물건들을 저장하는 배열이다. 이전 실습에서 수정하는 것이므로 이전 실습에서는 10개로 두었다. 과제에서 이를 수정하라는 언급이 없으므로 그대로 10개로 생성했다. 

	
	public int getMoney()//private이므로 get함수를 통해 외부에서 값을 읽을 수 있게 했다. 
	{
		return money;
	}
	public boolean setMoney(int money)//money는 0보다 작으면 안된다는 조건이 있으므로 money에 값을 대입할 때 조건을 체크하고 값을 대입한다. 
	{
		if(money <= 0)//money에는 0이하의 값은 올 수 없다. 
		{
			System.out.println("Money should be positive.");
			return false;
		}
		else
		{
			this.money = money;//범위에 만족하는 값이므로 멤버변수 money에 값을 대입한다. 
			return true;//값을 넣을 수 없어서 실패한 것은 false이므로 값을 넣은 것은 true로 반환한다. 
		}
	}
	
	void buy(Product pd)
	{
		if(pd.price > money)//사려고 하는 물건보다 money의 값이 더 작을 때 
		{
			System.out.println("Money is not enough. \n");
			//프로그램이 바로 종료되지 않게 적절하게 수정하라고 했는데 System.exit(0)으로 종료되지 않고 계속 반복한다는 특성을 통해 프로그램을 종료하는 것이 아니라 
			//if-else문을 통해 돈이 not enough할 때는 해당 문장을 출력하기만 하고 돈이 여유있을 때는 money에서 차감하여 그 물건을 사는 로직으로 구현했다. 
		}
		else
		{//money가 해당 물건을 살 수 있는 정도일 때 살 수 있다 
			System.out.println("You bought " + pd + "("+pd.price+")");
			money = money - pd.price;//물건을 샀으므로 그 물건에 해당하는 가격만큼 원래 가지고 있는 돈에서 차감한다. 
			bonusPoint = bonusPoint + pd.bonusPoint;//물건을 샀으므로 그 물건에 해당하는 가격에 비례하여 보너스 포인트를 얻는다. 
			item[i++] = pd;//물건을 샀으므로 구매 목록에 해당 물건을 추가한다. 
		}
		
		
	}
	
	void summary()//결과를 출력하는 함수이다. 
	{
		System.out.print("- Shopping list: ");
		for (int j = 0 ; j < i; j++)
		{
			System.out.print(item[j] + " ");//이 메서드 호출 시점까지 배열에 들어간 인덱스는 i-1번째까지라고 할 수 있다. (i를 늘려가면서 배열에 인스턴스를 대입했으므로)
			//그래서 처음부터 i전까지 반복문을 돌리면서 item배열의 요소들을 출력한다 
			
		}
		System.out.println("\n- Money left : " + money);//남은 돈을 출력한다. 
		System.out.println("- Current bonus point : " + bonusPoint);//보너스 포인트를 출력한다
	}
	
	

}
