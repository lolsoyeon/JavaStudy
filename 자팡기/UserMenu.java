import java.util.Scanner;
import java.util.List;

public class UserMenu implements Menu
{
	Scanner scanner = new Scanner(System.in);
	//����ڿ��� ��ĳ�ʷ� �Է��� �޴´�.
	private Machine machine;
	private Report report;
	List<Item> items;
	int minPrice;

	public UserMenu(Machine machine)
	{
		this.machine = machine;
		items = machine.getItems();
		report = machine.getReport();

		minPrice = items.get(0).price;
		for (Item item: items)
		{
			minPrice = item.price;
		}
		 System.out.println("===========  ��ǰ ���� ==========");

	}
	
	
public void doProcess()
	{
		boolean isEnd = false;
		while (true)
		{
			System.out.print("���� �־� �ּ��� : )");
			int money  = scanner.nextInt();
			machine.setMoney(machine.getMoney() + money);
			if (showCanBuy(machine.getMoney()))
			{
				System.out.print("���ϴ� ��ǰ�� �������ּ��� :) ");
				int itemId = scanner.nextInt();
				String item = machine.getItem(itemId).name;
				machine.buy(itemId);
				System.out.println(item + "�� �����߽��ϴ�.");
				report.write(item);
				System.out.println("�� ���� �Ͻðڽ��ϱ�? (Y/N)");
				switch (scanner.next())
				{
					case "Y":
					case "y":
						break;
					case "N":
					case "n":
						System.out.println("�Ž����� " + machine.getMoney() + "���� ���������� :)");
						machine.setMoney(0);
						isEnd  = true;
						break;
					default:
						System.out.println("�߸��� �Է����� ó������ ���ư��ϴ�.");
				
				}

			}
			else
				continue;
			System.out.println("=======================================");
			if (isEnd)
			{
				break;
			}


		}
	}//doProcess()


	public void showItem()
	{
		System.out.println("��ȣ ��ǰ�� ������ �뷮 ����");
		for (Item item : items)
		{
			System.out.println(item);
		}
	}
	public boolean showCanBuy(int money)
	{
		if (money < minprice)
		{
			System.out.println("���� �ʹ� �����ϴ�...�� �־��ּ���..");
			return false;
		}
		else
		{
			System.out.println(money + "������ �� �� �ִ� ����");
			System.out.println("=> ");
			for (Item item : items )
			{
				if (item.price <= money)
				{
					System.out.println(item.itemId + "." + item.name + " " + item.price + "��");
				}
			}
			return true;
		}
	}
}//UserMenu implements Menu

/*

	MyParent p = new MyParent();
	System.out.println(p.prv);

	class Mychild extends MyParent
	{
		System.out.println(p.prv);
		System.out.println(p.de);

	}
	public void setHour(int hour)
	{
		
	}



*/