/*=============================================
	- Ŭ������ �ν��Ͻ� Ȱ��
===============================================*/

//1 ~3 ������ ������ �߻����Ѽ�
//����, ����, �� ���� ���α׷��� �����Ѵ�
//��, Ŭ������ ������ Ȱ���Ͽ� ó�� �� ���ֵ��� �Ѵ�.
//����, �迭�� Ȱ���Ͽ� ó���� �� �ֵ����Ѵ�//
//���������� RpsGame Ŭ������ �ϼ��� �� �ֵ��� �Ѵ�.

//�� ���� ������ �� 1:����, 2:����, 3:��

//���� ��)
//1:����, 2:����, 3:�� �� �Է�(1~3) : 4
//1:����, 2:����, 3:�� �� �Է�(1~3) :-2 
//1:����, 2:����, 3:�� �� �Է�(1~3) : 2

//����   : ����
//��ǻ�� : ��

//�º� ���� ��� : ��ǻ�Ͱ� �̰���ϴ�~!!!
//����Ϸ��� �ƹ� Ű�� ��������....
//�������� ������ �ʹ� ������� ¥�����Ѵ� �޼ҵ�(���)�� ���� ¥�� �ű⿡ �־�����.

import java.util.Scanner;
import java.util.Random;

class RpsGame
{
	private	int user;		
	private	int com;
	String[] str = {"����", "����" ,"��"};


	//��ǻ���� ����������
	private void runcom()
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;			//0 1 2 �� (+1)�߿� �� 1 2 3  
		
	}
	//������ ����������
	public void input()
	{
		//������ ���������� �ϱ����� ��ǻ�� ���� ����������
		runcom();
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("1:����, 2:����, 3:�� �� �Է�(1~3) : ");
			user = sc.nextInt();

		}
		while (user<1 || user>3);		//1����  �����鼭 ���ÿ� 3���� �������� ����.
	}

	//�߰���� ���
	public void middle()
	{
		System.out.println();
		System.out.println(" - ���� : " + str[user-1]);
		System.out.println(" - ��ǻ�� : " + str[com-1]);
	}

	//�ºο� ���� ���� ��� ����
	public String result()
	{
		String result = "���º� ��Ȳ�Դϴ�~!";
		//(���� ==���� && ��==��) || (����== ���� &&��==����) ||(���� ==�� &&��==����)
		if ((user==1 && com==3) || (user== 2 &&com==1) ||(user ==3 &&com==2))
		{
			result = "����� �¸��߽��ϴ�";
		}
		////(���� ==���� && ��==����) || (����== ���� &&��==��) ||(���� ==�� &&��=����)
		else if ((user ==1 && com==2) || (user== 2 && com==3) ||(user==3 && com==1))
		{
			result = "��ǻ�Ͱ� �¸��߽��ϴ�";

		}
		return result;
	}

	public void print(String str)
	{
		System.out.printf("%n>>�º� ������� :  %s%n", str);
		
	}
}

public class Test102
{
	public static void main(String[] args)
	{

		RpsGame ob = new RpsGame();
		ob.input();
		ob.middle();
		String result = ob.result();
		ob.print(result);
		
	}
}

/*
		Scanner sc = new Scanner(System.in);
		int n;		//�Է� ���� 1 2 3 ���� ����


		String [] arr = {"����", "����" ,"��"};		//������ ���� �迭 ����

		System.out.print("1:����, 2:����, 3:�� �� �Է�(1~3) : "); //�Է¸޼��� ���
	
		n = sc.nextInt();		//����� �Է�

		if (n<1 && n>3)			//�� �Է��� 1~3�� �������ʴ´ٸ� ��� �޼��� ���
		{

			System.out.println("1:����, 2:����, 3:�� �� �Է�(1~3) : ");
		}

		//	���� �ν��Ͻ� ����
		Random rd = new Random();
		// �迭 �ν��Ͻ� ����  
		//String [] arr = new String[3];


		rd.nextInt(n);
		System.out.print("�߻��� ����" ,n`);
		String arr [] = new String[arr.length];

		for (int i = 0;i<arr.length ;i++ )
		{
			System.out.printf("%2d",arr[i]);
		}
		
		
*/

/*
1:����, 2:����, 3:�� �� �Է�(1~3) : 2

 - ���� : ����
 - ��ǻ�� : ����

>>�º� ������� :  ���º� ��Ȳ�Դϴ�~!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/