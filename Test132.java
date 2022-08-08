/*=================================================================
   ■■■ 자바의 주요(중요) 클래스 ■■■ 2022-07-22 오전 11:32
 - 자바에서 기본적으로 제공하는 주요 클래스들
 - Wrapper 클래스
==================================================================*/

// 굉장히 큰 정수를 다루기 위한 java.math.BigInteger 클래스

import java.math.BigInteger;
public class Test132
{
	public static void main(String[] args)
	{
		// 불가능
		// int a1 = 123456789123456789;
		// System.out.println(a1);
		
		// 불가능
		// long b1 = 123456789123456789;
		// System.out.println(b1);

		// 불가능
		// long c1 = 123456789123456789L;
		// System.out.println(c1);

		// 불가능
		// long d1 = 123456789123456789123456789L;
		// System.out.println(d1);

		BigInteger a = new BigInteger("123456789123456789");   //생성자에서 넘겨받는다????????
		BigInteger b = new BigInteger("123456789123456789");  
		// BigInteger c = a + b;
		// System.out.println(c);

		// 더하기 위해서는
		BigInteger c = a.add(b);
		System.out.println(" 덧셈결과 : " + c);
		//--==>> 덧셈결과 : 246913578246913578

		// 빼기
		BigInteger d = a.subtract(b);
		System.out.println(" 뺄셈결과 : " + d);

		// 곱하기
		BigInteger e = a.multiply(b);
		System.out.println(" 곱셈결과 : " + e);

		// 지수승
		BigInteger g = new BigInteger("2");

		System.out.println(" 2의 3승 : "  + g.pow(3));

		/* 
		덧셈결과 : 246913578246913578
		뺄셈결과 : 0
		곱셈결과 : 15241578780673678515622620750190521
		2의 3승 : 8
		계속하려면 아무 키나 누르십시오 . . .
		*/
	}
}