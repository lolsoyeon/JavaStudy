/*=================================================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ���� 2022-07-21 2022-07-22
 - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
 - Object Ŭ����   == �񱳿�����
==================================================================*/

// import java.lang.*;
// import java.lang.Object;	����
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

		System.out.println("10 == 9 : " + (10 == 9));
		//--==>> 10 == 9 : false

		int a = 10;
		int b = 10;

		System.out.println("a == b : "+ (a == b));
		//--==>> a == b : true

		System.out.println("ob1 == ob2 : " + (ob1 == ob2));
		//--==>> ob1 == ob2 : false       
		//�� ��ü(Object)���� ���ϴ� �������� ����ϴ¡� == �������ڴ�
		//	ũ�⸦ ���ϴ°��� �ƴ϶� ��ü�� �ּҸ� ��.

		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println();

		
		System.out.println("ob1             : " + ob1);
		//--==>> ob1             : Test@15db9742
		System.out.println("ob1.toString()  : "+ ob1.toString());
		//--==>> ob1             : Test@15db9742
		//--==>> ob1.toString()  : Test@15db9742
		System.out.println("ob2             : "   + ob2);
		System.out.println("ob2.toString()  : "+ ob2.toString());
		//--==>> ob2             : Test@6d06d69c
		//--==>> ob2.toString()  : Test@6d06d69c

		// Ŭ������@�ؽ��ڵ�
		// �� �ؽ��ڵ�(hashcord)
		// :	�ڹ� ���������� ��ü�� "����"�ϱ� ���� ����ϴ°�
		//		�޸��� �ּҰ����� �����ϸ� ����� �ȵȴ�.
		
		//�� �ڡڡڡڰ�ü�� ������ hashcord(�ؽ��ڵ�) �� ������
		//	  hashcord(�ؽ��ڵ�)�� ���ٰ��ؼ� ���� ��ü�� �ƴϴ�.









	}
}