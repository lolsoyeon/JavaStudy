/*=====================================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ���� 2022-07-21
 - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
 - Object Ŭ����
======================================================*/

//import java.
class Test
{
	/*
	.....
	*/
	private int a  = 10;
	public void write()
	{
		System.out.println("a : " + a);
	}

	
}
public class Test128 //extends Object
{
	

	public static void main(String[] args)
	{
		Test ob1 = new Test();
		Test ob2 = new Test();

		System.out.println("10 == 9 : "+ (10 == 9));
		//--==>>10 == 9 : false

		int a = 10;
		int b = 10;

		System.out.println("a == b : "+ (a == b));
		//--==>>a == b : true

		System.out.println("ob1 == ob2 : " + (ob1 == ob2));
		//--==>>ob1 == ob2 : false       
		//�� ��ü(Object)���� ���ϴ� �������� ����ϴ¡� == �������ڴ�
		//	ũ�⸦ ���ϴ°��� �ƴ϶� ��ü�� �ּҸ� ��.

		
	}
}