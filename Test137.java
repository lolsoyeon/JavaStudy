/*=================================================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ���� 2022-07-22 ���� 3:18
 - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
 - String Ŭ���� 
==================================================================*/
public class Test137
{
	public static void main(String[] args)
	{
		String s = "seoul korea";
		System.out.println("s : " + s);
		//-->>s : seoul korea

		//�� ���ڿ� ���� 
		System.out.println(s.substring(6,9));
		//--==>>kor
		//String. substring(s,e)
		//String ���ڿ��� �������
		//s��° ����....e-1 ��°���� ����
		//��, �ε����� 0���� ����

		System.out.println(s.substring(7));
		//String substring(s)
		//String ���ڿ��� �������
		//s��°���� ...������ ����
		//��, ���ڿ��� ���� ���̸�ŭ

		//���ڿ��� ������ �� ��
		System.out.println(s.equals("seoul korea"));
		System.out.println(s.equals("seoul Korea"));
		//true
		//false
		//��ҹ��� ������ ����

		System.out.println(s.equalsIgnoreCase("SEOUL KOREa"));
		//-->>true
		//--��ҹ��� ���� ����


		//�� ã�����ϴ� ��� ���ڿ�(s)��
		// kor  ���ڿ��� ���� �ұ�?
		//�����Ѵٸ�.......�� ��ġ�� ��� �ɱ�?

		System.out.println("---------------------���м�");
		//"seoul korea"
		// 0123456789
		System.out.println(s.indexOf("kor"));
		//--==>>6

		System.out.println(s.indexOf("ea"));
		//--==>>9
		System.out.println(s.indexOf("e"));
		//--==>>1
		//--���� ã�� ���ڿ��� �ε����� ��ȯ �ϰ� ����.

		System.out.println(s.indexOf("tt"));
		//--==>>-1

		//--ã���� �ϴ� ���ڿ��� ��� ���ڿ��� ������ ���
		//  �� ���ڿ��� �ε����� ��ȯ������
		//	�������� ���� ��� ������ ��ȯ�ϰ� �ȴ�.(-1)


		//�۴�� ���ڿ�(s)�� ��rea�� �� ���������� ���� Ȯ��
		//(true/false)
		System.out.println(s.endsWith("rea"));
		System.out.println(s.endsWith("oul"));
		//--==>>true
		//		false

		//�� ã���� �ϴ� ��� ���ڿ�(s)��
		//	��e�����ڿ��� �����ұ�?
		//	�����Ѵٸ�...�� ��ġ�� ��� �ɱ�?
		//	(��, �ڿ��� ���� �˻�)

		//seoul korea
		System.out.println(s.indexOf("e"));
		//--==>>1
		System.out.println(s.indexOf("o"));
		//--==>>2


		//lastIndexOf()�޼ҵ� ��� �ڿ��� ���ͽ����ε�  �������� ó�����ͼ���.
		//seoul korea
		System.out.println(s.lastIndexOf("e"));
		//--==>>9
		System.out.println(s.lastIndexOf("o"));
		//--==>>7


		//�۴�� ���ڿ�(s)��
		// ��6����° �ε��� ��ġ�� ���ڴ�?(�ε��� ������ �׻� �����ؾ��Ѵ�.)

		//seoul korea
		System.out.println(s.charAt(6));
		//--==>>k

		//System.out.println(s.charAt(22));
		//--==>>��Ÿ�� �����߻� 
		//--  StringIndexOutOfBoundsException

		//��� ���ڿ�(s)�� �� ���ڿ� seoul corea��
		//� ���ڿ��� �� ū��?  �� ���ڿ��� ���� ũ�� ��
		// �� ���ڿ��� ���ٸ�	�� 0
		// �� ���ڿ��� �ٸ��ٸ� �� ���̸� Ȯ��(������ �迭)


		System.out.println(s.compareTo("seoul korea"));
		//--==>> 0 �� �ι��ڿ��� ���� (s�� seoul korea)
		System.out.println(s.compareTo("seoul corea"));
		//--==>> 8
		//-- c ~ k �� defghijk �� 8
		//�Ƹ��� �ε����� 0���� ����??????�ε�


		//�� ����ڿ�(s) ��
		//�ش� ���ڿ��� ã�Ƽ� ���ϴ� ���·� ������ ���ڿ� ��ȯ 
		//���ִ°� �� s�� �ٲٴ°��� �ƴϴ�.

		s = "�츮���� ���ѹα� ���ѵ��� ����";
		s= s.replaceAll("����", "����");

		System.out.println("ó�� ��� : " + s);
		//--==>>ó�� ��� : �츮���� ���ֹα� ���ֵ��� ����


		//�� ���� ����
		s ="          ��          ��          ";

		System.out.println(s);
		System.out.println("|" + s + "| ");
		//--==>>|          ��          ��          |


		System.out.println("|" + s.trim() + "|");  

		//--==>>|��          ��|
		//--���� �����ڸ� ��������
		//trim() �̶�� �޼ҵ��� ����� ���� Ȯ�� ����Ŭ����� substring ����  

		//Ʈ�� : ��������� Ư¡�� ���� !!! 









	}
	
}