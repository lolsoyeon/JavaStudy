/*=================================================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ���� 2022-07-22 ���� 12:04
 - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
 - Wrapper Ŭ����
==================================================================*/

public class Test134
{

	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;
		float f = 1.2f;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);
		Float f2 = new Float(f);

		System.out.println(b2);
		System.out.println(i2);
		//--==>>3
		//		256

		print(b2);
		print(i2);
		print(f2);

	}
	/*
	static void print(Byte b)
	{		
	}
	static void print(Short s)
	{
		
	}
	static void(Integer i)
	{
		
	}
	*/
	
	//print(3);		��ĳ����
	//static void print(Object obj)				///static �����ϱ�~!~!
		
	
	//java.lang.Number (�߻�)Ŭ����
	//��� ������ Wrapper Ŭ������ �θ� Ŭ����
	//(���� Ŭ����, ����Ŭ����)�̴�.
	//b2, i2�ڷ����� Number�� �Ѿ���鼭
	//�� ĳ���� �� �Ͼ�Եȴ�.

	static void print(Number nb)
	{
		System.out.println(nb);

		/*
		if(n instanceof Integer)
		{
			System.out.println(n.intValue());
		}
		else if (n instanceod Double)
		{
		}
		*/
	}

//	static void print(double x)
//	{
//		System.out.println(x);
//	}

}
