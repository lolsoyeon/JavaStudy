/*
======================================================================

������� �帧�� ��Ʈ�� (���)����
-if��
-if ~else ��
  
======================================================================
*/
//1.���α׷��� �ۼ� �Ҷ� �־��� ���ǿ� ����
//	�б� ���ؤ����� ���ϱ����� ����ϴ� ������
//IF��, if~else��, ���� ������,���� if��(if�� ��ø)
//	,switch �����ִ�

//2. if���� if ������ ������ ���ϰ��
//	Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.

//����ڷ� ���� ������ �� ������ �����ڸ� �Է¹ھ�
//�ش� �������� ����ó�� ����� ����ϴ� ���α׷��� �����Ѵ�
//��, if���ǹ��� Ȱ���Ͽ� ó�� �� ���ֵ��� �ϸ�,
//���� ����� ���ǻ� ���� ������� ó�� �� �� �ֵ��� �Ѵ�.


//���� ��)
//ù ��° ���� �Է� : 10
//�� ��° ���� �Է� : 3
//������ �Է�[+ - * /] : +

// >> 10 + 3 = 13
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test036
{
	public static void main(String[] args) throws IOException
	{
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//��� 1
		
		int a , b;  //ù ��°, �ι�°
		char op;	//������

		System.out.print("ù ��° ���� �Է�  : ");
		a = Integer.parseInt(br.readLine());		//kkkk ���ڰ��ƴ϶� �ѹ������ͼ��� ����

		System.out.print("�� ��° ���� �Է�  : ");
		b = Integer.parseInt(br.readLine());

			// Integer.parseInt("12345455")   parseInt�� ���ڸ�縸 ��ȯ
			// "1234" �� Integer.parseInt()  ��1234  ���ڸ���� ���ڿ��� �������·� ��ȯ
			// "abcd" �� Integer.parseInt()  �� (X �����߻�)

			// System.in.read �ϳ��� ���Ϲ����� �ƽ�Ű�ڵ� �� ��ȯ 


		System.out.print("������ �Է�[+ - * /]  : ");	
		//op = (char)Integer.parseInt(br.readLine()); 
		//���ڿ� ->���ڷ� �ٲٴ°� �Ұ��� 1���� ���ڿ��� ����
		//+ < > == �񱳿����� 
		//System.in.read();			4����Ʈ ������
		//op = System.in.read();    �ڵ� ����ȯ ���� �������̵��� �ƴ¸�ŭ���δ�.

		/*op = (char)System.in.read();

		//�׽�Ʈ(Ȯ��)
		//System.out.println("�Է��� ������ : " + op);
		
		if (op == '+') //����ڰ� �Է��� �����ڰ� '+'��� 
		{
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));

		}
		else if (op == '-')//����ڰ� �Է��� �����ڰ� '-'���
		{
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		
		}
		else if (op == '*')//����ڰ� �Է��� �����ڰ� '*'���
		{
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		
		}
		else if(op == '/')//����ڰ� �Է��� �����ڰ� '/'���
		{
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		}
		else
		{
			System.out.println("\n>>�Է� ������ ������ �����մϴ�.");
		}


		//a �� b�� ���� ���� �����Ͽ� ���
		
		//a �� b�� ���� ���� �����Ͽ� ���
		

/*  ������ 1
ù ��° ���� �Է�  : 10
�� ��° ���� �Է�  : 5
������ �Է�[+ - * /]  : +

>> 10 + 5 = 15
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/


/*  ���� Ǯ�� �� ��  (�ٽ� �غ���)

		int a;
		int b;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.println("������ �Է�[+ - * /] : ");
		b = Integer.parseInt(br.readLine());


		if (a)
		{
			System.out.print(a + a);
		}

*/


//��� 2
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//��� 1
		
		int a , b;  //ù ��°, �ι�°
		char op;	//������

		System.out.print("ù ��° ���� �Է�  : ");
		a = Integer.parseInt(br.readLine());		//kkkk ���ڰ��ƴ϶� �ѹ������ͼ��� ����

		System.out.print("�� ��° ���� �Է�  : ");
		b = Integer.parseInt(br.readLine());

			// Integer.parseInt("12345455")   parseInt�� ���ڸ�縸 ��ȯ
			// "1234" �� Integer.parseInt()  ��1234  ���ڸ���� ���ڿ��� �������·� ��ȯ
			// "abcd" �� Integer.parseInt()  �� (X �����߻�)

			// System.in.read �ϳ��� ���Ϲ����� �ƽ�Ű�ڵ� �� ��ȯ 


		System.out.print("������ �Է�[+ - * /]  : ");	
		//op = (char)Integer.parseInt(br.readLine()); 
		//���ڿ� ->���ڷ� �ٲٴ°� �Ұ��� 1���� ���ڿ��� ����
		//+ < > == �񱳿����� 
		//System.in.read();			4����Ʈ ������
		//op = System.in.read();    �ڵ� ����ȯ ���� �������̵��� �ƴ¸�ŭ���δ�.

		op = System.in.read();

		//�׽�Ʈ(Ȯ��) ��� 2
		//System.out.println("�Է��� ������ : " + op);
		
		if (op == 43) //����ڰ� �Է��� �����ڰ� '+'��� 
		{
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));

		}
		else if (op == 45)//����ڰ� �Է��� �����ڰ� '-'���
		{
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		
		}
		else if (op == 42)//����ڰ� �Է��� �����ڰ� '*'���
		{
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		
		}
		else if(op == 47)//����ڰ� �Է��� �����ڰ� '/'���
		{
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		}
		else
		{
			System.out.println("\n>>�Է� ������ ������ �����մϴ�."); 
		} */


		//��� 3  ��±����� �ϳ��� ó��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, result;
		char op;
		//String �����ڵ� ���ڿ��� ���� ������ "+"�� ���� ������ ũ��� ���߿����
		System.out.print("ù ��° ���� �Է�  : ");
		a = Integer.parseInt(br.readLine());	
		System.out.print("�� ��° ���� �Է�  : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�[+ - * /]  : ");	
		op = (char)System.in.read();

		if (op=='+')
		{
			result = a + b;
		} //���̽� ��������

		else if (op=='-')
			result = a - b;
		else if (op=='*')
			result = a * b;
		else if (op=='/')
			result = a / b;

		System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result);
	


//������?

	}
			
}
