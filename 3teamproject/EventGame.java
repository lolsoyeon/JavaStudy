
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
	public String resultCalc()
	{
		String result = "���º��Դϴ�. �ƽ����� ������ȸ��~!!";

		// (���� == "����" && �� == "��") || (���� == "����" && �� =="����") || (���� == "��" && �� == "����")
		if ((user==1 && admin==3) || (user==2 && admin==1) || (user==3 && admin==2))
		{
			Scanner sc = new Scanner(System.in);
			
			 do
		  {
			System.out.print("\n>> �º� ��� : ����� �¸��߽��ϴ�~!! \n>> �����ڽ��� ������ : 1  2  3\n");
			 user = sc.nextInt();
		  }
		  while (user < 1 || user > 3);
		RandomBox();

		}
		
		// (���� == "����" && �� == "����") || (���� == "����" && �� =="��") || (���� == "��" && �� == "����")
		else if ((user==1 && admin==2) || (user==2 && admin==3) || (user==3 && admin==1))
		{
			result = "����� �����ϴ�. �ƽ����� ������ȸ��~!!";
		}
		return result;

	}


	// �̰��� �� �����ڽ� ���� �޼ҵ�
	public void RandomBox()
	{
		  if (user == 1)
			  System.out.print("1000�� ���α� ��÷ !");
		  if (user == 2)
			System.out.print("3000�� ���α� ��÷ !");
		  if (user == 3)
			System.out.print("5000�� ���α� ��÷ !2");
			  
	}


	// ��� ���
	public void print(String str)
	{
		System.out.printf("\n>> �º� ��� : %s\n" ,str);
	}

}



public class EventGame
{
	public static void main(String[] args)
	{
		RpsGame ob = new RpsGame();
		
	ob.input();
	ob.middleCalc();
	String result = ob.resultCalc();
	//ob.print(result);
		

	}
}

