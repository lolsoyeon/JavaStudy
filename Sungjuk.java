    /*===================================================================
	Ŭ������ �ν��Ͻ�
	- Ŭ������ �ν��Ͻ� Ȱ��
	- Test101�� ��Ʈ
===================================================================*/

// 2. Sungjuk Ŭ����
//		- �ο����� �Է¹޾�, �Է¹��� �ο� �� ��ŭ
//		  �̸�, ��������, ��������, ���� ������ �Է¹ް�
//		  ������ ����� �����ϴ� Ŭ������ ������ ��
//		- �Ӽ� : �ο���, Record Ÿ���� �迭
//		- ��� : �ο��� �Է�, �� ������ �Է�, ���� �� ��� ����, ��� ���

import java.util.Scanner;

public class Sungjuk
{
	Scanner sc = new Scanner(System.in);

	int n;				// �Է��� �л� ��

	// �ο��� �Է�
	public void input()
	{
		do
		{
			System.out.print("�ο� �� �Է�(1~100) : ");
			n = sc.nextInt();
		}
		while (n<1 || n>100);
	}

	// �� ������ �Է�
	public stu()
	{
		Record rec = new Record();

		// �л����� ���� ����� �� �迭
		Record[] arr = new Record[3];

		for (int i=0; i<arr.length; i++)
		{
			System.out.printf("%d��° �л��� �̸� �Է� : ", i);
			rec.name = sc.next();
			System.out.printf("���� ���� : ");
			rec.score[0] = sc.nextInt();
			System.out.printf("���� ���� : ");
			rec.score[1] = sc.nextInt();
			System.out.printf("���� ���� : ");
			rec.score[2] = sc.nextInt();
		}
		
	}
	
	
}