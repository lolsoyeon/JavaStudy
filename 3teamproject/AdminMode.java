import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Vector;
import java.util.Scanner;

public class AdminMode implements Mode
{	
	public static BufferedReader br;
	public static Integer sel;
	VendingMachine vendingmachine = new VendingMachine();
	UserMode user = new UserMode(vendingmachine);
	boolean flag;

	private VendingMachine machine;
	Vector<Items> items;
	
	//static
	public AdminMode()
	{ 	
		//this.vendingmachine = vendingmachine;
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	@Override
	public void display() 
	{
		System.out.println("===================[������ ���]===================");
		System.out.println("1.��� �߰�");
		System.out.println("2.���� Ȯ��"); 
		System.out.println("3.��ŷ");
		System.out.println("4.ȭ�� ����");
		System.out.println("5.�Ǹ� ��� ����");
		System.out.println("6.����");
		System.out.println("===================================================");
		System.out.print("�ʿ��� �۾��� �Է����ּ���(1~6) : ");

	}
	
	@Override
		public boolean selecting(){return true;};

	@Override
	public void select() throws IOException, NumberFormatException
	{	
		sel = Integer.parseInt(br.readLine());
		if (sel<1 || sel>6)
		{
			System.out.println("�߸� �Է� �ϼ̽��ϴ�");
			System.out.println("�ٽ� �Է� ���ֽʽÿ�");
			System.out.println();
		}
		else if (sel==1)
		{
			do
			{
				user.display();
				flag = this.stockup();
			}
			while (flag);
		}

		else if (sel==2)
		{
			//���� Ȯ�� ���
		}

		else if (sel==3)
		{
			//
		}

		else if (sel==4)
		{
			//
		}

		else if (sel==5)
		{
			
			do
			{
				user.display();
				flag = user.selecting();
			}
			while (flag);	//�Ǹ��� ��嵵 ���� ��� ���ƾ��ϴµ�... ���ö� ��� ����������.......
			
		}
		else if (sel==6)
		{	
			exit();

		}
	}

	

	public static void exit()
	{	
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(-1);		
	}

	public boolean stockup() throws IOException		//�Է��� �ް� �Է¿� ���� ���������� ��� ȣ��
	{	
		Scanner sc = new Scanner(System.in);
		boolean flag =true;
		System.out.print("��� �߰��� �׸��� ������ ");
		String size = null;

		int itemId = sc.nextInt();
		if (itemId == 99)
		{	
			flag = false;
			return flag;
		}
		if (itemId>0 && itemId<=10)
		{	
			System.out.print("��� �߰��� ����� �Է����ּ���(S/M/L) : ");
			size = sc.next();
			this.vendingmachine.stockC(itemId-1, size);
			//boolean valid = this.machine.buyC(itemId-1, size);
		}

		else if (itemId>10 && itemId<=15)
		{
			this.vendingmachine.stockA(itemId-1);
			//boolean valid = this.machine.buyA(itemId-1);
		}
		
		//1~10�������� ����� ������༭ �Է¹��� �� �ְ� ����

		//11~15�������� ��� �ʿ� ���� �ٷ� ����
		
		//vendingmachine.buy(int n ��1~15���� �ش��ϴ� ��ȣ);
		
		return true;
		}

}
	
	//���� �ܵ��� ����� �ش��ϴ� Ŭ������ �ҷ����ڴ�
	
//1. (��� Ŭ�������� ��� ���� ��� ȣ��)
	 //������ڸ�忡�� ��� �߰��ϰ� ���ʿ� ���� ó�� ���� ���� �ְ� �����Ѵ�.
	 //������ڸ�忡�� ��� �߰��� ���� (������ �׸� ���ؼ�) �ѹ��� �ƽ� ���� �ֵ��� ����

	
//2. (���� Ŭ��������                  ���� ���� ��� ȣ��)


//3. (��ŷ Ŭ�������� ���� ���� ��� ȣ��)


//4. (�ܵ� Ŭ�������� ȭ�� ������ ���õ� ��� ȣ��)


//5.  �Ǹ� ��� ����
	 //(UserMode();)



//6.  �ý��� ����(System.exit(-1);)