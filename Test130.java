/*=================================================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ���� 2022-07-22
 - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
 - Wrapper Ŭ����
==================================================================*/


/*
�� Wrapper Ŭ����

	1. �ڹٿ����� ��� ���ؿ��� �����ϴ� �⺻�� �����͸� ������
	�������� Ŭ������ �����Ͽ� ��ü ������ ó���Ѵ�.
	���� �ڹٿ����� �̷��� �⺻�� �����͸�
	��ü ������ ó���� �� �ֵ��� Ŭ������ ������ ���ۿ� ���µ�
	�̷��� Ŭ�������� ������ Wrapper Ŭ�������Ѵ�.

	2. �� �ڷ�����
	byte, short, int,      long, float, double, char,      boolean ���� �����ϴ�
	Byte, Short, Integer,  Long, Float, Double, Character, Boolean ��
	Wrapper Ŭ���� �� ū ���ڵ��� �ٷ�� ����
	java.math.BigInteger �� java.math.BigDecimal Ŭ������ �����Ѵ�.


	Wrapper Ŭ������ java.lang ��Ű���� ���ԵǾ� �����Ƿ�
	������ import ���� ���� �ٷ� ����ϴ°��� �����ϸ�
	�⺻���� ���������� Wrapper Ŭ������ ���� �޼ҵ带 ����
	�� ��ȯ�� �����ϰ�, ���� �񱳿� ���� ���굵 �����ϴ�.


	ex) java.lang.Integer Ŭ����
	int �⺻ �ڷ����� Wrapper Ŭ������
	������ �ٷ�µ� �ʿ��� ����� �޼ҵ�, ���� ��ȯ � �ʿ���
	�޼ҵ� ���� �����ϰ� �ִ�.

	static int parseInt(Sstring s)
	���ڿ� �������� ����� ���ڸ� ���� ���·� ��ȯ�Ͽ� ��ȯ�Ѵ�.

	static Integer parseInt(int i)
	int ���� Integer ������ ��ȯ�Ѵ�

	byte byteValue(), int intValue(),
	short shortValue(), long longValue(),
	float floatValue(), double doublaValue()
	�ش� �⺻ �ڷ������� �� ��ȯ ���� ��ȯ�Ѵ�.

	/*
	�� ���� �ڽ�(Auto-Boxing)�� ���� ��ڽ�(Auto-Unboxing) �߿�~!��

	�Ϲ������� ���۷��� ���� �⺻ �ڷ����� ȣȯ���� ������(���� �Ұ�)
	�� ��� �߻��ϴ� ���� �ذ��� ���� �ڹٿ����� Wrapper Ŭ������ �����ϰ� �Ǿ���.
	������,  jDK 1.5 ���� ���۷��� ���� �⺻ �ڷ�����
	������ ���� �� ��ȯ�� �����ϰ� �Ǿ���.

	   int a = 10, b;
(��ü) Integer ob;
(��ü) ob = a;
		//--�⺻ �ڷ���(int)�� Integer ������ �ڵ� ��ȯ(���� �ڽ�)
		//  �����δ�.....��ob = new Intger(a);��
	
		b = ob;
		//---Integer(��ü)�� �⺻�ڷ��� int ������ �ڵ� ����ȯ(���� ��ڽ�)
		//�����δ�..... ��b = ob.intValue();��

	�̴� JDK 1.5 ���� �߰��� ����ڽ�/ ���� ��ڽ��̶��
	����������� �������� ���̴�.

	�⺻�� ��ü�� �ٲ��� ������� �ڽ�   		�⺻�� �ڽ������� ����x      
	��ü�� �⺻�ڷ������� �ٲ�� ��ڽ�			��ü�� ����o


	*/

public class Test130
{
	public static void main(String[] args)
	{
		int a  = 10,b;
		Integer c;
		Object d;

		b = a;					//--int �� ������(�ڷ�) ��  int �� ����

		c = new Integer(0);		//��ü ���� ����

		//�� ���۷��� ��(���� Ÿ��) �⺻ �ڷ���(�⺻ Ÿ��)�� ȣȯ�� ���� �ʴ´�.
		//�� Ÿ�԰� �ּ� Ÿ���̱⶧����

		b = c;		//Integer �� ������(��ü) �� int �� ����(���� ��ڽ�)

		b = c.intValue();	//��ü�� �޼ҵ� ȣ���� ���� ����� ��ȯ (��ڽ�)
		

		d = new Object();		//��ü ����
		System.out.println("d.toString() : " + d.toString());
		//--==>>d.toString() : java.lang.Object@15db9742


		d = new Integer(10);	 //�� ĳ����			�̰� �� ��ĳ����?????
		System.out.println("d.toString() : " + d.toString());
		//--==>>d.toString() : 10

		//�������̵� �Ʊ��� ~~~~��� ���� �Ѵ�.
		//���������� ���÷� ������ �־���Ѵ�.

		d = new Double(12.345); //��ĳ����			��?? �¹�
		System.out.println("d.toString() : " + d.toString());
		//--==>>d.toString() : 12.345

		d = 10;			//--���� �ڽ�
		System.out.println("d.toString() : " + d.toString());
		//--==>>d.toString() : 10

		
	}
}