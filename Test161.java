/*=============================================
   �����÷���(Collection)  ���� 2022-07-27
 ==============================================*/

//�˻� �� ����
import java.util.Vector;
public class Test161
{
	//���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors 
		= {"����","���","�ʷ�","�Ķ�","����","����"};


	public static void main(String[] args)
	{
			//���� �ڷᱸ�� ����
			Vector<String> v = new Vector<String>();

			//�����ڷᱸ�� v�� colors �迭�� �뿡�� ��ҷ� �߰�
			for (String color: colors )
			{
				v.add(color);
			}
			//���� �ڷᱸ�� �� ��ü ���
			System.out.print("��ü ��� ��� : ");
			for (String str : v )
			{
				System.out.print(str + " ");
			}
			System.out.println();
			//--==>>��ü ��� ��� : ���� ��� �ʷ� �Ķ� ���� ����


			String s1 = "��ȫ";

			//indexOf()
			int i = v.indexOf(s1);
			System.out.println(s1 + "�� index ��ġ : " + i);
			System.out.println();
			//--==>>��ȫindex ��ġ : -1
		

			String s2 = "���";
			//v.contains(s)
			//--���� �ڷᱸ�� v�� ã���� �ϴ� s �� ���ԵǾ��ִٸ�...
			//�� index ��ġ Ȯ��

			if (v.contains(s2))
			{
				 i = v.indexOf(s2);
				 System.out.println(s2 + "�� index��ġ : " + i);
		
				//�������ϴ����� ���θ� Ȯ���ϰ�
				//�����ִ��� Ȯ���ϰ�
				//��Ȯ�������� �����ض�(�����ض�)
				 v.remove(i);

			 //--==>>����� index��ġ : 1


			//ã�Ƽ� ������ �� ���Ǥ�ü ��� ���
			System.out.print("���� �� ��ü ��� ��� : ");
				for (String str : v )
				{
					System.out.print(str + " ");
				}
			}
			System.out.println();
			//--==>>���� �� ��ü��� ��� : ���� �ʷ� �Ķ� ���� ����

			System.out.println(v);

			//�� Ȯ�ο� ���� �����ʹ�
			//	���� ���(������)�� �ƴϱ� ������
			//	�̸� Ȱ���Ͽ� ������ �����ϰ� ó���ؼ��� �ȵȴ�.��

	}
}