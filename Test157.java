/*=============================================
   �����÷���(Collection)  ���� 2022-07-27
 ==============================================*/
import java.util.Queue;
import java.util.LinkedList;

public class Test157
{

	//���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����","���","�ʷ�","�Ķ�","����","����"};

	public static void main(String[] args)
	{
		String val; 
		//Queeu �ڷᱸ�� ����
		Queue<String> qu = new LinkedList<String>();
		//- q�������̽� ����� �ν��Ͻ��� �����ϱ� ���ؼ���
		//new �����ڸ� �̿��Ͽ� Queue �������̽� implements ��
		// ���� Ŭ������ �����ڸ� ȣ���ؾ��Ѵ�.

		//qu ��� Queue �ڷᱸ����
		//colors �迭�� ������ �Է�

		for ( String s: colors )
		{
			//qu.add(s); �����Ѱ�
			qu.offer(s);
		}
		//qu��� Queue �ڷᱸ���� ��� ������ ��ü ���

		//peek()
		//: ť�� head ��Ҹ� ��ȯ�ϰ� �������� ������
		//  ť �ڷᱸ���� ����մ� ���°� �Ǹ� null�� ��ȯ

		// poll()
		//: ť�� head ��Ҹ� ��ȯ�ϰ� �����ϸ�
		//  ť �ڷᱸ���� ����ִ� ���°� �Ǹ� null�� ��ȯ

		while (qu.peek() != null)
		{
			System.out.print(qu.poll() + " ");
		}
		System.out.println();


/* ���� �� �� 
		while (qu.peek() != null)
		{
			//poll()
			//-- ť�� head��� ��ȯ .������.
			//   ť�� empty �� ��� null�� ��ȯ
			val = (String)qu.poll();

			System.out.println(val);

		}
		System.out.println();
*/		

	}
}