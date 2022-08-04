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
		System.out.println("=============================================================================================================");
		System.out.println("�Ƿ���ȭ ���Ǳ� �Դϴ�. (��ȣ:��ǰ(���))");
		System.out.println("				[����]								[����]											[��ȭ]");
		for (int i=0; i<5; i++)
		{
			System.out.println((i+1)+":"+items.get(i).getName()+"      "+"("+items.get(i).getPrice()+")"+"  - "
			+"(S:"+items.get(i).getSize(0)+"M:"+items.get(i).getSize(1)+"L:"+items.get(i).getSize(2));
		}
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
		boolean valid = this.machine.offer(itemId, size);
		//1~10�������� ����� ������༭ �Է¹��� �� �ְ� ����

		//11~15�������� ��� �ʿ� ���� �ٷ� ����
		
		//vendingmachine.buy(int n ��1~15���� �ش��ϴ� ��ȣ);


	};												
	

}