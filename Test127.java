/*=====================================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ���� 2022-07-21
 - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
======================================================*/

//Test126.java�� ��
//import java.lang.*;
//(import java.lang.*Object ����)
public class Test127	//extends Object
{

	
		/*
		public String toString()
		{
		}
		*/
		@Override
		public String toString()
		{
			return "�������� toString()....";
		}
	
	public static void main(String[] args)

	{
		Test127 ob = new Test127();

		System.out.println(ob.toString());
		
		System.out.println(ob);

		/*
		�������� toString()....
		�������� toString()....
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

		*/
	}
}