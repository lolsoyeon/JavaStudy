/*=================================================================
   ���Ό�� ó��(Exception Handing) ���� 2022-07-26 
 ==================================================================*/

 //�ٸ� ���� �ٽ� ������ ���� ��Ʈ��

public class Test153
{

	public int getValue(int value) throws Exception		//���� ������ (�Ķ�)
	{
		int a = 0;

		try
		{
			a = getData(-2);							//�� ���� �߻� (����)

		}
		catch (Exception e)								//�꿹�� ��Ƴ���(����)
		{
			//�뿹�� ó�� (����)
			System.out.println("printStackTrace.......");
			e.printStackTrace();

			//check~!~!
			//�쿹�� �߻� (�Ķ�)
			throw new Exception("value �� �����Դϴ�.");			
		}
		
		return a;
	}

	public int getData(int data) throws Exception		//�迹�� ������ (����)
	{
		if (data<0)
		{
			throw new Exception("data�� 0���� �۽��ϴ�."); //�翹�� �߻� (����)
		}
		return data + 10;
	}


	public static void main(String[] args)
	{
		Test153 ob = new Test153();

		try
		{
			int a = ob.getValue(-2);				//��� �߻� (�Ķ�)

			System.out.println("a : " + a);		
		}
		catch (Exception e)							//�￹�� ��Ƴ���(�Ķ�)
		{
			//�𿹿� ó��(�Ķ�)
			System.out.println("printStackTrace......");
			e.printStackTrace();
		}
			
	}
}
/*
printStackTrace.......��
java.lang.Exception: data�� 0���� �۽��ϴ�.
        at Test153.getData(Test153.java:38)
        at Test153.getValue(Test153.java:16)
        at Test153.main(Test153.java:49)

printStackTrace......��
java.lang.Exception: value �� �����Դϴ�.
        at Test153.getValue(Test153.java:27)
        at Test153.main(Test153.java:49)
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/