
/*=====================================================================
	���Ḹ��޷¡���
	- ������ ���� ����� ���α׷��� �����Ѵ�.
=======================================================================*/

//���� ��)
//������ �Է��ϼ��� : 2022
//�� �� �Է��ϼ���  : 7

/*
	[	2022�� 7��	]

	�� �� ȭ �� �� �� ��
  ==========================
					1  2
	 3  4  5  6  7  8  9
	10 11 12 13 14 15 16
	17 18 19 20 21 22 23
	24 25 26 27 28 29 30
	31
  ==========================
����Ϸ��� �ƹ� Ű�� ��������........

*/

/*  ���� �м�
-	 ���� 1�� 1�� 1���� �������̴� �̰ź��� �߿�
	������ 4�� ����̸鼭 100�� ����� �ƴϰų�,
	400�� ����̸� 2���� 29�ϱ��� �ִ� ����
	������ 2���� 28�� (���)

-	���� 2022�� 7�� �޷��� �׸��ٰ� �����ϸ�
	1�� 1�� 1�� ~ 2022�� 6�� 31�� ������ �� ���� ���Ѵ�
	--------------------------------
	(1�� 1�� 1�� ~ 2021�� 12�� 31��) + (2022�� 1�� 1�� ~ 2022�� 6�� 30�� )
	�׳����� + 1 ������ �����ϸ� (2022�� 7�� 1���� ���� Ȯ��)
	----------------------------------------������� �����ϸ� �޷� �׸� �غ� ��

  - ����  = ��ü���� % 7
	����  = 0 �Ͽ���
	����  = 1 ������
	����  = 2 ȭ����
				:

*/
import java.io.BufferedReader;			
import java.io.InputStreamReader;
import java.io.IOException;

public class Test105
{
	public static void main(String[] args) throws IOException
	{	
		//�ν��Ͻ�����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
		//�迭 �ε��� 0   1    2   3   4   5   6   7   8   9  10  11
		//��		  1   2    3   4   5   6   7   8   9  10  11  12
 		//�׽�Ʈ
		//System.out.println(days.length);
		//�ֿ�
		int nalsu, y, m, w;			//����, ��, ��, ����

		do
		{
			System.out.print("������ �Է��ϼ��� : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		//�Է¹��� �⵵�� 1���� ������ �ٽ��Է¹ޱ�
		do
		{
			System.out.print("���� �Է��ϼ��� : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);

		//�Է¹��� ���� 1���� �۰ų� 12���� ũ�� �ٽ� �Է¹ޱ�

		//-------------������� �����ϸ� ��ȿ�� �⵵�� ���� ����ڷκ��� �Է¹�������

		//�Է¹��������� �ش��ϴ� 2���� �����������

		if (y%4==0 && y%100==0 || y%400==0)		//����
		{
			days[1] = 29;
		}
		//else ������
		//���� days �迭�� 1��° ��Ұ� 28�Ϸ� ���� �Ǿ��ִ� �����̱� ������
		//���������� �����̵ȴ�.

		//1��1�� 1�� ~ �Է¹��� ������ ���� �⵵ 12�� 31�� ������ �� �� ���
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

		//(1�� 1�� 1�� ~ 2021�� 12�� 31��)

		//�Է¹��� ���� 1�� 1��  ~ �Է��� ���� ���� ������ �� �� ���
		for (int i =0;i<(m-1) ; i++)
		{
			nalsu += days[i];				//�迭�� ������ ������
		}
		//�Է¹��� ���� 1���� ���� ��������
			nalsu += 1;  //++nalsu;

		//--------------������� �����ϸ� ��� ������ ���� ����ó�� �Ϸ�

		//���� Ȯ��
		//--�Է¹��� ���� �Է¹��� ���� 1���� ���� �������� Ȯ���ϱ� ���� ����
		w = nalsu % 7;		//������ 7�� ���� �������� �����̰ڴ�.
		//w: 0 �Ͽ���  �̰��� �߿�~!~!
		//w: 1 ������
		//w: 2 ������

		//�׽�Ʈ
		//System.out.println("w : "+ w);
		/*
		������ �Է��ϼ��� : 2022
		���� �Է��ϼ��� : 7
		w : 5
		2022�� 7�� 1���� �ݿ���(5)�̶�� �ǹ�
------------------------- ������� �����ϸ� �ش� ���� �ش� ���� 1���� ���� �������� Ȯ�� �Ϸ�~!
		*/

		//���(�޷� �׸���)
		System.out.println();		//����
		System.out.printf("\t[ %d �� %d�� ]%n" , y, m);
		System.out.println();
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��"); //�ϳ��� ������ 4ĭ
		System.out.println("=============================");
	
		//Ư�� ���Ϻ��� 1���� ����� �� �ֵ��� ���� �߻�(����)
		for (int i =1;i<=w ;i++ )
		{
			System.out.print("    ");		//���� 4ĭ����
		
		}
		//�׽�Ʈ
		//System.out.printf("%4d", 1);

		//�ش� �� (�Է��� ��)�� ��¥�� ��µ� �� �ֵ��� �ݺ��� ����
		for (int i =1;i<=days[m-1] ;i++ )		//m�ϰԵǸ� ���̶� �ε����� �ϳ��� ���̳��� -1
		{

			System.out.printf("%4d", i);
			w++;
			//�ݺ����� ���� ��¥�� ó���ϴ¸�ŭ
			//���ϵ� �Բ� ���� �� ���ֵ��� ó��~!
			
			//�Ͽ����� �����Ϸ��� ���
			//�� �̹� ����ϰ��� �ϴ� ��¥�� �Ͽ����ΰ��

			if (w%7==0)
			{
				System.out.println();
			}	
		}

		if (w%7!=0)
			{
				System.out.println();
			}
		//���� ������ ��¥�� ��� ������ ��� ä�������
		//�� ����ϱ��� ������ü�� ��µǾ������
		//�̹� �Ͽ��� ������ �̷�� ���� ������
		//�� ���� �߰� ������ �����ʵ��� ó��~!  ?????????
		
		System.out.println("=============================");
	}
}

/*
		//���� �� ó��
		int [] months = {31, 0, 30, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int nalsu;
		if (y%4==0 && y%100!=0 || y%400==0)
		{
			months[1] = 29;
		}
		else
			months[1] = 28;

		//��1�� 1�� 1�Ϻ��� �Է¹��� �⵵ �� �⵵ ���� ���� ���
		nalsu = (y-1)*365 + (y-1)/4-(y-1)/100 + (y-1)/400;

			//System.out.println("�� �� : " + nalsu);

			//������ �޼���ŭ �������Ѷ�
			for (int i = 0;i<(m-1) ;i++ )	//7�� �� �Է��Ѵٸ� 6�� �������� �ϼ��� 
			{
				nalsu += months[i];			//
			}
			//System.out.println("�� �� : " + nalsu);

			int dayStart = day % 7;			//������ ������ �� ����

			char[]


			System.out.println();



			for (int i =0;i<=dayStart ;i++ )
			{
				System.out.print("   ");
			}

			for (int i = 0;i<=month[month-1] ;i++ )
			{
				System.out.printf("%3d",i);
				if ((day+1)%7==6)
				{
					System.out.println();
				}
			}
			System.out.println();
		
*/