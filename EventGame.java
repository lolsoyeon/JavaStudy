
import java.util.Scanner;
import java.util.Random;

class RpsGame 
{
	private int user;
	private int admin;

	// ��ǻ���� ����������
	private void runCom()
	{
		Random rd = new Random();
		admin = rd.nextInt(3)+1;			//- (3)�̸� 012 �̴ϱ� +1�� �ؼ� 123 ������ �����.
	}

	// ������ ����������
	public void input()
	{
		// ������ ���������� �ϱ� ����... ��ǻ��(������) ���� ����������
		runCom();

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:���� 2:���� 3:�� �� �Է�(1~3) : ");
			user = sc.nextInt();
		}
		while (user < 1 || user > 3);

	}

	// �߰� ��� ���
	public void middleCalc()
	{
		String[] str = {"����","����","��"};

		System.out.println();
		System.out.println(" - ����		:" + str[user-1]);
		System.out.println(" - ��ǻ��	:" + str[admin-1]);
	}

	// �ºο� ���� ���� ��� ����
	public void resultCalc()
	{

		// (����=="����"&& ��ǻ��=="����")||(����=="����"&& ��ǻ��=="����")||(����=="��"&& ��ǻ��=="��")

		if ((user==1&& admin==3)||(user==2&& admin==1)||(user==3&& admin==2))
		{
		   System.out.println("�º� ��� : ����� �¸��߽��ϴ�~!!");
		   RandomBox();

		}

		else if ((user==1&& admin==2)||(user==2&& admin==3)||(user==3&& admin==1))
		{
			System.out.println("�º� ��� : ����� �����ϴ�. �ƽ����� ������ȸ��~!!");
		}
		
		else if (user==admin)
		{
			System.out.println("�º� ��� : ���º��Դϴ�. �ƽ����� ������ȸ��~!!");
		}
	}

	// �̰��� �� �����ڽ� ���� �޼ҵ�
	public int RandomBox()
	{ 
		int arr[] = new int[]{1000, 2000, 3000};
		runCom();
		Scanner sc = new Scanner(System.in);
		System.out.println(">> �����ڽ��� ������ : 1  2  3");
		user = sc.nextInt();
		

		  if (admin == 1)
			  System.out.printf("%s �� ���α� ��÷ !",arr[0]);
		  else if (admin == 2)
			System.out.printf("%s �� ���α� ��÷ !",arr[1]);
		  else 
			System.out.printf("%s �� ���α� ��÷ !",arr[2]);
			  System.out.println();
	}

}

	// ��� ���
	/*
	public void print(String str)
	{
		System.out.printf("\n>> �º� ��� : %s\n" ,str);
	}
	*/


public class EventGame
{
	public static void main(String[] args)
	{
		RpsGame ob = new RpsGame();
		
	ob.input();
	ob.middleCalc();
	ob.resultCalc();

	//ob.print(result);
		

	}
}



