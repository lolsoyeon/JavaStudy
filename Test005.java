/*�ڹ��� ���� �� Ư¡
-������ �ڷ���
-Ű���� �� �ĺ���
- printf()
*/



public class Test005
{
	public static void main(String[] args)
	{
	
	//���� ����(�޸� Ȯ��) �� �ʱ�ȭ(�޸𸮿� �� �Ҵ�)
	int a=10, b=5;
	//��������
	int c, d;

	//���� �� ó��
	c =a + b;   //a + b�� ������� ���� c�� �����ض�.
	d =a - b;	//a - b�� ������� ���� d�� ���Է���.	


	//��� ���   10 + 5  = 15������
	
	System.out.println(a + " + "+ b + " = "+ c);

	//10 + 5 = 15

                    //���� ���ڿ� ���� ���ڿ� ����
	//�ڹٿ����� ���� �ٸ� �ڷ����� �����͵� ������ +�����̰���
	//�ٸ� � �ڷ����� ���ڿ� �������� +����� ���ڿ� 
	//��, ���ڿ� ���� �����ڷν��� +

	System.out.println("abcd");
	System.out.print("1234\n");
	// ���ڿ� �ȿ��� ���Ǵ� \n�� ���� ~~!!!

	//print () println()       printf() format()

	//printf() formet()
	//JDK1.5 ���� �����Ǵ� �޼ҵ�

	//System.out.printf(" o + o =o", 10, 20, 30);
	//����,�μ�,�Ķ���� 4��.

	//10���� ������
	System.out.printf("%d + %d =%d%n", 10, 20, 30);  // \n ����
	System.out.printf("%d + %d +%d\n",10, 20, 30);   // %n ����
	//--%d�� (10���� ������)�� ���� ���� �ɼ�




	//System.out.printf("s�� s\n", 10,3.14);
	//System.out.printf("%d �� %d\n", 10,3.14);
	//==>>���� �߻� (��Ÿ�� ����)
	
	System.out.printf("%d �� %f\n", 10,3.14);
	//10 �� 3.140000
	//--%f�� �Ǽ��� ���� ���� �ɼ�
	System.out.printf("%d �� %.2f\n", 10,3.14);
	//--==>>10�� 3.14
	//-- %.2f : �Ҽ��� ���� �� ��° �ڸ����� ǥ��
	System.out.printf("%f%n", 3.141592);
	//3.141592
	System.out.printf("%.4f%n", 3.141592);
	//3.1416
	//%.4f : �Ҽ��� ���� �� ��° �ڸ� ���� ǥ��
			//(�ݿø� �߻�)


	/*10 + 5 = 15
abcd
1234
10 + 20 =30
10 + 20 +30
10 �� 3.140000
10 �� 3.14
3.141592
3.1416
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/





	}
}