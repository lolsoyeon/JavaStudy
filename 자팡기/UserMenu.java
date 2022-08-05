import java.util.Scanner;
import java.util.List;

public class UserMenu implements Menu
{
	Scanner scanner = new Scanner(System.in);
	//사용자에게 스캐너로 입력을 받는다.
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
		 System.out.println("===========  상품 구매 ==========");

	}
	
	
public void doProcess()
	{
		boolean isEnd = false;
		while (true)
		{
			System.out.print("돈을 넣어 주세요 : )");
			int money  = scanner.nextInt();
			machine.setMoney(machine.getMoney() + money);
			if (showCanBuy(machine.getMoney()))
			{
				System.out.print("원하는 상품을 선택해주세요 :) ");
				int itemId = scanner.nextInt();
				String item = machine.getItem(itemId).name;
				machine.buy(itemId);
				System.out.println(item + "을 구입했습니다.");
				report.write(item);
				System.out.println("더 구매 하시겠습니까? (Y/N)");
				switch (scanner.next())
				{
					case "Y":
					case "y":
						break;
					case "N":
					case "n":
						System.out.println("거스름돈 " + machine.getMoney() + "원을 가져가세요 :)");
						machine.setMoney(0);
						isEnd  = true;
						break;
					default:
						System.out.println("잘못된 입력으로 처음으로 돌아갑니다.");
				
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
		System.out.println("번호 상품명 제조사 용량 가격");
		for (Item item : items)
		{
			System.out.println(item);
		}
	}
	public boolean showCanBuy(int money)
	{
		if (money < minprice)
		{
			System.out.println("돈이 너무 적습니다...더 넣어주세요..");
			return false;
		}
		else
		{
			System.out.println(money + "원으로 살 수 있는 음료");
			System.out.println("=> ");
			for (Item item : items )
			{
				if (item.price <= money)
				{
					System.out.println(item.itemId + "." + item.name + " " + item.price + "원");
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