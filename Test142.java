/*=================================================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����	2022-07-25 ���� 3:02
 - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
 - Calender Ŭ����
==================================================================*/
/*
�� Calender Ŭ������ �߻� Ŭ�����̱� ������ ��ü�� ���� �� �� ����.
	(�߻�Ŭ���� : �̿ϼ��� Ŭ����)

	Calender ob = new Calender();
	�̿� ���� ������ ���� �ν��Ͻ� ���� �Ұ�


	Calener Ŭ���� ��ü(�ν��Ͻ�)�� ������ �� �ִ� ���

	//���� �޼ҵ�, Ŭ���� �޼ҵ�
	1. Calender ob1 = Calender.getInstance();

	2. Calender ob2 = new GregorianCalender();	 G�� C�� �ڽ��̴� ��ĳ���ñ��� 

	3. GragorianClender ob3 = new GregorianClender();
	(�� GregorianClender : Calender Ŭ������ ���� Ŭ����)
*/


//��, ��, ��, ������ Calender ��ü�� ���� �����ͼ� ���

import java.util.Calendar;
import java.util.GregorianCalendar;
public class Test142
{
	public static void main(String[] args)
	{
		//Calendar��� �ν��Ͻ� ���� �ȵ�
		//Calendar ob = new Calendar();

		Calendar rightNow = Calendar.getInstance();

		//������ �޷� �ν��Ͻ��� ����
		//��¥ ���� ������ ��� �� �� �ִ� �޼ҵ� ��get()��

		int y = rightNow.get(Calendar.YEAR);
		System.out.println("y : " + y);
		//--==>> y : 2022

		int m = rightNow.get(Calendar.MONTH) + 1; //��+1�� check~!~!~!~!~!
		System.out.println("m : " + m);
		//--=>>m : 7

		int d = rightNow.get(Calendar.DATE);
		System.out.println("d: " + d);

		int w = rightNow.get(Calendar.DAY_OF_WEEK);
		System.out.println("w: " + w);

			//�׽�Ʈ
		/*
		System.out.println(Calendar.SUNDAY);
		System.out.println(Calendar.MONDAY);
		System.out.println(Calendar.TUESDAY);
		System.out.println(Calendar.WEDNESAY);
		System.out.println(Calendar.THURSDAY);
		System.out.println(Calendar.FRIDAY);
		System.out.println(Calendar.SATURDAY);
		*/

		System.out.println(y + "-" + m + "-" + d + "-" + w);

		String week = "";
		switch (w)

		{
			/*
		case Calendar.SUNDAY: week = "�Ͽ���"; break;
		case Calendar.MONDAY: week = "������"; break;
		case Calendar.TUESDAY: week = "ȭ����"; break;
		case Calendar.WEDNESAY: week = "������"; break;
		case Calendar.THURSDAY: week = "�����"; break;
		case Calendar.FRIDAY: week = "�ݿ���"; break;
		case Calendar.SATURDAY: week = "�����"; break;
		
*/
		case 1 : week = "�Ͽ���"; break;
		case 2 : week = "������"; break;
		case 3 : week = "ȭ����"; break;
		case 4 : week = "������"; break;
		case 5 : week = "�����"; break;
		case 6 : week = "�ݿ���"; break;
		case 7 : week = "�����"; break;
		}
		System.out.println(y + "-" + m + "-" + d + "-" + week);
		

		//Calendar Ŭ���� ��� �ν��Ͻ� ����
		Calendar rightNow2 = new GregorianCalendar();
		String[] week2 = {"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
		
		//�޷� ��¥ ���� ��set()�� �޼ҵ� Ȱ��

		rightNow2.set(2023,0,16);		//2023�� 1�� 16�� check~~~!!!

		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		//--==>> 2

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>> ������

		
	}

}