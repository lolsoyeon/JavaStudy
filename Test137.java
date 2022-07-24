/*=================================================================
   ■■■ 자바의 주요(중요) 클래스 ■■■ 2022-07-22 오후 3:18
 - 자바에서 기본적으로 제공하는 주요 클래스들
 - String 클래스 
==================================================================*/
public class Test137
{
	public static void main(String[] args)
	{
		String s = "seoul korea";
		System.out.println("s : " + s);
		//-->>s : seoul korea

		//○ 문자열 추출 
		System.out.println(s.substring(6,9));
		//--==>>kor
		//String. substring(s,e)
		//String 문자열을 대상으로
		//s번째 에서....e-1 번째까지 추출
		//단, 인덱스는 0부터 시작

		System.out.println(s.substring(7));
		//String substring(s)
		//String 문자열을 대상으로
		//s번째에서 ...끝까지 추출
		//즉, 문자열이 가진 길이만큼

		//문자열의 데이터 값 비교
		System.out.println(s.equals("seoul korea"));
		System.out.println(s.equals("seoul Korea"));
		//true
		//false
		//대소문자 엄격히 구분

		System.out.println(s.equalsIgnoreCase("SEOUL KOREa"));
		//-->>true
		//--대소문자 구분 안함


		//○ 찾고자하는 대상 문자열(s)에
		// kor  문자열이 존재 할까?
		//존재한다면.......그 위치는 어떻게 될까?

		System.out.println("---------------------구분선");
		//"seoul korea"
		// 0123456789
		System.out.println(s.indexOf("kor"));
		//--==>>6

		System.out.println(s.indexOf("ea"));
		//--==>>9
		System.out.println(s.indexOf("e"));
		//--==>>1
		//--먼저 찾은 문자열의 인덱스를 반환 하고 종료.

		System.out.println(s.indexOf("tt"));
		//--==>>-1

		//--찾고자 하는 문자열이 대상 문자열에 존재할 경우
		//  그 문자열의 인덱스를 반환하지만
		//	존재하지 않을 경우 음수를 반환하게 된다.(-1)


		//○대상 문자열(s)이 『rea』 로 끝나는지의 여부 확인
		//(true/false)
		System.out.println(s.endsWith("rea"));
		System.out.println(s.endsWith("oul"));
		//--==>>true
		//		false

		//○ 찾고자 하는 대상 문자열(s)에
		//	『e』문자열이 존재할까?
		//	존재한다면...그 위치는 어떻게 될까?
		//	(단, 뒤에서 부터 검사)

		//seoul korea
		System.out.println(s.indexOf("e"));
		//--==>>1
		System.out.println(s.indexOf("o"));
		//--==>>2


		//lastIndexOf()메소드 사용 뒤에서 부터시작인데  주의할점 처음부터센다.
		//seoul korea
		System.out.println(s.lastIndexOf("e"));
		//--==>>9
		System.out.println(s.lastIndexOf("o"));
		//--==>>7


		//○대상 문자열(s)중
		// 『6』번째 인덱스 위치의 문자는?(인덱스 접근은 항상 조심해야한다.)

		//seoul korea
		System.out.println(s.charAt(6));
		//--==>>k

		//System.out.println(s.charAt(22));
		//--==>>런타임 에러발생 
		//--  StringIndexOutOfBoundsException

		//대상 문자열(s)과 비교 문자열 seoul corea중
		//어떤 문자열이 더 큰가?  → 문자열에 대한 크기 비교
		// 두 문자열이 같다면	→ 0
		// 두 문자열이 다르다면 → 차이를 확인(사전식 배열)


		System.out.println(s.compareTo("seoul korea"));
		//--==>> 0 → 두문자열이 같다 (s와 seoul korea)
		System.out.println(s.compareTo("seoul corea"));
		//--==>> 8
		//-- c ~ k → defghijk → 8
		//아마도 인덱스는 0부터 시작??????인듯


		//○ 대상문자열(s) 중
		//해당 문자열을 찾아서 원하는 형태로 수정된 문자열 반환 
		//해주는것 뿐 s를 바꾸는것이 아니다.

		s = "우리나라 대한민국 대한독립 만세";
		s= s.replaceAll("대한", "자주");

		System.out.println("처리 결과 : " + s);
		//--==>>처리 결과 : 우리나라 자주민국 자주독립 만세


		//○ 공백 제거
		s ="          사          랑          ";

		System.out.println(s);
		System.out.println("|" + s + "| ");
		//--==>>|          사          랑          |


		System.out.println("|" + s.trim() + "|");  

		//--==>>|사          랑|
		//--양쪽 가장자리 공백제거
		//trim() 이라는 메소드사용 제대로 사용법 확인 오라클등등사용 substring 역시  

		//트림 : 손톱깍이의 특징을 가짐 !!! 









	}
	
}