
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;

public class Test143_1
{
	public static void main(String[] args) throws IOException
	{
		
		//BufferedReader 클래스 기반 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//Calendar클래스 기반 인스턴스생성
		Calendar cal = Calendar.getInstance();

		//주요 변수 선언
		int y,m;		// 연, 월
		int w;			// 요일
		int i;			// 루프변수
		
		do
		{
			System.out.print("연도 입력 : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("월 입력 : ");
			m = Integer.parseInt(br.readLine());
		}

		while (m<1 || m>12);

		//사용자로 부터 입력받은 연y 월m 을 이용하여
		//달력의 날짜 세팅
		cal.set(y,m-1 ,1);
		//- 월 구성시 입력값을 그대로 사용하는 것이 아니라
		//	입력값에서 1을 뺀 값으로 월을 설정해야 한다.
		//- 일 구성시 입력받은 연, 월에 해당하는 1일로 설정해야한다.
		//	1일의 요일 확인 필요~~!!!!!

		//세팅된 달력의 날짜로부터 요일 가져오기
		w = cal.get(Calendar.DAY_OF_WEEK);

		//테스트
		//System.out.println(w);
		//--==>> 6 →2022년 7월 기준 →금요일 →2022년 7월 1일은 금요일~!

		//결과 출력 →달력그리기
		System.out.println();
		System.out.println("\t[" + y +"년" + m + " 월]\n");
		System.out.println("  일  월  화  수  목  금  토 ");
		System.out.println("=============================");

		for (i=1;i<w ;i++)
		{
			System.out.print("    ");
		}
		//System.out.printf("%4d",1);

		//Calendar클래스 getActualMaximum() 메소드 체크
		for (i=1;i<=cal.getActualMaximum(Calendar.DATE);i++ )
		{
			System.out.printf("%4d",i);
			w++;		//반복문을 수행하며 날짜가 증가할 때마다
						//요일도 함께 등가 할 수있도록 처리
						//--증가한 요일이 일요일이 될 때마다 
			if (w % 7 ==1)
			{
				System.out.println();	//개행 후 출력될 수 있도록 처리
			}
		}

		
		if (w % 7 != 1)				//일요일 개행이 적용되지 않았을 경우에만
									//개행 처리   알겠는데 원리는...?
			System.out.println();
		System.out.println("=============================");

	
	
	}
}
