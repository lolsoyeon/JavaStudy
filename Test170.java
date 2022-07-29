/*=====================================================
  �����÷���(Collection)  ���� 2022-07-29  ���� 3:35
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
�� Hashtable <K, V> Ŭ����

-  ���� �ؽ����̺� ������ ��ü �𵨸� �� Ŭ������
	�˻��� �����ϱ� ������ ��� �󵵰� ���� �� ���Ѵ�.

-	�ؽ����̺��̶� Ű(Key) �� �׿� �����ϴ� ������(Value)��
	���е� ������ �����̴�.

-  �����͸� �����ϰ� ,  �˻��ϱ� ���ؼ� Ű(key)�� �����ϸ�
	�� ���������� Ű ���� �ο��ϸ� �ش� �����Ͱ� ��ȯ�ȴ�.

 -  ����,  Hashtable Ŭ������ key �Ǵ� value �� ������ null�� ������� �ʴ´�.

*/
import java.util.Hashtable;
public class Test170
{
	private static final String[] names
		={"������","������","�ֳ���","����","������","�ݺ���"};
	private static final String[] tels
		={"010-7202-6306","010-2546-0266","010-7236-0813","010-4016-6208","010-4151-5510","010-7193-4562"};



	public static void main(String[] args)
	{
		//Hashtable �ڷᱸ�� �ν��Ͻ� ����
		//<key,value> 
		Hashtable<String, String> ht = new Hashtable<String, String>();

		//ht ��� Hashtable �ڷᱸ����
		//�迭(names,tels)�� ����ִ� ������ ��ҷ� ��Ƴ���
		//�� put(k,v);�ڡڡ�
		for (int i = 0;i<names.length ;i++ )
		{
			 //ht.put("������", "010-7202-6306");�ڡڡڡڡ�
			 ht.put(names[i], tels[i]); 

		}
			//ht ��� Hashtable �ڷᱸ������
			//key �� �̿��Ͽ� ������ �˻�
			//�� get(k); �ڡڡ�
			String findName1 = "������";	 //"������"
			String str = ht.get(findName1);  //Ű�ѱ�� ����

			if (str != null) 
			{
				System.out.println(findName1 + " ��ȭ��ȣ : " + str);
			}


			//else
			//{
			//	System.out.println("���~!~!~!");//�˻����ó�� ������ �̷��� ����
			//}
			System.out.println();

			//--==>>������ ��ȭ��ȣ : 010-4151-5510



			//ht��� Hashtable �ڷᱸ���� key �� �����ϴ��� �� ����Ȯ��
			// �� containsKey() �ڡڡ�
			
			String findName2 = "�ֵ���";    //findNames2�ٲ㺸�� 
			if (ht.containsKey(findName2))
			{
				System.out.println(findName2 + " �����Ͱ� �����մϴ�");
			}
			else
				System.out.println(findName2 + " �����Ͱ� �������� �ʽ��ϴ�");
			

			String findName3 = "�ֳ���";

			if (ht.containsKey(findName3))
			{
				System.out.println(findName3 + " �����Ͱ� �����մϴ�.");
			}
			else
			{
				System.out.println(findName3 + " �����Ͱ� �������� �ʽ��ϴ�");
			}
			System.out.println();

			//ht��� Hashtable �ڷᱸ���� value �� �����ϴ��� 
			// contains() �ڡڡ�
			String findTel1 = "010-2546-0266";
			if (ht.contains(findTel1))
			{
				System.out.println(findTel1 + " �����Ͱ� �����մϴ�.");
			}
			else
			{
				System.out.println(findTel1 + "�����Ͱ� �������� �ʽ��ϴ�");
			}
			System.out.println();


			//ht��� Hashtable �ڷᱸ���� �ݺ��� �����ͻ���
			// ��remove()�� �ڡڡ�

			ht.remove("�ݺ���");

			// remove() �޼ҵ�� ���ڰ����� key �� �Ѱܹ�����
			//�� ��, key �� �����Ǵ� ���� �ƴϴ�.
			// �ش� key �� ����Ǿ�(���εǾ�) �ִ� value �� �Բ� ���ŵȴ�.

			//����(remove()) ���� key �� �����ϴ��� Ȯ��
			if (ht.containsKey("�ݺ���"))
			{
				System.out.println("�����̰� �����մϴ�.");
			}
			else
				System.out.println("�����̰� ��𰬾�???");
			
			System.out.println();

			//����(remove()) ���� value �� �����ϴ��� ����
			if (ht.contains("010-7193-4562"))
			{
				System.out.println("������ ��ȭ��ȣ�� �����մϴ�.");
			}
			else
				System.out.println("�����̰� ��ȭ��ȣ�� ���������ʽ��ϴ�.");
			
			System.out.println();
		
			// �� null���� ó��  �� null �ƹ��͵����� ���°�
			//�ֳ��ϸ� Hashtable�� null������������ϱ�
			//ht.put(null, null);				//--key, value ��� null
			//�����߻�( ��Ÿ�� ����)
			//--==>>NullPointerException
		
			//ht.put("������",null);			//value�� null
			//�����߻�( ��Ÿ�� ����)	
			//--==>>NullPointerException

			//ht.put(null,"010-8903-1234");		//key�� null
			//�����߻�( ��Ÿ�� ����)
			//--==>>NullPointerException

			//�ߺ��� key �Է�
			ht.put("������", "010-1111-1111");
			System.out.println(ht.get("������"));
			System.out.println();
			//--==>>010-1111-1111
			//�ߺ��� key�� Ȱ���Ͽ� �����͸� �Է��� ���
			//���� "010-2546-0266"���� 010-1111-1111 �� ����Ǿ����� Ȯ��
			


			//�ߺ��� value �Է�
			ht.put("���¹�","010-7202-6306");
			System.out.println(ht.get("������"));
			//--==>>010-7202-6306
			System.out.println(ht.get("���¹�"));
			//--==>>010-7202-6306

			//value�� �ߺ��Ȱ��� �ԷµǴ��� ���������Ϳ� �ƹ��� ������ ��ġ�� ����
			//�ʴ� ���� �� �ٸ����־� ���� �������ٰ� �ٵ� Ű�� ������

		}
}