import java.util.Scanner;

public class Project
{
	public static final int MAX = 10;
	//�޴��� �ִ� ���� ==10

	//�������� ����
	static String[] box = new String[MAX];
	static int[] price = new int[MAX];
	static int[] stock = mew int[MAX];
	static int count = 3; �޴���  ����
	static int admin = 1004; //������ �޴��� ���� ��й�ȣ
	static profit = 0; //�� ����
	static Scanner sc = new Scanner(System.in);


	//ó�� ���Ǳ⸦ �ʱ�ȭ �ϴ� �޼ҵ�
	public static void initialize()
	{
		box[0] = "���";
		price[0] = 500;
		stock[0] = 3;
		box[1] = "��������";
		price[1] = 1000;
		stock[1] = 3;
		box[2] = "��ȭ";
		price[2] = 3000;
		stock[2] = 3;
	}

	//������ �������� ����ϴ� �Լ�
	public static void admin()
	{
		while(true)
		{
			 System.out.println("==========================");
			 System.out.println("������ ������ �Դϴ�.");
			 System.out.println("1: �޴����� 2 :���ݺ��� 3: ����߰� 4: �޴��߰� 5: ���� Ȯ�� (����� -1)");
			 System.out.println("��ȣ�� �Է��ϼ���: ");
			
			int num = sc.nextInt();
			 System.out.println("==========================");



			if(num == 1)
			{
				System.out.print("�����Ͻ� �޴��� ��ȣ�� �Է��ϼ���(1~" + count + ") :");
				int i = sc.nextInt();
				System.out.print(box[i-1] + "��(��) �������� �ٲٽðڽ��ϱ�? : ");
				sc.nextLine();
				String name = sc.next();
				System.out.print(name + "�� ������ ���Դϱ�?");
				int v = sc.nextInt();
				System.out.print(name + "�� ��� �� �� ����Ͻðڽ��ϱ�? :");
				int n = sc.nextInt();

				box[i-1] = name;
				price[i-1] = v;
				stock[i-1] = n;
				System.out.print("�޴� ������ �Ϸ� �Ǿ����ϴ�!");
			}
			//2. ���ݺ���
			else if (num == 2)
			{
				System.out.print("������ �����Ͻ� �޴��� ��ȣ�� �Է��ϼ���(1~" + count + "):");
				int i = sc.nextInt();

			}

		}
	}

