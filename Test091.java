/*===============================================
						�迭
	- �迭�� �迭(2���� �迭)
===============================================*/

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ� �� ����� ����ϴ� ���α׷��� ����

// ���� ��)
/*
  1   2   3   4   10
  5   6   7   8   26
  9  10  11  12   42
 13  14  15  16   58
 28  32  36  40  136
����Ϸ��� �ƹ� Ű�� ��������...
*/

public class Test091
{
	public static void main(String[] args)
	{
		// �� Ǯ�� ----------------------------------------------------------------------

		/*
		// �迭�� �迭 ���� �� �ʱ�ȭ
		int[][] arr1 = new int[4][5];
		int[] arr2 = new int[5];

		// ���� ����
		int n=1;
		int m =28;

		// �迭1 �ʱ�ȭ
		for (int i=0; i<arr1.length; i++)
		{
			for (int j=0; j<arr1[i].length; j++)
			{
				if (j<4)
				{
					arr1[i][j] = n;
					n++;
				}
				else
				{
					for (j=0; j<4; j++)
						arr1[i][4] += arr1[i][j];
						// sum += arr1[i][j];
						// arr1[i][j] = sum;
						// n++;
				}
			}
		}

		// �迭2 �ʱ�ȭ
		for (int i=0; i<arr2.length; i++)
		{
			if (i<4)
			{
				arr2[i] = m;
				m+=4;
			}
			else
			{
				for (i=0; i<4; i++)
					arr2[4] += arr2[i];
			}
				
		}

		// ��ü ��� ���
		for (int i=0; i<arr1.length; i++)
		{
			for (int j=0; j<arr1[i].length; j++)
			{
				System.out.printf("%4d",arr1[i][j]);
			}
			System.out.println();
		}
		
		for (int i=0; i<arr2.length; i++)
		{
			System.out.printf("%4d", arr2[i]);
		}
		System.out.println();
		*/


		// ������ Ǯ�� ------------------------------------------------------------------
		
		// ����� ��� ���� �� �޸� �Ҵ�
		int[][] arr = new int[5][5];
		int n=0;

		// �׽�Ʈ ����
		int sum=0;

		// �� for�� ���� 2ȸ -1 �� �ݺ����� ó���� �ʿ����� ���� ����
		for (int i=0; i<arr.length-1; i++)			// �� i �� 0 1 2 3
		{
			for (int j=0; j<arr[i].length-1; j++)		// �� j �� 0 1 2 3
			{
				n++;
				arr[i][j] = n;

				arr[i][arr[i].length-1] += arr[i][j];
				// arr[0][4] += arr[0][0]
				//			 += arr[0][1]
				//			 += arr[0][2]
				//			 += arr[0][3]

				arr[arr.length-1][j] += arr[i][j];
				// arr[4][0] += arr[0][0]
				//			 += arr[1][0]
				//			 += arr[2][0]
				//			 += arr[3][0]

				arr[arr.length-1][arr[i].length-1]  += arr[i][j];
				// arr[4][4] += arr[0][0]
				//			 += arr[0][1]
				//			 += arr[0][2]
				//			 += arr[0][3]
				//			:
			}
		}


		// ��ü ��� ���
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
	}
}

// ���� ���
/*
	   1   2   3   4  10
	   5   6   7   8  26
	   9  10  11  12  42
	  13  14  15  16  58
	  28  32  36  40 136
	����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/