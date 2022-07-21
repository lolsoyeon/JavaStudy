
/*======================================================================

■■■연산자(Operator)■■■
-조건 연산자 == 삼항 연산자
- "조건이 2개이상 이라면 무조건 논리 연산자"

======================================================================*/

//사용자로부터 임의의 문자하나 입력받아
//대문자이면 소문자로, 소문자이면 대문자로
//알파벳이 아닌 기타문자라면 그 문자 그대로 출력하는
//프로그램을 구현한다.

//실행 예)
//한 문자 입력 : A
//A → a
//계속하려면 아무 키나 누르세요....

//한 문자 입력 : b
//b → B
//계속하려면 아무 키나 누르세요....

//한 문자 입력 : 7
//7 →7
//계속하려면 아무 키나 누르세요....
//sce 자바가 트루연산끝내면 더이상 연산 하지않음

// 바이트 쇼츠 인트 롱 float double
/* 
30
30=< a 
a<=40


ch

알파벳 대문자 ? 알파벳 소문자로 변환 : (알파벳 소문자? 알파벳대문자로 변환 : 있는그대로); 그래서 3항연산자
											----------	 -----------------   ----------
											1				2					3
-------------   ---------------------   ----------------------------------------------
	  1						2							3
result

*/

import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException

	{
		

		//주요변수 선언
		//char temp;
		//System.print("한 문자 입력 : ");
		//temp = (char)System.in.read();

		//System.out.println("입력 받은 값 확인 : " + temp);

		//대문자? 대문자 아님?
		//temp == 'A'
		//temp == 'B'
		//temp == 'C'

		//String result = temp >= 65 && temp <=90 ? "대문자" : "대문자 아님";
		//System.out.println("결과 : " + result);
		//String result = temp >= 'A' && temp <='Z' ? "대문자" : "대문자 아님";
		//System.out.println("결과 : " + result);
/*

		대문자 → 소문자
		'A'(65)→'a'(97) ==> +32

		소문자 → 대문자
		'b'(66)→'B'(98) ==> -32

*/
		char ch, result;
		System.out.print("한 문자 입력 : ");
		ch = (char)System.in.read();

		//result = () ? () : ();
		//result = (입력값 대문자 ) ? (소문자로 변환) : ((입력값 소문자) ? 대문자로변환 : 그대로));
		result = (ch>= 'A' && ch <= 'Z' ) ? ((char)(ch+32)) : ((ch>= 'a' && ch<='z' ? ((char)(ch-32)) : ch));

		System.out.println(ch + "→" + result);



		//연산 및 처리


		
		//결과 출력



/*  실행 결과
한 문자 입력 : a
a→A
계속하려면 아무 키나 누르십시오 . . .

한 문자 입력 : 7
7→7
계속하려면 아무 키나 누르십시오 . . .

한 문자 입력 : S
S→s
계속하려면 아무 키나 누르십시오 . . .

*/

	}
}

/*			내가푼것     System.in.read();를 못썻다.?


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


		char a, b;
		int n;

		System.out.print("한 문자 입력 : ");

		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());

		n = (a >= 65 && a <= 90) ? (a += 32) : a;
		b = (char)n;

		System.out.println();
		System.out.println( a + "→" + b);

		System.out.println("%d %d");   */


		/* 친구가 한  것

		char a, b;
		int n;

		System.out.print("한 문자 입력 : ");
		n = System.in.read();

		b = ( n < 60 ) ? ((char)n) : ( n < 91) ? ((char)(n + 32)) : ((char)(n-32));

		a = (char)n;

		System.out.printf(" %c → %c\n" , a , b); */

		

