
/*=================================================================
   ■■■ 자바의 주요(중요) 클래스 ■■■	2022-07-25 오후 3:02
 - 자바에서 기본적으로 제공하는 주요 클래스들
 - Calender 클래스
==================================================================*/

//○ 실습 문제
//오늘을 기준으로 입력받는 날짜만큼 후의 연, 월, 일 , 요일을 확인하여 
//결과를 출력하는 프로그램을 구현한다.

//실행 예)
//오늘 날짜 : 2022-07-26 화요일			  -일단 출력
//몇 일 후의 날짜를 확인하고자 하십니까? : 200

//===========[확인 결과]============
//200일 후  : xxxx- xx-xx x요일
//==================================
//계속하려면 아무키나 누르세요

//	※ Calendar 와 관련한 API 참조
//	『add()』
//	현재 날짜를 기준으로 날수를 더하는 연산 메소드
//	『객체.add(Calender.DATE,날수);』

/*
설계 
1. import 잘 작성
2. 오늘 날짜 셋팅? set()? 오늘 날짜 출력
2-1. Calendar 에 있는 메소드를 받을  int에 받고 출력
3. Sanner 사용하여 사용자에게 메세지 출력
4. 받은 숫자 add()메소드이용
5.
*/

import java.util.Scanner;
import java.util.Calendar;

public class Test144
{
	public static void main(String[] args)
	{
		//Scanner 클래스 기반 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		//Calendar 클래스기반 인스턴스 생성
		Calendar now = Calendar.getInstance();

		//주요 변수 선언
		int nalsu;			//사용자로부터 입력받은 날 수
		int y, m ,d, w;

		String[] week = {"일","월","화","수","목","금","토"};

	
		//현재의 연,월 ,일, 요일 확인 
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) + 1;
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);

		//현재의 연 월, 일 요일 확인결과 출력

		System.out.println("오늘 날짜 : "+ y + "-" + m + "-" + d + " "+ week[w-1] + "요일");

		do
		{
			System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu<1);
		
		//check~!~!

		now.add(Calendar.DATE,nalsu);

		//결과 출력
		System.out.println();
		System.out.println("==========[확인 결과]============");
		System.out.printf("%d일 후  : %tF %tA",nalsu, now, now);
		System.out.println();

		//String.format("%tF", 달력객체);
		// → 년-월-일 형태의 문자열 반환
		//String.format("%tA", 달력객체);
		// → 요일 형태의 문자열 반환
	}
}


/*내가 한것

		int n; //사용자가 입력할 정수를 담을 변수

		//캘린더 클래스기반 인스턴스 생성
		Calendar cal = Calendar.getInstance();


		int y = cal.get(Calendar.YEAR);

		int m = cal.get(Calendar.MONTH)+1;

		int d = cal.get(Calendar.DATE);

		int w = cal.get(Calendar.DAY_OF_WEEK);


		//System.out.println(y +"-" + m + "-" + d + "-" + w);

		String week = "";

		switch (w)
		{
		case 1 : week = "일요일"; break;
		case 2 : week = "월요일"; break;
		case 3 : week = "화요일"; break;
		case 4 : week = "수요일"; break;
		case 5 : week = "목요일"; break;
		case 6 : week = "금요일"; break;
		case 7 : week = "토요일"; break;

		}
		System.out.println("오늘날짜 : " + y +"-" + m + "-" + d + "-" + week);
	

		//cal.set();
		System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		//date.clear();

		cal.set(2022,6,26);


		cal.add(Calendar.YEAR, n);
		cal.add(Calendar.MONTH,n);
		cal.add(Calendar.DATE, n);
		cal.add(Calendar.DAY_OF_WEEK, n);

		//더한걸 담을 변수가 필요한가? 

		System.out.println("===========[확인 결과]============");
		System.out.printf("%d일 후  : %4d - %d - %d %s%n", n,y,m,d,week);
		System.out.println("==================================");

*/

/*
오늘 날짜 : 2022-7-26 화요일
몇 일 후의 날짜를 확인하고자 하십니까? : 174

==========[확인 결과]============
174일 후  : 2023-01-16 월요일
계속하려면 아무 키나 누르십시오 . . .

*/