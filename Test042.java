/*======================================================================

������� �帧�� ��Ʈ�� (���)����
-switch��
  ���� ���ù�
======================================================================*/

//����ڷκ��� 1���� 3 ������ ���� �� �ϳ��� �Է¹޾�
//�Է¹��� ���� ��ŭ ������(��)�� Ǯ�µǴ� ���α׷��� �ۼ��Ѵ�.
//��, �� ���� ������� ������ �� �ֵ��� �Ѵ�.


//switch ���� �Ϲ� ���� ����Ͽ� �����Ѵ�.
//switch ���� �⺻ ���� ����ϵ�,
//break�� �� �� ���� ����� �� �ֵ��� �����Ѵ�.


//���� ��)
//������ ���� �Է�(1~3) : 3
//�ڡڡ�
//����Ϸ��� �ƹ� Ű�� �����ÿ�........

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test042
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;

		System.out.print("������ ���� �Է�(1~3) : ");
		n = Integer.parseInt(br.readLine());
		

		//case ��� ����Ʈ �����������
		switch (n)

		{

			case 3 : System.out.print("��");
			case 2 : System.out.print("��");
			case 1 : System.out.print("��\n");
				break;
			default : System.out.println("�Է¿���~!");
		
		}
			

/*������ ���� �Է�(1~3) : 2
�ڡ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

			
*/
		
	/*   switch(n) �������� �� ��1

		{
			case 1 : System.out.println("��");break;
			case 2 : System.out.println("�ڡ�");break;
			case 3 : System.out.println("�ڡڡ�");break;
			default : System.out.println("�Է¿���~!");// break; �Ϲݸ�
		}



		*/
		//System.out,println("����ġ ���� ����");

	
	}
}


/*		���� �� ��

		switch(n)
		{
			case 1 : ��; break;
			case 2 : �ڡ�; break;
			case 3 : �ڡڡ�; break;
		}
		System.out.printf("%d ,��",n);
		System.out.printf("%d ,�ڡ�",n);
		System.out.printf("%d ,�ڡڡ�",n);
	
*/
