
/*===============================================
  ����Ŭ������ �ν��Ͻ�����
 -  Ŭ���� ����� ���� ��� ��ƴ�
=================================================*/

//Test071.java�� ��Ʈ~!~!

//���� ���̿� �ѷ����ϱ�
//���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�.
//Ŭ������ : circleTest CircleTest.java
//BufferedaRead �� readLine()

//���� ���� = ������ * ������ * 3.141592
//���� �ѷ� = ������ * 2 * 3.141592

//���� ��)
//������ �Է� : xxx 

//>>�������� xxx�� ����
//>>���� : xxx.xxx
//>>�ѷ� : xxxx.xxx
//����Ϸ��� �ƹ� Ű�� ��������......


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest{  

	//�ֿ� �Ӽ�(������) �� ��� ����

	int r;						//�������� ��������

	final double PI = 3.141592;	//������(������ ���ȭ)

	//�ֿ� ���(����, ����) �� ��� �޼ҵ�
	//������ �Է� ��� �� �޼ҵ� ����

	void input() throws IOException           //�޼ҵ��� �̸��� ����� ��õ
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ �Է� : ");

		r = Integer.parseInt(br.readLine());	//r�� �ʱ�ȭ ��ų�� �־���Ѵ�.
	}

	//���� ��� ��� �� �޼ҵ� ����     ���� 1.�޼ҵ��� �̸� 2. �޼ҵ�ȿ��� ��۾����� ��ų��?
	double calArea()
	{
		//���� ���� = ������ * ������ * 3.141592
		return r * r * PI;
		
	}
	//�ѷ� ��� ��� �� �޼ҵ� ����
	double calLength()
	{
		//���� �ѷ� = ������ * 2 * 3.141592
		double result;				//???

		result = r * 2 * PI;

		return result;
	}
	//��� ��� ��� �� �޼ҵ� ����

	void print(double a, double l)			//�̸� �޶󵵵�
	{
		
		/*>>�������� xxx�� ����
		>>���� : xxx.xxx
		>>�ѷ� : xxxx.xxx*/
		System.out.printf(">>�������� xxx�� ����\n" , r);
		System.out.printf(">>���� : ", a);
		System.out.printf(">>�ѷ� : " , l);
		
	}

}//end class

/*	
	double calLength()
	{
		double result;
		result = r * 2 * PI;	//���� �ѷ� = ������ * 2 * 3.141592
		return result;
	}

	double calAarea()
	{
		double result;

		result = r * r * PI;     //���� ���� = ������ * ������ * 3.141592

		return result;

	}

		void print(int a, int b)
	{
		System.out.printf("�������� %d�� ���� " + r);
		System.out.println(">>���� : " + a);
		System.out.println(">>�ѷ� : " + b); 
	}

			*/

//>>�������� xxx�� ����
//>>���� : xxx.xxx
//>>�ѷ� : xxxx.xxx
//����Ϸ��� �ƹ� Ű�� ��������......

			


/*���� �Ѱ� 

	int r;			//�������� ��������
	//int area;		//���̸� ���� ����
	//int length;		//�ѷ��� ���� ����

	final double PI = 3.141592;
	
		int input() throws IOException

		{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ �Է� : ");

		r = Integer.parseInt(br.readLine());
		

		//���� �� ó��

		//���
		
		double calLength()
		{
			double result;
			result = r * 2 * PI;	//���� �ѷ� = ������ * 2 * 3.141592
			return result;
		}

		double calAarea()
		{
			double result;

			result = r * r * PI;     //���� ���� = ������ * ������ * 3.141592

			return result;
	
		}

			void print(int a, int b)
		{
			System.out.printf("�������� %d�� ���� " + r);
			System.out.println(">>���� : " + a);
			System.out.println(">>�ѷ� : " + b); 
		}


			
		}
//>>�������� xxx�� ����
//>>���� : xxx.xxx
//>>�ѷ� : xxxx.xxx
//����Ϸ��� �ƹ� Ű�� ��������......

			

}//end class

*/