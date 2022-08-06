/*=============================================
   ���� �÷���(Collection)  ���� 2022-07-28
 ==============================================*/
 /*
 List �� Vector, ArrayList, LinkedList,.....
 - ������ ����
 - �迭�� ����
 - �ߺ��� ���

 �� ArrayList Ŭ���� ��� �� ���� ��ǥ��

 - ArratList �� Vector Ŭ������ 
	List �� ũ�� ������ ������ �迭�� ������ ������
	�������� Vcetor Ŭ������ ��ü�� �⺻������ ����ȭ ������,
	ArrayList �� �׷��� �ʴٴ� ���̴�.

 - �񵿱�ȭ �÷����� ����ȭ �� �÷��Ǻ��� �� ���� ������ �����ϸ�
  ��������� �÷����� ���������ʴ� ���α׷�������
  �Ϲ������� ArrayList �� Vector ���� �� ��ȣ�ϸ�,
  Array �� ����ȭ�� ������� ���� Vectoró�� ���������ν�
  ������ ����ȭ�� ������ �δ��� ������ �ʱ� ������
  Vector ���� �� ������ ����ȴ�.

  - null �� ������ ��� ��Ҹ� ����ϸ�
  List �������̽��� �����ϴ� �� �ܿ� ����Ʈ�� �ݳ��ϱ�����
  ���������� ���Ǵ� �迭�� ����� �����ϴ� �޼ҵ带 �����Ѵ�.

 */
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.ListIterator;
public class Test165

{
	public static void main(String[] args)
	{
		// ArratList �ڷᱸ�� �ν��Ͻ�����
		 //ArrayList<String> list = new ArrayList<String>();	//
		 //Vector<String> list = new Vector<String>();			// �ȵǴ� �ڵ��
		// List<String> list = new Vector<String>();			// �� �ȵɱ�??

		List<String> list1 = new ArrayList<String>();

		// list1 �ڷᱸ���� ��� �߰� �� add()
		list1.add("���˵���2");
		list1.add("ž��2");
		list1.add("����2");
		
		List<String> list2 = new ArrayList<String>(list1);
		// list2 �� ��� �߰� add()

		list2.add("�μ���");
		
		List<String> list3 = new ArrayList<String>();

		// list 3�� list2�� ��ü��� �߰� addAll()
		list3.addAll(list2);		//�ݺ����Ⱦ��� �� �� �ѱ�� �߰����ȴ�


		// "ž��2" �տ� "���������" �߰��غ���

		// ��"ž��" ã�� indexOf() �� ��ġ �ε��� ��ȯ
		int n = list3.indexOf("ž��2");
		// --==>>n : 1

		// �� ž��2 ã�� �ε��� ��ġ ��������� ����
		list3.add(n,"���������");

		// System.out.println("n : " + n);
		// insertElementAt()
		//      0                          1
		// --==>>[���˵���2, ���������, ž��2, ����2, �μ���]
		// list3.insertElementAt("���������",1);
		// list3.set(1,"���������"); ž�Ǵ�� ��
		// list3.clear();


		// list3.add(1, "���������"); �����Ѱ� ����!~!~!


		// ��� �� ���̳����� Ȯ��
		System.out.println(); 
		System.out.println("========================");
		System.out.println(list1);
		// --==>>[���˵���2, ž��2, ����2]
		System.out.println(list2);
		// --==>>[���˵���2, ž��2, ����2, �μ���]
		System.out.println(list3);
		// --==>>[]

		// -addAll()�����
		// --==>>[���˵���2, ž��2, ����2, �μ���]
		System.out.println("========================");

		// ��� �� listIterator() �޼ҵ� Ȱ���Ͽ� ���

		 ListIterator<String> li= list3.listIterator();

		 while (li.hasNext())
		 {
			 System.out.print(li.next() + " ");
		 }
		System.out.println();

		// --==>>
		
		// ��� �� �������� ����
		 while (li.hasPrevious())
		 {
			System.out.print(li.previous() + " ");
		 }
		System.out.println();
		// ==>>�μ��� ����2 ž��2 ��������� ���˵���2

		
	}
}