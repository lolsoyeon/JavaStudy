import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//mport java.util.ArrayList;
//import java.util.Scanner;
public class AdminMode implements Mode
{
	VendingMachine vendingmachine = new VendingMachine();
	UserMode user = new UserMode(vendingmachine);
	//��ü�� �ϳ��� ���� �ؾ��ϱ⶧���� �ٸ���ü�� �������� �ʰ� �ϱ� ���� �� �����͸� ����(?)�ϱ� ����     (�°� �����Ѱ��� ���)
	//����� ���ؼ� �����ڿ��� �ϳ��� �����ϰ�, �� ������ �� ������ ��ü�� ���ѱ�� �������� �ϴ� ��

	boolean isEnd = true;
	public static BufferedReader br;

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
	public boolean select() throws IOException, NumberFormatException
	{
		boolean flag ;
		int sel = Integer.parseInt(br.readLine());
		if (sel<1 || sel>6)
		{
			System.out.println("�߸� �Է� �ϼ̽��ϴ�");
			System.out.println("�ٽ� �Է� ���ֽʽÿ�");
			System.out.println();
		}	
		else if (sel==1)
		{ //��� ���� ���
			user.display();
			this.stockUp();
		}
		//1. (��� Ŭ�������� ��� ���� ��� ȣ��)
		//������ڸ�忡�� ���� �߰��ϰ� ���ʿ� ���� ó�� ���� ���� �ְ� �����Ѵ�.
		//������ڸ�忡�� ���� �߰��� ���� (������ �׸� ���ؼ�) �ѹ��� �ƽ� ���� �ֵ��� ���� �� �ذ��� ��ã��
		//  �� �� �׸�� 5���� �߰� ���ִ°ɷ� ����
		else if (sel==2)
		{
			///2. (���� ���� ��� ȣ��)
			int salesAll = vendingmachine.getSales().getsumAll();
			System.out.println("���� �� ������� " + salesAll + "�� �Դϴ�");
			System.out.print("����ȭ������ ���ư����� �ƹ�Ű�� �Է��ϼ���.......");
			String anyKey = br.readLine();
		}
		else if (sel==3)
		{
			//3. (��ŷ ���� ��� ȣ��)
			vendingmachine.getSales().ranking();

			 
			System.out.print("����ȭ������ ���ư����� �ƹ�Ű�� �Է��ϼ���.......");
			String anyKey = br.readLine();
		}
		else if (sel==4)
		{
			//4. (ȭ�� ���� �����ִ� ��� ȣ��)
			vendingmachine.moneyinsert.Display();
			System.out.print("����ȭ������ ���ư����� �ƹ�Ű�� �Է��ϼ���.......");
			String anyKey = br.readLine();
		}
		//4. (�ܵ� Ŭ�������� ȭ�� ������ ���õ� ��� ȣ��)
		else if (sel==5)
		{	
			do
			{
				user.display();
				isEnd = user.select();
				
			}
			while (isEnd);
		}
		//5.  �Ǹ� ��� ����
		//(UserMode();)
		else if (sel==6)
		{	
			exit();
		}
		//6.  �ý��� ����(System.exit(-1);)
		return true;
	}
	public void stockUp() throws IOException 
	{
		//Scanner sc = new Scanner(System.in);
		boolean flag = true;
		//boolean flag = false;
		do
		{
			System.out.print("��� �߰��� �׸��� �������: ");
			int itemId = Integer.parseInt(br.readLine());//sc.nextInt();
			if (itemId > 0 && itemId <= 15)
			{
				this.vendingmachine.stock(itemId - 1);
				System.out.println(vendingmachine.getName(itemId-1) + " ��(��) 5�� �߰��Ǿ����ϴ�.");
			} 
			else 
			{
				System.out.print("�߸� �Է��ϼ̽��ϴ�.");
			}
			System.out.print("���� �� �߰��Ͻðڽ��ϱ�? (Y/N): ");
			String check = br.readLine();
			if (check.equals("N") || check.equals("n") ) {
				flag = false;
			}
			/*
			�����ߴ� ��
			if (!(check.equals("Y")&&check.equals("y")))
			{
				flag = true;
			}
			*/
		}
		while(flag);
	} //���� �߰�

	public void exit()
	{
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(-1);
	}

}

