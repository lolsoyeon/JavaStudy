/*
======================================================================

������� �帧�� ��Ʈ�� (���)����
-if��
-if ~else ��
  
======================================================================
*/
//1.���α׷��� �ۼ� �Ҷ� �־��� ���ǿ� ����
//	�б� ������ ���ϱ����� ����ϴ� �������
// if��, if~else��, ���� ������,���� if��(if�� ��ø)
//	,switch �����ִ�

//2. if���� if ������ ������ ���ϰ��
//	Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.

//����ڷκ��� ������ ������ �Է¹޾�
//������ ���� �ǰ� ����� ����ϴ� ���α׷��� �����Ѵ�.


//2�� ��� / 3�ǹ�� / 2�� 3�ǹ�� / 2�� 3�� ����ƴ�


//���� ��)

//������ ���� �Է� : 4
//4 �� 2�� ���
//����Ϸ��� �ƹ� Ű�� ��������...

//������ ���� �Է� : 9
//9 �� 3�� ���
//����Ϸ��� �ƹ� Ű�� ��������...

//������ ���� �Է� :12
//12 �� 2�� 3�� ���
//����Ϸ��� �ƹ� Ű�� ��������...

//������ ���� �Է� :17
//17 �� 2�� 3�� ��� �ƴ�
//����Ϸ��� �ƹ� Ű�� ��������...



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test034
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//�ֿ� ���� ����
			int n;
			

			//���� �� ó��
			System.out.print("������ ���� �Է� : ");
			n = Integer.paresInt(br.readLine());


			//��� ���
			if (n%2==0 && n%3==0)
			{
				System.out.println(n +"��2�� 3�ǹ��");

			}
			else if (n%2==0)
			{
				System.out.println(n + "��2�� ���");
			}
			else if (n%3==0)
			{
				System.out.println(n + "�� 3�� ���");
			}
			else if (n%2!=0 || n%3!=0)
			{
				
				System.out.println(n + "��2�� 3�� ��� �ƴ�");
			}
			else
			{
				
				System.out.println(n + "������ �Ұ�");
			}
			

			
		
	}
}
/*
			System.out.print("������ ���� �Է� : ");
			a = Integer.parseInt(br.readLine());

			if (a%3==0 && a%2==0)
			{
				System.out.println(a + " �� 2�� 3�ǹ��");
			}
			else if (a%2==0)
			{
				System.out.println(a +" �� 2�ǹ�� ");
			}
			else if (a%3==0)
			{
				System.out.println(a + " �� 3�� ���");
			}
			else				//������ �� �ƴϾ� ���ٴ� üũ����
			{
				System.out.println(a + "��2�� 3�� ����ƴ�");
*/