/*===================================
   �����÷���(Collection)  ���� 2022-07-27
 ====================================*/

import java.util.Stack;
//import java.util.StringTokenizer;

public	class Test155
{
	//���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����","���","�ʷ�","�Ķ�","����","����"};


	//������
	public Test155()
	{

		//st ��� Stack�ڷᱸ�� ����
		//���׸��� Ȱ���Ͽ� �ڷᱸ���� ���� ������ ǥ�� �� ��<String>��
		Stack<String> st = new Stack<String>();

		//st��� Stack �ڷᱸ���� ������ (colors) ���
		//st = colors;  //(X)

		//StringTokenizer str = new StringTokenizer(colors,"," );

		//colors = new String[st.countTokens()];
/*
		st.push(colors[0]);  //st.add(colors[0]);
		st.push(colors[1]);  //st.add(colors[1]);
		st.push(colors[2]);  //st.add(colors[2]);
		st.push(colors[3]);  //st.add(colors[3]);
		st.push(colors[4]);  //st.add(colors[4]);
		st.push(colors[5]);  //st.add(colors[5]);

		for (int i = 0;i<colors.length ;i++ )
		{
			st.push(colors[i]);		//st.add(colors[i]);
		
		}

*/
		for (String color : colors)
		{
			st.push(color);		//st.add(color); 
		}

		st.push("����");

		//st.push(10);		//���׸�<String>�߱⶧�����߻�
		//st.push(10.0);
		//--==>>���� �߻�(������ ����)
		//--���׸� ǥ������ ���� �����ϰ� �ִ�
		//	String �� �ƴ� �ٸ� �ڷ���(int �� double)��
		//	�����ڷ� ���� st�� push()�Ϸ��� �߱� ������...
		
		popStack(st);


	}
	//��� �޼ҵ�
	private void popStack(Stack<String>st)			//??�Ű�����Ÿ��
	{
			System.out.print("pop : ");

			while (!st.empty())		//isEmpty()
			{

				System.out.print(st.pop() + " ");
			}
			System.out.println();
	}

	public static void main(String[] args)
	{
		new Test155();
			
	}
}

/* ���� ���
pop : ���� ���� �Ķ� �ʷ� ��� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .



		for (String color : colors)
		{
			st.push(color);		//st.add(color); 
		}

		st.push("����");		// �߰�����

pop : ���� ���� ���� �Ķ� �ʷ� ��� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .



*/