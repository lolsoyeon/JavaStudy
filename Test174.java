/*=====================================================
  �����ڹ��� �⺻ �����(I/O)  ���� 2022-08-01
  - Reader �ǽ�
 ======================================================*/

//Test172.java ���ϰ� ��~!~!

 import java.io.Reader;
 import java.io.InputStreamReader;
 import java.io.IOException;
 
public class Test174
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;
		
		// System.in : �ڹ� ǥ�� �Է� ��Ʈ�� �� ����Ʈ ��� ��Ʈ��
		//inputStreamReader : ����Ʈ��� ��Ʈ���� �� ���� ��� ��Ʈ������
		//					��ȯ�� �ִ� ���� ����
		// Reader        : ���� ��� ��Ʈ�� ��ü

		 Reader rd = new InputStreamReader(System.in);
	
		 System.out.println("���ڿ� �Է�(���� : ctrl+z)");
		 while ((data = rd.read()) != -1)
		 {
			 ch = (char)data;
			System.out.print(ch);



			//System.out.write(ch);
			/*
			���ڿ� �Է�(���� : ctrl+z)
			2324
			2324
			asdas
			asdas
			�����ٶ�
			 ��|
			^Z
			����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
			*/
		 }

	}
}