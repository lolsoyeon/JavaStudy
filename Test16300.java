/*=============================================
   �����÷���(Collection)  ���� 2022-07-27
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

public class Test16300
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

		System.out.println();
		System.out.println("\t[ �޴� ���� ]============");
		System.out.println("\t1. ��� �߰�");
		System.out.println("\t2. ��� ���");
		System.out.println("\t3. ��� �˻�");
		System.out.println("\t4. ��� ����");
		System.out.println("\t5. ��� ����");
		System.out.println("\t6. ����");
		System.out.println("\t========================");
		System.out.println();

		
	}
	//�޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException, NumberFormatException
	{

		do
		{
			System.out.print(">> �޴� ���� (1~6) : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel> 6 );
		
	}

	//���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun() throws IOException
	{
		/*
		vt.menuDisp();
		vt.menuSelect();
		vt.addElement();
		vt.dispElement();
		vt.findElement();
		vt.delElement();
		vt.chaElement();
		vt.exit();
		*/
		switch (sel)
		{
		//case Menus.E_ADD: addElement(); break;
		//case Munus.: addElement();break;
		//case Munus.E_DISP : addElement();break;

		case 1: addElement();break;
		case 2: dispElement();break;
		case 3: findElement();break;
		case 4: delElement();break;
		case 5: chaElement();break;
		case 6: exit();break;


		}

	}

	//�ڷᱸ�� ��ü �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException
	{
		do
		{
			System.out.println();
			System.out.printf("%d��° ��� �Է� : ", vt.size()+1);

			String a = br.readLine();

			vt.addElement(a);

			System.out.printf("%d��° ��� �Է� ����~!!!", vt.size());
			System.out.print("��� �Է� ���(Y/N) : ");
			con = br.readLine();
		}
		while (con.equals("y") || con.equals("Y"));


	}

	//�ڷᱸ�� ��ü ��� �޼ҵ�
	public static void dispElement()
	{
		System.out.print("[���� ��ü ���]\n ");
			for (Object obj : vt )
			{
				System.out.println(obj);
			}
			System.out.println();
	}

	//�ڷᱸ�� �� ��� �˻� �޼ҵ�
	public static void findElement() throws IOException
	{

		System.out.println(">>�˻��� ��� �Է� : ");
		String x = br.readLine();
		int i = vt.indexOf(x);

		System.out.println();
		System.out.println("[�˻� ��� ���]");

		if (i<0)
		{	
			System.out.println("�׸��� �������� �ʽ��ϴ�.");
		}else 
			System.out.printf("%s �׸��� �����մϴ�.", x);
	}

	//�ڷᱸ�� �� ��� ���� �޼ҵ�
	public static void delElement() throws IOException
	{
		/*
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
		*/

		System.out.println();
		System.out.print(">> ������ ��� �Է� : ");
		String n = br.readLine();
		System.out.println();
		System.out.println("[���� ��� ���]");


		//���� ���� üũ �� ����
		if (vt.contains(n))						
		{
			int i = vt.indexOf(n);
			vt.remove(i);
			System.out.printf("%s �׸��� �����Ǿ����ϴ�.",n);
		}
		else
			System.out.println("�׸��� �������� �ʾ� ������ �� �����ϴ�.");
			System.out.println();
	}


	//�ڷᱸ�� �� ��� ����(����) �޼ҵ�
	public static void chaElement() throws IOException
	{
		System.out.print(">> ������ ��� �Է� : ");
		String x = br.readLine();
		
		
		if (vt.contains(x))
		{
			int i = vt.indexOf(x);
			System.out.print(">> ������ ���� �Է� : ");
			String y = br.readLine();
			
			vt.set(i,y);										

			System.out.println();
			System.out.println("[���� ��� ���]");
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			
		}
		else
		{	System.out.println();
			System.out.println("[���� ��� ���]");
			System.out.println("������ ����� �������� �ʽ��ϴ�. ");
		}
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