/*=================================================================
   ■■■예외 처리(Exception Handing) ■■■ 2022-07-26 
 ==================================================================*/

 //다른 예외 다시 던지기 예외 컨트롤

public class Test153
{

	public int getValue(int value) throws Exception		//⑦예외 던지기 (파랑)
	{
		int a = 0;

		try
		{
			a = getData(-2);							//③ 예외 발생 (빨강)

		}
		catch (Exception e)								//④예외 잡아내기(빨강)
		{
			//⑤예외 처리 (빨강)
			System.out.println("printStackTrace.......");
			e.printStackTrace();

			//check~!~!
			//⑥예외 발생 (파랑)
			throw new Exception("value 가 음수입니다.");			
		}
		
		return a;
	}

	public int getData(int data) throws Exception		//②예외 던지기 (빨강)
	{
		if (data<0)
		{
			throw new Exception("data가 0보다 작습니다."); //①예외 발생 (빨강)
		}
		return data + 10;
	}


	public static void main(String[] args)
	{
		Test153 ob = new Test153();

		try
		{
			int a = ob.getValue(-2);				//⑧예외 발생 (파랑)

			System.out.println("a : " + a);		
		}
		catch (Exception e)							//⑨예외 잡아내기(파랑)
		{
			//⑩예외 처리(파랑)
			System.out.println("printStackTrace......");
			e.printStackTrace();
		}
			
	}
}
/*
printStackTrace.......빨
java.lang.Exception: data가 0보다 작습니다.
        at Test153.getData(Test153.java:38)
        at Test153.getValue(Test153.java:16)
        at Test153.main(Test153.java:49)

printStackTrace......파
java.lang.Exception: value 가 음수입니다.
        at Test153.getValue(Test153.java:27)
        at Test153.main(Test153.java:49)
계속하려면 아무 키나 누르십시오 . . .

*/