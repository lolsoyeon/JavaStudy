
/*===============================================
  ����Ŭ������ �ν��Ͻ�����
  - ������ (Constructor)
=================================================*/

//- ������,�޼ҵ�� �⺻������ �ĺ����� ���� 

//������ �Ű������� ������ �Ű������� Ÿ���� �ٸ��� �����̵Ǵϱ� ���Ƶ��ȴ� ���� �޼ҵ� ���� �ε�
//������ ���ο��� �����ڸ� ȣ�� �� �� ������???

public class Test076
{
	int x;

	//	��	�������� �̸��� �׻� ���ܾ��� Ŭ������ �̸��� �����ؾ��ϸ�
	//		�ʿ��� ��� �μ��� �޾Ƶ��̴� �͵� �����ϰ�
	//		���� �̸��� �޼ҵ带 �����ϴ� �ߺ����ǰ� ����������
	//		���ϰ�(��ȯ��)�� ���� �� ����.

	// ��	�����ڴ� �ٸ� �Ϲ� �޼ҵ�ó�� ȣ�� �� �� ����
	//	   ��new�� �����ڸ� �̿��Ͽ� ��ü�� �����ϱ� ���� ȣ��Ǹ�,
	//		�� Ŭ������ �ν��Ͻ��� ��ü�� ������ �Ŀ�
	//		������ ��ü�� ����� �ʱ�ȭ ��Ű�� �۾��� �����ϰ� �ȴ�.

	Test076()
	{
		// �� ������ ���ο��� �ٸ� �����ڸ� ȣ���ϴ� ���� �����ϴ�.
		//	--------			 ---------  
		//   �޼ҵ�			      �޼ҵ�    ȣ�� �����ϴ�
		//   ������ , ������ ���ο��� ���� ���� ù��°��  ����Ǿ�� �Ѵ�. check~~!!!!

		//������ ���ο��� �Ǵٸ� �����ڸ� ȣ���ϴ� ����

		//Test076(100); �����⶧���� ��� ����Ѵ�

		this(100);

		x = 10;     //int x;

		System.out.println("���� ���� ������");
		//System.out.println("Test076�� �����ִ� x : " + this.x);
		System.out.println("Test076�� �����ִ� x : " + x);
	}
	
	//Test076(int num)							        	//�޼ҵ� ���� �ε�~!~!
	Test076(int num);			    //�ʱ�ȭ
		//x = xt x)		        //�Ű����� x�� �� ���� 
	{
		//x = n;				//�� �� �������� x

		//��this ��Ű����~!~! Ŭ������ �ҼӵǾ��ִ� Ŭ������ ã�ƶ�!
		//Test076.x = x;		// -- ������ ������ ���� �����.

		this.x = x;

		System.out.println("���ڰ� �ϳ��� ������");
		System.out.println("Test076�� �����ִ� x : " + this.x);
	}
	
	public static void main(String[] args)
	{
		//Test076 Ŭ���� ��� �ν��Ͻ� ���� �ϴ� ���� ���� class�̸� ������ð���
		Test076 ob1 = new Test076(); 
		Test076 ob2 = new Test076(100);
	}



	System.out.println()
	System.out.println("main ���� ob1.x : " + ob1.x);
	System.out.println("main ���� ob2.x : " + ob2.x);



/* ������

���ڰ� �ϳ��� ������					//line37
Test076�� �����ִ� x : 100				//line37
���� ���� ������
Test076�� �����ִ� x : 10
���ڰ� �ϳ��� ������
Test076�� �����ִ� x : 100		        //line 64
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .	//line64



*/
}
