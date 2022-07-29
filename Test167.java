/*=====================================================
  ■■■컬렉션(Collection)  ■■■ 2022-07-29
 ======================================================*/

//List → String[]  : List.toArray();

//String[] → List  : Arrays.asList();

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
	//List → String[]
	//mList.toArray(new String[100]);  //사용하는 메소드 toArray()
	String[] sArrays = mList.toArray(new String[mList.size()]);
	
	for (String s :sArrays)
	{
		System.out.print( s + " ");
	}
	System.out.println();
	//--==>>1 2 3
	

	//check~!~!★ 
	//String → List
	//Arrays.asList();     //안에 뭘 담든 반환자료형 은 리스트★
	List<String> mNewList = Arrays.asList(sArrays);

	for (String s : mNewList)
	{
		System.out.print( s + " ");
	}
	System.out.println();
	//--==>>1 2 3
	
	






	}
}