/*
======================================================================

�����ڹ� �⺻ ���α׷��֡���
-�ڹ� �⺻ ����� : System.util.Scanner

ScannerŸ��?
�̸�() �޼ҵ� ����  �޼ҵ��? ���,����,���� ->���� ��Ű�� ����
System.in ����ƮŸ��
new InputStreamReader ������ 
����̸����ؼ� ������ ���������ƴϴ�. �ݺ�� ����. ex)�����ͱ�
throws IOException �� �� �ص��� ���������� ó���Ǿ�����

=======================================================================
*/
//#java.util.Scanner
//	�ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����Ͽ�
//	����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� '����'�̴�.(���鿡 ���� ���� ����, ���� next)
//	�ۼ��� ���� ��ū�� next() �޼ҵ带 ���
//  �ٸ� ����(�ڷ���)�� ������ ��ȯ �� ���ִ�.

//import java.util.Scanner;

public class Test018
{
	public static void main(String[] args)
	{
		//�ֿ� ���� ����
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String name;
		int kor, eng, mat, tot;

		//���� �� ó��
		//- ����ڿ��� �ȳ��� �޼��� ���
		System.out.print("�̸� ���� ���� ���� �Է�(���鱸��) : ");
		// "�躸�� 90 80 70"

		// - ����ڰ� �Է��� �����͸� �� ������ �� ���� ��Ƴ���
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;

		//��� ���

		System.out.println();
		System.out.println(">>�̸� : "+ name);
		System.out.println(">>���� : "+ tot);


	}
}
/* ������
�̸� ���� ���� ���� �Է�(���鱸��) : ���ҿ�
90 80
70

>>�̸� : ���ҿ�
>>���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/