/*=================================================================
   ���Ό�� ó��(Exception Handing) ���� 2022-07-26 ���� 2:03
 ==================================================================*/
/*
    ���α׷����� �߻��ϴ� ����(Error)��

	�� �߸��� ������ ����ϰų� �������� �������� ���� ���¿���
	��� �����ν� ������ �ܰ迡�� �߻��ϴ� �������� ������

	�� ���α׷��� �����ϴ� �������� �߻��Ǵ� ��Ÿ�� ����(Error)�� ���� �� �ִ�.

  - �����ڰ� ���� �м��� �߸��ϰų� �Ǽ��� ����
	������ ����� �������� �Ǵ� ������ ����(Error)��

 - �ý��� �̻󿡼� �߻��Ǵ� �ý��� ����(Error), �׸���

 - ���α׷� ���� �� �߻��Ǵ� ���������� ��Ȳ�� �ǹ��ϴ�
   ���ܻ���(Exception)�� �ִ�.

  ���� ���,
  � ���� 0���� �����ų�
  �迭�� �����ϴ� �������� ÷�ڸ� ����� ��Ȳ�� �߻��ϰų�...
  �������� �ʴ� ������ �����Ͽ� �о���δٰų�...

  ==> �����ڰ� �̷� ���� ������ �߻��� ��츦 �̸� �����Ͽ�
  ��ö�� �����ϱ� ���� ������ �����ϵ��� ������ �̸� ������ ���� ��.
  ��. ��. ó. ��

	�����س��� ����~! (�� Exception Ŭ����) ��, ���� ���� �޴���

  - ���ܴ� ���α׷� ���� �߿� �߻��� �� �ִ�
  ��ɾ��� �������� �帧�� �����ϴ� �̺�Ʈ��
  �ڹٿ��� ���ܴ� �ϳ��� ������Ʈ(Object, ��ü)�̴�.

  - ���α׷� �����߿� �޼ҵ�(����) �ȿ��� ����(Error)�� �߻��ϰ� �� ���,
  �޼ҵ�� �� ������ �ش��ϴ� ���� ������Ʈ�� �����
  �װ��� �ڹ� ��Ÿ�� �ý���(Runtime System)�� ������ �ش�.

  - �ڹٿ����� ��� ���� Ŭ������ Throwable Ŭ������
  Ŭ���� ���� Ŭ������ ��� �޾� ����Ѵ�. ��� ���ܴ� �������ִ�.

  - Throwable Ŭ������ ���ܸ� �����ϴ� �����̳�
  ���ܰ� �߻� �Ҷ��� ���α׷��� ���¿� ���� ������ �����ϰ��ִ�.

  - Throwable Ŭ�������� �Ļ��� Ŭ����

   �� Exception Ŭ����

   Exception ���� Ŭ������ �Ϲ������� ���α׷��ӿ� ����
   ������ �� �ִ� ���ܻ�������
   �޼ҵ尡 ���� �߿� ������ ���ܸ� ����Ų��.

   �� Error Ŭ����
   �ɰ��� ������ ���·� �����ڰ� ������ �� ���� ������ �����̴�.

   �� ������ ����

   - checked exception
   �޼ҵ� ������ ���ܰ� �߻��� ���
   �޼ҵ带 ������ �� ��throws�� ���� �޼ҵ� ������ �߻��� �� �ִ�
   ���ܵ��� ����� �ְų� �Ǵ� �� ���ܸ� ��try ~ catch���ؼ�
   ó���� �־�߸� �ϴ� �����̴�.
   �����Ϸ��� �������ϴ� ����������checked exception����
   ��throws�� �Ǵ°��� ���� Ȥ�� ��try ~ catch�� �Ǵ����� ���θ� �Ǵ��Ͽ�
   ���α׷����� ���ܸ� � ������ε� ó������ ������
   ������ ��ü�� �Ұ����ϴ�.

   - unchecked exception		 ArryIndex ��¼��.....
   ������ ó������ �ʾƵ� �����Ϸ��� üũ���� �ʴ�
   ��Ÿ�ӽÿ� �߻��� �� �ִ� �����̴�.

*/

