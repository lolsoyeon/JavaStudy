
/*
======================================================================

������� �帧�� ��Ʈ�� (���)����
-if��
-if ~else ��
  
======================================================================
*/
//1.���α׷��� �ۼ� �Ҷ� �־��� ���ǿ� ����
//	�б� ���ؤ����� ���ϱ����� ����ϴ� ������
//IF��, if~else��, ���� ������,���� if��(if�� ��ø)
//	,switch �����ִ�

//2. if���� if ������ ������ ���ϰ��
//	Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.

//����ڷκ��� ������ ���� �� ���� �Է¹޾�
//���������� ū�� ������ ����ϴ� ���α׷��� �����Ѵ�.


//���� ��)
//ù ��° ���� �Է� : 753
//�� ��° ���� �Է� : 42
//�� ��° ���� �Է� : 127


//>> ���� ��� 42 127 753
//����Ϸ��� �ƹ� Ű�� ��������...


/* ���� =  �� , �ڸ��ٲ�
	8		  20		75					123  87  65
	------��								---  ---
	-----			  ----					87 123  65
			------------					---     ---
											65  123  87
												--- ---
											65  87  123

*/

//1.  ù ��° ���� VS �� ��° ���� ũ���
// -> ù ��° ������ �� ��° �������� ũ�ٸ� ....�ڸ� �ٲ�
//2. ù ��° ���� VS �� ��° ���� ũ���
// ->  ù ��° ������ �� ��° �������� ũ�ٸ� ....�ڸ� �ٲ�

//3. �� ��° ���� VS ����° ���� ũ���
// ->  �� ��° ������ �� ��° �������� ũ�ٸ� ... �ڸ��ٲ�  ���� �� �����Ѵ�.


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test037
{
	public static void main(String[] args) throws IOException

	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b ,c; //����ڰ� �Է��ϴ� ������ ������ ��Ƶ� ����

		System.out.print("ù ��° ����  :");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ����  :");
		b = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ����  :");
		c = Integer.parseInt(br.readLine());

//1.  ù ��° ���� VS �� ��° ���� ũ���
// -> ù ��° ������ �� ��° �������� ũ�ٸ� ....�ڸ� �ٲ�
		if(a > b ) //�ڸ��ٲ� a �� b
		{
			a=a^b;
			b=b^a;
			a=a^b;
			//�ڸ��ٲ�
		}

		if(a > c)
		{
			c=c^a;
			a=a^c;
			c=c^a;
		}

		if(b > c)
		{
			b=b^c;
			c=c^b;
			b=b^c;
		}
		System.out.printf("\n>> ���� ��� : d%, %d, %d\n" , a, b, c);


	}
}

//else if () ������ �ϸ� ���Ĵٺ��� ��������  if�� ���
//2. ù ��° ���� VS �� ��° ���� ũ���
// ->  ù ��° ������ �� ��° �������� ũ�ٸ� ....�ڸ� �ٲ�

//3. �� ��° ���� VS ����° ���� ũ���
// ->  �� ��° ������ �� ��° �������� ũ�ٸ� ... �ڸ��ٲ�



/*
	int a, b, c;
		
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		c = Integer.parseInt(br.readLine());


		if( a > b )   //a, b, c �����ٸ�?    // if(a<=b<=c)?

		{
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}

		if( b > c)

		{
			b = b ^ c;
			c = c ^ b;
			b = b ^ c;
		}

		if( a > b)

		{
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}


/*
		else if()
		{

		}



		System.out.printf(">> ���� ��� : %d ,%d ,%d" ,a ,b ,c);
*/





