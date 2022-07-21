
/*===============================================
  ����Ŭ������ �ν��Ͻ�����
=================================================*/

//����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
//�ش� ������ �����ϴ� ���α׷��� �����Ѵ�.
//��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� ���ֵ��� �Ѵ�.
//(calculate Ŭ���� ����)

//���� ��)

//������ �� ���� �Է�(���� ����) : 10 5
//������ ������(+ - * /)		 : +
//>>10 + 5 = 15
//����Ϸ��� �ƹ� Ű�� ��������.....
import java.util.Scanner;
import java.io.IOException;

class calculate
{
	//�ֿ� ��������
	int a, b;		//�� ������ ���� a,b
	char op;		//�����ڸ� ���� op

	//�޼ҵ� ���� �� ������ �޾Ƴ��¿���
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("������ �� ���� �Է�(���� ����) : ");
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.print("������ ������(+ - * /)		 : ");
		op = (char)System.in.read();

	}
	//������ ����� �ϴ� �޼ҵ� (���� ���)
	int cal()
	{
		int result = 0;

		switch (op)
		{
		case '+':result = a + b;break;
		case '-':result = a - b;break;
		case '*':result = a * b;break;
		case '/':result = a / b;break;
		}

		return result;
	}

	//����� ����� �ϴ� �޼ҵ� ����

	void print(int s)		//>>10 + 5 = 15
	{
		System.out.printf(">> %d %c %d = %d\n", a, op, b, s);
	}

}
public class Test073
{
	public static void main(String[] args) throws IOException
	{
		calculate cal = new calculate();

		cal.input();		//������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��

		int r = cal.cal();	//������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ��

		cal.print(r);		//������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ��
		
	}
}
/*������ 

������ �� ���� �Է�(���� ����) :
90 80
������ ������(+ - * /)           : +
>> 90 + 80 = 170
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
