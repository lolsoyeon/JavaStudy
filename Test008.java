
/*�ڹ��� ���� �� Ư¡
-������ �ڷ���
-������ �ڷ��� �ý� �� �׽�Ʈ : char

============================================
*/


public class Test008
{
	public static void main(String[] args)
	{

		//�ֿ亯�� ����
		char ch1, ch2, ch3;
		int a;					//üũ~~!!


		//���� �� ó��

		ch1 ='A';
		ch2 = '\n';	//���� ����  \n�� �ϳ��� ���ڷ� �ν�
		ch3 = '��';
		//a = ch1;        //üũ~~!!! �ڵ� ����ȯ ��Ģ����
		a = (int)ch1;     //üũ~~!!

		//--==����� ����ȯ (���� ����ȯ)
		System.out.printf("%c, %c, %c, %d%n", ch1, ch2, ch3, a);
	

		//��� ���

		System.out.println("ch1 : "+ ch1);
		// ch1 : A
		System.out.println("ch2 : "+ ch2);
		//ch2 : (����)
		System.out.println("ch3 : "+ ch3);
		//ch3 : ��
		System.out.println("a : "+ a);//����? 2��°���̽�
		//a : 65
		
/*
������
A,
, ��, 65
ch1 : A
ch2 :

ch3 : ��
a : 65
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .*/



	}
}