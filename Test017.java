/*
======================================================================

�����ڹ� �⺻ ���α׷��֡���
-�ڹ� �⺻ ����� : System.util.Scanner

ScannerŸ��?
�̸�() �޼ҵ� ����
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


import java.util.Scanner;
//throws IOException;
public class Test017
{
	public static void main(String[] args) 
	{
		//Scanner Ŭ���� ����� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);  //���ڿ� ����
		//�ֿ� ���� ����
		String name;
		int kor, eng, mat;
	

		//���� �� ó��
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.next();

		//�׽�Ʈ(Ȯ��)
		//System.out.println("�Է��� �̸� : " + name);

		System.out.print("���� ���� �Է� : ");
		//kor = Integer.paresInt(br.readLine());
		//KOR = Integer.paresInt()

		kor = sc.nextInt();

		System.out.print();kor = sc.nextInt("���� ���� �Է� : ");
		eng = sc.nextInt();
		System.out.print();kor = sc.nextInt("���� ���� �Է� : ");
		mat = sc.nextInt();
		//���ڿ� ���� ������


		System.out.println();
		System.out.println(">>�̸�  : " = name);
		//System.out.println(">>����  : " + kor + eng + mat);
		System.out.println(">>����  : " +  (kor + eng + mat));





	}
}