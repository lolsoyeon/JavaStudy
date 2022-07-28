/*=============================================
   �����÷���(Collection)  ���� 2022-07-27
 ==============================================*/
//Vector v = new Vector();
//--����ִ� Vector �ڷᱸ�� v ����

//Vector v = new Vector(8);
//--8���� �ʱ� elements ������ Vector �ڷᱸ�� v ����
//	�� �ڷᱸ���� Ȱ���ϴ� ��������
//	8���� ��� ä�����ԵǸ� (���ڶ�� �Ǹ�) �ڵ����� Ȯ��ȴ�.

//Vector v = new Vector(3,5); 
//--3���� �ʱ� elements ������ Vector �ڷᱸ�� v ����
//	�� �ڷᱸ���� Ȱ���ϴ� ��������
//	3���� ��� ä�����ԵǸ� (���ڶ�� �Ǹ�) �ڵ����� 5�� ����(Ȯ��)�ȴ�.

//�� ���ʹ� ������ ��ҷμ� ������, �Ǽ���, ���ڿ� ...����
//	��Ƴ��°��� �����ϴ�.(�� ����������.)
//   �� ������ ������ Ȯ�� check~!~!

//MyVector Ŭ���� ���� �� Vector Ŭ���� ���


//�̰����� �ڷ����� ���� instanceof ����ϱ�~!~!
import java.util.Iterator;
import java.util.Vector;

class MyVector extends Vector<Object>
{
	//Object obj;
	//������
	MyVector()
	{
		//Vector(����Ŭ����) ������ ȣ��
		//super();
		//��Vector();
		super(1,1);
		//ù ��° ���� : �־��� �뷮
		//�� ��° ���� : ������

	}
	void addInt(int i)
	{
		addElement(new Integer(i));
	}
	void addFloat(float f)
	{
		addElement(new Float(f));
	}
	void addString(String s)
	{
		addElement(s);
	}
	void addCharArray(char[] a)
	{
		addElement(a);
	}

	void addObject(Record rec)
	{
		addElement(rec);
	}

	void write()
	{
		/*
		//Iterator<Object> it = new v.iterator();
		//Iterator<Object> it = super.iterator();
		Iterator<Object> it = this.iterator();

		while (it.hasNext())
		{
			//rec = (Object)it.next();
			//System.out.print(rec + " ");
			System.out.println(it.next());

		}

		*/

		/*
		Object o;
		int length = size();

		System.out.println("���� ��� ����" + length);

		for (int i =0;i<length ;i++ )
		{
			o = elementAt(i);
			System.out.println(o);
		}
		*/
		Object o;
		int length = size();

		System.out.println("���� ��� ����" + length);

		for (int i =0;i<length ;i++ )
		{
			o = elementAt(i);
			//��instanceof�� ������

			//-- ó���ؾ��ϴ� ����� ��ü Ÿ�� Ȯ��
			if (o instanceof char[])
			{
				//System.out.println("���� �迭 : "+ o);
				//System.out.println("���� �迭 : " + o.toString());
				System.out.println("���� �迭 : " + String.copyValueOf((char[])o));
			}
			else if (o instanceof String)
			{
				System.out.println("���ڿ�: "+ o.toString());
			}
			else if (o instanceof Integer)
			{
				System.out.println("������ : "+ o);
			}
			else if (o instanceof Float)
			{
				System.out.println("�Ǽ��� : "+ o);
			}
			else
				System.out.println("Ÿ�� Ȯ�� �Ұ�~!~!");
		}


	}
}


public class Test159
{
	public static void main(String[] args)
	{
		MyVector v = new MyVector();

		int digit = 5;
		float real = 3.14f;
		String s = new String("�ȳ��ϼ���");
		char[] letters = {'s','t','u','d','y'};

		v.addInt(digit);
		v.addFloat(real);
		v.addString(s);
		v.addCharArray(letters);

		v.write();
		
	}
}

/*
������ 
���� ��� ����4
������ : 5
�Ǽ��� : 3.14
���ڿ�: �ȳ��ϼ���
���� �迭 : study
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/