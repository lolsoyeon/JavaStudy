/*==============================================
    ���� Ŭ���� ��� ���� 2022-07-20
	- �������̽�(Interface)
===============================================*/
//
interface Demo
{
	public void write();
	public void print();

}
abstract class DemoImpl implements Demo
{
	@Override
	public void write()
	{
		System.out.print("write() �޼ҵ� ������...");
	}
}
//�߻� Ŭ������ ��ӹ޴� �߻� Ŭ����
//
//
class DemoImplSub extends DemoImpl
{

	/*
	@Override
	public void write()
	{
		System.out.print("write() �޼ҵ� ������...");	
	}
	*/
	@Override
	public void print()
	{
		System.out.println("print() �޼ҵ� ������...");
	}
}
//
public class Test119
{
	public static void main(String[] args)
	{
		//Demo ob1 = new Demo();
		//�ν��Ͻ� �����Ұ�  �������̽�
		//DemoImpl ob2 = new DemoImpl
		//�ν��Ͻ� �����Ұ� �߻�Ŭ������

		DemoImplSub ob3 = new DemoImplSub();

		ob3.write();
		ob3.print();
		//write() �޼ҵ� ������...print() �޼ҵ� ������...


	}
