/*======================================================================
�������ڹ� ���α׷��֡�����
-������ �ڷ���
-�ڹ� �⺻ ����� : System.in.read()


=======================================================================*/
/*
System.in.read() �޼ҵ�� (�Է� ��⿭�κ���) �� ���ڸ� �����´�.
��, �Է¹��� �ϳ��� ���ڸ� ���� �״�� �������°��� �ƴ϶�.
ASCII Code ������ ��ȯ�Ѵ�.��� Ű ���� �ƽ�Ű�ڵ�� ��ȯ ��*/

//���� ��)
//�� ���� �Է�      : A
//�� �ڸ� ���� �Է� : 9

//>> �Է��� ���� : A
//>> �Է��� ���� : 9
//����Ϸ��� �ƹ� Ű�� ��������......

import java.io.IOException;
import java.io.InputStreamReader;

public class Test015
{
	public static void main(String[] args) throws IOException
	{
		//�ֿ� ���� ����
		char ch;		//�Է¹��� ���ڸ� ���� ����
		int n;			
		//�߰� ���� ����
		//char temp;     //�ӽ÷� �߰� ������ ����

		//���� �� ó��
		//-����ڿ��� �ȳ� �޼���
		System.out.print("�� ���� �Է�      : ");
		ch = (char)System.in.read();			
		        //���   //�޼ҵ��̸�

		//�Է� ��⿭�� �����ִ� \r �� \n �� ��ŵ (�ǳʶٱ�)  �ʿ�!
		System.in.skip(2);
		//--�Ű�����(2)�� ���� �� ���ڸ� �о�� �ʰ� �ǳʶڴ�.(������.)
		System.out.print("�� �ڸ� ���� �Է� : ");
		//n = System.in.read();
		//temp = (char)System.in.read;
		n = System.in.read();
		// 1 - 49
		// 2 - 50
		// 3 - 51
		// 9 - 57

		//�Է¹���  n �� ���� 48��ŭ ���ҽ��Ѷ�~~~!!
		//���մ��� ������ 
		//a +;
		n -= 48;


		//��� ���
		System.out.println();
		System.out.println(">> �Է��� ���� : " + ch);
		//System.out.println("<<�Է��� ���� : " + n);
		//System.out.println(">> �Է��� ���� : "+ temp);
		System.out.println(">> �Է� �� ���� : " + n);


		//System.in.read();		�� ���� 1���� �����´�
		//���ʹ� (\r+\n)  ������??? 



		/* //�ֿ� ���� ����
		char ch;	//������
		int nA;
		InputStreamReader isr 

		//���� �� ó��
		System.out.println("���� �ϳ� �Է��ϼ���");	//A
		ch = (char)System.in.read();		//65  int Ÿ���ε� �ڵ�����ȯ ��Ģ ����
		
															
														//���� ���� ����ȯ
		isr = 
		System.out.println("�� �ڸ� ���� �Է��ϼ���");

		nA = System.in.read();


		//��� ���
		System.out.println(ch);
		System.out.println(nA);
		*/
		

	}
}

		/*//�ֿ� ���� ����
		char ch;				//������


		//���� �� ó��
		System.out.println("���� �ϳ� �Է��ϼ���");	//A
		ch = (char)System.in.read();						//65  int Ÿ���ε� �ڵ�����ȯ ��Ģ ����
															//���� ���� ����ȯ


		/*��� ���
		�� ���� �Է�      : A
�� �ڸ� ���� �Է� : 7

>> �Է��� ���� : A
>> �Է� �� ���� : 7
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .*/