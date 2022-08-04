import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class UserMode implements Mode
{	
	Scanner sc = new Scanner(System.in);

	private VendingMachine machine;
	List<Items> items;

	public UserMode(VendingMachine vendingmachine)
	{
		this.machine = vendingmachine;
		items = this.machine.getItems();
	}

	public void display()							//�޴����� ������� �Ѵ� 
	{	
		items = this.machine.getItems();
		System.out.println("=============================================================================================");
		System.out.println("�Ƿ���ȭ ���Ǳ� �Դϴ�. (��ȣ:��ǰ(���))");
		System.out.println("\t\t\t\t\t\t[����]");
		for (int i=0; i<5; i++)
		{
			/*System.out.println((i+1)+"."+items.get(i).getName()+"      "+"("+items.get(i).getPrice()+")"+"  - "
			+"(S:"+items.get(i).getSize(0)+" M:"+items.get(i).getSize(1)+" L:"+items.get(i).getSize(2)+")");*/

			System.out.printf("%2d. %s(%d) - (S:%s M:%s L:%s)", (i+1),  items.get(i).getName(), items.get(i).getPrice(), items.get(i).getSize(0), items.get(i).getSize(1), items.get(i).getSize(2));
			if (i==2)
			{
				System.out.println(); continue;
			}
			else if (i==4)
			{
				continue;
			}
			System.out.print("         >> "); 
		}
		System.out.println();

		
		System.out.println();
		System.out.println("\t\t\t\t\t\t[����]");
		for (int i=5; i<10; i++)
		{


			System.out.printf("%2d. %s(%d) - (S:%s M:%s L:%s)", (i+1),  items.get(i).getName(), items.get(i).getPrice(), items.get(i).getSize(0), items.get(i).getSize(1), items.get(i).getSize(2));
			if (i==7)
			{
				System.out.println(); continue;
			}
			else if (i==9)
			{
				continue;
			}
			else if (i==5)
			{
				System.out.print("       >> "); continue;
			}

			else if (i==6)
			{
				System.out.print("        >> "); continue;
			}
			
			System.out.print("   >> "); 
		}
		System.out.println();

		
		System.out.println();
		System.out.println("\t\t\t\t\t\t[��ȭ]");
		for (int i=10; i<15; i++)
		{
			System.out.printf("%2d. %s(%d)", (i+1),  items.get(i).getName(), items.get(i).getPrice());
			if (i==12)
			{
				System.out.println(); continue;
			}
			else if (i==11)
			{
				System.out.print("			    >> "); continue;
			}
			else if (i==14)
			{
				continue;
			}
			System.out.print("			       >> ");
		}
		System.out.println();
		System.out.println("=============================================================================================");
	};	


	public void select() throws IOException		//�Է��� �ް� �Է¿� ���� ���������� ��� ȣ��
	{	
		System.out.print("������ �����Ͻðڽ��ϱ�?");
		String size = null;
		int itemId = sc.nextInt();
		if (itemId>0 && itemId<=10)
		{	
			System.out.print("����� �Է����ּ���(S/M/L) : ");
			size = sc.next();
		}
		boolean valid = this.machine.offer(itemId-1, size);
		//1~10�������� ����� ������༭ �Է¹��� �� �ְ� ����

		//11~15�������� ��� �ʿ� ���� �ٷ� ����
		
		//vendingmachine.buy(int n ��1~15���� �ش��ϴ� ��ȣ);


	};												
	

}