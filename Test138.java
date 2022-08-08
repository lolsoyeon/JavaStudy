/*=================================================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ���� 2022-07-25 ���� 9:31
 - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
 - StringBuffer Ŭ����
==================================================================*/
/*
	�� StringBuffer Ŭ����

	���ڿ��� ó���ϴ� Ŭ������ String Ŭ�������� ��������
	String Ŭ������ ���� ���ڿ� �������� ������ �Ұ���������
	StriongBuffer Ŭ������ ���ڿ��� ����� ��
	���� ���ڿ��� �����ϴ� �ܰ迡�� ���� �� ���ִ�.

	��, StringBuffer��ü�� �������� ���̸� �����Ƿ�
	��ü�� �����ϴ� �������� �̸� �� ũ�⳪ ���� �����ϰų�
	���� ������ ������ ũ�⸦ �ٲ� ���ִ� ����� �����Ѵ�.

	// ���ڿ��� �ٷ�ٴ� ���� ������ StringBuffer�� �������̶� ������ �ִ�.
	
	���� JDK1.5 ���ĺ��ʹ�
	���ڿ��� ó���ϴ� StringBuilder ��� Ŭ������ �����Ѵ�.
	StringBuilder Ŭ������ ����� StringBuffer Ŭ������ ����������
	���� ū �������� multi-thread unsafe ��� ���� ���� ū ����̴�.
					 -------------------
	//         ���� thread �� ���ư����� �����������ϴ�.
	��, Syncroniztion ����ȭ ��(��) ���� ������
	StringBuffer���� ������ ���ü�(����ȭ) ������ ���ٸ�	
	StringBuilder�� ����ϴ� ���� ������ ����ų �� �ִ�.

	// ���߿� �������� ����� �� ������ ���� �ڹٿ� ����.
	// ��ɰ� ������ �ݺ��!!!!!! ������ �����ͱ�
	// �۾����� ó���ϴ� ���� ���(����) : thread
*/
public class Test138
{
	public static void main(String[] args)
	{
		String str1 = new String("seoul");
		String str2 = new String("seoul");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		//--==>> false
		//		 true

		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2)); //check~!~!
		//--==>> false
		//		 false
		// eqauls() �޼ҵ带 �������̵� �����ʾҴ�.
		System.out.println("----------------------------------");

		System.out.println(sb1);
		//--==>> korea
		// StringBuffer Ÿ��

		System.out.println(sb1.toString()); ///??
		//--==>> korea

		System.out.println(sb1.toString().equals(sb2.toString()));
		//line 51�� ���ϱ� �̰� String
		//--==>> true

		System.out.println("-----------------------------");
		StringBuffer sb3 = new StringBuffer();
		//-- StringBuffer �⺻ ������ ȣ��(�ν��Ͻ� ��������)
		//	 �⺻������ �����Ǵ� ������ ũ��� 16

		// capacity()
		System.out.println("����ũ�� : " + sb3.capacity());
		//--==>> ����ũ�� : 16

		System.out.println(sb3);
		//--==>> ��
		
		String name = "���̰�";
		name += "������";
		name += "�ֵ���";
		name += "�ӽÿ�";

		System.out.println(name);

		sb3.append("seoul");		//sb3 += "seoul";
		sb3.append("korea");		//sb3 += "korea";
		sb3.append("�츮����");		//sb3 += "�츮����";
		sb3.append("���ѹα�");		//sb3 += "���ѹα�";

		System.out.println(sb3);
		System.out.println(sb3.toString());
		//--==>> seoulkorea�츮������ѹα�
		//		 seoulkorea�츮������ѹα�

		// ���� ũ�� �ٽ� Ȯ��
		System.out.println("����ũ�� : " + sb3.capacity() );
		//--==>> ����ũ�� : 34  Ŀ��

		///////////////////////////////////////////////////////

		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());
		//--==>> JAVA AND ORACLE   
		// ��� �빮�ڷ� ���Ѱ��� �� ���ִ�.

		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp1.toLowerCase());
		//--==>> java and oracle

		//System.out.println(sb3.toUpperCase());
		//System.out.println(sb3.toLowerCase());
		//--==>> ���� �߻�(������ ����)

		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase());
		//--==>> SEOULKOREA�츮������ѹα�
	
		System.out.println(sb3.toString().toUpperCase());

		//--==>> SEOULKOREA�츮������ѹα�

		// seoulkorea�츮������ѹα�

		//�� ��� ���ڿ� (sb3)�� seoul �տ�
		//"�ѱ�"�̶�� ���ڿ� �߰��ϰ� ������
		//	�� �ѱ�seoulkorea�츮������ѹα�

		sb3.insert(0, "�ѱ�");		//
		System.out.println("seoul �տ� �ѱ� �߰� : " + sb3.toString());

		//�� ��� ���ڿ� (sb3)�� korea���ڿ� �ڿ�
		// "���"�̶�� ���ڿ� �߰�
		// ��, ��� ���ڿ��� �ε����� ������ Ȯ�������ʰ�...
		//	�� �ѱ�seoulkorea����츮������ѹα�

		// korea�ڿ� "���" �����ض� replaceAll????
		// �׷� a�� ã�ƾ���  11
		
		// ���� �� ��
		// System.out.println("korea" + sb3.replaceAll(" ","") + "�츮");
		// System.out.println(sb3.indexOf("a"));
		//--==>> 11
		// sb3.insert(12,"���");
		// System.out.println("korea �ڿ� ��� �߰� : " + sb3.toString());

		//--==>> korea �ڿ� ��� �߰� : �ѱ�seoulkorea����츮������ѹα�

		// �׽�Ʈ
		System.out.println(sb3.toString());

		// �׽�Ʈ2
		//sb3.insert(12,"���");
		//System.out.println("korea �ڿ� ��� �߰�" + sb3.stString());
 
		// �׽�Ʈ3
		//sb3.indexOf("korea");
		//System.out.println(sb3.indexOf("korea"));
		//--==>>7

		// �׽�Ʈ4
		//System.out.println(sb3.insert(sb3.indexOf("korea"),"���"));
		//--==>>�ѱ�seoulkorea����츮������ѹα�

		// �׽�Ʈ5
		System.out.println(sb3.insert(sb3.indexOf("korea") + "korea".length() ,"���"));
		//													  -------------5
		//--==>>�ѱ�seoulkorea����츮������ѹα�

		//�� ��� ���ڿ� (sb3) ���� 
		//���츮����  ���ڿ� ����

		//�츮���� �����Ϸ��� ���̴� 4�� 

		//sb3.delete(14,18);
		//System.out.println(sb3);
		//--==>> �ѱ�seoulkorea������ѹα�


		//--==>> �ѱ�seoulkorea����츮������ѹα�
		//System.out.println(sb3.delete(sb3.indexOf("���") + "�츮����".length(), "�츮����"));

		sb3.delete(sb3.indexOf("�츮����"),sb3.indexOf("�츮����") + "�츮����".length());
		System.out.println(sb3);
		//--==>> �ѱ�seoulkorea������ѹα�

		// ��� ���ڿ� ����
		// korea ���� ���ڿ� ����(korea ����)
		//--==>> �ѱ�seoul                     //      korea������ѹα�


		sb3.delete(sb3.indexOf("korea") ,sb3.indexOf("korea������ѹα�") + "korea��� ���ѹα�".length());
		// substring(m) ??
		System.out.println(sb3);
		// �ѱ�seoul

		// �ñ��Ѱ�
		// sb3.delete(sb3.indexOf("seoul") ,sb3.indexOf("korea������ѹα�") + "korea��� ���ѹα�".length());
		// System.out.println(sb3);
		// �ѱ�

		// sb3.delete(7,18);
		// System.out.println(sb3.toString());
		// �ѱ�seoul


		sb3.delete(sb3.indexOf("korea") ,sb3.length());
		System.out.println(sb3.toString());


		//���� ũ�� Ȯ��
		//System.out.println("���� ũ��  : " + sb3.capacity());

		//���ڿ��Ǳ��� Ȯ��
		System.out.println("���� ũ��  : " + sb3.length());

		// ���� ũ�� ����
		// ���� ���ڿ��� ��Ƶ� ���ִ� ������ ũ���
		sb3.trimToSize();

		//
		System.out.println("���� ũ��  : " + sb3.capacity());
		//--==>> ���� ũ�� : 7?????




	}
}