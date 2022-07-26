/*=================================================================
   ■■■ 자바의 주요(중요) 클래스 ■■■	2022-07-25 오후 3:02
 - 자바에서 기본적으로 제공하는 주요 클래스들
 - Calender 클래스
==================================================================*/

/*
java.util.Calender 클래스는
날짜와 시간을 객체 모델링화 한 클래스로
연, 월, 일, 요일, 시, 분, 초 까지의
시간와 날짜와 관련된 정보를 제공한다.
그리고, Calendar 클래스는 추상클래스 이므로 직접 객체를 생성할 수 없으며
실제적인  메소드 구현은  Calendar 클래스의 서브 클래스인
GregorianCalendar 클래스에 정의 되어있다.

시스템으로부터 현재 시스템 시간 정보를 얻어올 때
getInstance() 라는 정적(static, class) 메소드를 이용하여 객체를 생성할 수 있다.
생성된 Calendar 클래스 객체는 시스템의 현재 날짜와 시간정보를 가지며,
이 객체가 생성되면 갖고있는 시간 정보들은 
get() 메소드를 이용하여 쉽게 가져올(사용할) 수있다.

getInstance()메소드는 내부적으로 GregorianCalendar 객체를 생성하여
돌려주기 때문에 GregorianCalendar 객체를 직접 생성하여 시간 정보를 구할 수도 있다.★★★★

*/

/*
○ 실습 문제
사용자로부터 연 월을 입력받아
달력을 그려주는 (출력하는) 프로그램을 구현한다.
단, Calendar 클래스를 활용하여 작성할 수 있도록 한다,
※ API Document 를 참조하여 getActualMaximum()메소드의 활용 방법 검토 할것~!


실행예)
연도입력 : 0
연도입력 : 2022
월 입력 : -20
월 입력 : 16
월 입력 : 7

		[2022년 7월]

 일  월  화  수  목  금  토 
 ==========================
 					  1   2
  3   4   5   6   7   8   9
 10  11  12  13  14  15  16
 17  18  19  20  21  22  23
 24  25  26  27  28  29  30
 31
 ===========================
 계속하려면 아무 키나 누르세요....


설계 
1.  import java.util.Calendar;
	import java.util.GregorianCalendar; 한다.
	import java.io.BufferedReader;

2. 사용자로부터 연 월을 입력받는데 BufferedReader 로 받는다.
음수이면 다시해야하니까 do while문 사용예정

3.Calendar ob2 = new GregorianCalendar(); 클래스 기반 인스턴스생성
4. 달력 날짜 세팅 『set()』 메소드 활용


-	 서기 1년 1월 1일은 월요일이다  //이거부터 중요
	연도가 4의 배수이면서 100의 배수가 아니거나,
	400의 배수이면 2월은 29일까지 있는 윤년
	나머지 2월은 28일 (평년)


*/
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test143
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int y,m,w;
		do
		{
			System.out.print("연도입력 : ");
			y = Integer.parseInt(br.readLine());

		}
		while (y<1);

		do
		{
			System.out.print("월 입력 : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);


		//Calender 기반 인스턴스 생성 년, 월, 일 객체를 가져옴
		Calendar cal = Calendar.getInstance();

		//int d = cal.get(Calendar.DATE);

		//System.out.println("d : " + d);    --==>>25

		//System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		//그 월의 최대값 (말 일)을 리턴받는다 
		//--==>>31					 인데 이 날이 무슨 요일이냐?????

		//int w = cal.get(Calendar.DAY_OF_WEEK-1);

		//System.out.println("w : " + w);
		
		cal.set(y,m-1,1);

		w = cal.get(Calendar.DAY_OF_WEEK);
/*
		String week = "";
		switch (w)
		{
		case 1: week = "일요일";break;
		case 2: week = "월요일";break;
		case 3: week = "화요일";break;
		case 4: week = "수요일";break;
		case 5: week = "목요일";break;
		case 6: week = "금요일";break;
		case 7: week = "토요일";break;
		
		}
	*/
		//System.out.println(y  + "-" + m +" - "+ week);
		

		//------------출력만 남음
		System.out.println();
		System.out.printf("	 [%d년 %d월]" ,y,m);
		System.out.println();
		System.out.println();
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("================================");
		for (int i = 1;i<cal.get(Calendar.DAY_OF_WEEK);i++ )
		{
			System.out.print("    ");
		}
		for (int i = 1;i<=cal.getActualMaximum(Calendar.DAY_OF_MONTH) ; i++)
		{
			System.out.printf("%4d",i);
			w++;
				if (w%7==1)
				{
				System.out.println();
				}
		}
		if (w%7 !=1)
		{
			System.out.println();
		}

		System.out.println("================================");
		
	}
}
/*
		[2022년 7월]

 일  월  화  수  목  금  토 
 ==========================
 					  1   2
  3   4   5   6   7   8   9
 10  11  12  13  14  15  16
 17  18  19  20  21  22  23
 24  25  26  27  28  29  30
 31
 ===========================
 계속하려면 아무 키나 누르세요....

 getActualMaximum(int field)
Returns the maximum value that the specified calendar field could have, 
given the time value of this Calendar.

*/