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

csv ������1, ������2, ������3
�޸��� ���е� ������
==================================================================
*/
//#java.util.Scanner
//	�ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����Ͽ�
//	����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� '����'�̴�.(���鿡 ���� ���� ����, ���� next)
//	�ۼ��� ���� ��ū�� next() �޼ҵ带 ���
//  �ٸ� ����(�ڷ���)�� ������ ��ȯ �� ���ִ�.


public class Test019
{
	public static void main(String[] args)
	{
		//�ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;

		//���� �� ó��
		System.out.print("�̸�,����,����,���� �Է�(,����) : ");
		//�̸�,����,����,���� �Է�(,����) : ����,90,80,70
		//String temp	 = sc.next();

		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");

		//sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//				 ---------���� ó��
		//							  .�����ڻ��();
		//				"����,90,80,70"
		//										   "\s*,\s*"

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;


		//��� ���

		System.out.println("\n>> �̸� : " + name);
		System.out.println(">> ���� : " + tot);

	}
}