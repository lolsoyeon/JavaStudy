/*===============================================
						�迭
	- �迭�� �迭(2���� �迭)
===============================================*/

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ� �� ����� ����ϴ� ���α׷��� ����

// ���� ��)
/*
  1  8   9  16  17
  2  7  10  15  18
  3  6  11  14  19
  4  5  12  13  20
����Ϸ��� �ƹ� Ű�� ��������...
*/

public class Test089
{
	public static void main(String[] args)
	{
		// �� Ǯ�� ----------------------------------------------------------------------
		
		/*
		// �迭�� �迭 ���� �� �޸� �Ҵ�
		int[][] arr = new int[4][5];
		
		// ���� ����
		int n = 1;

		// �迭�� �迭 �ʱ�ȭ
		for (int i=0; i<5; i++)							// arr[0].length
		{
			if (i%2==0)
			{
				for (int j=0; j<arr.length; j++)
				{
					arr[j][i] = n;
					n++;
				}
			}
			else
			{
				for (int j=arr.length-1; j>=0; j--)
				{
					arr[j][i] = n;
					n++;
				}
			}
		}

		// �迭�� �迭 ��ü ��� ���
		for (int j=0; j<arr.length; j++)
		{
			for (int i=0; i<arr[j].length; i++)
				System.out.printf("%3d",arr[j][i]);
			System.out.println();
		}
		*/


		// ������ Ǯ�� ------------------------------------------------------------------

		// �迭�� �迭 ���� �� �޸� �Ҵ�
		int[][] arr = new int[4][5];

		int n=0;

		for (int i=0; i<5; i++)					// outer �� i �� 0 1 2 3 4
		{
			for (int j=0; j<4; j++)				// inner �� j �� 0 1 2 3
			{
				// �׽�Ʈ(Ȯ��)
				// System.out.print(j + "" + j + " ");	

				n++;

				if (i%2==0)						// i �� ¦�� �� 0 2 4
					arr[j][i] = n;				//		00 10 20 30		02 12 22 32		04 14 24 34
				else							// i �� Ȧ�� �� 1 3
					arr[3-j][i] = n;			//		31 21 11 01		33 23 13 03

			}
			// System.out.println();
		}

		// ��ü ��� ���
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				//System.out.printf("%3d", arr[j][i]);	//-- �갡 ����~!!! ��
				System.out.printf("%3d", arr[i][j]);
			System.out.println();
		}
	}
}

// ArrayIndexOutOfBoundsException �� �� ������
// �迭���� �Ҵ�� �溸�� �� ū �� ��ȣ�� �����Ϸ��� ���� �� �߻��ϴ� ����~!!!