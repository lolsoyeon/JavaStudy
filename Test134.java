/*=================================================================
   ■■■ 자바의 주요(중요) 클래스 ■■■ 2022-07-22 오후 12:04
 - 자바에서 기본적으로 제공하는 주요 클래스들
 - Wrapper 클래스
==================================================================*/

public class Test134
{

	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;
		float f = 1.2f;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);
		Float f2 = new Float(f);

		System.out.println(b2);
		System.out.println(i2);
		//--==>>3
		//		256

		print(b2);
		print(i2);
		print(f2);

	}
	/*
	static void print(Byte b)
	{		
	}
	static void print(Short s)
	{
		
	}
	static void(Integer i)
	{
		
	}
	*/
	
	//print(3);		업캐스팅
	//static void print(Object obj)				///static 공부하기~!~!
		
	
	//java.lang.Number (추상)클래스
	//모든 숫자형 Wrapper 클래스의 부모 클래스
	//(슈퍼 클래스, 상위클래스)이다.
	//b2, i2자료형이 Number에 넘어오면서
	//업 캐스팅 이 일어나게된다.

	static void print(Number nb)
	{
		System.out.println(nb);

		/*
		if(n instanceof Integer)
		{
			System.out.println(n.intValue());
		}
		else if (n instanceod Double)
		{
		}
		*/
	}

//	static void print(double x)
//	{
//		System.out.println(x);
//	}

}
