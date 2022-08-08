/*=================================================================
   ■■■ 자바의 주요(중요) 클래스 ■■■ 2022-07-25 오전 9:31
 - 자바에서 기본적으로 제공하는 주요 클래스들
 - StringBuffer 클래스
==================================================================*/
/*
	○ StringBuffer 클래스

	문자열을 처리하는 클래스로 String 클래스와의 차이점은
	String 클래스는 내부 문자열 데이터의 수정이 불가능하지만
	StriongBuffer 클래스는 문자열을 사용할 때
	내부 문자열을 실행하는 단계에서 변경 할 수있다.

	즉, StringBuffer객체는 가변적인 길이를 가지므로
	객체를 생성하는 시점에서 미리 그 크기나 값을 지정하거나
	실행 시점에 버퍼의 크기를 바꿀 수있는 기능을 제공한다.

	// 문자열을 다룬다는 것은 같지만 StringBuffer는 유동적이라서 여유가 있다.
	
	또한 JDK1.5 이후부터는
	문자열을 처리하는 StringBuilder 라는 클래스도 제공한다.
	StringBuilder 클래스의 기능은 StringBuffer 클래스와 동일하지만
	가장 큰 차이점은 multi-thread unsafe 라는 점이 가장 큰 기능이다.
					 -------------------
	//         다중 thread 가 돌아갔을때 안전하지못하다.
	즉, Syncroniztion 동기화 이(가) 없기 때문에
	StringBuffer보다 빠르며 동시성(동기화) 문제가 없다면	
	StringBuilder를 사용하는 것이 성능을 향상시킬 수 있다.

	// 나중에 나왔지만 기능이 더 안좋은 것이 자바엔 많다.
	// 기능과 성능은 반비례!!!!!! 레이져 프린터기
	// 작업들을 처리하는 단위 기능(행위) : thread
*/
public class Test138
{
	public static void main(String[] args)
	{
		String str1 = new String("seoul");
		String str2 = new String("seoul");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		//--==>> false
		//		 true

		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2)); //check~!~!
		//--==>> false
		//		 false
		// eqauls() 메소드를 오버라이딩 하지않았다.
		System.out.println("----------------------------------");

		System.out.println(sb1);
		//--==>> korea
		// StringBuffer 타입

		System.out.println(sb1.toString()); ///??
		//--==>> korea

		System.out.println(sb1.toString().equals(sb2.toString()));
		//line 51랑 비교하기 이건 String
		//--==>> true

		System.out.println("-----------------------------");
		StringBuffer sb3 = new StringBuffer();
		//-- StringBuffer 기본 생성자 호출(인스턴스 생성과정)
		//	 기본적으로 생성되는 버퍼의 크기는 16

		// capacity()
		System.out.println("버퍼크기 : " + sb3.capacity());
		//--==>> 버퍼크기 : 16

		System.out.println(sb3);
		//--==>> 無
		
		String name = "정미경";
		name += "한은영";
		name += "최동현";
		name += "임시연";

		System.out.println(name);

		sb3.append("seoul");		//sb3 += "seoul";
		sb3.append("korea");		//sb3 += "korea";
		sb3.append("우리나라");		//sb3 += "우리나라";
		sb3.append("대한민국");		//sb3 += "대한민국";

		System.out.println(sb3);
		System.out.println(sb3.toString());
		//--==>> seoulkorea우리나라대한민국
		//		 seoulkorea우리나라대한민국

		// 버퍼 크기 다시 확인
		System.out.println("버퍼크기 : " + sb3.capacity() );
		//--==>> 버퍼크기 : 34  커짐

		///////////////////////////////////////////////////////

		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());
		//--==>> JAVA AND ORACLE   
		// 모두 대문자로 변한것을 알 수있다.

		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp1.toLowerCase());
		//--==>> java and oracle

		//System.out.println(sb3.toUpperCase());
		//System.out.println(sb3.toLowerCase());
		//--==>> 에러 발생(컴파일 에러)

		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase());
		//--==>> SEOULKOREA우리나라대한민국
	
		System.out.println(sb3.toString().toUpperCase());

		//--==>> SEOULKOREA우리나라대한민국

		// seoulkorea우리나라대한민국

		//○ 대상 문자열 (sb3)중 seoul 앞에
		//"한국"이라는 문자열 추가하고 싶을때
		//	→ 한국seoulkorea우리나라대한민국

		sb3.insert(0, "한국");		//
		System.out.println("seoul 앞에 한국 추가 : " + sb3.toString());

		//○ 대상 문자열 (sb3)중 korea문자열 뒤에
		// "사랑"이라는 문자열 추가
		// 단, 대상 문자열의 인덱스를 눈으로 확인하지않고...
		//	→ 한국seoulkorea사랑우리나라대한민국

		// korea뒤에 "사랑" 삽입해라 replaceAll????
		// 그럼 a를 찾아야함  11
		
		// 내가 한 것
		// System.out.println("korea" + sb3.replaceAll(" ","") + "우리");
		// System.out.println(sb3.indexOf("a"));
		//--==>> 11
		// sb3.insert(12,"사랑");
		// System.out.println("korea 뒤에 사랑 추가 : " + sb3.toString());

		//--==>> korea 뒤에 사랑 추가 : 한국seoulkorea사랑우리나라대한민국

		// 테스트
		System.out.println(sb3.toString());

		// 테스트2
		//sb3.insert(12,"사랑");
		//System.out.println("korea 뒤에 사랑 추가" + sb3.stString());
 
		// 테스트3
		//sb3.indexOf("korea");
		//System.out.println(sb3.indexOf("korea"));
		//--==>>7

		// 테스트4
		//System.out.println(sb3.insert(sb3.indexOf("korea"),"사랑"));
		//--==>>한국seoulkorea사랑우리나라대한민국

		// 테스트5
		System.out.println(sb3.insert(sb3.indexOf("korea") + "korea".length() ,"사랑"));
		//													  -------------5
		//--==>>한국seoulkorea사랑우리나라대한민국

		//○ 대상 문자열 (sb3) 에서 
		//『우리나라』  문자열 삭제

		//우리나라 삭제하려면 길이는 4개 

		//sb3.delete(14,18);
		//System.out.println(sb3);
		//--==>> 한국seoulkorea사랑대한민국


		//--==>> 한국seoulkorea사랑우리나라대한민국
		//System.out.println(sb3.delete(sb3.indexOf("사랑") + "우리나라".length(), "우리나라"));

		sb3.delete(sb3.indexOf("우리나라"),sb3.indexOf("우리나라") + "우리나라".length());
		System.out.println(sb3);
		//--==>> 한국seoulkorea사랑대한민국

		// 대상 문자열 에서
		// korea 이후 문자열 삭제(korea 포함)
		//--==>> 한국seoul                     //      korea사랑대한민국


		sb3.delete(sb3.indexOf("korea") ,sb3.indexOf("korea사랑대한민국") + "korea사랑 대한민국".length());
		// substring(m) ??
		System.out.println(sb3);
		// 한국seoul

		// 궁금한거
		// sb3.delete(sb3.indexOf("seoul") ,sb3.indexOf("korea사랑대한민국") + "korea사랑 대한민국".length());
		// System.out.println(sb3);
		// 한국

		// sb3.delete(7,18);
		// System.out.println(sb3.toString());
		// 한국seoul


		sb3.delete(sb3.indexOf("korea") ,sb3.length());
		System.out.println(sb3.toString());


		//버퍼 크기 확인
		//System.out.println("버퍼 크기  : " + sb3.capacity());

		//문자열의기이 확인
		System.out.println("버퍼 크기  : " + sb3.length());

		// 버퍼 크기 조절
		// 현재 문자열을 담아둘 수있는 버퍼의 크기로
		sb3.trimToSize();

		//
		System.out.println("버퍼 크기  : " + sb3.capacity());
		//--==>> 버퍼 크기 : 7?????




	}
}