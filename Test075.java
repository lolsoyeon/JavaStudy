

/*===============================================
  ����Ŭ������ �ν��Ͻ�����
  - ������ (Constructor)
=================================================*/


class NumberTest2
{
	int num;


	//NumberTest2()
	//{
		//����Ʈ ������
	//}

	//�ػ���� ���� �����ڰ� ���ǵǾ������Ƿ�
	//  default �����ڰ� �ڵ����� ���Ե��� ����~~~!!!

	//������ �� ����� ���� ������
	NumberTest2(int n)
	{
		num = n;
		System.out.println("������ ȣ��� �Ű����� ���� : " + n);
		
	}

	int getNum()
	{
		return num;
	}

}

public class Test075
{
	public static void main(String[] args)
	{	
		//NumberTest2 �ν��Ͻ� ����
		//    NumberTest2 ob1 = new NumberTest2();
		//--==>>���� �߻�(������ ����)

		//-----	NumberTest2Ŭ��������
		//		����� ���� �����ڰ� �����ϰ� �ִ� ��Ȳ�̱⶧����
		//		dufault �����ڰ� �ڵ����� ���Ե��� ������
		//		����ڰ� ������ �����ڴ� �Ű������� �´� �����̱� ������
		//		���Ͱ��� �Ű����� ���� �����ڸ� ȣ���ϴ� ������ ������ ���� �߻��ϰԵȴ�.

		NumberTest2 ob1 = new NumberTest2(10);
		//--==>>������ ȣ��� �Ű����� ���� : 10 


		System.out.println("�޼ҵ� ��ȯ �� : " + ob1.getNum());
		//--==>>�޼ҵ� ��ȯ �� : 10
	
		System.out.println("ob.num : " + ob1.num);
		//--==>>ob.num : 10


		NumberTest2 = new numberTest2(3654);


		System.out.println("�޼ҵ� ��ȯ �� : " + ob2.getNum());


		System.out.println("ob2.num: " + ob2.num);
	}
}
