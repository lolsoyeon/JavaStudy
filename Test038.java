
/*
======================================================================

������� �帧�� ��Ʈ�� (���)����
-if��
-if ~else ��
  
======================================================================
*/
//����ڷκ��� ������ ���� 5���� �Է¹޾�
//¦����, Ȧ���� �հ踦 ����ϴ� ���α׷��� �����Ѵ�,
//��, Scanner �� Ȱ�䤷�Ͽ� �����͸� �Է� ���� �� �ֵ��� �Ѵ�.

//���� ��)
//������ ���� 5�� �Է� (���� ����) : 1 2 3 4 5 

// >>¦���� ���� 6�̰�, Ȧ���� ���� 9 �Դϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������....


import java.util.Scanner;   //Scaaner�� IOE�ʿ����

public class Test038
{
	public static void main(String[] args)
	{
		//�ֿ亯�� ����

		//�������� ��� �� ���� �ʱ�ȭ check~!
		Scanner sc= new Scanner(System.in);
		int evenSum=0;	//¦���� ���� ���� ����(������) �������̶� 0 �� �ʱ�ȭ ��Ų��.
		int oddSum=0;		//Ȧ���� ���� ��� �� ����(������)
		int a, b ,c ,d ,e;
		// ����ڷκ��� �Է¹��� �ټ� ���� ������ ��� �� ���� ����


		//���� �� ó��
		System.out.print("������ ���� 5�� �Է� (���� ����) : "); // 1 2 3 4 5 
		a = sc.nextInt();
		b = sc.nextInt();
		C = SC.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();

		if(a % 2 ==0)  //a�� ¦�� �϶� evenSum �� a��ŭ ����
		
			//evenSum �� a��ŭ ����  (~��ŭ ����)��� ���� ���� ���� �־���Ѵ�.
			evenSum += a;

		
		else if	//             Ȧ�� �϶� addSum�� a��ŭ ����
			oddSum += a;
			//evenSum �� 1��ŭ ����
		if(b % 2 ==0)  //a�� ¦�� �϶� evenSum �� a��ŭ ����
			evenSum += b;
			//evenSum �� 1��ŭ ����

		else if //             Ȧ�� �϶� addSum�� a��ŭ ����
			oddSum += b;
			//evenSum �� 1��ŭ ����
		if(c % 2 ==0)  //a�� ¦�� �϶� evenSum �� a��ŭ ����
			evenSum += c;
			//evenSum �� 1��ŭ ����

		else if	//             Ȧ�� �϶� addSum�� a��ŭ ����
			oddSum += c;
			//evenSum �� 1��ŭ ����
		if(d % 2 ==0)  //a�� ¦�� �϶� evenSum �� a��ŭ ����
			evenSum += d;
			//evenSum �� 1��ŭ ����

			oddSum += d;
		else if	//             Ȧ�� �϶� addSum�� a��ŭ ����

			//evenSum �� 1��ŭ ����
		if(e % 2 ==0)  //a�� ¦�� �϶� evenSum �� a��ŭ ����
			evenSum += e;
			//evenSum �� 1��ŭ ����

		
		else	//             Ȧ�� �϶� addSum�� a��ŭ ����
			oddSum += e;
			//evenSum �� 1��ŭ ����

		System.out.printf("\n >> ¦���� ���� %d�̰�,  Ȧ���� ���� %d �̴�.\n",evenSum, oddSum);

		
	}
}




/*
		Scanner sc = new Scanner(System.in)
		int a, b, c, d ,e;
		String strResult;

		System.out.print("������ ���� 5�� �Է� (���� ����) : ");

		sc = new Scanner(sc.next()).useDilmiter("\\r*,\\r*");

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();

		String strResult;

		if(a % 2 ==0)
		{
			
		}

*/