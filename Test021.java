/*
======================================================================

�����ڹ� �⺻ ���α׷��֡���
-��� ������
-BufferedReader
-printf()
======================================================================

*/
//����ڷ� ���� ������ ������ �� �� �Է� �޾�
//��Ģ���� �� ������ ������ �����Ͽ�
//�� ����� ����ϴ� ���α׷��� �����Ѵ�
//��, �Է¹޴� ������ �� BufferedReader Ȱ�� �� ���ֵ��� �ϰ�
//����ϴ� ������ printf()�޼ҵ带 Ȱ�� �� �� �ֵ��� �Ѵ�.
//����, ������ ������ ���ǻ� ���� ������� ó���Ѵ�.

//���� ��)
//ù ��° ���� �Է� : 10
//�� ��° ���� �Է� :2

//===[=���]====
//10 + 2 = 12
//10 - 2 = 8
//10 * 2 = 20
//10 / 2 = 5
//10 % 2 = 0
//===========
//����Ϸ��� �ƹ� Ű�� ��������...
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//import java.io.*;   -���������� ���� ����x


public class Test021
{
	public static void main(String[] args) throws IOException

	{
		//�ֿ� ���� ����
		//int a = 10;
		//int b = 2;
		int num1, num2;						//--����� �Է°��� ���� ����
		int res1, res2, res3, res4, res5;	//--������ ���� ����� ���� ����
		//BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in)) ;
		//BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in)) ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;

		//���� �� ���

		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());

		res1 = num1 + num2;		//res1=num1+num2; ������
		res2 = num1 - num2;
		res3 = num1 * num2;
		res4 = num1 / num2;
		res5 = num1 % num2;
		
		
		//��� ���
		System.out.printf("\n===[=���]====\n");
		System.out.printf("%d + %d = %d%n" ,num1, num2, res1);
		System.out.printf("%d - %d = %d%n" ,num1, num2, res2);
		System.out.printf("%d * %d = %d%n" ,num1, num2, res3);
		System.out.printf("%d / %d = %d%n" ,num1, num2, res4);
		System.out.printf("%d %% %d = %d%n" ,num1, num2, res5);	// "%%"  -> "%" 2���� 1���� ��Ÿ��

		//printf,format  �� %���� ������

		System.out.printf("===========\n");

	}
}
/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 2

===[=���]====
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
10 % 2 = 0
===========
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .



*/