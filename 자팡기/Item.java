public class Item
{
	int itemId;		//상품명
	String brand;	//제조사
	int weight;		//용량
	int price;		//가격
	String name;
	long date;


	public Item(int itemId, String brand, int weight, int price, String name)
	{
		this.itemId = itemId;
		this.brand = brand;
		this.weight = weight ;
		this.price = price;
		this.name = name;
		this.date = System.currentTimeMillis();
	}
	@Override
	public String toString()
	{
		return itemId + ". " + name + " " + brand + weight + "ml" + price + "원";
	}

}