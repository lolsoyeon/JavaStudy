/*===============================================
						�迭
	- �迭�� �迭(2���� �迭)
===============================================*/

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ� �� ����� ����ϴ� ���α׷��� ����

// ���� ��)
/*
  E  J  O  T  Y
  D  I  N  S  X
  C  H  M  R  W
  B  G  L  Q  V
  A  F  K  P  U
����Ϸ��� �ƹ� Ű�� ��������...
*/

public class Test090
{
	public static void main(String[] args)
	{
		// �� Ǯ�� ------------------------------------------------------------

		/*
		// �迭�� �迭 ���� �� �޸� �Ҵ�
		char[][] arr = new char[5][5];
		
		// ���� ����
		int ch = 65;
		
		// �迭 �ʱ�ȭ
		for (int i=0; i<arr[0].length; i++)
		{
			for (int j=arr.length-1; j>=0; j--)
			{
				arr[j][i] = (char)ch;
				ch++;
			}
		}

		// ��� ��ü ���
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				// System.out.printf("%3d", arr[i][j]); 
				System.out.printf("%3c", arr[i][j]);
			System.out.println();
		}
		*/


		// ������ Ǯ�� --------------------------------------------------------

		// �迭�� �迭 ���� �� �޸� �Ҵ�
		char[][] arr = new char[5][5];

		char start = 'A';		// 65

		for (int i=0; i<5; i++)					// �� i �� 0 1 2 3 4
		{
			for (int j=4; j>=0; j--)			// �� j �� 4 3 2 1 0
				arr[j][i] = start++;
		}

		// ��ü ��� ���
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3c", arr[i][j]);
			System.out.println();
		}

	}
}