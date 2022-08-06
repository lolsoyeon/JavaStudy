/*=====================================================
  �����÷���(Collection)  ���� 2022-07-28 ���� 5:58
 ======================================================*/

/*
�� List �������̽�
- ������ �ִ�,  �迭�� ����, �ߺ� ���
- �ֿ� ���� Ŭ����
	��Vector(����ȭ����)
	��ArrayList(����ȭ ������������)
	��LinkedList(ü��, ��ũ, ����, ť)
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Test166
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();	
		list.add("����");
		list.add("�λ�");
		list.add("����");
		list.add("�뱸");
		list.add("����");
		list.add("���");
		list.add("����");

		System.out.println(list);
		//--==>>[����, �λ�, ����, ���, ����, ���, ����]

		System.out.println("��ü ���� : " + list.size());

		//0~7�� ���� 
		System.out.println("ù ��° ��� : " + list.get(0));
	
		//������ ��� ���
		System.out.println("������ ��� :  "+ list.get(list.size()-1));


		///ó�� ��ġ�� "�ѱ�" �߰�
		 list.add(0, "�ѱ�");
		 System.out.println(list);


		 //ó�� ��ġ�� �����͸� "���ѹα�" ���� ����

		 list.set(0,"���ѹα�");
		 System.out.println(list);


		 //"���� "���翩�� Ȯ��
		 if (list.contains("����"))
		 {
			 System.out.println("������ �����մϴ�");
		 }


		//"����"�� ���° �ε����� ��ġ�ϴ��� Ȯ��
		int n = list.indexOf("����");
		System.out.println("n : "+ n);

	
		//���ѹα� �����
		//list.remove("���ѹα�");		//-(O)
		list.remove(0);					//-(O)
		System.out.println(list);


		//list �� ��ü ��� ���
	
		System.out.println("��ü ��� ���....��");
		for (int idx =0;idx<list.size() ;idx++ )
		{
			System.out.print(list.get(idx) + " ");
		}
		System.out.println();
		//--==>>��ü ��� ���....��
		//���� �λ� ���� �뱸 ���� ��� ����


		System.out.println("���� ���...��");

		for (int idx=list.size()-1;idx>=0 ;idx-- )
		{
			System.out.print(list.get(idx)+" ");
		}
		System.out.println();


		System.out.println("��ü ���....��");
		for (String s : list )
		{
			System.out.print(s + " ");
		}
		System.out.println();


		System.out.println("��ü ���.....��");
		Iterator<String> it = list.iterator();
		while (it.hasNext())
		{
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println();



		System.out.println("��ü ���......��");
		ListIterator<String> li = list.listIterator();
		while (li.hasNext())
		{
			System.out.print(li.next() + " ");
		}
		System.out.println();



		System.out.println("���� ���.....��");
		while (li.hasPrevious())
		{
			String s = li.previous();
			System.out.print(s + " ");
		}
		System.out.println();

	}
}