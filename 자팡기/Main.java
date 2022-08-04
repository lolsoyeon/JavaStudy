import java.util.Scanner; 

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Machine machine = new Machine();
		Menu menu = null;

		System.out.println("�Ƿ� ��ȭ ���Ǳ�");
		while (true)
		{
			System.out.println("1. ��ǰ ����(����� �޴�)\n2.��ǰ����(������ �޴�)");
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� :)");
			switch (scanner.nextInt())
			{
			case 1:
				menu = new UserMenu(machine);
				menu.showItems();
				menu.doProcess();
				break;
			case 2:
				menu = new AdminMenu(machine);
				menu.showItems();
				menu.showMenus();
				menu.doProcess(scanner.nextInt());
				break;
			
			}
		}
	}
}