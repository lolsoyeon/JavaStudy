
/*===============================================
  ■■■클래스와 인스턴스■■■
 -  클래스 설계는 답이 없어서 어렵다
=================================================*/

//CircleTest.java와 세트~!~!

//원의 넓이와 둘레구하기
//원의 넓이와 둘레를 구할 수 있는 클래스를 설계한다.
//클래스명 : CircleTest CircleTest.java
//BufferedaRead 의 readLine()

//원의 넓이 = 반지름 * 반지름 * 3.141592
//원의 둘레 = 반지름 * 2 * 3.141592

//실행 예)
//반지름 입력 : xxx 

//>>반지름이 xxx인 원의
//>>넓이 : xxx.xxx
//>>둘레 : xxxx.xxx
//계속하려면 아무 키나 누르세요......

//import java.io.BufferedReader;  안 써도됨 WHY? CircleTest class에서 필요했다.

import java.io.IOException;

public class Test071
{
	//메인이 항상 중요하다 프로그램의 시작과 끝이라서.

	public static void main(String[] args) throws IOException
	{
		//CircleTest 클래스 기반 인스턴스 생성
		//CircleTest 클래스 인스턴스 생성
		//CircleTest 객체 생성

		CircleTest ob = new CircleTest();	//새로 퍼올려지고 ob라는 이름으로 접근 가능
		
		ob.input();							//리턴자료형이없어서 준비를 해 줄 필요도 없다.
		
		double num1 = ob.calArea();	
		
		double num2 = ob.calLength();

		ob.print(num1, num2);

	}
}

/* 실행 결과

반지름 입력 : 6
>> 반지름이 6 인 원의
>> 넓이 : 113.10
>> 둘레 : 37.70
계속하려면 아무 키나 누르십시오 . . .

*/