/*=================================================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ���� 2022-07-25 
 - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
 - StringBuffer Ŭ����
==================================================================*/
public class Test139
{
	public static void main(String[] args)
	{
		String s1 = "123456789";

		//(s1 + "123").replace('2','A');
		s1 = (s1 + "123").replace('2','A');
		//1234567892A456789

		//123456789
		//123456789123
		//1A34567891A3

		System.out.println("s1 : " + s1);
		//--==>> s1 : 1A34567891A3

		StringBuffer s2 = new StringBuffer("123456789");

		s2.delete(0,3).replace(1,3,"24").delete(4,6);
		//123456789
		//123456789.delete(0,3).replace(1,3,"24").delete(4,6);
		//456789.replace(1,3,"24").delete(4,6);
		//424789.delete(4,6);
		//4247
		System.out.println("s2 : "+ s2);
		//--==>> s2 : 4247

		//StringBuffer�� substring ��������??
		StringBuffer s3 = new StringBuffer("123456789");

		String s4 = s3.substring(3,6);
		//"123456789"
		//"123456789"
		//"456"
		System.out.println("s4 : " + s4);
		//s4 : 456

		StringBuffer s5 = new StringBuffer("123456789");
		s5.delete(0,3).delete(1,3).delete(2,5).insert(1,"24");
		//"123456789" s5.delete(0,3).delete(1,3).delete(2,5).insert(1,"24");
		//"456789" delete(1,3).delete(2,5).insert(1,"24");
		//"4789" delete(2,5).insert(1,"24");
		//"47" insert(1,"24");
		//"4247" insert(1,"24");
		//""4247"
		System.out.println("s5 : "+ s5.toString());
		//--==>>s5 : 4247




		
	}
}