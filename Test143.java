/*=================================================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����	2022-07-25 ���� 3:02
 - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
 - Calender Ŭ����
==================================================================*/

/*
java.util.Calender Ŭ������
��¥�� �ð��� ��ü �𵨸�ȭ �� Ŭ������
��, ��, ��, ����, ��, ��, �� ������
�ð��� ��¥�� ���õ� ������ �����Ѵ�.
�׸���, Calendar Ŭ������ �߻�Ŭ���� �̹Ƿ� ���� ��ü�� ������ �� ������
��������  �޼ҵ� ������  Calendar Ŭ������ ���� Ŭ������
GregorianCalendar Ŭ������ ���� �Ǿ��ִ�.

�ý������κ��� ���� �ý��� �ð� ������ ���� ��
getInstance() ��� ����(static, class) �޼ҵ带 �̿��Ͽ� ��ü�� ������ �� �ִ�.
������ Calendar Ŭ���� ��ü�� �ý����� ���� ��¥�� �ð������� ������,
�� ��ü�� �����Ǹ� �����ִ� �ð� �������� 
get() �޼ҵ带 �̿��Ͽ� ���� ������(�����) ���ִ�.

getInstance()�޼ҵ�� ���������� GregorianCalendar ��ü�� �����Ͽ�
�����ֱ� ������ GregorianCalendar ��ü�� ���� �����Ͽ� �ð� ������ ���� ���� �ִ�.�ڡڡڡ�

*/

/*
�� �ǽ� ����
����ڷκ��� �� ���� �Է¹޾�
�޷��� �׷��ִ� (����ϴ�) ���α׷��� �����Ѵ�.
��, Calendar Ŭ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�,
�� API Document �� �����Ͽ� getActualMaximum()�޼ҵ��� Ȱ�� ��� ���� �Ұ�~!


���࿹)
�����Է� : 0
�����Է� : 2022
�� �Է� : -20
�� �Է� : 16
�� �Է� : 7

		[2022�� 7��]

 ��  ��  ȭ  ��  ��  ��  �� 
 ==========================
 					  1   2
  3   4   5   6   7   8   9
 10  11  12  13  14  15  16
 17  18  19  20  21  22  23
 24  25  26  27  28  29  30
 31
 ===========================
 ����Ϸ��� �ƹ� Ű�� ��������....


���� 
1.  import java.util.Calendar;
	import java.util.GregorianCalendar; �Ѵ�.
	import java.io.BufferedReader;

2. ����ڷκ��� �� ���� �Է¹޴µ� BufferedReader �� �޴´�.
�����̸� �ٽ��ؾ��ϴϱ� do while�� ��뿹��

3.Calendar ob2 = new GregorianCalendar(); Ŭ���� ��� �ν��Ͻ�����
4. �޷� ��¥ ���� ��set()�� �޼ҵ� Ȱ��


-	 ���� 1�� 1�� 1���� �������̴�  //�̰ź��� �߿�
	������ 4�� ����̸鼭 100�� ����� �ƴϰų�,
	400�� ����̸� 2���� 29�ϱ��� �ִ� ����
	������ 2���� 28�� (���)


*/
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test143
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int y,m,w;
		do
		{
			System.out.print("�����Է� : ");
			y = Integer.parseInt(br.readLine());

		}
		while (y<1);

		do
		{
			System.out.print("�� �Է� : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);


		//Calender ��� �ν��Ͻ� ���� ��, ��, �� ��ü�� ������
		Calendar cal = Calendar.getInstance();

		//int d = cal.get(Calendar.DATE);

		//System.out.println("d : " + d);    --==>>25

		//System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		//�� ���� �ִ밪 (�� ��)�� ���Ϲ޴´� 
		//--==>>31					 �ε� �� ���� ���� �����̳�?????

		//int w = cal.get(Calendar.DAY_OF_WEEK-1);

		//System.out.println("w : " + w);
		
		cal.set(y,m-1,1);

		w = cal.get(Calendar.DAY_OF_WEEK);
/*
		String week = "";
		switch (w)
		{
		case 1: week = "�Ͽ���";break;
		case 2: week = "������";break;
		case 3: week = "ȭ����";break;
		case 4: week = "������";break;
		case 5: week = "�����";break;
		case 6: week = "�ݿ���";break;
		case 7: week = "�����";break;
		
		}
	*/
		//System.out.println(y  + "-" + m +" - "+ week);
		

		//------------��¸� ����
		System.out.println();
		System.out.printf("	 [%d�� %d��]" ,y,m);
		System.out.println();
		System.out.println();
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("================================");
		for (int i = 1;i<cal.get(Calendar.DAY_OF_WEEK);i++ )
		{
			System.out.print("    ");
		}
		for (int i = 1;i<=cal.getActualMaximum(Calendar.DAY_OF_MONTH) ; i++)
		{
			System.out.printf("%4d",i);
			w++;
				if (w%7==1)
				{
				System.out.println();
				}
		}
		if (w%7 !=1)
		{
			System.out.println();
		}

		System.out.println("================================");
		
	}
}
/*
		[2022�� 7��]

 ��  ��  ȭ  ��  ��  ��  �� 
 ==========================
 					  1   2
  3   4   5   6   7   8   9
 10  11  12  13  14  15  16
 17  18  19  20  21  22  23
 24  25  26  27  28  29  30
 31
 ===========================
 ����Ϸ��� �ƹ� Ű�� ��������....

 getActualMaximum(int field)
Returns the maximum value that the specified calendar field could have, 
given the time value of this Calendar.

*/