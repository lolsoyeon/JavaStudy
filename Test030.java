/*
======================================================================

■■■연산자(Operator)■■■
-조건 연산자 == 삼항 연산자
-4 100 400 기억
4의배수 이면서 100의배수가 아니면 윤년  2/29일
400의 배수면 윤년
나머지는 평년 

        무조건 논리 연산자
======================================================================
*/
//사용자로부터 임의의 연도를 입력받아
//입력받은 연도가...윤년인지 평년인지 판별하여
//그 결과를 출력하는 프로그램을 구현한다.
//단, 입력은 BufferedReader 를 활용하고
//조건 연산자를 활용하여 연산을 수행할 수 있도록 한다.


//실행 예)
//임의의 연도 입력 : 2000
//2000 → 윤년
//계속하려면 아무 키나 누르세요...

//임의의 연도 입력 : 2012
//2012 → 윤년
//계속하려면 아무 키나 누르세요...

//임의의 연도 입력 : 2022
//2022 → 평년
//계속하려면 아무 키나 누르세요...



//2월이 28일 까지 있는 해 →평년
//2월이 29일 까지 있는 해 →윤년


//윤년의 판별 조건
//연도가 4의 배수이면서 100의배수가 아니거나
//400의 배수이면 윤년!~!
//그렇지 않으면 평년~!


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test030
{
	public static void main(String[] args) throws IOException;

	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		//주요변수 선언
		int year;			//사용자가 입력한 연도를 담아낼 변수
		String strResult;	//판별 결과를 담아낼 변수
		

	    //연산 및 출력
		System.out.print("임의의 연도 입력 : ");
		year = Integer.parseInt(br.readLine());
		//연도가 4의배수 연도가 100의 배수가아님 연도가 400의배수
		//year%4==0       year%100!=0             year%400==0
		//→year%4==0 이면서 year%100!=0 또는 year%400==0
		//→year%4==0 $$ year%100!=0 || year%400==0
		
		//year%4==0 $$ year%100!=0 || year%400==0 ? "윤년" : "평년"

		strResult = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ? "윤년" : "평년";

		System.out.printf("%d년 → %s\n", year, strResult);

//%s문자열 %d정수형 %f실수형 %c문자형

/*실행결과

임의의 연도 입력 : 2022
2022년 → 평년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2023
2023년 → 평년
계속하려면 아무 키나 누르십시오 . . .


*/


/*
int year;
		String result;

		System.out.print("임의의 연도 입력 : ");
		yar = Integer.parseInt(br.readLine());

		//result = 윤년? 평년?
		result = 4의배수 이면서 100의배수가 아니면 윤년 400의 배수면 윤년 나머지는 평년 


	    //연산 및 출력
*/

/*       친구가한 것
		int year;
		String result;

		System.out.print("임의의 연도 입력 : ");
		year = Integer.parseInt(br.readLine());

		//result = 윤년? 평년?
		//result = 4의배수 이면서 100의배수가 아니면 윤년 400의 배수면 윤년 나머지는 평년 
		result = (year % 400 == 0 ) ? "윤년" : ((year % 4 == 0 && !(year % 100 == 0)) ? "윤년" : "평년");
		System.out.println(year + "→" + result);
		//result = ((year % 4 == 0 && year%100 != 0) || year % 400 == 0)? "윤년" : "평년";
	*/