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
//	Ư�� ������ �����ϰ��� �� �� ����˴� �����̴�.

//����ڷ� ���� ������ ������ �Է¹޾�
//Ȧ��/ ¦���� �Ǻ��ϴ� ���α׷��� �����Ѵ�,
//��, ���� if������ Ȱ���Ͽ� ó�� �� �� �ֵ��� �Ѵ�.

//���� ��)
//������ ���� �Է� : 20
//>> 20��(��) ¦���Դϴ�.
//����Ϸ��� �ƹ�Ű�� 

//������ ����
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 

public class Test032
{
	public static void main(String[] args) throws IOException;

	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		
		System.out.print("������ ���� �Է� : ");

		int num = Integer.parseInt(br.readLine());

		if (num%2 == 0)
		{
			System.out.printf("%d�� ¦���Դϴ�.\n" ,a);
		}
		if (num*2 ! = 0)
		{
			System.out.printf("%d�� Ȧ���Դϴ�.\n", b);
		}
		

	}
}

/*

		System.out.print("������ ���� �Է� : ");
		int a;

		if ()	//Ȧ��,¦�� 
		{
			= "Ȧ��"
*/