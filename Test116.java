/*==============================================
    ���� Ŭ���� ���� ���� 2022-07-20
	- ��� ���迡 �ִ� Ŭ������ ���� ĳ����
	(�� ĳ����, �ٿ� ĳ����)
===============================================*/

//super class, �θ�Ŭ����, ����Ŭ����
class SuperTest116
{
	public int a = 10, b = 20;

	public void write()
	{
		System.out.println("���� Ŭ���� write() �޼ҵ�.....");
	}
	public int hap()
	{
		return a + b;
	}
	
}

//sub class, �ڽ� Ŭ����, ���� Ŭ����
class SubTest116 extends SuperTest116
{
	public int b = 100, c = 200;


	@Override
	public int hap()
	{
		return a + b + c;
	}
	public void print()
	{
		System.out.println("���� Ŭ���� print() �޼ҵ�......");
	}

}
//main() �޼ҵ带  �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test116
{
	public static void main(String[] args)
	{
		//sub class(���� Ŭ����)��� �ν��Ͻ� ����
		SubTest116 ob1 = new SubTest116();

		System.out.println("ob1.b : " + ob1.b);
		//--ob1.b : 100

		//�� �� ĳ����          ����� �����ε� ������������ ĳ���� �Ѵ�  
		//���� ������ �θ��
		//�θ�� �ڽ��� ���ǵ��δ�
		//SuperTest116 ob2;
		SuperTest116 ob2 = ob1;
		//--��SuperTest116 ob2 = (SuperTest116)ob1���� ������ �ڵ�
		//subTest116�� SuperTest116�� ����Ŭ���� �̱⿡ ������ ����
		//	((�θ�)ob1) .b

/*
		�л� �ҿ��� = new �л�();

		������ ��� = �ҿ���;	  //�������� ��� = (���)�ҿ���;�� �� �������ڵ�

		 ���л��� ������

		 ��calss  ������				class �л� extends ������
		   {							{
		   }							}

*/	
		System.out.println("ob2.b  : " + ob2.b);
		//--==>>ob2.b  : 20
		//������ ��ü���� ���� �Ҵ�Ǳ� ������
		//���� b�� ob2�� �����̴�.

		System.out.println(" ��  : " + ob2.hap());
		//hap()�޼ҵ�� �������̵� �Ǿ��ְ�
		//ob2�� ob1�� ĳ������ ������ ��ü�̹Ƿ�
		//SuperTest116�� hap() �޼ҵ带 ȣ���ϴ°��� �ƴ϶�
		//SubTest116���� �������� hap()�޼ҵ带 ȣ���ϰԵȴ�.
		//��, �޼ҵ�� ��ĳ������ �Ǵ���
		//������(�����)�� �̻�....������ ������� ���� �� ����.

		ob2.write();
		//--==>> "���� Ŭ���� write() �޼ҵ�....." 

		//ob2.print();
		//--==>> ���� �߻�
		

		//�� �ٿ� ĳ����
		((SubTest116)ob2).print();
		//--==>>"���� Ŭ���� print() �޼ҵ�......"

		//�� �߰� ����------------------------------------
		// �ٿ� ĳ���� ���� ����


		//super class(���� Ŭ���� )��� �ν��Ͻ�����
		SuperTest116 ob3 = new SuperTest116();
		SubTest116 ob4;

		//System.out.println(ob3.c);
		//--==>>���� �߻�
		//�θ�� �̷��ڽ����ִ��� �𸥴�!
		//���� ��ü�� ���� ��ü�� ����� �����ϴ°��� �Ұ����ϴ�
		//(���� ��ü ���忡���� � ������ü�� �����ϴ��� �� ������)

		//ob4 = ob3;
		//������ ���� �߻�
		//--���� ��ü�� ���� ��ü�� ���� �� (���� �� ��) ����.


		//ob4 = (SubTest116)ob3;
		//---===>> ���� �߻�(��Ÿ�� ����)
		//�ۼ��� ������ �������� ������ ������ 
		//�ٿ�ĳ������ �̷������ ��Ȳ�̴�.
		//������ �������� ĳ������ �̷�������ʴ´�.
		//���� Sub ��ü�� ���� �޸� �Ҵ��� �̷�� �������� �����̱� ������
		//�ٿ�ĳ������ �Ұ����� ���̴�.
	}
}

/*
	�� ��ĳ���� �ٿ�ĳ������ ���������� �̷����� ���----------------

	1. ������ü ����;			//CHECK~!~!~!~!~!�����Ȱ�ü�� ���� ��ü��
	2. ���� = ����;				//�� ĳ����. ����.
	3. ���� = ����;				//���� �߻�
	4. ���� =(����)����;		//�ٿ�ĳ����. ����.

	�� �ٿ� ĳ������ ���������� �̷������ ���--------------
	1. ������ü ����;
	2. ���� = ����;				//���� �߻�.
	3. ���� = (����)����;		//�ٿ�ĳ����. ��Ÿ�� ���� ClassCastException

�� �� ĳ������ �׻� ����. �ٿ�ĳ������ ��쿡 ���� ����
	KEY : ��ü ������ �ִ�

*/