
/*======================================================================

���Ῥ����(Operator)����
-���� ������ == ���� ������
- "������ 2���̻� �̶�� ������ �� ������"

======================================================================*/

//����ڷκ��� ������ �����ϳ� �Է¹޾�
//�빮���̸� �ҹ��ڷ�, �ҹ����̸� �빮�ڷ�
//���ĺ��� �ƴ� ��Ÿ���ڶ�� �� ���� �״�� ����ϴ�
//���α׷��� �����Ѵ�.

//���� ��)
//�� ���� �Է� : A
//A �� a
//����Ϸ��� �ƹ� Ű�� ��������....

//�� ���� �Է� : b
//b �� B
//����Ϸ��� �ƹ� Ű�� ��������....

//�� ���� �Է� : 7
//7 ��7
//����Ϸ��� �ƹ� Ű�� ��������....
//sce �ڹٰ� Ʈ�翬�곡���� ���̻� ���� ��������

// ����Ʈ ���� ��Ʈ �� float double
/* 
30
30=< a 
a<=40


ch

���ĺ� �빮�� ? ���ĺ� �ҹ��ڷ� ��ȯ : (���ĺ� �ҹ���? ���ĺ��빮�ڷ� ��ȯ : �ִ±״��); �׷��� 3�׿�����
											----------	 -----------------   ----------
											1				2					3
-------------   ---------------------   ----------------------------------------------
	  1						2							3
result

*/

import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException

	{
		

		//�ֿ亯�� ����
		//char temp;
		//System.print("�� ���� �Է� : ");
		//temp = (char)System.in.read();

		//System.out.println("�Է� ���� �� Ȯ�� : " + temp);

		//�빮��? �빮�� �ƴ�?
		//temp == 'A'
		//temp == 'B'
		//temp == 'C'

		//String result = temp >= 65 && temp <=90 ? "�빮��" : "�빮�� �ƴ�";
		//System.out.println("��� : " + result);
		//String result = temp >= 'A' && temp <='Z' ? "�빮��" : "�빮�� �ƴ�";
		//System.out.println("��� : " + result);
/*

		�빮�� �� �ҹ���
		'A'(65)��'a'(97) ==> +32

		�ҹ��� �� �빮��
		'b'(66)��'B'(98) ==> -32

*/
		char ch, result;
		System.out.print("�� ���� �Է� : ");
		ch = (char)System.in.read();

		//result = () ? () : ();
		//result = (�Է°� �빮�� ) ? (�ҹ��ڷ� ��ȯ) : ((�Է°� �ҹ���) ? �빮�ڷκ�ȯ : �״��));
		result = (ch>= 'A' && ch <= 'Z' ) ? ((char)(ch+32)) : ((ch>= 'a' && ch<='z' ? ((char)(ch-32)) : ch));

		System.out.println(ch + "��" + result);



		//���� �� ó��


		
		//��� ���



/*  ���� ���
�� ���� �Է� : a
a��A
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

�� ���� �Է� : 7
7��7
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

�� ���� �Է� : S
S��s
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/

	}
}

/*			����Ǭ��     System.in.read();�� ������.?


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


		char a, b;
		int n;

		System.out.print("�� ���� �Է� : ");

		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());

		n = (a >= 65 && a <= 90) ? (a += 32) : a;
		b = (char)n;

		System.out.println();
		System.out.println( a + "��" + b);

		System.out.println("%d %d");   */


		/* ģ���� ��  ��

		char a, b;
		int n;

		System.out.print("�� ���� �Է� : ");
		n = System.in.read();

		b = ( n < 60 ) ? ((char)n) : ( n < 91) ? ((char)(n + 32)) : ((char)(n-32));

		a = (char)n;

		System.out.printf(" %c �� %c\n" , a , b); */

		