/*
��java.lang.Trowable Ŭ������ �ֿ� �޼ҵ�

 -  String toString() 
	: Throwable ������ ���� ������ ���ڿ� ���·� ��ȯ�Ѵ�.
  - void printStackTrace(PrintStream s)
  - void printStackTrace(PrintStream w)
	: ǥ�� ��� ��Ʈ���� ���� ȣ�� ����� ������ �޼ҵ�� ���� ����Ѵ�.

  �ֿ� ��Ÿ�� ���� Ŭ����
   - ArihmeticException
   : ��ġ ������ ����(0���� ������ ��)

   -ArrayStoreException
   : �迭�� �߸��� ������ ���� �����Ϸ� ���� ��� �߻��ϴ� ����

   -IndexOutBoundsException
   : �迭, ���ڿ�, ���� ��� �ε��� �������� ��� ��� �߻��ϴ� ����

   - ClassCastException
   : Ŭ���� ��ȯ�� �߸��� ��� �߻��ϴ� ����

   - NullPointeException
   :  �� ��ü�� �����ϴ°��(�ʱ�ȭ ���� ���� ���� ��� ��) �߻��ϴ� ����

   - SecurityeException
   : �ڹ��� ���� ���� ������ �����Ͽ��� ��� �߻��ϴ� ����
*/

//IOException e
//System.out.println(e.toString());

//Exception e
//System.out.println(e.toString());  ��������??
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test147
{											//�����
	public static void main(String[] args) //throws IOException
	{

		// BufferedReader Ŭ���� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ֿ� ���� ����
		int a, b, c;
/*
		// �� 
		try
		{
			System.out.print("ù ��° ���� �Է�");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է�");
			b = Integer.parseInt(br.readLine());

			c = a + b;

			System.out.println("���  : " + c);
			
		}
		catch (IOException e)
		{
			// �߻���  IOException�� ......�����ض�
			// e�� �����ض� ��� ������ �� �ڸ�

			// IOException checked execption
			// �޼ҵ带 ���� �ϴ� �������� throws �� ����
			// ��Ƴ��ų� ������ ���� ���

			System.out.println(e.toString());
		}
*/

/*
		//�� 
		try
		{
			System.out.println("ù ��° ���� �Է�");
			a = Integer.parseInt(br.readLine());
			System.out.println("�� ��° ���� �Է�");
			b = Integer.parseInt(br.readLine());

			c = a + b;

			System.out.println("���  : " + c);
			
		}
		catch (IOException e1)
		{
			//�߻���  IOException�� ......�����ض�
			//e�� �����ض� ��� ����

			//IOException checked execption
			//�޼ҵ带 ���� �ϴ� �������� throws �� ����
			//��Ƴ��ų� ������ ���� ���
			System.out.println(e1.toString());   //Object�� �ִ� toString �������̵�
		}

		catch(NumberFormatException e2)

		{
			//NumberFormatException �� unchecked exception
			//--��Ÿ�� �� �߻��� �� �ִ� ���ܷ�
			// �ݵ�� ���� �ʿ䵵, ��Ƴ� �ʿ䵵 ����.
			System.out.println(e2.toString());
			System.out.println(">>���� ���·� �Է��ؾ� �մϴ�~!~!");
		}	
*/

/*
		//��
		try
		{
			System.out.print("ù ��° ���� �Է�");
			a = Integer.parseInt(br.readLine()); 
			System.out.print("�� ��° ���� �Է�");
			b = Integer.parseInt(br.readLine());

			c = a + b;

			System.out.println("���  : " + c);
			
		}
		catch (Exception e)		//IOException �� ���� ��ü�� Exception �̴�.
		{
			System.out.println(e.toString());   //Object�� �ִ� toString �������̵�
			System.out.ptintln(e.getMessage());
			System.out.println("printStackTrace...");
			e.printStackTrace();
		}

*/
		//etc
		try
		{
			System.out.print("ù ��° ���� �Է�");
			a = Integer.parseInt(br.readLine()); 
			System.out.print("�� ��° ���� �Է�");
			b = Integer.parseInt(br.readLine());

			c = a + b;

			System.out.println("���  : " + c);
			
		}
		catch (Exception e)
		{
			System.out.println(e.toString());   //Object�� �ִ� toString �������̵�
			System.out.println(e.getMessage());
			System.out.println("printStackTrace...");
			e.printStackTrace();
		}
		finally
		{
			//���ܰ� �߻��ϰų� �߻����� �ʰų� ������ ����Ǵ� ����
			System.out.println("��������̽��ϴ�. �����մϴ�.");
		}

	}
}