/*=================================================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����  2022-07-25
 - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
 - String Ŭ���� 
==================================================================*/
public class Test137
{
	public static void main(String[] args)
	{
		String slogan = "seoul korea";
		System.out.println("slogan : " + slogan);
		//--==>> slogan : seoul korea

		//�� ���ڿ� ���� 
		System.out.println(slogan.substring(6,9));
		//--==>> kor
		// String. substring(s,e)
		// String ���ڿ��� �������
		// s��° ����....e-1 ��°���� ����
		// ��, �ε����� 0���� ����

		System.out.println(slogan.substring(7));
		//--==>> orea
		// String substring(s)
		// String ���ڿ��� �������
		// s��°���� ...������ ����
		// ��, ���ڿ��� ���� ���̸�ŭ

		// ���ڿ��� ������ �� ��
		System.out.println(slogan.equals("seoul korea"));
		System.out.println(slogan.equals("seoul Korea"));
		//--==>> true
		//--==>> false
		// ��ҹ��� ������ ����

		System.out.println(slogan.equalsIgnoreCase("SEOUL KOREa"));
		//--==>> true
		// ��ҹ��� ���� ����


		//�� ã�����ϴ� ��� ���ڿ�(slogan)��
		// kor ���ڿ��� ���� �ұ�?
		// �����Ѵٸ�.......�� ��ġ�� ��� �ɱ�?

		System.out.println("---------------------���м�");
		//"seoul korea"
		// 0123456789
		System.out.println(slogan.indexOf("kor"));
		//--==>> 6

		System.out.println(slogan.indexOf("ea"));
		//--==>> 9
		System.out.println(slogan.indexOf("e"));
		//--==>> 1
		//-- ���� ã�� ���ڿ��� �ε����� ��ȯ �ϰ� ����.

		System.out.println(slogan.indexOf("tt"));
		//--==>> -1
		//-- ã���� �ϴ� ���ڿ��� ��� ���ڿ��� ������ ���
		//   �� ���ڿ��� �ε����� ��ȯ������
		//	 �������� ���� ��� ������ ��ȯ�ϰ� �ȴ�.(-1)


		//�� ��� ���ڿ�(slogan)�� ��rea�� �� ���������� ���� Ȯ��
		//(true/false)
		System.out.println(slogan.endsWith("rea"));
		System.out.println(slogan.endsWith("oul"));
		//--==>> true
		//--==>> false

		//�� ã���� �ϴ� ��� ���ڿ�(slogan)��
		//	��e�����ڿ��� �����ұ�?
		//	�����Ѵٸ�...�� ��ġ�� ��� �ɱ�?
		//	(��, �ڿ��� ���� �˻�)

		// seoul korea
		System.out.println(slogan.indexOf("e"));
		//--==>> 1

		System.out.println(slogan.indexOf("o"));
		//--==>> 2


		// lastIndexOf() �޼ҵ� ��� �ڿ��� ���ͽ����ε�  �������� ó�����ͼ���.
		// seoul korea
		System.out.println(slogan.lastIndexOf("e"));
		//--==>> 9
		System.out.println(slogan.lastIndexOf("o"));
		//--==>> 7

		//�۴�� ���ڿ�(slogan)��
		// ��6����° �ε��� ��ġ�� ���ڴ�?(�ε��� ������ �׻� �����ؾ��Ѵ�.)

		//seoul korea
		System.out.println(slogan.charAt(6));
		//--==>> k

		// System.out.println(slogan.charAt(22));
		//--==>> ��Ÿ�� �����߻� 
		//--  StringIndexOutOfBoundsException

		// ��� ���ڿ�(slogan)�� �� ���ڿ� seoul corea��
		// � ���ڿ��� �� ū��?  �� ���ڿ��� ���� ũ�� ��
		// �� ���ڿ��� ���ٸ�	�� 0
		// �� ���ڿ��� �ٸ��ٸ� �� ���̸� Ȯ��(������ �迭)
		System.out.println(slogan.compareTo("seoul korea"));
		//--==>> 0 �� �ι��ڿ��� ���� (slogan�� seoul korea)
		System.out.println(slogan.compareTo("seoul corea"));
		//--==>> 8
		//-- c ~ k �� defghijk �� 8


		//�� ����ڿ�(slogan) ��
		// �ش� ���ڿ��� ã�Ƽ� ���ϴ� ���·� ������ ���ڿ� ��ȯ 
		// ���ִ°� �� slogan�� �ٲٴ°��� �ƴϴ�.
		slogan = "�츮���� ���ѹα� ���ѵ��� ����";
		// �ش� ������ ���� ����Ǵ� ���� �ƴ϶�
		// ������ �ݷ����� ����̵�
		// ���ڿ� ����� ���Ӱ� ����� ������ ����
		slogan = slogan.replaceAll("����", "����");

		System.out.println("ó�� ��� : " + slogan);
		//--==>> ó�� ��� : �츮���� ���ֹα� ���ֵ��� ����

		//�� ���� ����
		slogan = "          ��          ��          ";

		System.out.println(slogan);
		System.out.println("|" + slogan + "| ");
		//--==>>|          ��          ��          |


		System.out.println("|" + slogan.trim() + "|");  

		//--==>> |��          ��|
		//-- ���� �����ڸ� ��������
		// trim() �̶�� �޼ҵ��� ����� ���� Ȯ�� ����Ŭ����� substring ����  

		// Ʈ�� : ��������� Ư¡�� ���� !!! 
		System.out.println("|" + slogan.replaceAll(" ","") + "|");
		//--==>> |���|
		
		System.out.println("===========================���м�");

		// "50"
		int temp = Integer.parseInt("50");
		// System.out.println(temp);
		System.out.printf("%d\n" ,temp);

		slogan = Integer.toString(30);
		System.out.printf("%s%n",slogan);
		//--==>> 30
		// Object �� ������ toString �� �Ű������� ���µ� �̰������Ƿ� �����ε�
		// Integer�� Ŭ���� �޼ҵ�� �� static�پ�����
	
		int n = 2345678;
		System.out.printf("%d%n",n);
		// System.out.println();
		System.out.format("%d%n",n);
		//--==>> 2345678
		//--==>> 2345678
		
		//System.out.println();
		System.out.println("===========================���м�");

		slogan = String.format("%d",n);	 //���ڿ��� ��ȯ�ϴ� format()
		System.out.println(slogan);
		//--==>> 2345678

		slogan = String.format("%,d",n); //3�ڸ����� ,�����
		System.out.println(slogan);
		//--==>> 2,345,678

		// String str = "�⺻,����,���";
		// String[] strArr = str.split("",""); 

		// line 173 ~ 174�� ������ ����
		// String ��ü�� 

		String[] strArr = "�⺻,����,���".split(",");
		//split �ֹι�ȣ �����ϱ�

		for (String str : strArr)
		{
			System.out.print(str + " ");
		}
		System.out.println();
		//--==>> �⺻ ���� ���

	







	}
	
}