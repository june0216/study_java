

class Product {
	int price;//가격을 저장할 int형 변수이다. 
	int bonusPoint;// 각 제품로 가지고 있는 보너스 포인트를 저장할 int형 변수이다. 
	
	public Product()//기본생성자이다. 
	{}
	
	Product(int price)//생성자이다. 
	{
		this.price = price;
		bonusPoint = (int)(price/10.0);//가격을 바탕으로 보너스 점수를 계산하여 저장한다. 
	}

}
