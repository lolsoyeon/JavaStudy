import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AdminMode implements Mode
{	
	public static BufferedReader br;
	public static Integer sel;
	VendingMachine vendingmachine = new VendingMachine();
	UserMode user = new UserMode(vendingmachine);
	public static int profit; // ����

	static
	{ 	
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

//��ü�� �����ɶ����� 
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
			
			//��� ���� ���
		}

		else if (sel==2)
		{
			
			//profit -= ���ξ�;
			//profit = 10 * 3
			//System.out.println("��������� ������ " + profit + "�Դϴ�.");
			 
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

			//�Ǹ��� ��� UserMode.display()
			//UserMode.select()
			/*do
			{

			}
			while ();	//�Ǹ��� ��嵵 ���� ��� ���ƾ���...?
			*/
			user.display();
			user.select();
			user.display();
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

}
	
	//���� �ܵ��� ����� �ش��ϴ� Ŭ������ �ҷ����ڴ�
	
//1. (��� Ŭ�������� ��� ���� ��� ȣ��)
	 //������ڸ�忡�� ��� �߰��ϰ� ���ʿ� ���� ó�� ���� ���� �ְ� �����Ѵ�.
	 //������ڸ�忡�� ��� �߰��� ���� (������ �׸� ���ؼ�) �� ���� �ƽ� ���� �ֵ��� ����

	
//2. (���� Ŭ��������        ���� ���� ��� ȣ��)


//3. (��ŷ Ŭ�������� ���� ���� ��� ȣ��)


//4. (�ܵ� Ŭ�������� ȭ�� ������ ���õ� ��� ȣ��)


//5.  �Ǹ� ��� ����
	 //(UserMode();)



//6.  �ý��� ����(System.exit(-1);)