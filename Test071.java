
/*===============================================
  ����Ŭ������ �ν��Ͻ�����
 -  Ŭ���� ����� ���� ��� ��ƴ�
=================================================*/

//CircleTest.java�� ��Ʈ~!~!

//���� ���̿� �ѷ����ϱ�
//���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�.
//Ŭ������ : CircleTest CircleTest.java
//BufferedaRead �� readLine()

//���� ���� = ������ * ������ * 3.141592
//���� �ѷ� = ������ * 2 * 3.141592

//���� ��)
//������ �Է� : xxx 

//>>�������� xxx�� ����
//>>���� : xxx.xxx
//>>�ѷ� : xxxx.xxx
//����Ϸ��� �ƹ� Ű�� ��������......

//import java.io.BufferedReader;  �� �ᵵ�� WHY? CircleTest class���� �ʿ��ߴ�.

import java.io.IOException;

public class Test071
{
	//������ �׻� �߿��ϴ� ���α׷��� ���۰� ���̶�.

	public static void main(String[] args) throws IOException
	{
		//CircleTest Ŭ���� ��� �ν��Ͻ� ����
		//CircleTest Ŭ���� �ν��Ͻ� ����
		//CircleTest ��ü ����

		CircleTest ob = new CircleTest();	//���� �ۿ÷����� ob��� �̸����� ���� ����
		
		ob.input();							//�����ڷ����̾�� �غ� �� �� �ʿ䵵 ����.
		
		double num1 = ob.calArea();	
		
		double num2 = ob.calLength();

		ob.print(num1, num2);

	}
}

/* ���� ���

������ �Է� : 6
>> �������� 6 �� ����
>> ���� : 113.10
>> �ѷ� : 37.70
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/