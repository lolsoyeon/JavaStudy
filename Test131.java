/*=================================================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ���� 2022-07-22
 - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
 - Wrapper Ŭ����
==================================================================*/
public class Test131
{
	public static void main(String[] args)
	{
		boolean bi = true;

		Boolean wrapBi = new Boolean(bi);
		Boolean wBi = bi;				//----- ���� �ڽ�
										// ������Ƽ�� Ÿ�� bi�� ��ü�� �����Ѵ� ��� ��Ȳ
										
		int n = 300;
		Integer wrapN = new Integer(n);

		int n2 = wrapN;					//---- ���� ��ڽ�
										// ��ü�� ������Ƽ�� Ÿ�� �� �����Ѵ�.
								

		float f = 300.3f;
		Float wrapF = new Float(f);

		System.out.println(wrapBi.toString());
		System.out.println(wrapN.toString());
		System.out.println(wrapF.toString());
		// true
		// 300
		// 300.3

		System.out.println(wrapBi);
		System.out.println(wrapN);
		System.out.println(wrapF);
		// true
		// 300
		// 300.3

		// Integer Ŭ����
		String sn = "12";

		int ni = Integer.parseInt(sn);
		System.out.printf("ni : %3d\n", ni);

		ni = Integer.parseInt("0101",2);
		System.out.printf("ni : %3d\n",ni);

		ni = Integer.parseInt("12",8);
		System.out.printf("ni : %3d\n",ni);

		ni = Integer.parseInt("A",16);
		System.out.printf("ni : %3d\n",ni);

		sn = Integer.toBinaryString(20);		// static Ŭ���� �޼ҵ�ڱ��� �����ڱ��� ��ȯ�ڷ���� String �ΰ�����~~
		System.out.printf("sn : %s\n",sn);
		sn = Integer.toOctalString(31);
		System.out.printf("sn : %s\n",sn);

		sn = Integer.toHexString(31);
		System.out.printf("sn : %s\n",sn);

		Integer num = new Integer(50);
		System.out.println("num.toString : "+ num.toString());

		int n3 = 345;
		Integer n4 = Integer.valueOf(n3);
		System.out.println("n4 : "+ n4);







	}
}