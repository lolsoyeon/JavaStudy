import java.util.Scanner;

public class Project
{
	public static final int MAX = 10;
	//�޴��� �ִ� ���� ==10

	//�������� ����
	static String[] box = new String[MAX];
	static int[] price = new int[MAX];
	static int[] stock = new int[MAX];
	static int count = 3;		//�޴���  ����
	static int admin = 1004;	//������ �޴��� ���� ��й�ȣ
	static int profit = 0;		//�� ����
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
			 System.out.println("1: �޴�����  2 :���ݺ���  3: ����߰�  4: �޴��߰�  5: ���� Ȯ�� (����� -1)");
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
				System.out.print(box[i-1] + "�� ������ �󸶷� �ٲٽðڽ��ϱ�? : ");
				int j = sc.nextInt();
				price[i-1] = j;
				System.out.print("���� ������ �Ϸ�Ǿ����ϴ�!");
			}

			//3. ��� �߰�
			else if (num == 3)
			{
				System.out.print("��� �߰��Ͻ� �޴��� ��ȣ�� �Է��ϼ���(1~" + count + "):");
				int i = sc.nextInt();
				System.out.print(box[i-1] + "��(��) �� �� �߰� �Ͻðڽ��ϱ�? :");
				int j = sc.nextInt();
				stock[i-1] += j;
				//stock[i-1] = stock[i-1] + j ;
				System.out.println("��� �߰��� �Ϸ�Ǿ����ϴ�!");

			}
			//4. �޴� �߰�
			else if (num == 4)
			{
				if (count>=MAX - 1)
				{
					System.out.println("�� �̻� �޴��� �� �ڸ��� �����ϴ�!");
					continue;
				}
			
				else
				{
					System.out.print("�߰��Ͻ� �޴��� ������ �Է��ϼ��� : ");
					int i = sc.nextInt();
					System.out.print("�߰��Ͻ� �޴��� �̸��� �Է��ϼ��� : ");
					sc.nextLine();
					String name = sc.next();
					System.out.print(name + "�� ���� �� �� �Դϱ�? : ");
					int j = sc.nextInt();

					box[count] = name;
					price[count] = i;
					stock[count] = j;
					count++;
					System.out.print("�޴� �߰��� �Ϸ�Ǿ����ϴ�!");
				}
			}

			//���� Ȯ��
			else if (num == 5)
			{
				System.out.println("��������� ������" + profit + "�Դϴ�.");
			}
			//-1�� �Է��ϸ� �ٽ� ���Ǳ� �޴��� ���ư�
			else if (num == -1)
			{
				user();
				return;
			}

		}//while

	}//end admin

		//���� �������̽��� ����ϴ� �޼ҵ�
		public static void user() 
		{
			Boolean first = true;
			int money = 0;

			while (true)
			{
				System.out.println("===================================");
				System.out.println("�� ���Ǳ� �Դϴ�.(��ȣ: ��ǰ(���))");


				//��ȣ : �޴�(����)- ������
				for (int i = 0;i<count ;i++ )
				{
					System.out.print((i+1) + ": " +box[i] +"(" + price[i] + "W)-" + stock[i] + " ��   ");
				}
				System.out.println();
				System.out.println("=====================================");

				//ó������ ���� �Է¹ް� �ܵ� ��ȯ �� ������ ���� �Է¹��� �ʴ´�.
				if (first)
				{
					System.out.print("���� �־��ּ��� : ");
					money = sc.nextInt();
					first = false;
				}
				//������ ��й�ȣ�� 1004, �Է��ϸ� ������ �޼ҵ�� �Ѿ.
				if (money == 1004)
				{
					admin();
					return;
				}
				System.out.print("�޴� �Է� : ");
				int num = sc.nextInt();

				//���� ����Ѱ�?
				if (money >= price[num-1])
				{
					//��� ����Ѱ�?
					if (stock[num-1] > 0)
					{
						money = money - price[num-1];
						stock[num-1]--;
						profit += price[num-1];
						System.out.println(box[num-1] + "��(��) ���Խ��ϴ�!");
					}
					else
					{
						System.out.println("���� ��� �����ϴ�!");
						continue;
					}
				}
				else{
					System.out.println("�ܾ��� �����մϴ�!");
				}
			
				System.out.println("�ܾ� : " + money);

				//�������� ����ϸ� �̿� ���� �� �ʱ� ȭ�� ����
				if (money == 0)
				{
					System.out.println("�����մϴ�! ������ �� �̿����ּ���.");
					first = true;
					continue;

				}
				//���� ���Ҵٸ� �������� �ش�.
				System.out.println("1 : ��� �����ϱ�  2 : �ݾ� �߰��ϱ�  3 : �ܵ� ��ȯ�ϱ� ");
				System.out.print("��ȣ�� �Է� �� �ּ��� : ");
				int num1 = sc.nextInt();

				if (num1 == 1)
				{
					continue;
				}
				else if (num1 == 2)
				{
					System.out.print("���� �־��ּ��� : ");
					int extra = sc.nextInt();
					money += extra;
					System.out.println("�ݾ��� �߰��Ǿ����ϴ�! �ܾ�: " + money);
				}
				else if (num1 == 3)
				{
					System.out.println("�Ž����� " + money + " ���� ��ȯ�˴ϴ�.");
					System.out.println();
					System.out.println("�����մϴ�! ������ �� �̿����ּ���.");
					first = true;
				}

			}//while


			
		}//user 
	public static void main(String[] args)
	{
		initialize();
		user();
		return;
	}



}//Project
