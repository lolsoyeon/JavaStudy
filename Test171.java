/*=====================================================
  �����÷���(Collection)  ���� 2022-07-29  
 ======================================================*/

//Map �� Hashtable, HashMap

/*
�� java.util.Map �������̽���
	Ű(Key)�� ��(Value)�� ����(mapping) �ϸ�
	������ Ű�� ����� �� ����, �����ؾ� �ϸ�,
	�� Ű�� �� ���� ������ �����ؾ� �Ѵ�.
	��, �ϳ��� Ű�� �����ϴ� �ϳ��� ���� ���� �ڷᱸ���̴�.    �ڽ�
*/

/*
HashMap<K, V>Ŭ����
 - Hashtable Ŭ������ ���������� Map�������̽����� ��ӹ���
 HashMapŬ������ ����� Hashtable�� ����������
 Sychronization �� ���⶧���� ���ü� ������ ���ٸ�
 (��, ��Ƽ ������ ���α׷��� �ƴѰ�� ���)
 HashMap�� ����ϴ� ���� ������ ����ų�� �ִ�.

 - ����, HashMap�� Hashtable Ŭ������ �޸� null �� �� �����Ѵ�.

*/
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test171
{
	public static void main(String[] args) throws IOException
	{
		//HashMap �ڷᱸ�� �ν��Ͻ�����
		//HashMap<String, String> map = new HashMap<Stirng,String>();
		Map<String,String> map = new HashMap<String, String>();
		
		//map �̶�� Hashtable �ڷᱸ���� ��� �߰�
		// �� put(); �ڡڡڡ�
		map.put("��ȭ","���˵���");
		map.put("���","���¿�Ŭ��");
		map.put("��ȭ","������ũ");

		//�׽�Ʈ()�� ����Ȯ��
		System.out.println(map);
		//--==>>{���=���¿�Ŭ��, ��ȭ=���˵���, ��ȭ=������ũ}
		//--������ ���� ���� Ȯ��
		//--������ ��� �ݳ� ������ �߰� ������ ���� ����
		//������ �ĺ��� key�� �Ѵ�~~~~~~~~~~~~~~~~

		//�� null���� ó��
		// �Ʒ��� ������ �Է� ������ ���� ��� ������ ������ �Է��� ������������
		//������ null�� key�� ���ε� "�𳪸���"��
		//���� null�� key�� �����ϴ� null�� ����� ��Ȳ�� �߻��ϰԵȴ�.
		//��, HashMap�� null�� �ϳ��� ������ key�� �����Ѵ�.(�ν��Ѵ�.)

		//key�� value ��� null
		map.put(null,null);

		//�׽�Ʈ
		System.out.println(map);
		//--==>>{null=null, ���=���¿�Ŭ��, ��ȭ=���˵���, ��ȭ=������ũ}
		//		---------

		//value�� null
		map.put("��ȭ",null);
		//�׽�Ʈ ����Ȯ��
		System.out.println(map);
		//--==>>{null=null, ���=���¿�Ŭ��, ��ȭ=���˵���, ��ȭ=null, ��ȭ=������ũ}
		//														----------

		//key�� null ~~~~~~~~~~~~~~~~~~
		map.put(null,"�𳪸���");
		//�׽�Ʈ
		System.out.println(map);
		//--==>>{null=�𳪸���, ���=���¿�Ŭ��, ��ȭ=���˵���, ��ȭ=null, ��ȭ=������ũ}
		//		--------------										---------


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp;
		for (String str;(str = br.readLine()) != null; )
		{
			temp = str.split(",");
			if (temp.length< 2)
			{
				System.out.print("ī�װ�, Ÿ��Ʋ(�ĸ�����) : ");
				continue;
			}
			map.put(temp[0].trim(), temp[1].trim());
			System.out.println(map);


		}


	}
}