/*=================================================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ���� 2022-07-25 ���� 12:10
 - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
 - StringTokenizer Ŭ���� (������ �� �Ⱦ��� ���丸 ����~!~!)
==================================================================*/
/*
	StringTokenizer Ŭ������
 ���ڿ� �Ľ� �� ���� ������ �����ϴ� Ŭ������
 �Ľ�(parsing) �ϰ����ϴ� ���ڿ��� ���ڷ� �޾� �����ϴµ�,
 ���⿡�� �Ľ�(parsing)�̶� �ϳ��� ���ڿ��� ���� ���ڿ���
 ������ �۾��� �ǹ��ϰ� �Ǹ�, �� �� ������ ������ �Ǵ� ���ڿ���
 ��ū(Token) �̶���Ѵ�

 StringTokenzer Ŭ������ ����ϱ� ���ؼ���
 java.util ��Ű����  StringTokenizer �� import �ؾ��Ѵ�.
 StringTokenizer Ŭ������ ȣȯ���� �����ϴ� ��������
 ���� �����ǰ� ������, ���ڿ��� �Ľ� �ϱ� ���ؼ���
 String Ŭ������ split()�޼ҵ峭 java.util.regex ��Ű����
 ����� ���� �����ϰ� �ִ�.

  �� ������

 -  ����
 	StringTokenizer(String str)
	StringTokenizer(String str, String delim)�����ڸ� �� ���ٴ�.
	StringTokenizer(String str, String delim , boolean returnDelims)
	 : �־��� ���ڿ� str�� �ܾ�� �и��ϴ� ��ü�� �����ϸ�
	 ����(����) ���ڴ� delim�� ���Ե� ���ڷ� ó���ϰ� �ȴ�.
	 ���� returnDelims �� true �̸�
	 ���� ���ڵ� �и��� �����ͷ� ó���ϰ� �ȴ�.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Test140
{
	public static void main(String[] args) throws IOException
	{
		String strTemp;
		String[] strArr;
		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("�Ľ��� ���ڿ� �Է� : ");
		strTemp = br.readLine();

		// Ŭ���� �ν��Ͻ�����
		StringTokenizer st = new StringTokenizer(strTemp,",");
		// strTemp�� ��� ���ڿ��� ("���, ����, �ٳ���, ����");
		// , �� �����ڷ�....

		// st�� countToken()
		// int sountToken()
		// : �Ľ̵� ���ڿ��� ������ ��ȯ(����) �Ѵ�.

		strArr = new String[st.countTokens()];
		//					-----------------
		//						4

		// strArr = new String[4];

		n = 0;
		while (st.hasMoreTokens())  // ���� ��ū�� ���Ҵ�? ������ 
									// true true true true false
		{
			strArr[n++] = st.nextToken();		// �ô�. 

			//strArr[0]	 = "���";				// �������鼭 "���"�� �����Ѵ�. 
			//strArr[1]	 = "����";
			//strArr[2]	 = "�ٳ���";
			//strArr[3]	 = "����";
		}

		//-- ��hasMoreTokens()��
		//	 : ����� ���ִ� ��ū�� �����ִ� ��� true �� ��ȯ
		//	 ���̻� ����� ��ū�� ���� ��� false �� ��ȯ
		//	 Ȯ�ΰ���� ��ȯ�� ��.. 
		//	 ���� ������ �о������ �ʰ�
		//	 ���� ������ �о���̴� ��带 �̵���Ű���� �ʴ´�.

		//-- ��nextToken()��
		//	 : ���� ��ū�� ���´�.
		//	 ���� ��ū�� ������ ��带 �̵���Ű�Եȴ�.
		//	 �����ڸ� �ٲپ��� ��� ���� ȣ�⿡��
		//	 �ٲ� �����ڸ� �̿��Ͽ� ��ū�� �и��Ѵ�.

		System.out.print(" �Ľ̵� ��ū(���ڿ�) : ");

		for (String str : strArr)
		{
			System.out.print(str + " ");
		}
		System.out.println();
	}
}

/* ������
 �Ľ��� ���ڿ� �Է� ���,��,����,�ٳ���
 �Ľ̵� ��ū(���ڿ�) :  ��� �� ���� �ٳ���
 ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/