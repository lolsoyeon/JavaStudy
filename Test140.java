/*=================================================================
   ■■■ 자바의 주요(중요) 클래스 ■■■ 2022-07-25 오후 12:10
 - 자바에서 기본적으로 제공하는 주요 클래스들
 - StringTokenizer 클래스 (이제는 잘 안쓰니 개념만 숙지~!~!)
==================================================================*/
/*
	StringTokenizer 클래스는
 문자열 파싱 을 위한 정보를 제공하는 클래스로
 파싱(parsing) 하고자하는 문자열을 인자로 받아 생성하는데,
 여기에서 파싱(parsing)이란 하나의 문자열을 여러 문자열로
 나누는 작업을 의미하게 되며, 이 때 나누는 단위가 되는 문자열을
 토큰(Token) 이라고한다

 StringTokenzer 클래스를 사용하기 위해서는
 java.util 패키지의  StringTokenizer 를 import 해야한다.
 StringTokenizer 클래스는 호환성을 유지하는 목적으로
 보관 유지되고 있으며, 문자열을 파싱 하기 위해서는
 String 클래스의 split()메소드난 java.util.regex 패키지를
 사용할 것을 권장하고 있다.

  ○생성자

 -  원형
 	StringTokenizer(String str)
	StringTokenizer(String str, String delim)구분자를 뭘 쓰겟다.
	StringTokenizer(String str, String delim , boolean returnDelims)
	 : 주어진 문자열 str을 단어로 분리하는 객체를 생성하며
	 공백(구분) 문자는 delim에 포함된 문자로 처리하게 된다.
	 만약 returnDelims 가 true 이면
	 구분 문자도 분리된 데이터로 처리하게 된다.
*/

//Test?클래스 하나 만들어보셈
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Test140
{
	public static void main(String[] args) throws IOException
	{
		String strTemp;
		String[] strArr;
		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("파싱할 문자열 입력");
		strTemp = br.readLine();

		//클래스 인스턴스생성
		StringTokenizer st = new StringTokenizer(strTemp,",");
		//strTemp를 대상 문자열로 ("사과, 딸기, 바나나, 포도");
		//, 를 구분자로....

		//st의 countToken()
		//int sountToken()
		//: 파싱된 문자열의 갯수를 반환(리턴) 한다.

		strArr = new String[st.countTokens()];
		//					-----------------
		//						4

		//strArr = mew String[4];

		n=0;
		while (st.hasMoreTokens())  //다음 토큰을 보았니?  
									//true true true true false
		{
			strArr[n++] = st.nextToken();		//봤다.

			//strArr[0]	 = "사과";				//지나오면서 "사과"를 리턴한다. 
			//strArr[1]	 = "딸기";
			//strArr[1]	 = "바나나";
			//strArr[1]	 = "포도";
		}

		//--『hasMoreTokens()』
		//	: 사용할 수있는 토큰이 남아있는 경우 true 를 반환
		//	더이상 사용할 토큰이 없는 경우 false 를 반환
		//	확인결과만 반환할 뿐.. 
		//	실제 내용을 읽어들이지 않고
		//	실제 내용을 읽어들이는 헤드를 이동시키지도 않는다.

		//--『nextToken()』
		//	: 다음 토큰을 얻어온다.
		//	다음 토큰을 얻어오며 헤드를 이동시키게된다.
		//	구분자를 바꾸었을 경우 다음 호출에도
		//	바뀐 구분자를 이용하여 토큰을 분리한다.

		System.out.print(" 파싱된 토큰(문자열) : ");

		for (String str : strArr)
		{
			System.out.print(str + " ");
		}
		System.out.println();
	}
}

/* 실행결과
 파싱할 문자열 입력 사과,배,포도,바나나
 파싱된 토큰(문자열) :  사과 배 포도 바나나
계속하려면 아무 키나 누르십시오 . . .

*/