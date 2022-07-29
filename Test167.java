/*=====================================================
  �����÷���(Collection)  ���� 2022-07-29
 ======================================================*/

//List �� String[]  : List.toArray();

//String[] �� List  : Arrays.asList();

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Test167
{
	public static void main(String[] args)
	{
		List<String> mList = new ArrayList<String>();

		mList.add("1");
		mList.add("2");
		mList.add("3");
	
	//check~!~!
	//List �� String[]
	//mList.toArray(new String[100]);  //����ϴ� �޼ҵ� toArray()
	String[] sArrays = mList.toArray(new String[mList.size()]);
	
	for (String s :sArrays)
	{
		System.out.print( s + " ");
	}
	System.out.println();
	//--==>>1 2 3
	

	//check~!~!�� 
	//String �� List
	//Arrays.asList();     //�ȿ� �� ��� ��ȯ�ڷ��� �� ����Ʈ��
	List<String> mNewList = Arrays.asList(sArrays);

	for (String s : mNewList)
	{
		System.out.print( s + " ");
	}
	System.out.println();
	//--==>>1 2 3
	
	






	}
}