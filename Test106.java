/*==============================================
	�����ֹε�Ϲ�ȣ ��ȿ�� �˻����
================================================*/
/*
�� �ֹε�Ϲ�ȣ ���� ����
	�� ������ �ڸ��� ������ ���ڱ� ���� ��Ģ�� �°� ���Ѵ�.

	123456-1234567	(�ֹι�ȣ)
	****** *******	------------���ڸ��� ���ϱ�
	234567 892345 (�� �ڸ��� ������ ��)


	�� ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�.
	7 5 0 6 1 5 - 1 8 6 2 1 3 3
	* * * * * *   * * * * * * 
	2 3 4 5 6 7   8 9 2 3 4 5 
	===========================
	14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12  +6 + 4 + 15
	==217
	�� ������ ������� 11�� ������ �������� ���Ѵ�. sum%%11==0

		19
      ------------
	11|217
	   11
	   --------
	   107
	    99
       ------
	     8 ---8�� ������(O)

	�� 11���� ������ 8���� ������� ���Ѵ�.

	11 - 8 �� 3
	���� ó���������� �������� 0�ΰ�� 11 - 0 �� 11
				   	�������� 0�ΰ��   11 - 1 �� 10
	�̸� �ٽ� 10���� ������ �������� ���Ѵ�.  11 �� 1
											  10 �� 0

	����� �������� �ֹι�ȣ�� �����ϴ� ������ ���ڿ�
	��ġ�ϴ����� ���θ� ���Ͽ� Ȯ���Ѵ�.

	��ġ   �� ��ȿ�� �ֹι�ȣ
	����ġ �� �߸��� �ֹι�ȣ
	
*/

//���� ��)
//�ֹι�ȣ�Է�(XXXXXX-XXXXXXX) : 123456-12345678 �� �Է°��� �ʰ�
//>>�Է� ����~!!
//����Ϸ��� �ƹ� Ű�� ��������......
//���� ��)
//�ֹι�ȣ�Է�(XXXXXX-XXXXXXX) : 123456-123456 �� �Է°��� �̴�
//>>�Է� ����~!!
//����Ϸ��� �ƹ� Ű�� ��������......

//�ֹι�ȣ�Է�(XXXXXX-XXXXXXX) : 750615-1252085 �� ��ȿ�� �ֹι�ȣ
//>>��Ȯ�� �ֹι�ȣ~!!!
//����Ϸ��� �ƹ� Ű�� ��������......

//�ֹι�ȣ�Է�(XXXXXX-XXXXXXX) : 750615-1252086 �� �߸��� �ֹι�ȣ
//>>�߸��� �ֹι�ȣ~!!!
//����Ϸ��� �ƹ� Ű�� ��������......

//�� ���� �ذ��� ���� �߰� ��~!

//�迭.length			�� �迭�� ����(�迭 ���ǰ���) ��ȯ
//���ڿ�.length()		�� ���ڿ��� ���� ��ȯ(��ĭ����)
//���ڿ�.substring()	�� ���ڿ� ����
//���ڿ�.substring(m, n)�� ���ڿ� m��° ��ġ���� n-1��° ��ġ���� ����(�ε����� 0����)
//���ڿ�.substring(m)	�� ���ڿ� m��° ��ġ���� ���ڿ��� ������ ����(�ε����� 0����)

import java.util.Scanner;
public class Test106   //2022-07-18 , 2022-07-19 
{
	public static void main(String[] args)
	{
/*
		String strTemp = "���¹�";
		System.out.println(strTemp.length());
		//-->> 3
		strTemp = "���ع��� ��λ���";
		System.out.println(strTemp.length());
		//-->>9

		strTemp = "study-hard";
		System.out.println(strTemp.length());

		strTemp = "ABCDEFGHIJKLNMOPQRSTUVWXYZ";
		System.out.println(strTemp.length());	//	26
		System.out.println(strTemp.substring(13, 17));

		//MOPQ
		//MOPQRSTUVWXYZ

		//System.out.println(strTemp.substring(13, 57));
		//--==>>StringIndexOutOfBoundsException(�����Ͽ���)

		System.out.println(strTemp.substring(13));
	
		Scanner sc = new Scanner(System.in);
*/
		//�Է¹��� �ֹι�ȣ
		String strTemp;
		
		//�������� ���� �迭
		int [] x = {2,3,4,5,6,7,8,9,2,3,4,5};

		int tot = 0;		//�������¼��� �������� ���� tot

		System.out.print("�ֹι�ȣ�Է�(14�ڸ�XXXXXX-XXXXXXX) : ");
		strTemp = sc.next();
	
			if (strTemp.length()<14 || strTemp.length()>15)
			{
				System.out.print(">>�Է¿���~!~!");
			}



			//else if (strTemp.length()==14)
			//{
			//	System.out.print("��Ȯ�� �ֹι�ȣ~!!!");
			//}
			System.out.println();
			for (int i = 0;i<x.length ;i++ )
			{
				if (i == 6)
					continue;

				tot += x[i] * Integer.parseInt(strTemp.substring(i,(i+1)));
			}
			int su = 11 - tot % 11;
			//�׽�Ʈ
			//System.out.print(su);
			if (su>=10)
			{
				su%=10;
			}

			if (su == Integer.parseInt(strTemp.substring(13)))
			{
				System.out.println(">>��Ȯ�� �ֹι�ȣ~!!!");
					
			}
			else
				System.out.println(">>�߸��� �ֹι�ȣ~!!!");
					
		

//�ֹι�ȣ�Է�(XXXXXX-XXXXXXX) : 750615-1252086 �� �߸��� �ֹι�ȣ
//�߸��� �ֹι�ȣ~!!!
//����Ϸ��� �ƹ� Ű�� ��������......
		
	}
}

/*
		String strTemp;
		
		//�������� ���� �迭
		int x = {2,3,4,5,6,7,8,9,2,3,4,5};

		int tot = 0;		//�������¼��� �������� ���� tot

		System.out.print("�ֹι�ȣ�Է�(14�ڸ�XXXXXX-XXXXXXX) : ");
		strTemp = sc.next();
	
			if (strTemp.length()<14 || strTemp.length()>15)
			{
				System.out.print(">>�Է¿���~!~!");
			}



			//else if (strTemp.length()==14)
			//{
			//	System.out.print("��Ȯ�� �ֹι�ȣ~!!!");
			//}
			System.out.println();
			for (int i = 0;i<x.length ;i++ )
			{
				for (int j = 0;j<7 ;j++ )
				{
					System.out.print(strTemp.substring(i,j));
				}
			}

			for (int i =8 ;i<14 ;i++ )
			{
				for (int j = 8;j<14 ;j++ )
				{
					System.out.print(strTemp.substring(i,j));
				}
*/