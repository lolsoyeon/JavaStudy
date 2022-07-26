
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;

public class Test143_1
{
	public static void main(String[] args) throws IOException
	{
		
		//BufferedReader Ŭ���� ��� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//CalendarŬ���� ��� �ν��Ͻ�����
		Calendar cal = Calendar.getInstance();

		//�ֿ� ���� ����
		int y,m;		// ��, ��
		int w;			// ����
		int i;			// ��������
		
		do
		{
			System.out.print("���� �Է� : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("�� �Է� : ");
			m = Integer.parseInt(br.readLine());
		}

		while (m<1 || m>12);

		//����ڷ� ���� �Է¹��� ��y ��m �� �̿��Ͽ�
		//�޷��� ��¥ ����
		cal.set(y,m-1 ,1);
		//- �� ������ �Է°��� �״�� ����ϴ� ���� �ƴ϶�
		//	�Է°����� 1�� �� ������ ���� �����ؾ� �Ѵ�.
		//- �� ������ �Է¹��� ��, ���� �ش��ϴ� 1�Ϸ� �����ؾ��Ѵ�.
		//	1���� ���� Ȯ�� �ʿ�~~!!!!!

		//���õ� �޷��� ��¥�κ��� ���� ��������
		w = cal.get(Calendar.DAY_OF_WEEK);

		//�׽�Ʈ
		//System.out.println(w);
		//--==>> 6 ��2022�� 7�� ���� ��ݿ��� ��2022�� 7�� 1���� �ݿ���~!

		//��� ��� ��޷±׸���
		System.out.println();
		System.out.println("\t[" + y +"��" + m + " ��]\n");
		System.out.println("  ��  ��  ȭ  ��  ��  ��  �� ");
		System.out.println("=============================");

		for (i=1;i<w ;i++)
		{
			System.out.print("    ");
		}
		//System.out.printf("%4d",1);

		//CalendarŬ���� getActualMaximum() �޼ҵ� üũ
		for (i=1;i<=cal.getActualMaximum(Calendar.DATE);i++ )
		{
			System.out.printf("%4d",i);
			w++;		//�ݺ����� �����ϸ� ��¥�� ������ ������
						//���ϵ� �Բ� � �� ���ֵ��� ó��
						//--������ ������ �Ͽ����� �� ������ 
			if (w % 7 ==1)
			{
				System.out.println();	//���� �� ��µ� �� �ֵ��� ó��
			}
		}

		
		if (w % 7 != 1)				//�Ͽ��� ������ ������� �ʾ��� ��쿡��
									//���� ó��   �˰ڴµ� ������...?
			System.out.println();
		System.out.println("=============================");

	
	
	}
}
