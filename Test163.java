/*=============================================
   �����÷���(Collection)  ���� 2022-07-28
 ==============================================*/
//Test163 Ŭ������ �ϼ��Ͽ� ���� ����� ���� ���α׷��� �����Ѵ�.

/*
���� ��)

	[ �޴� ���� ]============
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	=========================
>> �޴� ���� (1~6) : 1

1��° ��� �Է� : ������
1��° ��� �Է� ����~!!!
��� �Է� ���(Y/N) : Y


2��° ��� �Է� : ���ҿ�
2��° ��� �Է� ����!!!

��� �Է� ���(Y/N) : N

	[ �޴� ���� ]============
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	=========================
>> �޴� ���� (1~6) : 2

[���� ��ü ���]
������
���ҿ�
���� ��ü ��¿Ϸ�~!!


	[ �޴� ���� ]============
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	=========================
>> �޴� ���� (1~6) : 3

>>�˻��� ��� �Է� : ������

[�˻� ��� ���]
�׸��� �����մϴ�.


	[ �޴� ���� ]============
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	=========================
>> �޴� ���� (1~6) : 3

>>�˻��� ��� �Է� : �ݺ���

[�˻� ��� ���]
�׸��� �������� �ʽ��ϴ�.



	[ �޴� ���� ]============
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	=========================
>> �޴� ���� (1~6) : 4

>>������ ��� �Է� : �躸��

[���� ��� ���]
�׸��� �������� �ʾ� ������ �� �����ϴ�.

	[ �޴� ���� ]============
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	=========================
>> �޴� ���� (1~6) : 4

>>������ ��� �Է� : ������

[���� ��� ���]
������ �׸��� �����Ǿ����ϴ�.



	[ �޴� ���� ]============
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	=========================
>> �޴� ���� (1~6) : 5

>>������ ��� �Է� : ������

[���� ��� ���]
������ ����� �������� �ʽ��ϴ�.

	[ �޴� ���� ]============
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	=========================
>> �޴� ���� (1~6) : 5

>>������ ��� �Է� : ���ҿ�
>>������ ���� �Է� : ������

[���� ��� ���]
������ �Ϸ� �Ǿ����ϴ�.



	[ �޴� ���� ]============
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	=========================
>> �޴� ���� (1~6) : 2

[���� ��ü ���]
������
���� ��ü ��¿Ϸ�~!!

	[ �޴� ���� ]============
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	=========================
>> �޴� ���� (1~6) : 6

���α׷� ����~!~!
����Ϸ��� �ƹ� Ű�� ��������....

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;
import java.io.IOException;
import java.util.Collection;

class Menus		//�ϼ�
{
	public static final int E_ADD = 1;		//��� �߰�
	public static final int E_DISP = 2;		//��� ���
	public static final int E_FIND = 3;		//��� �˻�
	public static final int E_DEL = 4;		//��� ����
	public static final int E_CHA = 5;		//��� ����
	public static final int E_EXIT = 6;		//����
}

public class Test163
{

	//�ֿ� �Ӽ� ����
	private static final Vector<Object> vt;		//�ڷ� ����
	private static BufferedReader br;			//�Է� �� Ȱ��
	private static Integer sel;					//���� ��
	private static String con;					//��� ���� ����

	//static�ʱ�ȭ ��
	static
	{

		//Vector �ڷᱸ�� ����
		vt = new Vector<Object>();

		//BufferedReader Ŭ���� �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));
		

		//����� �Է°� �ʱ�ȭ
		sel = 1;
		con = "Y";
	}


	//�޴� ��� �޼ҵ�
	public static void menuDisp()
	{

		System.out.println("[ �޴� ���� ]============");
		System.out.println("1. ��� �߰�");
		System.out.println("2. ��� ���");
		System.out.println("3. ��� �˻�");
		System.out.println("4. ��� ����");
		System.out.println("5. ��� ����");
		System.out.println("6. ����");
		System.out.println("========================");
		System.out.printf(">> �޴� ���� (1~6) : %d",n);

		System.out.println();
		
		}
		
	}
	//�޴� ���� �޼ҵ�
	public sttic void menuSelect() throws IOException, NumberFormatException
	{
		
		//Menus Ŭ���� ��� �ν��Ͻ� ����
		Menus m = new Menus();

		n = Integer.parseInt(br.readLine());


		for (Object o : m )
		{
			System.out.print(m + " ");
		}
		
		System.out.printf(">> �޴� ���� (1~6) : %d",n);

		System.out.println();
		
	}

	//���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun() throws IOException
	{/*
	public static final int E_ADD = 1;		//��� �߰�
	public static final int E_DISP = 2;		//��� ���
	public static final int E_FIND = 3;		//��� �˻�
	public static final int E_DEL = 4;		//��� ����
	public static final int E_CHA = 5;		//��� ����
	public static final int E_EXIT = 6;		//����
	*/
		switch (sel)
		{
		case 1:addElement();break;
		case 2:dispElement();break;
		case 3:findElement();break;
		case 4:delElement();break;
		case 5:chaElement();break;
		case 6:exit();break;
		
		}

	}

	//�ڷᱸ�� ��ü �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException
	{

		/*
		1��° ��� �Է� : ������
1��° ��� �Է� ����~!!!
��� �Է� ���(Y/N) : Y


2��° ��� �Է� : ���ҿ�
2��° ��� �Է� ����!!!

		*/
		vt = System.in.read();

		System.out.print("����Ͻðڽ��ϱ�(Y/N)? : ");    //Y,y�� ���ǹ� 
		if (vt != 'y'&& vt !='Y')
			break;

		
	}

	//�ڷᱸ�� ��ü ��� �޼ҵ�
	public static void dispElement()
	{
		System.out.print("[���� ��ü ���]\n ");
			for (Object obj : vt )
			{
				System.out.print(obj);
			}
			System.out.println("���� ��ü ��¿Ϸ�~!!");
		}
		System.out.println();
	
	}


	//�ڷᱸ�� �� ��� �˻� �޼ҵ�
	public static void findElement() throws IOException
	{
		Collections.sort(vt);

		System.out.println(">>�˻��� ��� �Է� : ")
		
		for (Object obj :vt )
		{
			System.out.print(st + " ");
		}
		System.out.println();
	}


	//�ڷᱸ�� �� ��� ���� �޼ҵ�
	public static void delElement() throws IOException
	{
		if ( boolean contains != null)
		{
			boolean removeElement(Object obj)
			System.out.println("[���� ��� ���]");
			System.out.println("�׸��� �����Ǿ����ϴ�.");
		}
		else if 
			System.out.println("[���� ��� ���]");
			System.out.println("�׸��� �������� �ʾ� ������ �� �����ϴ�.");
		
		String br = br.readLine();
			//v.contains(br)
			//--���� �ڷᱸ�� v�� ã���� �ϴ� br �� ���ԵǾ��ִٸ�...
			//�� index ��ġ Ȯ��

			if (vt.contains(br))
			{
				 i = vt.indexOf(br);
		
				//�������ϴ����� ���θ� Ȯ���ϰ�
				//�����ִ��� Ȯ���ϰ�
				//��Ȯ�������� �����ض�(�����ض�)
				 vt.remove(i);

				System.out.print(obj.getBr(), obj.get"���� �� ��ü ��� ��� : ");
				for (Object obj : vt )
				{
					System.out.print(obj + " ");
				}
			}
	}


	//�ڷᱸ�� �� ��� ����(����) �޼ҵ�
	public static void chaElement() throws IOException
	{
		v.set(0, "br.readLine()");
	}


	//���α׷� ���� �޼ҵ� �� �ϼ�
	public static void exit()
	{
		System.out.println("\n���α׷� ����~!!!");
		System.exit(-1);
	}

	//main() �޼ҵ� �� �ϼ�
	public static void main(String[] args) throws IOException, NumberFormatException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
		
	}
}