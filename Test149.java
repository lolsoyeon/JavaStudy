/*=================================================================
   ■■■예외 처리(Exception Handing) ■■■ 2022-07-26 
 ==================================================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test149
{

		private String[] data = new String[4];

	public void proc() //throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n = 0;

		try
		{
			System.out.print("이름 입력 [종료: ctrl+z] : ");
			while ((str = br.readLine()) != null)
			{
				data[n++] = str;//이구문의 의미를 모르겠음
				System.out.print("이름 입력 [종료: ctrl+z] : ");
			}
			System.out.println("입력된 내용........");

			for (String s : data )
			{
				if (s != null)
				{
					System.out.println(s);
				}
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("배열 인덱스 관련 예외 발생~!~");
			System.out.println("getMessage : " + e.getMessage());
			System.out.println("toString   : " + e.toString());
			System.out.println("printStackTrace.........");
			e.printStackTrace();
			
		}
			
	} 

	public static void main(String[] args)
	{
		Test149 ob = new Test149();
		ob.proc();
		
	}
}