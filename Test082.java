/*===============================================
						�迭
	- �迭�� ����� �ʱ�ȭ
	- �迭�� �⺻�� Ȱ��
===============================================*/

// ����ڷκ��� �ο����� �Է¹ް�
// �Է¹��� �ο� �� ��ŭ�� �л� �̸��� ��ȭ��ȣ�� �Է¹ް�
// �̷��� �Է¹��� �����͸� �̸� �迭�� ��ȭ��ȣ �迭�� �����Ͽ�
// ����� ����� �� �ִ� ���α׷��� ����

// ���� ��)
// �Է� ó���� �л� �� �Է�(��, 1~10) : 27
// �Է� ó���� �л� �� �Է�(��, 1~10) : -5
// �Է� ó���� �л� �� �Է�(��, 1~10) : 3
// �̸� ��ȭ��ȣ �Է�[1](���� ����) : ���̰� 010-1111-1111
// �̸� ��ȭ��ȣ �Է�[2](���� ����) : ������ 010-2222-2222
// �̸� ��ȭ��ȣ �Է�[3](���� ����) : �ֳ��� 010-3333-3333

// ---------------------
// ��ü �л� �� : 3
// ---------------------
// �̸�   ��ȭ��ȣ
// ���̰� 010-1111-1111
// ������ 010-2222-2222
// �ֳ��� 010-3333-3333
// ---------------------
// ����Ϸ��� �ƹ� Ű�� ��������...

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
import java.util.Scanner;

public class Test082
{
	public static void main(String[] args) //throws IOException
	{
		// �� Ǯ�� --------------------------------------------------------------------------------

		/*
		int n;
		String name, pho;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		// ����ڷκ��� �ο��� �Է¹ޱ�
		
		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			n = Integer.parseInt(br.readLine());
		}
		while (n<1 || n>10);

		// �̸� ��ȭ��ȣ �Է� �ް� �迭�� �����ϱ�
		String[] stu = new String[n];
		
		for (int i=0; i<n; i++)
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ", i+1);
			name = sc.next();
			pho = sc.next();
			
			stu[i] = name + " " + pho;
		}

		
		// ��� ���
		System.out.println();
		System.out.println("---------------------");
		System.out.println("��ü �л��� : " + n);
		System.out.println("---------------------");
		System.out.println("�̸�   ��ȭ��ȣ");
		for (int i=0; i<stu.length; i++)
			System.out.println(stu[i]);
		System.out.println("---------------------");
		*/


		// ������ Ǯ�� ----------------------------------------------------------------------------
		
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		
		// ����ڰ� �Է��ϴ� �л� ���� ��Ƴ� ����
		int memberCount = 0;
		
		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			memberCount = sc.nextInt();
		}
		while (memberCount<1 || memberCount>10);

		// �׽�Ʈ(Ȯ��)
		// System.out.println("����ڰ� �Է��� �ο� �� : " + memberCount);
		// �� ����ڰ� �Է��� �ο� �� : 5

		// ����ڰ� �Է��� �ο����� ���� �̸� �迭�� ��ȭ��ȣ �迭�� ����

		// �ο� �� ��ŭ�� �̸� ���� �迭 ����
		String[] names = new String[memberCount];

		// �ο� �� ��ŭ�� ��ȭ��ȣ ���� �迭 ����
		// String[] tels = new String[names.length];
		String[] tels = new String[memberCount];

		// �ο� �� ��ŭ�� �ȳ� �޽��� ��� �� �Է°� ��Ƴ���
		// for (int i=0; i<names.length; i++)
		// for (int i=0; i<tels.length; i++)
		for (int i=0; i<memberCount; i++)
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ", (i+1));
			
			// ���� 010-1111-1111
			// ------
			names[i] = sc.next();

			// ���� 010-1111-1111
			//		  -------------
			tels[i] = sc.next();
		}

		// ���� ���(�̸�, ��ȭ��ȣ) ���
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("��ü �л� �� : %d��\n", memberCount);
		// memberCount == names.length == tels.length
		System.out.println("---------------------");
		System.out.println("�̸�   ��ȭ��ȣ");

		// �л� ����Ʈ
		for (int i=0; i<memberCount; i++)
			System.out.printf("%3s %14s\n", names[i], tels[i]);

		System.out.println("---------------------");
	}
}

// ���� ���
/*
	---------------------
	��ü �л� �� : 2��
	---------------------
	�̸�   ��ȭ��ȣ
	������  010-1111-1111
	�ڿ���  010-2222-2222
	---------------------
	����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/