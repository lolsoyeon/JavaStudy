/*==============================================
    	���� Ŭ���� ��� ����
		- �߻� Ŭ����(abstract) 2022-07-20
===============================================*/

/*
    �� �߻�Ŭ����(abstract)�� 
	���� �ְ� ���ǰ� ���� �ϳ� �̻��� �޼ҵ�(�߻� �޼ҵ�)�� ���� �޼ҵ�
	���� Ŭ����()���� �������̵�(Overriding) �� ������ ����Ǵ� �޼ҵ忡 ����
	�޸� ���� ���� �̸� ȣ�� ��ȹ�� �����α� ���� �����.

	�� ���� �� ����
	[�������� ������] abstract class Ŭ������
	{
		[�������� ������] abstract �ڷ��� �޼ҵ��([�Ű�����], ....);
	}

	�� Ư¡
	Ŭ������ ��� �ϳ� �̻��� �߻� �޼ҵ带 ���� �� ��
	�� Ŭ������ Ŭ�����վ� ��abstract��Ű���带 �ٿ�
	�߻� Ŭ������ ����ؾ��ϸ�,
	�߻� Ŭ������ ������ ��쿡��
	�ҿ����� ������ Ŭ�����̹Ƿ� ��ü�� ������ ������.
	�߻� �޼ҵ尡 �������� �ʴ� �߻� Ŭ���� ������
	��ü�� ������ �� ���°��̴�.

	��, �߻� Ŭ������ ���������� ������ �� ���� ������
	����� ���ؼ��� �����ϸ�
	�߻� Ŭ������ ��ӹ��� ���� Ŭ����������
	�ݵ�� �߻� �޼ҵ带 �������̵�(Overriding)�ؾ��Ѵ�.

	//���� Ŭ�������� �ݵ�� �߻� �޼ҵ带 �������̵� �ؾ��Ѵٰ� �ϼ̴µ�, 
	�߻� �޼ҵ��� ����� ��� ���ϰ� �߻� Ŭ������ ���赵�� �ϼ���Ű�� �Ǵ°� �ƴѰ���?

	��abstract�� Ű�����
	Ŭ������ �޼ҵ忡���� ����� �� ������
	��� ������ ���� ���� ������ ����� �� ����.
*/
//�߻� Ŭ����
abstract class SortInt115                //��
{
	private int[] value;//1

	protected void sort(int[] value)//2
	{
		this.value = value;
		sorting();
	}

	//�߻� �޼ҵ�
	protected abstract void sorting();//3

	protected int dataLength()//4
	{
		return value.length;
	}
	protected final int compare(int i, int j )//5
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
		
			return 0;
		
		else if (x > y)
		
			return 1;
		
		else 

		   return -1;
	}

	//��final Ű��������� 
	//�� Ŭ����(SortInt115)�� ��� �޴� Ŭ��������
	//�� �޼ҵ带 ������(Override) �� �� ����.
	protected final void swap(int i, int j)		//6
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}

}//end SortInt115

//SortInt115(�߻� Ŭ����)�� ��ӹ��� Ŭ���� �ϴ��� �߻� Ŭ����
//public abstract class Test115 extends SortInt115

//�߻� �޼ҵ带 �������̵��ؾ� �Ϲ� ���� Ŭ����

public class Test115 extends SortInt115				//��
{
	/*
	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}

	//�߻� �޼ҵ�
	protected abstract void sorting();

	protected int dataLength()
	{
		return value.length;
	}
	protected final int compare(int i, int j )
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
		
			return 0;
		
		else if (x > y)
		
			return 1;
		
		else 

		   return -1;

	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
	*/
	int i, j;
	static int[] data = {7, 10, 3, 28, 7};


	@Override
	protected void sorting()
	{
		//selection sort 
		//�����س��� ó�����س��� �޼ҵ带 �������ϸ�ȴ�.

		//�ν��Ͻ� �����Ұ�
		
		for (i= 0 ;i< dataLength()-1 ;i++ )
		{
			for (j = i+1;j<dataLength() ;j++ )
			{

				//ũ���
				if (compare(i,j)>0)
				{
					//�ڸ�
					swap(i,j);
				}
				
				}
			}
		}
	
	public static void main(String[] args)				//1
	{
		System.out.print("Source Data : ");
		for (int n : data )
		{
			System.out.print(n + " ");
		}
		System.out.println();

		Test115.ob = new Test115();
		ob.sort(data);

		System.out.print("Sourted Data : ");
		for (int n : data )
		{
			System.out.print(n + " ");
		}
		System.out.println();
		 
	}
}
/*

		for (int i= 0 ;i< dataLength()-1 ;i++ )
		{
			for (int j = i+1;j<dataLength() ;j++ )
			{
				int a = compare(i,j);
				switch (a)
				{
				case 0: continue;
				case 1 :swap(i,j); break;
				case -1 : continue;
				
				}
			}
		}
*/