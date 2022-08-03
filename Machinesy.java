import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Machinesy
{
	private Report report;
	private List<Item> items;
	private Map<Item, Integer> stocks;   //���� �����۸�� 
	private int capacity = 10;				//����
	private int money;


	public Machinesy()
	{
		items = new ArrayList<>();
		items.add(new Item(1, "����", 240, 1000,"������"));
		items.add(new Item(2, "���ƿ���ī" , 240, 900,"���ڿ�"));
		items.add(new Item(3, "�Ե�", 150, 500,"ĥ�����̴�"));
		items.add(new Item(4, "����Ʈ" , 240, 1100,"���������̵�"));

		report = new Report();

		stocks = new HashMap<Item, Integer>();
		for (Item item : items)
		{
			stocks.put(item, capacity);
		}
	}
	public void setMoney(int money)
	{
		this.money = money;
	}
	public int getMoney()
	{
		return money;
	}



	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}
	public int getCapacity()
	{
		return capacity;
	}
	public Item getItem(int itemId)
	{
		Item it = null;
		for (Item item:items)
		{
			if (item.itemId == itemId)
			{
				it = item;
			}
		}
		if (it == null)
		{
			System.out.println("���� ã���ô� ��ǰ�� �����ϴ�.");
			return null;
		}
		else
			return it;
	}
	public void fill(Item item, int amount)
	{
		int remains = stocks.get(item);
		stocks.put(item, remains + amount);
	}
	public void buy(int itemId)
	{
		for (Item item : items)
		{
			if (item.itemId == itemId)
			{
				Item it = item;
				int remains = stocks.get(it);
				if (remains == 0)
				{
					System.out.println("Sold Out!!");
				}
				else
				{
					stocks.put(it, remains - 1);
					money -= it.price;
				}
			}
		}
	}

	public List<Item> getItems()
	{
		return items;
	}
	public Map<Item, Integer> getStocks()
	{
		return stocks;
	}
	public Report getReport()
	{
		return report;
	}

}//Machinesy