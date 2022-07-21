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
//	특정 문장을 수행하고자 할 때 사용죄는 구문이다.

//사용자로 부터 임의의 정수를 입력받아
//홀수/ 짝수를 판별하는 프로그램을 구현한다,
//단, 단일 if구문을 활용하여 처리 할 수 있도록 한다.

//실행 예)
//임의의 정수 입력 : 20
//>> 20은(는) 짝수입니다.
//계속하려면 아무키나 

//임의의 정수
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 

public class Test032
{
	public static void main(String[] args) throws IOException;

	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		
		System.out.print("임의의 정수 입력 : ");

		int num = Integer.parseInt(br.readLine());

		if (num%2 == 0)
		{
			System.out.printf("%d는 짝수입니다.\n" ,a);
		}
		if (num*2 ! = 0)
		{
			System.out.printf("%d는 홀수입니다.\n", b);
		}
		

	}
}

/*

		System.out.print("임의의 정수 입력 : ");
		int a;

		if ()	//홀수,짝수 
		{
			= "홀수"
*/