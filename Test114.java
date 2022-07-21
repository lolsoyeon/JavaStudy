/*==============================================
    	���� Ŭ���� ��� ����
		- ���(Inheritance) 2022-07-20
===============================================*/
/*
�޼ҵ� �������̵�(Method Overriding)�� Ư¡
- �޼ҵ� �̸�, ����Ÿ��, �Ķ���� ���� Ÿ���� ���� ��ġ�ؾ��Ѵ�.
- �ݵ�� ��.�� ���谡 �־���Ѵ�.
-	�����ǵ� ���� Ŭ������ �޼ҵ� �������������ڴ�
	����Ŭ������ �޼ҵ� �������� �����ں��� ������ ũ�ų� ���ƾ��Ѵ�.
	�������, ����Ŭ���� �޼ҵ��� �������� ������ ��protected��  �ΰ��
	����Ŭ������ �� �޼ҵ带 �������̵�(Overriding) �ϴ°��
	�������������ڴ� ��public���Ǵ� ��protected���̾�� �Ѵ�.
- ��static ��,��final�� ,��private�� �޼ҵ�� �������̵�(Overriding) �� �� ����.
//   ���    ���������̾� 

- Exception �� �߰��� �Ұ����ϴ�.
��, ���� �޼ҵ尡 �������ִ� ���� ���� ���׿�
���ο� Exception �� �߰��ϴ� ���� �Ұ��� �ϴٴ°��̴�.

�ڹٿ����� ���������� �ϳ��� ��ü�� ��, �ϳ��� ���̽��� �����Ѵ�.
*/

//�θ� Ŭ����(���� Ŭ����  super class)
class SuperTest114
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write()�޼ҵ� : " + a + ": "  + b +" : "+ c);
	}

}


//�ڽ� Ŭ����
class SubTest114 extends SuperTest114
{

	/*
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write()�޼ҵ� : " + a + ": "  + b " +: "+ c);
	}
	*/
	protected int b = 100;		//

	public void print()
	{
		//System.out.println("sub print() �޼ҵ� : " + a + " : " + b + ": " + c);
		//-==>>������ ���� �߻�
		//����Ŭ�������� ����� ���� a���� ���� �� �� ����.
		//private�����̱⶧����

		System.out.println("Sub print()�޼ҵ� : " + b + " : " + c);
		System.out.println("Sub print()�޼ҵ� : " + b);
		System.out.println("Sub print()�޼ҵ� : " + this.b); //�� Ŭ���� SubTest114.b
		System.out.println("Sub print()�޼ҵ� : " + super.b);//extends �� SuperTest114.b

		//--==>> Sub print()�޼ҵ� : 100 : 20
		//--==>> Sub print()�޼ҵ� : 100
		//--==>> Sub print()�޼ҵ� : 100
		//--==>> Sub print()�޼ҵ� : 10
		//���� b �� ���ٹ���� ���� �ٸ� b �� ���� �� ����� �̷������.
		//����Ŭ�������� ����� b, ����Ŭ�������� ����� b

		System.out.println("Sub print()�޼ҵ� : " + c);
		System.out.println("Sub print()�޼ҵ� : " + this.c);	//SubTest114.c
		System.out.println("Sub print()�޼ҵ� : " + super.c);	//SuperTest114.c
		//--==>> Sub print()�޼ҵ� : 20
		//--==>> Sub print()�޼ҵ� : 20
		//--==>> Sub print()�޼ҵ� : 20
		//���� c�� �����ϴµ� �ƹ��� ����� �����̾���.
		//����Ŭ�������� ����� c

	} //end print()
	@Override
	public void write()
	{
		//System.out.println("Sub write() �޼ҵ� : "  + a + ": "+ b + " : "  + c );

		//--���� Ŭ�������� ����� ���� a���� ������ ������. (print() �޼ҵ�� ��������)
		//-> private �����̱� ������
		System.out.println("Sub write() �޼ҵ� : " + b + " : "  + c );
		//--==> Sub write() �޼ҵ� : 100 : 20


	}
}

//main()�޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test114
{
	public static void main(String[] args)
	{
		//���� Ŭ����(SubTest114)�ν���
		SubTest114 ob = new SubTest114();

		ob.print();

		ob.write();
		//--==>> Super write()�޼ҵ� : 5: 10 : 20
		//Sub write() �޼ҵ� : 100 : 20
		System.out.println("-------------------------���м�");


		System.out.println(ob.b);  
		//--==>>100 
		System.out.println(((SuperTest114)ob).b); 
		//--==>>10 
		//�� ���� �θ� (�θ� ��ġ�� �÷����ȴ�)

		ob.write();

		((SuperTest114)ob).write();
	}
}