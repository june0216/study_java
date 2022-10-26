

public class Product {
	public int price;
	public int bonusPoint;
	public Product() {}
	public Product(int price)
	{
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}

}
