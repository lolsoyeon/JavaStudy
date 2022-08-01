/*=====================================================
  �����ڹ��� �⺻ �����(I/O)  ���� 2022-08-01
 ======================================================*/

//Reader Witer �ǽ�

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.IOException;

public class Test176
{
	public void process(InputStream is)		//System.in ���� ~!
	{
		int data;

		System.out.println("���ڿ� �Է�(����: ctrl+z)");

			try
			{
			//�Ű����� is��� ����Ʈ ��ݰ�ü(InputStream)��
			//���� ��Ʈ������ ��ȯ�Ͽ�
			//(�� InputStreamReader �� ����)
			//Reader Ÿ���� rd ���� ������ �� �ֵ��� ó��
			Reader rd = new InputStreamReader(is);				//System.in 
			//���� ��� �Է� ��Ʈ�� rd~!

			//����Ʈ ��� ��Ʈ���� �ڹ� ���� ��� ��Ʈ��(System.out)��
			//���� ��Ʈ������ ��ȯ�ϸ�
			//(�� OutputStreamWriter �� ����)
			//Writer Ÿ���� wt���� ������ �� �ֵ��� ó��
			Writer wt = new OutputStreamWriter(System.out);
			//���� ��� ��� ��Ʈ�� wt~!

				while ((data = rd.read()) != -1)
				{
					wt.write(data);		//--�������� ��Ʈ��(���ٱ�) �� data�� ���
					wt.flush();			//--����� ��Ʈ��(���ٱ�)�� �о� ������
				}

			}
			catch (IOException e)
			{
				System.out.println(e.toString());
				
			}
	}
	public static void main(String[] args)
	{
		Test176 ob = new Test176();
		ob.process(System.in);
	}
}

/*������

���ڿ� �Է�(����: ctrl+z)
12345
12345
SAASFDASDASD
SAASFDASDASD
���ٳ���
���ٳ���
������������^Z
������������
^Z
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/