/*=================================================================
   ■■■ 자바의 주요(중요) 클래스 ■■■ 2022-07-22 오전 11:32
 - 자바에서 기본적으로 제공하는 주요 클래스들
 - Wrapper 클래스
==================================================================*/
//굉장히 큰 실수를 다루기 위한 BigDecimal 

import java.math.BigDecimal;
public class Test133
{
	public static void main(String[] args)
	{
		BigDecimal a = new BigDecimal("123456789.123456789");

		//mmovePointLeft() : 소수점을 왼쪽으로 이동
		BigDecimal b = a.movePointLeft(3);
		System.out.println( "처리결과 : " + b);
		//--==>>
		
		//덧셈
		BigDecimal c = a.divide(b);
		System.out.println( "처리결과 : " + c);

		//
		BigDecimal d = a.divide(b.BigDecimal.ROUND_DOWN);	//반올림을 하지않는다. → 절삭
		System.out.println( "처리결과 : " + d);

		//BigInteger 객체로 변환
		System.out.println(a.toBigInteger());


		
	}
}