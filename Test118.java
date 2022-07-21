/*==============================================
    ���� Ŭ���� ��� ���� 2022-07-20
	- �������̽�(Interface)
===============================================*/

//�������̽�
interface ADemo
{
	public void write();
}
//�������̽�
interface BDemo
{
	public void print();
}

//�������̽��� 2�� �̻��� ����(implements) �� �� �ִ�
// �� Ŭ���������� ���� ����� ���� �ʴ� �κ��� ����(����)�ϴ� ����.

//Ŭ����
//class Demolpml
//class demoLmpl exteds ADemo,BDemo 
//class demoLmpl implements ADemo,BDemo
//	��
//�߻�Ŭ���� - �� �������̽��� �����ϴ� �߻� Ŭ����
//abstract class DemoImpl implements ADemo,BDemo
//Ŭ���� - �� �������̽��� �����ϴ� Ŭ����(�� �������̽��� ��� �޼ҵ带 Overriding)

class DemoImpl implements ADemo,BDemo
{
	//JDK 1.5(5.0)������ �������̽� �޼ҵ带
	//�������̵� �� ��
	//@Override ������̼� �� ����� �� ����.
	//JDK1.6���ĺ��� ���밡���� �����̴�.
	//��, ��ӹ��� Ŭ������ �޼ҵ带 �������̵� �Ҷ�����
	//JDK 1.5������ ������̼� ����� �����ϴ�.
	@Override
	public void write()
	{
		System.out.println("ADemo �������̽� �޼ҵ� write()....");
	}
	@Override
	public void print()
	{
		System.out.println("BDemo �������̽� �޼ҵ� print()....");
		
	}

}

public class Test118
{
	public static void main(String[] args)
	{
	
		//ADemo ob = new ADemo;		//�������̽� �ν��Ͻ� �����Ұ�
		//BDemo ob = new BDemo
		

		//ADemo BDemo �������̽��� ������
		//Ŭ���� ����� �ν��Ͻ� ����
		DemoImpl ob1 = new DemoImpl();

		ob1.write();
		ob1.print();

		//�� ĳ����
		ADemo ob2 = new DemoImpl();
		BDemo ob3 = new DemoImpl();


		//ob2.print();
		//-->>���� �߻�(������ ����)
		//ob3.write();
		//-->>���� �߻�(������ ����)

		
		ob3.print();
		ob2.write();
		//--==>>BDemo �������̽� �޼ҵ� print()....



		((BDemo)ob2).print();
		//-->> BDemo �������̽� �޼ҵ� print()....
		((ADemo)ob3).write();
		//-->> ADemo �������̽� �޼ҵ� write()....
		//--	DemoImplŬ������ �� �������̽��� ��� �����߱� ������
		//		�̿Ͱ��� ó���� �����ϴ�.
		//		���� ,DemoImplŬ������ �� �������̽��� �� �� �������̽��� �����ߵ��
		//		�� ������ ��Ÿ�� ���� (ClassCastException)�� �߻��ϴ� �����̴�.

		//�ٿ�ĳ����
		((DemoImpl)ob3).write();
		//--==>>ADemo �������̽� �޼ҵ� write()....
	}
}