/*�ڹ��� ���� �� Ư¡

����
������ �ο��� ������ ������ ����
���� ���̿� �ѷ��� ���ϴ� ���α׷��� �����Ѵ�.
	������ : 10
	���� ���� = ������ * ������ * 3.141592
	���� �ѷ� = ������ * 2 * 3.141592

���� ��)
���� : xxxxx

*/

public class Test010
{
	public static void main(String[] args)
	{
		//���� Ǯ���� ����
		/*int a = 10;
		double pi = 3.141592;
		double c = a*a*pi;
		double d = a*2*pi;


			System.out.println("���� : " + c);
			//���� : 314.1592
			System.out.println("�ѷ� : " + d);
			//�ѷ� : 62.83184	*/


			//�ֿ� ���� ����
		int r = 10;  //������
		final double PI = 3.141592; //������ 
		//--==> final Ű���� : ������ ���ȭ~!~!
		//RAINBOW_COLOR    PI
		//APPLE_PRICE	
		double area, length;

		//���� �� ó��
		//���� ���� = ������ * ������ * 3.141592   �ѱ����·� �������
		//���� �ѷ� = ������ * 2 * 3.141592
		//���� ���� = ������ * ������ * 3.141592

		area = r * r * PI;
		length = r * 2 * PI;



		// ������
		System.out.println("���� : " + area);
		System.out.println("�ѷ� : " + length);

		//System.out.printf("���� : %.3f\n",area);
		
		








	}
}