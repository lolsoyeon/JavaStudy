
/*����
- �ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
�� �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�.

���� ��)
�ﰢ�� ���� ���ϴ� ���α׷�
- �ﰢ���� �� �� �Է� : 3
- �ﰢ���� ���� �Է� : 5

>>�غ��� 3, ���̰� 5�� �ﰢ���� ���� : xxxx

//�ع��� �ν� �� �м�(�м� ����)
//	�ﰢ���� ���� = �غ� +���� / 2
//	����ڷκ��� �����͸� �Է¹޾� ó�� ��BufferedReader Ȱ��
//	BufferedReader �� ���� �� ���? �� �� ��� �ص��ȴ�.



*/

import java.io.BufferedReader;  //���赵 Ȯ�ο�
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{   
		
		//�ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
											//����Ʈ ����� ���ڷ� ����//(����Ʈ��� ��ȣ ��)


		//BufferedReader �ν��Ͻ� ����

		//�ֿ� ���� ����  , �غ� ���� ����
		int a; //�غ�   //int underLength, height;
		int b; //����
		double area; //���̴� �Ǽ� ���� check~!~!

		//a = Integer.parseInt(br.readLine());
		//b = Integer.parseInt(br.readLine());

		//���� �� ó��
		//������ڿ��� �ȳ� �޼��� ���
		//System.out.println("��ﰢ�� ���� ���ϴ� ���α׷���");
		//System.out.print("�ﰢ���� �� �� �Է� : ");
		//������ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� ��
		//      ����  underLength �� ��Ƴ���
		//underLegnth = Integer.parseInt(br.readLine());
		//���ٽ� ����ڿ��� �ȳ� �޼��� ���
		//System.out.print("�ﰢ���� ���� �Է� : ");
		//������ڰ� �Է��� ������(���ڿ�)�� ���� ���·� ��ȯ ����
		//   ���� height �� ��Ƴ���
		//���ﰢ���� ���ϴ� ���� ó��

		//area = underLength * height / 2; ���� ��� ���� (���� ���ϰ� �������� ����)
		//		 ������ / ������  / 2.0;   �Ǽ� ��� ����
/*�Ǽ� �ڷ����� ��������� ������ ��������
�Ǽ������ ������ �ʿ��� ��Ȳ�̴�.
������ 2 �� �ƴ� �Ǽ������� 2.0���� ������ ������ �����ϰԵǸ�
�� ������ �Ǽ�������� ó���Ѵ�.*/

		//area =(double)(underLength * height/ 2);  (X2)

		//��� ���
			
			//System.out.println();����
			//System.out.print();  ���� �߻� (������ ����)
			


			System.out.println("��ﰢ�� ���� ���ϴ� ���α׷���");
			//a = Integer.parseInt(br.readLine());

			System.out.print("�ﰢ���� �� �� �Է� : ");
			a = Integer.parseInt(br.readLine());


			//b = Integer.parseInt(br.readLine());
			System.out.print("�ﰢ���� ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

			area = a * b * 0.5;
			System.out.printf("�غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.1f\n", a ,b, area);
								



			/*��ﰢ�� ���� ���ϴ� ���α׷���
�ﰢ���� �� �� �Է� :
5
�ﰢ���� ���� �Է� :
5
�غ��� 5, ���̰� 5�� �ﰢ���� ���� : 12.5*/




/*  System.out.println("�ﰢ�� ���� ���ϴ� ���α׷�");
			System.out.println("�ﰢ���� �� �� �Է� : "+ a);
			System.out.println("�ﰢ���� ���� �Է�"+ b);

			System.out.printf();*/

		



	}
}