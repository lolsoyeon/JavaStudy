/*======================================================================

������� �帧�� ��Ʈ�� (���)����
-switch��
  ���� ���ù�
======================================================================*/

/* ���� ���ù��̶� �ϸ�, switch �� ������ ���� ���� ����
���� ������ ���� �������� �б��� �� ����ϴ� �����̴�.

���� �� ����
switch(����)
{
	case ���1 : ����1; [break;]
	case ���2 : ����2; [break;]

	[default : ����n+1; [break;]]
	
}

	switch ���� �����ġ� �� case �� ������� �� 
	byte, short, int, long �� �̾�� �Ѵ�.
	+ ����Ÿ�� (char)
	+ ���ڿ� (String)

case �� �ڿ� ��break;�� �� ���� ������ ���
���� case���� ������ ����ؼ�(�̾) �����ϰ� �ȴ�. (��⺻ ��)
��break;���� ���� �� ���
�ش� �����ؼ� ������ ���� �� switch ���� ����������. (���Ϲ� ��)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test041
{
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;
		int kor, eng, mat, tot;
		//double avg;
		int avg;
		//char gread;
		char gread='F';

		System.out.print("�̸� �Է� : ");
		name = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է� : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է� : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է� : ");
		mat = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		//avg = tot /3.0;
		avg = tot / 3;


			switch(avg/10)
		{
			case 10 : case 9 :  gread='A'; break;
			case 8 : gread='B'; break;
			case 7 : gread='C'; break;
			case 6 : gread='D'; break;

			//default: grade='F'; break;

		}

/*
		switch(avg/10)
		{
			case 10 : gread='A'; break;
			case 9 : gread='A'; break;
			case 8 : gread='B'; break;
			case 7 : gread='C'; break;
			case 6 : gread='D'; break;

			//defeult: grade='F'; break;

		}
*/

/*
		switch(avg/10)
		{
			case 10 : gread='A'; break;
			case 9 : gread='A'; break;
			case 8 : gread='B'; break;
			case 7 : gread='C'; break;
			case 6 : gread='D'; break;
			case 5 : gread='F'; break;
			case 4 : gread='F'; break;
			case 3 : gread='F'; break;
			case 2 : gread='F'; break;
			case 1 : gread='F'; break;


		}

*/



/*
		switch(avg)
		{
			case 100 : 'A' [break;]
		}



		switch(avg>=90)
		{
			90 : 'A' [break;]

		}
		switch(avg>=80)
		{
			80 : 'B' [break;]
		}
		switch
*/
/*
		if(avg>=90)   switch������?
		{
			gread='A'
		}
		else if(avg>=80)
		{
			gread='B'
		}
		else if(avg>=70)
		{
			gread='C'
		}
		else if(avg>=60)
		{
			gread='D'
		
		}
		else
			gread='F'



*/


		System.out.println();
		System.out.printf(">>����� �̸��� %s �Դϴ�.\n", name);
		//System.out.printf(">>������ %d, ����� %f�Դϴ�.\n",tot,avg);
		System.out.printf(">>������ %d, ����� %d�Դϴ�.\n",tot,avg);
		System.out.printf(">>����� %c  �Դϴ�.\n", gread);







	}
}