/*=================================================================
   ■■■ 자바의 주요(중요) 클래스 ■■■	2022-07-25 오후 3:02
 - 자바에서 기본적으로 제공하는 주요 클래스들
 - Calender 클래스
==================================================================*/
/*
※ Calender 클래스는 추상 클래스이기 때문에 객체를 생성 할 수 없다.
	(추상클래스 : 미완성된 클래스)

	Calender ob = new Calender();
	이와 같은 구문을 총해 인스턴스 생성 불가


	Calener 클래스 객체(인스턴스)를 생성할 수 있는 방법

	//정적 메소드, 클래스 메소드
	1. Calender ob1 = Calender.getInstance();

	2. Calender ob2 = new GregorianCalender();	 G가 C의 자식이다 업캐스팅구문 

	3. GragorianClender ob3 = new GregorianClender();
	(※ GregorianClender : Calender 클래스의 하위 클래스)
*/


//년, 월, 일, 요일을 Calender 객체로 부터 가져와서 출력

import java.util.Calendar;
import java.util.GregorianCalendar;
public class Test142
{
	public static void main(String[] args)
	{
		//Calendar기반 인스턴스 생성 안됨
		//Calendar ob = new Calendar();

		Calendar rightNow = Calendar.getInstance();

		//생성된 달력 인스턴스를 통해
		//날짜 관련 정보를 얻어 낼 수 있는 메소드 『get()』

		int y = rightNow.get(Calendar.YEAR);
		System.out.println("y : " + y);
		//--==>> y : 2022

		int m = rightNow.get(Calendar.MONTH) + 1; //『+1』 check~!~!~!~!~!
		System.out.println("m : " + m);
		//--=>>m : 7

		int d = rightNow.get(Calendar.DATE);
		System.out.println("d: " + d);

		int w = rightNow.get(Calendar.DAY_OF_WEEK);
		System.out.println("w: " + w);

			//테스트
		/*
		System.out.println(Calendar.SUNDAY);
		System.out.println(Calendar.MONDAY);
		System.out.println(Calendar.TUESDAY);
		System.out.println(Calendar.WEDNESAY);
		System.out.println(Calendar.THURSDAY);
		System.out.println(Calendar.FRIDAY);
		System.out.println(Calendar.SATURDAY);
		*/

		System.out.println(y + "-" + m + "-" + d + "-" + w);

		String week = "";
		switch (w)

		{
			/*
		case Calendar.SUNDAY: week = "일요일"; break;
		case Calendar.MONDAY: week = "월요일"; break;
		case Calendar.TUESDAY: week = "화요일"; break;
		case Calendar.WEDNESAY: week = "수요일"; break;
		case Calendar.THURSDAY: week = "목요일"; break;
		case Calendar.FRIDAY: week = "금요일"; break;
		case Calendar.SATURDAY: week = "토요일"; break;
		
*/
		case 1 : week = "일요일"; break;
		case 2 : week = "월요일"; break;
		case 3 : week = "화요일"; break;
		case 4 : week = "수요일"; break;
		case 5 : week = "목요일"; break;
		case 6 : week = "금요일"; break;
		case 7 : week = "토요일"; break;
		}
		System.out.println(y + "-" + m + "-" + d + "-" + week);
		

		//Calendar 클래스 기반 인스턴스 생성
		Calendar rightNow2 = new GregorianCalendar();
		String[] week2 = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		
		//달력 날짜 세팅 『set()』 메소드 활용

		rightNow2.set(2023,0,16);		//2023년 1월 16일 check~~~!!!

		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		//--==>> 2

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>> 월요일

		
	}

}