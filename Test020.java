/*
======================================================================

�����ڹ� �⺻ ���α׷��֡���
-������ �ڷ���
-�Ǽ��� ������Ÿ���� ���е� �׽�Ʈ �ǽ�

======================================================================
*/

public class Test020
{
	public static void main(String[] args)
	{
		//�ֿ� ���� ����
		float a = 0;
		double b = 0;

		//���� �� ó��
		//���� �� ó�� ->�ݺ��� ���� -> 100000(�ʸ�) �� �ݺ�
		for (int i=1; i<=100000; i++)



		a += 100000; //a�� 100000��ŭ �������Ѷ�~!
		b += 100000; //b�� 10000��ŭ �������Ѷ�~!

		//��� ���
		//System.out.println("�ݺ����"); //�ʸ� �� ���


		System.out.println("flout a : " +(a/100000));
		System.out.println("double b : " + (b/100000));

	}
}
/*
flout a : 99996.055
double b : 1.0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/