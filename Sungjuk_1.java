/*===================================================================
	 	Ŭ������ �ν��Ͻ�
	- Ŭ������ �ν��Ͻ� Ȱ��
===================================================================*/

// �л����� ��������, ��������, ���������� �Է¹޾�
// ����, ����� ����ϴ� ���α׷��� ����
// ��, Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
// ���� �� �������� �迭�� ���������� Ȱ���� �� �ֵ��� �Ѵ�
// Ŭ���� ����� ������ ���̵� ������ ���� ������ �� �ֵ��� �Ѵ�.

// 2. Sungjuk Ŭ����
//		- �ο����� �Է¹޾�, �Է¹��� �ο� �� ��ŭ
//		  �̸�, ��������, ��������, ���������� �Է¹ް�
//		  ������ ����� �����ϴ� Ŭ������ ������ ��
//		- �Ӽ� : �ο���, Record Ÿ���� �迭
//		- ��� : �ο��� �Է�, �� ������ �Է�, ���� �� ��� ����, ��� ���
import java.util.Scanner;
public class Sungjuk
{
	//�ֿ� �Ӽ� ����

	int inwom;		//�ο� ��
	Recore[] rec;   //Record �迭 �л� �� ��� Record �迭 �� �� �� Ȱ��
					//Record�� ������� ������ ��ü�� ��Ƴ����ִ� �迭

	//�ֿ� �޼ҵ� ����(��� ����)
	//�� �ο� �� �Է�
	public void set()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("�ο� �� �Է�(1~100) : ");
			imwon = sc.nextInt();
		}
		while (inwon<1 || imwon>100);

		//check~!~!
		//inwon������ŭ�� ��׸� ����
		//Record Ŭ������ ������� ������ ��ü(�ν��Ͻ�)�� ���� �� �ִ� 
		//�迭���� inwon��ŭ ������ ������
		//Record Ŭ������ �ν��Ͻ��� ���� �� ���� �ƴϴ�.
		rec = new Record[inwon];			//�ʴ��� �ο��� ��ŭ�� �׸��� �������
		
	}
	//�� �� ������ �Է�(���� �� ��� �����ϰ� ���� ��� ����) 
	public void input()//��������� �ȳ��ϰ� ����
	{
		Scanner sc = new Scanner(System.in); //for (int i = 0; i<rec.length ;i++ )

		String[] title = {"���� ���� : ", "���� ���� : ","���� ���� : "};

		//�ο� �� ��ŭ �ݺ� �� �ο� ���� ����Ͽ� ������� �迭�� ���̸�ŭ �ݺ�
		for (int i = 0;i<inwon ; i++)
		{
			//check~!~!
			//Record Ŭ���� ����� �ν��Ͻ� ����
			rec[i] = new Record();

			System.out.printf("%d��° �л��� �̸� �Է� : ",(i+1));
			rec[i].name = sc.next();
/*
			System.out.print("�������� : ");
			rec[i].kor = sc.nextInt();
*/
			/*
			System.out.print("�������� : ");  �� ���º��� ���ϰ� ������ �迭�� ��Ƶд�.
			rec[i].score[0] = sc.nextInt();
			System.out.print("�������� : ");
			rec[i].score[1] = sc.nextInt();
			System.out.print("�������� : ");
			rec[i].score[2] = sc.nextInt();
			*/
			for (int j = 0;j<title.length ;j++ )      // j<title[3]������? 0 1 2 
			{

				//�ȳ��޼������ �� ��û���� �ٵ������
				System.out.print(tilte[j]);

				//����ڰ� �Է��� �����͸� ���ھ�(score) �迭�� ��Ƴ���

				//title[j] = sc.next();
				rec[i].score[j] = sc.nextInt(); //score[0] ��������
												//score[1] ��������
												//score[2] ��������

				//�þ� ���� ���� ���� ����ó�� �ݺ������� �Է¹޴� ����
				//������ ���� ���� ����
				rec[i].tot += rec[i].score[j];
			}
			//��� �����ϱ�
			rec[i].avg = rec[i].tot / 3.0;
		}//end outer for

	}//end input

	//�� ������
	// ������ 90 80 70 240 xx.xx   2
	// ���̰� 92 82 72 xxx xx.xx   1
	// ������ 82 72 62 xxx xx.xx   3

	public void print()
	{
		//���μ��� ���� �޼ҵ� ȣ��
		rec.rank();

	{
		System.out.println();
		//�л� �� �� �� �ݺ� ��� ��������
		for (int i = 0;i<imwon ;i++ )	//for(int i = 0; i<rec.length; i++)
		{
			//�̸� ���
			System.out.printf("%5s", rec[i],name);

			//����(����, ����, ����) �ݺ� ���
			for (intj = 0;j<3 ;j++ )
			{
				System.out.printf("%4d", rec[i].score[j]);
			}

			//���� ���
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f",rec[i].avg);


			//check~!~!
			//���� ��� ���� �߰�~!
			System.out.printf("%5d", rec[i].rank);
		}
		System.out.println();
		
	}
	//�� ���� ���� �޼ҵ� �߰�
	//	- ���� �������� ���꿡 �ʿ��� �����Ͱ� �̹� �����ϴ� ��Ȳ �� �Ű����� �ʿ����
	//	Record �迭�� rank �Ӽ� �ʱ�ȭ ��� ���� �� ��ȯ�ڷ��� void
	// Ŭ���� ���ο��� Ȱ���� �޼ҵ�� ���� �� �������� ������ private

	private void ranking()
	{
		//��� �л����� ���(����, rank)�� 1�� �ʱ�ȭ
		for (int i = 0;i<inwon ;i++ )
		
			rec[i].rank = 1;

		//��� �����5���� ���ε�� 
		for (int i =0; i<inwon-1;i++ )		//�� �� �񱳱��� ��0   1    2   3 
		{
			for (int j = i+1;j<inwon; j++)		//�� �ο������ϱ�???
												//���� �񱳴�� 1234 234  34  4
			{
				if (rec[i].avg> rec[j].avg) //�񱳱����� ����� �� ����� ��պ��� ũ�ٸ� 
				{
					rec[j].rank++;	//�� ����� rank�� 1��ŭ ����
				}
				else if (rec[j].avg > rec[i].avg)
				//�񱳴���� ����� �񱳱����� ��պ��� ũ�ٸ�
				{
					rec[i].rank++:	//�񱳱����� rank �� 1��ŭ ����
				}
			}
		}
		
	}

}