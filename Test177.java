/*=====================================================
  ���ᰴü ����ȭ(Object Serialization)  ���� 2022-08-01
 ======================================================*/
/*
�� ��ü ����ȭ(Object Serialization) ��

	�޸𸮿� ������ Ŭ���� ��ü�� ��� ������ ���� ���¸�
	�״�� �����ؼ� ���Ͽ� �����ϰų�
	��Ʈ��ũ�� ���� ������ �� �ִ� �������
	��� ������ ���� �����Ѵٰų�(����)
	�ٸ� ��Ʈ��ũ�� �ִ� ȣ��Ʈ�� ���� ���� ��� ����ϰԵȴ�.

	��, ��ü ����ȭ�� ���빰�� ����Ʈ ������ ��ȯ�Ͽ�
	���� �Ǵ� ��Ʈ��ũ�� ���� �ۼ���(��Ʈ��)�� �����ϰ�
	������ִ� ������ �̶� , ��ü�� ��� ������ �޸𸮸����� ������ ���� ���Ѵ�.
								    ---------	

	����, �޼ҵ�� �����ڴ� ��ü ����ȭ�� ��󿡼� ���ܵȴ�.

�� ��ü ����ȭ�� ����

	��ü ��ü�� ������ ����� ���Ŀ� ���ֹ��� �ʰ�
	��ü�� ���Ͽ� ���������ν� ���Ӽ��� ������ �� ������
	��ü ��ü�� ��Ʈ��Ʈ�� ���� �ս��� ��ȯ�� ���ְ� �ȴ�.

	��ü ����ȭ�� �ڹ� 1.1 ���Ŀ� ���ԵǾ��µ�
	�� ������ RMI �� Bean �����̾���.
	RMI �� ���� ��ü ����� �����ؾ� �ϱ� ������
	��ü�� �״�� �̵��� �� �־�� �Ѵ�.
	���� �̸� �����ϱ� ���ؼ��� ��ü ����ȭ�� �ʼ����̾���.

	���� Bean �� ����� ���¿� ���� ������ ������ ��
	�� ��ü ����ȭ�� ����ϸ� ���ϰ� ��ü ���¸� ������ �� �ִ�.

 �� RMI(Remote Method Invocation)
	���� �ٸ� ���� �����ġ�� �����ϴ� �Լ���
	ȣ���ϰ� �����ϴ� ������ ����Ѵ�.
	���� �ٸ� ��� ������ ��ġ�� ������ ���� ��ü�� ����
	��� ������ �����ϴ� �������� �����ϸ� ���ڴ�.

 �� Bean(��)
	C/S ������ �𵨿��� ������ ������ �ش��ϸ�,
	���� ������ ����Ʈ���� ��ü�� ����� �ְ� �ϴ� ������Ʈ(ȣȯ) ���
	�ۼ��� ��ü�� ������ ���� �ϸ� ������Ʈ�� ���� ���Խ�ų �� �ֵ��� �Ѵ�.
	Ŭ���̾�Ʈ���� ���̶�� ���α׷� ������Ʈ�� �й��ϴ� ������� ó��.


�� Serializable �������̽�

	��ü ����ȭ�� �ϱ� ���� ���� ����ȭ�� �����ϵ���
	java.io.Serialxable �������̽��� ������ �־�� �Ѵ�.
	�� �������̽��� ��ü ����ȭ�� �����Ǿ�� �Ѵٴ� �����
	JVM�� �˷��ִ� ������ �����Ѵ�.
	���� Serializable �������̽���
	�ٸ� �������̽��� �޸� �����ؾ� �� �޼ҵ尡 ���� ������
	���� ���� ���ָ�ȴ�.

	�� ����)
	��
	public class Ŭ������ implements Serializable
	{
		//...���� �� �޼ҵ尡 ����.
	}

	��
	Serialxable �������̽��� ������ ��
	ObjectInputStream Ŭ������ ObjectOutputStream Ŭ������ �̿��Ͽ�
	��ü ������ ������� �����ϰ� �ȴ�.

	�� ��� ������ static ���� ����� ���
	(��, Ŭ���� �����ϰ��)
	��ü ����ȭ�� ��󿡼� ���ܵȴ�.

	�� Objet Stream

	java.io.ObjectInputStream
	ObjectInputStream Ŭ������ ObjectOutputStream Ŭ������ ����
	//(�⺻������ ����ȭ�� ���ԵǾ��ִ�)
	���Ͽ� ����Ǿ� �ִ� ��ü�� ��Ʈ��ũ�� ���� ���޵� ��ü��
	����ȭ�� �����ϴ� ����� �����Ѵ�
	��, java.io.Serializable �������̽���
	java.io.Externalizable �������̽��� �������ִ� ��ü�� ���ؼ��� ����� �����ϴ�.

	��, Serializable �������̽��� Externalizable �������̽���
	������ ��ü������ ����� �����ϴٴ� ���̴�.
	�� ��, readObject() �޼ҵ带 �̿��Ͽ�
	��Ʈ�����κ��� ����ȭ�� ��ü�� ���� �� ������
	
	�̷��� ���� ��ü�� �迭, ���ڿ� �Ǵ� �� ��ü ��
	������ ��(Type)���� ĳ���� ���־�� �Ѵ�.
	//(Object �� �ϴٰ� �ᱹ �ٿ�ĳ����)
*/
//���⼭ ���ͷ����� ����
import java.io.File;
import java.util.Hashtable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
//import java.io.IOException;

