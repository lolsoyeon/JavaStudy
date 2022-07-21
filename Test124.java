/*==============================================
   ���� Ŭ���� ��� ���� 2022-07-21
	- ��ø Ŭ����
===============================================*/

//outer
class InnerOuterTest
{
	static int a = 10;
	int b = 20;


	//inner
	class InnerNested
	{
		int c = 30;

		void write()	//outer �� write() �޼ҵ�
		{
			System.out.println("inner �� write()......");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
		}
	}

	void write()		//outer�� write()�޼ҵ�
	{
		System.out.println("outer�� write()....."); 

		InnerNested ob1 = new InnerNested();
		ob1.write();		//inner�� wrute()�޼ҵ� ȣ��
	}
}
public class Test124
{
	public static void main(String [] args)
	{
		
		//InnerOuterTest(outer)Ŭ������� �ν��Ͻ�����
		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write();			//outer�� write()�޼ҵ� ȣ��
		//--==>>
		//outer�� write().....
		//inner �� write()......
		//a : 10
		//b : 20
		//c : 30
		

		//InnerNested(inner)Ŭ���� �ù� �ν��Ͻ�����
		//InnerNested ob3 = new InnerNested();
		//--==>>�����߻�(�����Ͽ���)
		
		//Test122�� ���غ���~!~!
		//Ŭ���������� InnerOuterTest.InnerNested Ŭ���� ��� �ν��Ͻ�����
		//InnerOuterTest.InnerNested ob4 = new InnerOuterTest.InnerNested();
		//--==>>�����߻�(�����Ͽ���)

		//�� ��ø ���� Ŭ����(static ��ø Ŭ����)�ʹ� �޸�
		//	�ܺ� Ŭ������ �ν��Ͻ�(��ü)�� ��������ʰ�
		//	�ܵ����� ���� Ŭ������ �ν��Ͻ��� �����ϴ� ���� �Ұ����ϴ�.
		//	���� Ŭ������ ��ü�� �����ϴ� ���� �����ϴ�.
		//	�� �ܺ� Ŭ������ ��ü�� ����ϸ�
		//	���� Ŭ������ ��ü�� �����ϴ°��� �����ϴ�.

		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();
		ob5.write();
		//inner �� write()......
		//a : 10
		//b : 20
		//c : 30
		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		ob6.write();
		//a : 10
		//b : 20
		//c : 30
		//outerŬ������.innerŬ������ �������� = new outer������().new inner������();

		//cf) static �� ��ø Ŭ����
		//outer Ŭ������.innerŬ������ ���������� = new outerŬ������.inner������();

}