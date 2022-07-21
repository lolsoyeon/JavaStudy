/*
======================================================================

■■■실행 흐름의 컨트롤 (제어문)■■■
-if문
-if ~else 문
  
======================================================================
*/
//1.프로그램을 작설 할때 주어진 조건에 따라
//	분기 방해ㅑㅇ을 정하기위해 사용하는 재어문에는
//IF문, if~else문, 조건 연산자,복합 if문(if문 중첩)
//	,switch 문이있다

//2. if문은 if 다음의 조건이 참일경우
//	특정 문장을 수행하고자 할 때 사용되는 구문이다.

//사용자로 부터 임의의 두 정수와 연산자를 입력박아
//해당 연산자의 연산처리 결과를 출력하는 프로그램을 구현한다
//단, if조건문을 활용하여 처리 할 수있도록 하며,
//연산 결과는 편의상 정수 기반으로 처리 될 수 있도록 한다.


//실행 예)
//첫 번째 정수 입력 : 10
//두 번째 정수 입력 : 3
//연산자 입력[+ - * /] : +

// >> 10 + 3 = 13
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test036
{
	public static void main(String[] args) throws IOException
	{
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//방법 1
		
		int a , b;  //첫 번째, 두번째
		char op;	//연산자

		System.out.print("첫 번째 정수 입력  : ");
		a = Integer.parseInt(br.readLine());		//kkkk 숫자가아니라서 넘버포멧익셉션 에러

		System.out.print("두 번째 정수 입력  : ");
		b = Integer.parseInt(br.readLine());

			// Integer.parseInt("12345455")   parseInt는 숫자모양만 반환
			// "1234" → Integer.parseInt()  →1234  숫자모양의 문자열을 정수형태로 반환
			// "abcd" → Integer.parseInt()  → (X 에러발생)

			// System.in.read 하나의 단일문자의 아스키코드 값 반환 


		System.out.print("연산자 입력[+ - * /]  : ");	
		//op = (char)Integer.parseInt(br.readLine()); 
		//문자열 ->문자로 바꾸는거 불가능 1개의 문자열은 가능
		//+ < > == 비교연산자 
		//System.in.read();			4바이트 정수형
		//op = System.in.read();    자동 형변환 위배 먼지쌓이듯이 아는만큼보인다.

		/*op = (char)System.in.read();

		//테스트(확인)
		//System.out.println("입력한 연산자 : " + op);
		
		if (op == '+') //사용자가 입력한 연산자가 '+'라면 
		{
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));

		}
		else if (op == '-')//사용자가 입력한 연산자가 '-'라면
		{
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		
		}
		else if (op == '*')//사용자가 입력한 연산자가 '*'라면
		{
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		
		}
		else if(op == '/')//사용자가 입력한 연산자가 '/'라면
		{
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		}
		else
		{
			System.out.println("\n>>입력 과정에 오류가 존재합니다.");
		}


		//a 와 b의 덧셈 연산 수행하여 출력
		
		//a 와 b의 뺄셈 연산 수행하여 출력
		

/*  실행결과 1
첫 번째 정수 입력  : 10
두 번째 정수 입력  : 5
연산자 입력[+ - * /]  : +

>> 10 + 5 = 15
계속하려면 아무 키나 누르십시오 . . .

*/


/*  내가 풀이 한 것  (다시 해보기)

		int a;
		int b;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.println("연산자 입력[+ - * /] : ");
		b = Integer.parseInt(br.readLine());


		if (a)
		{
			System.out.print(a + a);
		}

*/


//방법 2
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//방법 1
		
		int a , b;  //첫 번째, 두번째
		char op;	//연산자

		System.out.print("첫 번째 정수 입력  : ");
		a = Integer.parseInt(br.readLine());		//kkkk 숫자가아니라서 넘버포멧익셉션 에러

		System.out.print("두 번째 정수 입력  : ");
		b = Integer.parseInt(br.readLine());

			// Integer.parseInt("12345455")   parseInt는 숫자모양만 반환
			// "1234" → Integer.parseInt()  →1234  숫자모양의 문자열을 정수형태로 반환
			// "abcd" → Integer.parseInt()  → (X 에러발생)

			// System.in.read 하나의 단일문자의 아스키코드 값 반환 


		System.out.print("연산자 입력[+ - * /]  : ");	
		//op = (char)Integer.parseInt(br.readLine()); 
		//문자열 ->문자로 바꾸는거 불가능 1개의 문자열은 가능
		//+ < > == 비교연산자 
		//System.in.read();			4바이트 정수형
		//op = System.in.read();    자동 형변환 위배 먼지쌓이듯이 아는만큼보인다.

		op = System.in.read();

		//테스트(확인) 방법 2
		//System.out.println("입력한 연산자 : " + op);
		
		if (op == 43) //사용자가 입력한 연산자가 '+'라면 
		{
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));

		}
		else if (op == 45)//사용자가 입력한 연산자가 '-'라면
		{
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		
		}
		else if (op == 42)//사용자가 입력한 연산자가 '*'라면
		{
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		
		}
		else if(op == 47)//사용자가 입력한 연산자가 '/'라면
		{
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		}
		else
		{
			System.out.println("\n>>입력 과정에 오류가 존재합니다."); 
		} */


		//방법 3  출력구문을 하나로 처리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, result;
		char op;
		//String 연산자도 문자열로 받을 수있음 "+"가 뭐랑 같은지 크기비교 나중에배움
		System.out.print("첫 번째 정수 입력  : ");
		a = Integer.parseInt(br.readLine());	
		System.out.print("두 번째 정수 입력  : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력[+ - * /]  : ");	
		op = (char)System.in.read();

		if (op=='+')
		{
			result = a + b;
		} //블레이스 생략가능

		else if (op=='-')
			result = a - b;
		else if (op=='*')
			result = a * b;
		else if (op=='/')
			result = a / b;

		System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result);
	


//실행결과?

	}
			
}
