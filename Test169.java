/*=====================================================
  �����÷���(Collection)  ���� 2022-07-29 
 ======================================================*/

// Set �� HashSet,  TreeSet
// - ������ ���� (����ָӴ�)
// - �ߺ��� ������� �ʴ� ����(�⺻)
/*
�� TreeSet<E> Ŭ����

 java.util.TreeSet<E> Ŭ������
 Set �������̽��� ����� SortedSet �������̽��� ������ Ŭ������
 �����͸� �߰��ϸ� �����͵��� �ڵ����� �������� ������ �ȴ�.

����� ��ü�϶� ����?
*/

//VO - Value Object					//�����Ͻ� ���� ����
//DTO - Data Transfer Object		// a->b �ǳױ� �տ��ִ°� 
//DAO - Data Access Object			//����� �־���

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class GradeVO
{
	//�ֿ� �Ӽ� ����
	private String hak;				//�й�
	private String name;			//�̸�
	private int kor, eng, mat;		//����, ���� ��������


	//������(����� ���� ������) 5���� �Ű������� ���� ������
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	//default ������ �ڵ� ���Ե�������

	//������(����� ���� ������) �Ű� �������� ������
	//--�Ű������� �������� �ʴ� �����ڸ� ��������� �����ڷ� �����Ͽ��� ������
	//	defaut �����ڰ� �ڵ����� ���Ե��� ���� ���� ����Ͽ�
	//	�߰��� ������ ������
	GradeVO()
	{
		this("" ,"", 0, 0, 0);
	}

	//getter/setter

	public String getHak()
	{
		return hak;
	}
	public void setHak(String hak)
	{
		this.hak = hak;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getKor()
	{
		return kor;
	}
	public void setKor(int kor)
	{
		this.kor = kor;
	}
	public int getEng()
	{
		return eng;
	}
	public void setEng(int Eng)
	{
		this.eng = eng;
	}
	public int getMat()
	{
		return mat;
	}
	public void setMat(int mat)
	{
		this.mat = mat;
	}

	//�߰� �޼ҵ� ����(���� ����)
	public int getTot()
	{
		//return kor + eng + mat; �� ���� ����
		return this.kor + this.eng + this.mat;
	}


	//���࿡ ��� �����̸�,,?????????? ����
	public int getAvg()
	{
		return (this.kor + this.eng + this.mat)/3;
	}


}

class MyComparator<T> implements Comparator<T>
{
	//�� �޼ҵ� ������
	@Override
	public int compare(T o1, T o2) 
	{
			GradeVO s1 = (GradeVO)o1;
			GradeVO s2 = (GradeVO)o2;

			//�й� ����
			//return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
			//return Integer.parseInt("2206113") - Integer.parseInt(2205115)
			//return 2206113  - 2205115
			//return -2;  

			//�й� ����(��������)
			//return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());

			//�й����� (��������) s1�� s2�� �ڸ��� �ٲ��� 
			//return Integer.parseInt(s2.getHak()) - Integer.parseInt(s1.getHak());
		
			//�������� ��������
			//return s1.getTot()- s2.getTot();
			//return Integer.parseInt(s1.getTot()) - Integer.parseInt(s2.getTot());
			//return 240 - 210
			//return 30
			//�������� ��������
			//return s2.getTot()- s1.getTot();


			//getName().charAt(0) - getName().charAt(0)

			//compareTo(String anotherString)

			// ȣ��T
			//return ������;
			return s1.getName().compareTo(s2.getName());
				 //---
			  //GradeVO
				  //-----------
				    //String
			

			//�̸����� (��������)
			//return s1.getName().compareTo(s2.getName());

			//�̸����� (��������)
			//return s2.getName().compareTo(s1.getName());
	}

}
public class Test169
{
	public static void main(String[] args)
	{
		//TreeSwt �ڷᱸ�� �ν��Ͻ�����
		TreeSet<String> set = new TreeSet<String>();

		//TreeSet�ڷᱸ�� set �� ��� �߰� �� add();
		set.add("�͸��� Į��");
		set.add("��Ž�� �ڳ�");
		set.add("����ť");
		set.add("���� �̸���");
		set.add("���ϸ�");
		set.add("���� ġ������ ���Ҹ�");
		set.add("������ ��庥ó");
		set.add("�̿��� �����");
		set.add("¯���� ������");
		set.add("�Ʊ���� �Ѹ� ������ �����");
		set.add("���� ���̺�");
		

		//Iterator �� Ȱ���� set ��� ��ü ���

		Iterator<String> it = set.iterator();
		while (it.hasNext())
		{
			System.out.print(it.next() + ",");
		}
		System.out.println();


		//--��Ҹ� ���ڿ��� ������ ���
		//	������ �� �������� ���� Ȯ��
		//	���� �� ���������� ���ؼ� �����Ѵ�.


		//TreeSet �ڷᱸ�� �ν��Ͻ� ����
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		//
		//					�� 
		//
		//MyComparatorŬ������ �����Ͽ�
		//compare() �޼ҵ带 �������� �� �ٽ� ����Comparator
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());

		//treeSet �ڷᱸ�� set2 �� ��� �߰�
		set2.add(new GradeVO("2206113", "������", 90, 80, 70));
		set2.add(new GradeVO("2206115", "�ֵ���", 80, 70, 60));
		set2.add(new GradeVO("2206128", "���α�", 88, 78, 67));
		set2.add(new GradeVO("2206139", "������", 70, 60, 50));
		set2.add(new GradeVO("2206150", "������", 99, 82, 72));

		//set2 �ڷᱸ�� ��ü ���

		/*System.out.print("set2 �ڷᱸ�� ���");
		for (String s : set2)
		{
			System.out.print( ((GradeVO)s).get + " ");
		}
		System.out.println();
*/
	/*
		//Iterator �� Ȱ���� et2 �ڷᱸ�� ���
		Iterator<GrradVO> it2 = set2.iterator();
		while (it2. hasNest())
		{
			System.out.print(it2.next() + " ");
		}
		System.out.println();
	*/
		//==>>���� �߻�(��Ÿ�� ����)

		//System.out.print( ((GradeVO)s).get + " ");
		//
		//					�� 
		//
		//MyComparatorŬ������ �����Ͽ�
		//compare() �޼ҵ带 �������� �� �ٽ� ����

/*
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			System.out.print(it2.next() + " ");
		}
		System.out.println();
		//--=>> 
		//
							��
*/
		//��ü ��ü�� ���� ����ϴ� ���� �ƴ϶�
		//��ü�� �����ִ� �Ӽ��� �����Ͽ� ����� �� �ֵ��� ó���ؾ���

/* �õ�
		Enumeration<GradeVO> it2 = set2.elements(); //���ͷ����� Ÿ���� ��ȯ��
		while (it2.hasMoreElements())
		{
			System.out.print(it2.next());
		}
		System.out.println();
*/		


		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			GradeVO	vo = it2.next();
			System.out.printf("%7s %7s %4d %4d %4d %6d %6d\n"
							,vo.getHak(), vo.getName() 
							,vo.getKor(), vo.getEng() ,vo.getMat()
							,vo.getTot(), vo.getAvg());
		}
		System.out.println();


/*
		Iterator<GradeVO> it1 = set2.iterator();
		while (it1.hasNext())
		{
			GradeVO vo = it1.next();
			System.out.println(vo.getHak() +" "+ vo.getName() +" "+ vo.getKor() +" "+ vo.getEng() +" "+ vo.getMat());
		}
		System.out.println();
		
*/

/*		�õ�
		Iterator<GradeVO> it2 = set2.iterator();
		System.out.println("��ü ��� ���....��");
		for (int idx =0;idx<set2.size() ;idx++ )
		{
			System.out.print(it2.get(idx) + " ");
		}
		System.out.println();

*/

		/* �й����� (��������)
		2206113     ������   90   80   70    240
		2206115     �ֵ���   80   70   60    210
		2206128     ���α�   88   78   67    233
		2206139     ������   70   60   50    180
		2206150     ������   99   82   72    253
		*/

		/* ��������
		2206150     ������   99   82   72    253
		2206139     ������   70   60   50    180
		2206128     ���α�   88   78   67    233
		2206115     �ֵ���   80   70   60    210
		2206113     ������   90   80   70    240
		*/

		//���� ���� (��������)


		//���� ���� (��������)
		/*
		2206150     ������   99   82   72    253
		2206113     ������   90   80   70    240
		2206128     ���α�   88   78   67    233
		2206115     �ֵ���   80   70   60    210
		2206139     ������   70   60   50    180
		*/

		//�̸����� (��������)

		//2206128     ���α�   88   78   67    233
		//2206113     ������   90   80   70    240
		//2206150     ������   99   82   72    253
		//2206139     ������   70   60   50    180
		//2206115     �ֵ���   80   70   60    210

		//�̸����� (��������)

		//2206115     �ֵ���   80   70   60    210
		//2206139     ������   70   60   50    180
		//2206150     ������   99   82   72    253
		//2206113     ������   90   80   70    240
		//2206128     ���α�   88   78   67    233

	}
}