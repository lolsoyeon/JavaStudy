/*=================================================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ���� 2022-07-22 ���� 11:32
 - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
 - Wrapper Ŭ����
==================================================================*/
//������ ū �Ǽ��� �ٷ�� ���� BigDecimal 

import java.math.BigDecimal;
public class Test133
{
	public static void main(String[] args)
	{
		BigDecimal a = new BigDecimal("123456789.123456789");

		//mmovePointLeft() : �Ҽ����� �������� �̵�
		BigDecimal b = a.movePointLeft(3);
		System.out.println( "ó����� : " + b);
		//--==>>
		
		//����
		BigDecimal c = a.divide(b);
		System.out.println( "ó����� : " + c);

		//
		BigDecimal d = a.divide(b.BigDecimal.ROUND_DOWN);	//�ݿø��� �����ʴ´�. �� ����
		System.out.println( "ó����� : " + d);

		//BigInteger ��ü�� ��ȯ
		System.out.println(a.toBigInteger());


		
	}
}