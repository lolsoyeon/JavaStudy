/*�ڹ��� ���� �� Ư¡
-������ �ڷ���
-������ �ڷ��� �ý� �� �׽�Ʈ : double
-������ ���� �ǽ�
============================================
*/


public class Test009
{
	public static void main(String[] args)
	{
		//������ ������ ������
		double a = 1 / 2;
		//double a = 0;          ����,���� �� �� ���� ���Ѵ� 
		//double a = 1.0 / 2;		   (o)
		//double a = (double)1 / 2;    (x)

		
		System.out.println("double a : " + a);
		// double a :0.0   int ->double �� ����ȯ

		double b = (double)1 /2;
		System.out.println("double b : "+ b);
		//double b : 0.5

		double c = 1/2 + 1/2;
		System.out.println("double c :"+ c);
		//double:c :0.0


		double d = 1 / 2.0;
		System.out.println("double d : "+d);




		//������ ����� �����Ͽ� �ǿ������� �Ǽ��� �ϳ��� ���ԵǸ�
		//������ �Ǽ������ ������ ����Ǹ�
		//����� ���� �Ǽ� ���·� ��ȯ�ȴ�.

		double e = 3/2 + 1/2;
		//double e = 1 +1/2;
		//double e = 1 + 0;
		//double e = 1;

		System.out.println("double e : "+ e);
		
		
		/*�������

		double a : 0.0
double b : 0.5
double c :0.0
double d : 0.5
double e : 1.0
*/

		
	}
}