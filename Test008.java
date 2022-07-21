
/*자바의 개요 및 특징
-변수와 자료형
-변수와 자료형 시습 및 테스트 : char

============================================
*/


public class Test008
{
	public static void main(String[] args)
	{

		//주요변수 선언
		char ch1, ch2, ch3;
		int a;					//체크~~!!


		//연산 및 처리

		ch1 ='A';
		ch2 = '\n';	//개행 문자  \n은 하나의 문자로 인식
		ch3 = '대';
		//a = ch1;        //체크~~!!! 자동 형변환 규칙부합
		a = (int)ch1;     //체크~~!!

		//--==명시적 형변환 (강제 형변환)
		System.out.printf("%c, %c, %c, %d%n", ch1, ch2, ch3, a);
	

		//결과 출력

		System.out.println("ch1 : "+ ch1);
		// ch1 : A
		System.out.println("ch2 : "+ ch2);
		//ch2 : (개행)
		System.out.println("ch3 : "+ ch3);
		//ch3 : 대
		System.out.println("a : "+ a);//에러? 2번째케이스
		//a : 65
		
/*
실행결과
A,
, 대, 65
ch1 : A
ch2 :

ch3 : 대
a : 65
계속하려면 아무 키나 누르십시오 . . .*/



	}
}