/*
======================================================================
�������ڹ� �⺻ ���α׷��֡�����
-������ �ڷ���
-�ڹ� �⺻ ����� : BufferedReader Ŭ����

=======================================================================
*/
//����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
//�̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.


//���� ��)
//�̸��� �Է��Ͻÿ� : ������
//���� ���� �Է� : 90
//���� ���� �Է� : 80
//���� ���� �Է� : 70

//====���====
//�̸� : ������
//���� : 240


import.java.io.BufferedReader;
import.java.io.InputStreamReader;
import.java.io.IOException;


public class 
{
	public static void main(String[] args) throws IOException;
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		//InputStreamReader isr = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader new InputStreamReader(System.in);


		//�ֿ� ���� ����
		String strName;
		int nKor, nEng, nMat;
		int nTot;
		String sterTemp;

		//���� �� ó��
		//����ڿ��� �ȳ� �޼��� ���
		System.out.print("�̸��� �Է��Ͻÿ� :");
		

		//����ڰ� �Է��� ��(�ܺε�����)�� ������ ��Ƴ���
		System.out.print("���� ���� �Է� : ");

		//����ڰ� �Է��� �� (�ܺ� ������)�� ������ ��Ƴ���
		strTemp = br.readLine();

		//��Ƴ� �����͸� ��ȯ�� �� �ʿ��� ������ �ٽô��
		nKor = Integer.parseInt(strTemp);

		//����ڿ��� �ȳ� �޼��� ���(���� ���� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		//����ڰ� �Է��� �� (�ܺ� ������)�� ������ ��Ƴ���
		strTemp = br.readLine();

		//��Ƴ� �����͸� ��ȯ�� �� �ʿ��� ������ �ٽ� ���
		nEng = Integer.parseInt(strTemp);
		//����ڿ��� �ȳ� �޼��� ���(���� ���� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		//����ڰ� �Է��� �� (�ܺ� ������)�� ������ ��Ƴ���
		strTemp = br.readLine();

		//��Ƴ� �����͸� ��ȯ�� �� �ʿ��� ������ �ٽ� ���
		nMat = Integer.parseInt(strTemp);

		//- �� ���� ������ ����ִ� ����Ŀ(����ڰ� �Է��� ������)����
		//	�����Ͽ� ������ �����ϰ� �� ����� ���� ������ ��Ƴ���
		nTot = nKor + nEng + nMat;

		//��� ���
		System.out.println("=====���======");
		System.out.printf("�̸� :%s\n",strName);
		System.out.printf("���� : %d\n", nTot); 

		
	}
}
		/*
		//�ֿ� ���� ����
		char a;
		int	b, c, d ;
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		c = Integer.parseInt(br.readLine());
		d = ();
		

		//���� �� ó��
		System.out.println("�̸��� �Է��Ͻÿ�");
		System.out.println("���� ���� �Է� :");
		System.out.println("���� ���� �Է� :");
		System.out.println("���� ���� �Է� :");

		//��� ���
		System.out.printf("�̸� : ");
		System.out.printf("���� : "a,b,c);*/