import java.util.Enumeration;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class Test177
{ 
	public static void main(String[] args) throws Exception
	{
		String appDir = System.getProperty("user.dir");

		//�׽�Ʈ(Ȯ��)
		//System.out.println(appDir);
		//--=>>	C:\JavaStudy

		//���� ��ü ����
		File f0 = new File(appDir, "\\data\\test.ser");
		//--appDir ��C:\JavaStudy
		//--appDir ��ġ�� ��������(�߽�����) "\\data\\test.ser"��
		//�����ϰڴٴ� �ǹ�.
		//-- ��������� ��C:\JavaStudy\data\test.ser�� ����.

		//�׽�Ʈ(Ȯ��)
		//System.out.println(f0.getParentFile().exists());
		//--==> false
		//��test.ser�������� ������� ���͸� ��ΰ� �����Ǿ� ���� �ʴ�.

		//�� ��C:\JavaStudy����ο� ��data�����͸� ������ �ٽ� Ȯ��

		//�׽�Ʈ(Ȯ��)
		//System.out.println(f0.getParentFile().exists());
		//--==>> true
		//��test.ser�������� ������� ���͸� ��ΰ� �����Ǿ� �ִ�.

		//��test.ser�������� ������� ���͸� ��ΰ� ���������� �ʴٸ�..
		if (!f0.getParentFile().exists())
		{
			//���͸��� ����ڴ�.
			f0.getParentFile().mkdirs();
		}

		//Hashtable �ڷᱸ�� �ν��Ͻ� ���� map�ڷᱸ��
		Hashtable<String, String> h1 = new Hashtable<String, String>();

		//������ h1 �̶�� Hashtable �ڷᱸ���� ��� �߰�
		h1.put("2206428","���ҿ�");
		h1.put("2206436","������");
		h1.put("2206512","�ӽÿ�");
		h1.put("2206524","������");
		h1.put("2206537","������");
		

		//�׽�Ʈ(Ȯ��)
		//System.out.println(h1.get("2206524"));


		//���� ���� ��� ��Ʈ�� ����(�������� ����)
		FileOutputStream fos = new FileOutputStream(f0);
		//-- ���� ���� ��� ��Ʈ��(���ٱ�)��
		//   f0 ��� ���� ��ü�� ���ڴ�.
		// InputStreamReder isr = new InputStreamReader(System.in);


		//��ü ���� ��� ��Ʈ�� ����
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//-- ��ü ���� ��� ��Ʈ��(���ٱ�)��
		//   f0 ��� ���� ��ü�� ���ڴ�.
		//BufferedReader br = new BufferedReader(isr);


		//���� line  152 ~ 159 �� ������ ����
		//ObjectOutputStram oos = ObjectOutputStram(new FileOutputStream(f0));

		//���� 164�� ����� ���� ����(���������� ������ ����)
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		//�� ObjectOutputStream Ŭ������
		//	��ü���� ����ϴ� ����� �����ϴ� Ŭ������
		//	��� ��Ʈ���� ����ϱ� ����
		//	���������� ��ü ����ȭ�� �����ϰ� �ȴ�.
		//	�ڹ� �⺻�� �����ͶǴ� ��ü����
		//	���Ͽ� �����ϰų� ��Ʈ��Ʈ�� ���� �����ϱ� ����
		//	������ ��ü�� ����ȭ �ϴ� ����� �����ϴ� ���̴�.


 		//������ ��Ʈ���� ������ ��ü�� ���
		oos.writeObject(h1);
		//--out.write(ch); �� ���� ������ ���� �ڡڡڡڡ�

		//��ü ���� ���ҽ� �ݳ� 
		oos.close();
		//ObjectOutputStream ���ҽ� �ݳ�

		//���� ���� ���ҽ� �ݳ�
		fos.close();
		//--FileOutputStream ���ҽ� �ݳ�

		//(��ü�� ����ȭ�Ͽ� ���Ϸ�) �������� ��~!~!~
		//����ȭ�� ���� ����!
		//---------------------------------------------------



		//(��ü�� ����ȭ�Ͽ� ������ ����) �о���̱� ����~~!~!

		//f0���� ��ü�� �����Ѵٸ�.... �����´� ������ �������� 
		if (f0.exists())
		{

			//f0������ ���� �Է� ��Ʈ��(fis, FileInputStream)���� �о���̰�
			FileInputStream fis = new FileInputStream(f0);

			//fis ���� �Է� ��Ʈ�����κ��� ��ü �Է� ��Ʈ��(ois, ObjectInputStream)�� ����
			ObjectInputStream ois = new ObjectInputStream(fis);

			//��ü�Է� ��Ʈ�� (ois,OutputStream)�� ���� �о���� ��ü(Object)��
			//ĳ����(Hashtable)�Ͽ�
			//h2��� Hashtable �ڷᱸ���� ��Ƴ���
			//Object obj = ois.readObject();

			Hashtable h2 = (Hashtable)ois.readObject();
			//							  ----------������Ʈ


			ois.close();
			//--ois,ObjectInputStream ���ҽ� �ݳ�

			fis.close();
			//--fis,FileInputStream ���ҽ� �ݳ�



			//�о���� h2 ��ü ���� Ȯ��

			String key;
			String value;

			//Itertaor ����� �� ����
			Enumeration e = h2.keys();

			while (e.hasMoreElements())
			{
				key = (String)e.nextElement();
			//-- Hashtable �ڷᱸ���� ������� key ���� �о���̴� ����
			}
			System.out.println(key); //?????



			value = (String)h2.get(key);
			//-- Hashtable �ڷᱸ���� ������� key �� Ȱ���Ͽ� value �� �о���̴� ����

			System.out.println(key + "��" + value);

		}











	}
}