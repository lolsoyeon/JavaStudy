
/*=================================================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����	2022-07-25 ���� 3:02
 - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
 - Calender Ŭ����
==================================================================*/

//�� �ǽ� ����
//������ �������� �Է¹޴� ��¥��ŭ ���� ��, ��, �� , ������ Ȯ���Ͽ� 
//����� ����ϴ� ���α׷��� �����Ѵ�.

//���� ��)
//���� ��¥ : 2022-07-26 ȭ����			  -�ϴ� ���
//�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

//===========[Ȯ�� ���]============
//200�� ��  : xxxx- xx-xx x����
//==================================
//����Ϸ��� �ƹ�Ű�� ��������

//	�� Calendar �� ������ API ����
//	��add()��
//	���� ��¥�� �������� ������ ���ϴ� ���� �޼ҵ�
//	����ü.add(Calender.DATE,����);��

/*
���� 
1. import �� �ۼ�
2. ���� ��¥ ����? set()? ���� ��¥ ���
2-1. Calendar �� �ִ� �޼ҵ带 ����  int�� �ް� ���
3. Sanner ����Ͽ� ����ڿ��� �޼��� ���
4. ���� ���� add()�޼ҵ��̿�
5.
*/

import java.util.Scanner;
import java.util.Calendar;

public class Test144
{
	public static void main(String[] args)
	{
		//Scanner Ŭ���� ��� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		//Calendar Ŭ������� �ν��Ͻ� ����
		Calendar now = Calendar.getInstance();

		//�ֿ� ���� ����
		int nalsu;			//����ڷκ��� �Է¹��� �� ��
		int y, m ,d, w;

		String[] week = {"��","��","ȭ","��","��","��","��"};

	
		//������ ��,�� ,��, ���� Ȯ�� 
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) + 1;
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);

		//������ �� ��, �� ���� Ȯ�ΰ�� ���

		System.out.println("���� ��¥ : "+ y + "-" + m + "-" + d + " "+ week[w-1] + "����");

		do
		{
			System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu<1);
		
		//check~!~!

		now.add(Calendar.DATE,nalsu);

		//��� ���
		System.out.println();
		System.out.println("==========[Ȯ�� ���]============");
		System.out.printf("%d�� ��  : %tF %tA",nalsu, now, now);
		System.out.println();

		//String.format("%tF", �޷°�ü);
		// �� ��-��-�� ������ ���ڿ� ��ȯ
		//String.format("%tA", �޷°�ü);
		// �� ���� ������ ���ڿ� ��ȯ
	}
}


/*���� �Ѱ�

		int n; //����ڰ� �Է��� ������ ���� ����

		//Ķ���� Ŭ������� �ν��Ͻ� ����
		Calendar cal = Calendar.getInstance();


		int y = cal.get(Calendar.YEAR);

		int m = cal.get(Calendar.MONTH)+1;

		int d = cal.get(Calendar.DATE);

		int w = cal.get(Calendar.DAY_OF_WEEK);


		//System.out.println(y +"-" + m + "-" + d + "-" + w);

		String week = "";

		switch (w)
		{
		case 1 : week = "�Ͽ���"; break;
		case 2 : week = "������"; break;
		case 3 : week = "ȭ����"; break;
		case 4 : week = "������"; break;
		case 5 : week = "�����"; break;
		case 6 : week = "�ݿ���"; break;
		case 7 : week = "�����"; break;

		}
		System.out.println("���ó�¥ : " + y +"-" + m + "-" + d + "-" + week);
	

		//cal.set();
		System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		//date.clear();

		cal.set(2022,6,26);


		cal.add(Calendar.YEAR, n);
		cal.add(Calendar.MONTH,n);
		cal.add(Calendar.DATE, n);
		cal.add(Calendar.DAY_OF_WEEK, n);

		//���Ѱ� ���� ������ �ʿ��Ѱ�? 

		System.out.println("===========[Ȯ�� ���]============");
		System.out.printf("%d�� ��  : %4d - %d - %d %s%n", n,y,m,d,week);
		System.out.println("==================================");

*/

/*
���� ��¥ : 2022-7-26 ȭ����
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 174

==========[Ȯ�� ���]============
174�� ��  : 2023-01-16 ������
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/