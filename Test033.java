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

//Ȧ��, ¦��		�� ���� if����
//Ȧ��, ¦�� , ��   ��  if �� ��ø

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args)throws IOException;
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;

		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		
		String result;
		if (n==0)
		{
			result = "��";
		}
		else if (n%2!==0)
		{
			result = "¦��";
		}

		else if (n%2!=0)
		{
			result ="Ȧ��";

		}

		//else
		//{
		//	resurt = "���� �Ұ�";
		//}


		


		if (n%2!=0)
		{
			System.out.println(n + "�� Ȧ��");
		}
		else if (n==0)
		{
			System.out.println(n + "�� ��");
		}
		else if (n%2==0)
		{
			System.out.println(n + "��¦��");
		}
		
		
		
		/*if (n%2==0)    (n%2==0)���� �̰ź��� �� ���������� ��
		{
			System.out.println(n + "��" + "¦��");
	
		}
		else if(n%2!=0)
		{
			System.out.println(n + " �� Ȧ��");

		}
		else
		{
			System.out.println(n + "�濵");
		}
		*/
	



	}
}