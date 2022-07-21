/*
======================================================================

������� �帧�� ��Ʈ�� (���)����
-if��
-if ~else ��

  
======================================================================
*/
//1.���α׷��� �ۼ� �Ҷ� �־��� ���ǿ� ����
//	�б� ���ؤ����� ���ϱ����� ����ϴ� ������
//IF��, if~else��, ���� ������,���� if��(if�� ��ø)
//	,switch �����ִ�

//2. if���� if ������ ������ ���ϰ��
//	Ư�� ������ �����ϰ��� �� �� ����˴� �����̴�.

//����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
//���������� ���·� ����ϴ� ���α׷��� �ۼ��Ѵ�.
//����� ��������� �������� ó���Ѵ�.

//90�� �̻�				: A
//80�� �̻� 90�� �̸�	: B
//70�� �̻� 80�� �̸�	: C
//60�� �̻� 70�� �̸�	: D
//60�� �̸�				: F

//�� BufferedReader �� Ȱ���� �����͸� �Է¹��� �� �ֵ��� �ϸ�,
//printf()�޼ҵ带 ���� ����� �� �ֵ��� �Ѵ�.


//���� ��)
//�̸� �Է� : �ڿ���
//���� ���� : 90
//���� ���� : 90
//���� ���� : 90

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test031
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//1.����ڷκ��� �̸��� �Է� �޴´�.

		System.out.print("�̸� �Է� : ");
		String strName = br.readLine();

		//2.����ڷκ��� ������ ������ �Է¹޴´�.
		
		System.out.print("���� ���� : ");
		String strKor = br.readLine();
		System.out.print("���� ���� : ");
		String strEng = br.readLine();
		System.out.print("���� ���� : ");
		String strMat = br.readLine();

		//3. ���ڿ� ���·� �Է¹��� ���� ������ ���� ���·� ��ȯ�Ѵ�.
		
		int nKor = Integer.parseInt(strKor);
		int nEng = Integer.parseInt(strEng);
		int nMat = Integer.parseInt(strMat);

		//4. ��� ������ ���� ������ ����� �����Ѵ�.
		int nTot = nKor + nEng + nMat;	//����
		double fAvg = nTot / 3.0;		//��� check~~!!!�Ǽ����·� ǥ��



		//5. ��޿� ���� ���� �˻縦 �����Ѵ�
		//char gread; �����Ͽ���
		char gread = 'F';						//���

		if(fAvg >= 90)	//���ǹ� ������������ ũ�� �񱳽� ���� �߿�
		{
			gread = 'A';
		}

		//<<<<<<<<<���̿� ���������� �ٸ��� ���� �� ��.���� �ϳ��� ����

		else if(fAvg >= 80)	//����� 90 �̸� ���� ����
		{
			gread = 'B';


		}
		else if(fAvg >= 70) //����� 80 �̸� ���� ����
		{
			gread = 'C';
		}
		else if(fAvg >= 60) //����� 70 �̸� ���� ����
		{
			gread = 'D';
		}
		//else  if�� �ܵ���밡�� else�� �Ұ���
		
		//{
		//	gread = 'F';
		//}


		//6. ������� ���
		System.out.printf("\n>>����� �̸��� %s�Դϴ�. %n", strName);
		System.out.printf(">>���� ������ %s,%n", strKor);
		System.out.printf(">>���� ������ %s,%n", strEng);
		System.out.printf(">>���� ������ %s,%n", strMat);
		System.out.printf(">>������ %d�̰�, ����� %.2f�Դϴ�.%n", nTot, fAvg);
		System.out.printf(">>����� %c �Դϴ�. %n", gread);

		
	}
}

/*      ������
�̸� �Է� : ���ҿ�
���� ���� : 90
���� ���� : 70
���� ���� : 30

>>����� �̸��� ���ҿ��Դϴ�.
>>���� ������ 90,
>>���� ������ 70,
>>���� ������ 30,
>>������ 190�̰�, ����� 63.33�Դϴ�.
>>����� D �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/