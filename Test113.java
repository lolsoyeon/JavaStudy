/*==============================================
    	���� Ŭ���� ��� ����
		- ���(Inheritance) 2022-07-19
===============================================*/
//������ ���� ���α׷��� �����Ѵ�.
//��, ����� ���並 �����Ͽ� �ۼ� �� �� �ֵ����Ѵ�.

//���� ��)
//������ �� ���� �Է�(���� ����) : 20 15
//������ �Է� (+ - * /): -
//>>20 - 15 = 5
//����Ϸ��� �ƹ� Ű�� ��������...

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class Aclass				//��
{
	protected int x,y;
	protected char op;
	
	Aclass()
	{
		
	}
	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f/n", x,op,y ,result);
	}
}

//Aclass �� ��ӹ޴� Ŭ������ ����
//Aclass�� �ڽ� Ŭ����
class Bclass extends Aclass		//��
{
	/*
	protected int x,y;
	protected char op;
	
	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f/n", x,op,y ,result);
	}
	*/
	
	Bclass()
	{
		//super();  �θ� Ŭ������ ȣ���ϴ� ����
	}


	//�Է¹ޱ����� ��ĳ�� �ν��Ͻ�����
	public boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.print("������ �� ���� �Է�(���� ����) : "); //"20 15" ��°�� ������ ���ڿ��� ����

		String temp = br.readLine();
		//�ع��ڿ�.split("������");
		//	���ڿ�.split("\\s")			 //������ �� ����
		//	ex) "10 20 30 40 50".split("\\s");
		// �� ��ȯ {"10", "20", "30", "40","50"}
		//	ex)"010-1234-4567".split("-");
		//�� ��ȯ {"010","1234","4567"}
		String [] strArr = temp.split("\\s"); ///���ڿ� �迭�� ��ȯ

		if (strArr.length != 2)

			return false;
		//	false�� ��ȯ�ϸ� input()�޼ҵ�����
		//	�� ������ �����Ͽ� if���� �����ϰ� �� ���
		//	�Ʒ� �����ؾ� �� �ڵ尡 �����ִ���
		//	�����(false)�� ��ȯ�ϸ� �޼ҵ�� ����ȴ�.
		
		x = Integer.parseInt(strArr[0]);  //�Է¹��� �������� x y�� ��´�
		y = Integer.parseInt(strArr[1]);


		System.out.print("������ �Է� (+ - * /): ");
		op = (char)System.in.read();
													//99.9% ������ �ȳ��� ã�Ⱑ �ʹ� �����.
		if (op != '+' && op != '-' && op != '*' && op != '/')//��������� �����̸� ����� ��û�����ؾ��Ѵ�
		{
			return false;
		}
		return true;
/*
		if (op=='+'|| op=='-'||op=='*'|| op=='/')
		{
			return true;
		}
		return false;
*/

	}//end input

	public double calc()
	{
		double result = 0;		

		switch (op)
		{
		case '+': result = x + y;break;
		case '-': result = x - y; break;
		case '*': result = x * y; break;
		case '/': result = (double)x / y; 
		}
		return result;	
	}

}//end class

public class Test113			//��
{
	public static void main(String[] args) throws IOException
	{

		Bclass ob = new Bclass();
		//ob.input();
		if (ob.input())
		{
			System.out.println("Error");
			return;
		}

		double result = ob.calc();

		ob.write(result);
	}
}

//���� ��)
//������ �� ���� �Է�(���� ����) : 20 15
//������ �Է� (+ - * /): -
//>>20 - 15 = 5
//����Ϸ��� �ƹ� Ű�� ��������...
/*
//�Է¹ޱ����� ��ĳ�� �ν��Ͻ�����
	public void input() throws IOException
	{
	Scanner sc = new Scanner(System.in);

	System.out.print("������ �� ���� �Է�(���� ����) : ");

	x = sc.nextInt();
	y = sc.nextInt();

	System.out.print("������ �Է� (+ - * /): ");
	op = (char)System.in.read();						//Test012?

	}

	public double switchs()
	{
	double result = 0;
	
		switch (op)
		{
		case '+':result = x + y;break;
		case '-':result = x - y;break;
		case '*':result = x * y;break;
		case '/':result = x / y;break;
			
		}
		return result;
	}
}

public class Test113			//��
{
	public static void main(String[] args) throws IOException
	{

		Bclass ob = new Bclass();
		ob.input();
		double result = ob.switchs();
		ob.write(result);
	}
}

*/
