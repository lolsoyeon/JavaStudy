
/*===============================================
  ����Ŭ������ �ν��Ͻ�����
  - ������ (Constructor)
=================================================*/


public class Test077
{
	int val1;
	double val2;


	Test077()
	{
		val1=0;
		val2=0;
		System.out.println("�Ű����� ���� ������...");
	}

	Test077(int x)
	{
		val1=x;
		val2=0;
		System.out.println("int�� �����͸� �Ű������� �޴� ������...");
		
	}

	Test077(double y)
	{
		val1=0;
		val2=y;
		System.out.println("double�� �����͸� �Ű������� �޴� ������...");

	}

	Test077(int x, double y)
	{
		val1=x;
		val2=y;
		System.out.println("int�� ������ double�� ������ �Ű������� �޴� ������....");
	}


	public static void main(String[] args)
	{
		Test077 ob1 = new Test077();
		//--==>>�Ű����� ���� ������...
		System.out.println(ob1.val1 + "," + ob1.val2);
		//--==>>0,0.0 

		Test077 ob2 = new Test077(4);
		//--==>>int�� �����͸� �Ű������� �޴� ������...

		System.out.println(ob2.val1 + "," + ob2.val2);
		//4,0.0

		Test077 ob3 = new Test077(7.0);
		//double�� �����͸� �Ű������� �޴� ������...


		System.out.println(ob3.val1 + "," + ob3.val2);
		//0,7.0

		Test077 ob4 = new Test077(4,7.0);
		//int�� ������ double�� ������ �Ű������� �޴� ������....

		System.out.println(ob4.val1 + "," + ob4.val2);
		//4,7.0




	}
}
