
/*===============================================
  ����Ŭ������ �ν��Ͻ�����
=================================================*/

//����ڷκ�ó ������ ������ �Է¹޾�
//1���� �Է¹��� �� ������ ���� �����Ͽ�
//������� ����ϴ� ���α׷��� �����Ѵ�.

//��, ���ݱ���ó�� main()�޼ҵ忡 ��� ����� �����ϴ°��� �ƴ϶�
//Ŭ������ �ν��Ͻ� ������ Ȱ���Ͽ� ó���� ���ֵ��� �Ѵ�
//(Hap Ŭ���� ����)
//����, ������ �Է�ó�� �������� BuffrtrdReader �� readLine() �� ����ϸ�.
//�Է� �����Ͱ� 1���� �۰ų� 1000���� ū���
//�ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

//���� ��)
//������ ���� �Է�(1~1000) : 1050
//������ ���� �Է�(1~1000) : -45
//������ ���� �Է�(1~1000) : 100
//>>1 ~ 100 ������ �� : 5050


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	//�ֿ� ���� ����(������� �Է°��� ��Ƴ� ����)
	
	int su;	// 1���� 100������ ���� ���� ��������


	//������ = �Ӽ��� �Է� �޾ƾ��Ѵ�.
	//��� = 1���� �Է¹��� �� ���� ���� �����ؾ��Ѵ�.
	//  n<=1 or n>100 �ٽ� �Է¹��� �� �ֵ��� ��.�� �Ѵ�.



	//�Է±�ɸ� �� �޼ҵ���
	void input() throws IOException			
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.println("������ ���� �Է�(1~100) : ");

			su = Integer.parseInt(br.readLine());
		}
		while (su<1 || su>100);	
	}

	//���� ó�� �޼ҵ� ����
	int calculate()
	{
		int result = 0;			//������� �ްٴ�

		for (int i=1; i<=su; i++)
		{

			result += i;
		}

		return result;	 		//��ȯ���� ��
		
	}
	//��� ��� �޼ҵ� ����

	void print(int sum)
	{
		System.out.printf(">> 1 ~ &d ������ �� : %d\n ", su, sum);
		
	}

}
/*
	int n; throws IOException 

	System.out.print("������ ���� �Է�(1~1000) : ");

	n = Integer.parseInt(br.readLine());

*/

public class Test072
{
	public static void main(String[] args) throws IOException	
	{
		//Hap �ν��Ͻ� ����

		Hap ob = new Hap();

		//������ �ν��Ͻ��� �� �� �Է¸޼ҵ� ȣ�� �� input()
		//--------------------��
		//   ���� ���� Ȱ��
		ob.input();					//--new Hap().input();

		//������ �ν��Ͻ��� ���� ���� ó�� �޼ҵ� ȣ�� �� calculate()

		int s = ob.calculate();

		//������ �ν��Ͻ�(ob)�� ���� ��� �޼ҵ� ȣ�� �� print()
		//ob.print(ob.calculate());
		ob.print(s);
	}
}
