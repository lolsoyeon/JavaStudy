/*=============================================
   �����÷���(Collection)  ���� 2022-07-28
 ==============================================*/
 /*
 Enumration �� Iterator �������̽� 
 Collection Framwork ���� 
 Enumration ��� �������̽��� �ִ�.
 �������� �ǹ̷δ� �ݺ�, ��ȯ, �̶�� �ǹ̸� ������ ������
 � ��ü���� ������ ������,
 �� ��ü���� � ������ ���� �ϳ��� �����Ͽ� ����ϱ� ����
 �������̽���� �� �� �ִ�.

 - java.util.Enumeration<E> �������̽�
 : �� �������̽��� ���� �ΰ��� �޼ҵ常�� �����ϸ�
 ��hasMoreElements()���޼ҵ带 ����
 �������̽� �ȿ� ���� ��Ұ� �ִ����� ���� ���Ǹ� �Ѵ�.
 ���� true�� ��ȯ�Ǿ��ٸ� ���� �ε����� ��Ұ� �����Ѵٴ� �ǹ��̸�
 ��nextElement()�� �޼ҵ�� ���� ��Ҹ� ������ ����ϸ� �Ǵ� ���̴�.

 ex) v ��� ���� �ڷᱸ���� ����� ��� ��� ���
 for(Enumeration e = v.elements(); e.hasMoreElement();)
 {
	 System.out.println(e.nextElement());
 }


 - java.util.Iterator<E> �������̽�
 : Enumeration ���� �������� ���� remove()�޼ҵ尡 �߰��� �ͻ��̴�.
  Iterator �� �������ִ� ��hasNext()���� ��next()���޼ҵ��
  �̸��� �ణ �ٸ��� �������̽��� �������ִ�
  hasMoreElements()�� �׸��� ��nextElement()����
  ��Ȯ�� ��ġ�ϴ� ����� �����Ѵ�
  Enumeration ��� Iterator�� JDK1.2���� �߰��Ͽ� ����ϰ� �� ������
  Enumeration �������̽��� ���� ������ ��Ҹ� ������ ����� ���� ������
 �̸� �����ϱ� ���� ���°��� Iterator �������̽���.
 */

 import java.util.Vector;
 import java.util.Enumeration;
 import java.util.Iterator;
public class Test164
{
	public static void main(String[] args)
	{
		//���� �ڷᱸ�� �ν��Ͻ�����
		Vector<String> v = new Vector<String>();
		//���� �ڷᱸ���� �߰�
		v.add("java");
		v.add("Oracle");
		v.add("Jsp");
		v.add("Servlet");
		v.add("Spring");

		//�� Enumeration
		// -hasMoreElements()
		// -nextElement()
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		System.out.println();


		System.out.println("============================");
		//�� Iterator
		//- hasNext()
		//- next()

		Iterator<String> it = v.iterator(); //���ͷ����� Ÿ���� ��ȯ��
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println();

		/*
		java
Oracle
Jsp
Servlet
Spring

		*/
	}
}
