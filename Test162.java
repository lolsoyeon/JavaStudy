                                                                                                                                           /*                                                            
   �����÷���(Collection) ���� 2022-07-27  ��
 =================================================*/

//�ڷᱸ�� ��ü ���� �� ���� ��
//����� ���� Ŭ���� Ȱ��
//�� �ڷ���
/*
�÷��� ��ü���� JDBC DB 

*/
//Ŭ���� �� ��������� �ڷ������� Ȱ��
import java.util.Vector;
import java.util.Iterator;                                                                    
class MyData
{
	//�ֿ� �Ӽ� ���� �� �ֿ亯�� ����(��� ����)
	private String name;			//�̸�
	private int age;				//����
              
	//getXxx() �� getter
	//setXxx() �� setter

	//getter / setter ����
	public String getName()		//���ͼ��� ����±�Ģ ���
	{
		return name;
	}

	public void setName(String name)	//���ý�Ű�ϱ� ���ƾ� �Ѵ�
	{
		this.name = name;				//���Ͱ� �ؾ� �� �ϳ� 
	}


	public int getAge()				//age�� getter 
	{
		return age;
	}

	public void setAge(int age)		//age�� setter
	{
		this.age = age;				//�ʱ�ȭ �ϴ�����
		
	}

	//������ (�Ű����� 2���� ������) �� ����� ���� ������
	public MyData(String name , int age)
	{
		this.name = name;
		this.age = age;
	}
	//�� ��������� �����ڰ� ������ ���
	//defaut �����ڰ� �ڵ����� ���Ե��� �ʱ� ������
	//defaut ������ ������ �����ڸ� ��������� �����ڷ�
	//�߰� �����ϰԵǴ°��� �Ϲ����� Ŭ���� �������
	//(�ݵ�� �����ؾ� �Ѵٴ� �������� ��Ģ�� ����)

	//������(�Ű����� ���� ������) �� ������ �ǹ̴�????????
	public MyData()
	{
		this("",0);
		name = "";
		age = 0;
	}

}

public class Test162
{
	public static void main(String[] args)
	{
		//���� �ڷᱸ�� ����
		Vector<MyData> v = new Vector<MyData>(); //<MyData>��ü�� ��Ƽ� ���ž�

		//���� �ڷᱸ�� v ��
		//������ 13�� / ���̰� 7�� /������ 3��
		//��Ƴ���
/*
		//��
		MyData st1 = new MyData();
		st1.setName("������");
		st1.setAge(13);
		v.add(st1);

		MyData st2 = new MyData();
		st1.setName("���̰�");
		st1.setAge(7);
		v.add(st2);

		MyData st3 = new MyData();
		st1.setName("������");
		st1.setAge(3);
		v.add(st3);   

		//��
		MyData st1 = new MyData("������", 13);
		v.add(st1);
		MyData st2 = new MyData("���̰�", 7);
		v.add(st2);
		MyData st3 = new MyData("������", 3);
		v.add(st3);
*/
		//��
		v.add(new MyData("������",13));
		v.add(new MyData("���̰�",7));
		v.add(new MyData("������",3));

		//���� �ڷᱸ�� v�� ��� ����(���) ��ü ����ϱ�
		//���࿹)
		//�̸� : ������, ���� 13��
		//�̸� : ���̰�, ���� 7��
		//�̸� : ������, ���� 3��

		//
		/*
		for (MyData obj : v)
		{
			System.out.printf("�̸� : %s, ���� %d��\n", obj.getName(), obj.getAge());
		}
		//==>>�̸� : ������, ���� 13��
		// 	 �̸� : ���̰�, ���� 7��
		//	 �̸� : ������, ���� 3��
		//����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/
/*
		//
		for (int i=0 ;i<v.size() ;i++ )
		{
			System.our.printf("�̸� : %s, ���� %d��", v.elementAt(i).getName(), v.elementAt(i).getAge());
		}
*/
		//�ٿ�ĳ����?
		for (Object temp : v)
		{
			System.out.printf("�̸� : %s, ���� %d��\n", ((MyData)temp).getName(), ((MyData)temp).getAge());
		}
		/*
		�̸� : ������, ���� 13��
		�̸� : ���̰�, ���� 7��
		�̸� : ������, ���� 3��
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

		*/



/*
		Iterator<MyData> it = v.iterator();

		while (it.hasNext())		//true true true true true true false
		{
			name = (String)it.next();	//���� ��� �ʷ� �Ķ� ���� ����
			System.out.printf("�̸� : %s , ���� %d��", name,age);	
		}
		System.out.println();
*/

		//for (int a : arr )
		//{
		//	System.out.print(a + " ");
		//}
		//System.out.println();


//���� �ڷᱸ�� v ��
		//������ 13�� / ���̰� 7�� /������ 3��
		//��Ƴ���

/*
		//���� �Ѱ�
		String[] names = {"������ 13��/","���̰� 7��/","������ 3�� /"};
		//int[] arr = {13, 7, 3};

		System.out.print("��� ���: ");
		for (String s : names )
		{
			System.out.print(s + " ");
		}
		System.out.println();
*/

	}
}