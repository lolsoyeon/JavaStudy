/*=================================================================
   ■■■ 자바의 주요(중요) 클래스 ■■■	2022-07-25 오후 2:36
 - 자바에서 기본적으로 제공하는 주요 클래스들
 - 문자열 관련 클래스
 - 캐릭터 셋(CharacterSet)
==================================================================*/

/*

○ 캐릭터 셋(CharacterSet)

	유니코드(nuicode)
	국제 표준으로 제정된 2바이트계의 만국 공통 국제 문자부호
	체계(UCS : Universal Code System)를 말한다.
	애플컴퓨터,	IBM, 마이크로소프트 등이 컨소시엄으로 설립한
	유니코드(Unicode)가 1990년에 첫 버전을 발표 하였고
	ISO/IEC JTC1 에서 1995년 9월 국제표준으로 제정하였다.
	공식 명칭은 ISO/ IEC 10646-1(Universal Multiple- Octet Coded Character Set)이다.

	데이터의 교환을 원활하게 하기 위하여 문자 1개에 부여되는 값을
	16비트로 통일 하였다.
	코드의 1문자당 영어는 7비트, 비영어는 8비트,
	한글이나 일본어는 16비트의 값을 가지게 되는데
	이들을 모두 16비트로 통일한 것이다.

	○ UTF-8과 UTF-16

		UTF-8과 UTF-16 의 차이를 한마디로 말하면
		문자를 표현할 때의 단위가 다르다는 것이다.
		UTF-8은 8비트 가변장 멀티바이트에서 문자를 표현하고,
		UTF-16은 16비트 가변장 멀티바이트에서 문자를 표현한다.

		- UTF-8(8bit UCS Transformation Format)
		웹에서 기본적으로 사용하는 코드.
		로 정의 되는 문자 집합을 이용하여 기술된 문자열을
		바이트 열로 변환하는방식의 1개 1문자를 1~6바이트 가변장
		멀티바이트로 변환한다.


		○ UTF-16(16bit)
		자바의 기본코드. 자바에서는 문자라나룰 저장하면 바이트 수는
		영문자이든, 한글문자이든 2바이트를 차지하게된다.
		UTF-2 로 정의되는 문자 집합을 이용하여 기수돤 문자열에
		UTF-4 의 일부릐 문자를 채워넣기 위한 인코딩 방식.
		UTF-8 과 병용할 수있다.
		UTF-2 로 이용할 수있는 문자수를 대폭 늘릴 수있다.

		자바단 에서는 UTF-16을 사용하고 웹에서는 UTF-8을 사용하기 때문에
		경우에따라 변환해야하는 상황이 발생 할 수있다.

		문자 코드의 종류
		○ KSC5601
		한글 완성형 표준(한글2,350자 표현).
		한국공업표준 정보처리분야(C)의 5601번 표준안.

		○ KSC5636
		영문자에 대한 표준
		한국 공업표준 정보처리(C)의 5636번 표준안
		기존 ASCII Code에서 역 슬래시(\)를 원() 표시로 대체

		○ EUC-KR(MS949) 
		Bell-Laboratoris 에서 유닉스 상에서 영문자 이외의 문자를
		지원하기 위해 제안한 확장 유니코드(Extend UNIX Code)중
		한글 인코딩 방식.
		영문은 KSC5636 처리하고, 한글은 KSC5601로 처리.
		즉 EUC-KR(MS949) = KSC5636 + KSC5601

		○ UTF-8
		영문과 숫자는 1바이트 한글은 3바이트로 표현.
		(웹에서 많이 사용, UTF-8형식으로 JSP 를 작성할때는
		파일도 UTF-8형식으로 저장해야한다.)

		○ UTF-16
		자바 기본 문자코드.
		영문과 숫자는 1바이트, 한글은 2바이트로 표현.
		
		○ IS0-8859-1
		서유럽 언어 표기에 필요한 US-ASCII 에 없는
		95개 글자의 순차적 나열.
*/

import java.io.UnsupportedEncodingException;
public class Test141
{
	public static void main(String[] aegs) throws UnsupportedEncodingException
	{
		byte[] buf;

		String name = new String("최동현");

		System.out.println("디폴트 캐릭터 셋 : " + System.getProperty("file.encoding"));
		//--==>> 디폴트 캐릭터 셋 : MS949


		//『String.getByte()』
		// : 디폴트 캐릭터셋으로 바이트 배열을 반환하는 메소드

		buf = name.getBytes();
		System.out.println("Length : " + buf.length);
		//--==>> Length : 6

		for (byte b :buf )
		{
			System.out.println("[" + b + "]");
		}
		System.out.println();

		/*
			[-61]
			[-42]
			[-75]
			[-65]
			[-57]
			[-10]
		*/
		
		// "UTF-8" 캐릭터셋으로 바이트 배열을 반환
		buf = name.getBytes("utf-8");			//내가 지정함
		//--==>> 에러 발생(컴파일 에러)
		//		UnsupportedEncodingException  

		// → 예외 처리후... 다시 확인
		//--==>>
		System.out.println("Length : " + buf.length);
		//--==>> Length : 9

		for (byte b :buf )
		{
			System.out.println("[" + b + "]");
		}
		System.out.println();

		/*
			[-20]
			[-75]
			[-100]
			[-21]
			[-113]
			[-103]
			[-19]
			[-104]
			[-124]
		*/

		// new String("최동현");			??

		// new String(바이트배열, 인코딩방식);


		// new String(buf,"utf-8");

		// utf-8형태로 저장된 바이트 배열을
		// String 객체로 파라미터 값 『utf-8』 을 부여하여 생성
		// → 즉 utf-8 기반으로 buf 바이트배열을 합쳐
		//	  문자열 객체 생성한 후 이름 출력
		System.out.println("Value 1 : " + new String(buf, "utf-8"));

		//--=>> Value 1 : 최동현

		System.out.println();		//개행


		// utf-8 형태로 저장된 바이트 배열을
		// String 객체로 파라미터 값 없이
		// 디폴트 캐릭터 셋(MS949)을 부여하여 생성
		System.out.println("Value 2 : " + new String(buf));
		//--==>> Value 2 : 理쒕룞?쁽


		System.out.println();	// 개행

		String convert = new String(name.getBytes("euc-kr"),"utf-8");

		System.out.println("Value 3: " + convert);
		//--==>> Value 3: ?????

		buf = convert.getBytes();
		System.out.println("Length : " + buf.length);
		//--==>> Length : 5

		buf = convert.getBytes("utf-8");
		System.out.println("Length : " + buf.length);
		//--==>> Length : 14

		/*
		euc-kr 을 utf-8로 변환하겠다는 의도로
		위와 같이 코딩을 해버리면
		이러한 변환(잘못된 변환)으로 인해 배열이 깨져서
		euc-kr 이든 utf-8 이든.....
		어떠한 바이트 배열로 읽어오든
		결과물이 깨져있는것을 확인할 수 있다

		이미 깨져서 생성된 String 객체의 바이트 배열은
		어떤 방식으로든 복구가 불가능하다.
		*/

	}
}