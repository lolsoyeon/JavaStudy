/*=================================================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ���� 2022-07-22 ���� 11:32
 - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
 - Wrapper Ŭ����
==================================================================*/

// ������ ū ������ �ٷ�� ���� java.math.BigInteger Ŭ����

import java.math.BigInteger;
public class Test132
{
	public static void main(String[] args)
	{
		// �Ұ���
		// int a1 = 123456789123456789;
		// System.out.println(a1);
		
		// �Ұ���
		// long b1 = 123456789123456789;
		// System.out.println(b1);

		// �Ұ���
		// long c1 = 123456789123456789L;
		// System.out.println(c1);

		// �Ұ���
		// long d1 = 123456789123456789123456789L;
		// System.out.println(d1);

		BigInteger a = new BigInteger("123456789123456789");   //�����ڿ��� �Ѱܹ޴´�????????
		BigInteger b = new BigInteger("123456789123456789");  
		// BigInteger c = a + b;
		// System.out.println(c);

		// ���ϱ� ���ؼ���
		BigInteger c = a.add(b);
		System.out.println(" ������� : " + c);
		//--==>> ������� : 246913578246913578

		// ����
		BigInteger d = a.subtract(b);
		System.out.println(" ������� : " + d);

		// ���ϱ�
		BigInteger e = a.multiply(b);
		System.out.println(" ������� : " + e);

		// ������
		BigInteger g = new BigInteger("2");

		System.out.println(" 2�� 3�� : "  + g.pow(3));

		/* 
		������� : 246913578246913578
		������� : 0
		������� : 15241578780673678515622620750190521
		2�� 3�� : 8
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/
	}
}