/*=================================================================
   ■■■ 자바의 주요(중요) 클래스 ■■■ 2022-07-22
 - 자바에서 기본적으로 제공하는 주요 클래스들
 - Wrapper 클래스
==================================================================*/


/*
○ Wrapper 클래스

	1. 자바에서는 언어 수준에서 제공하는 기본형 데이터를 제외한
	나머지는 클래스로 설계하여 객체 단위로 처리한다.
	따라서 자바에서는 이러한 기본형 데이터를
	객체 단위로 처리할 수 있도록 클래스를 제공할 수밖에 없는데
	이러한 클래스들을 가리켜 Wrapper 클래스라한다.

	2. 값 자료형인
	byte, short, int,      long, float, double, char,      boolean 형에 대응하는
	Byte, Short, Integer,  Long, Float, Double, Character, Boolean 의
	Wrapper 클래스 및 큰 숫자들을 다루기 위한
	java.math.BigInteger 와 java.math.BigDecimal 클래스를 제공한다.


	Wrapper 클래스는 java.lang 패키지에 포함되어 있으므로
	별도의 import 과정 없이 바로 사용하는것이 가능하며
	기본형과 마찬가지로 Wrapper 클래스도 내부 메소드를 통해
	형 변환이 가능하고, 동등 비교와 같은 연산도 가능하다.


	ex) java.lang.Integer 클래스
	int 기본 자료형의 Wrapper 클래스로
	정수를 다루는데 필요한 상수나 메소드, 진수 변환 등에 필요한
	메소드 등을 포함하고 있다.

	static int parseInt(Sstring s)
	문자열 형식으로 저장된 숫자를 정수 형태로 변환하여 반환한다.

	static Integer parseInt(int i)
	int 형을 Integer 형으로 변환한다

	byte byteValue(), int intValue(),
	short shortValue(), long longValue(),
	float floatValue(), double doublaValue()
	해당 기본 자료형으로 형 변환 값을 반환한다.

	/*
	※ 오토 박싱(Auto-Boxing)과 오토 언박싱(Auto-Unboxing) 중요~!★

	일반적으로 레퍼런스 형과 기본 자료형은 호환되지 않으며(연산 불가)
	이 경우 발생하는 문제 해결을 위해 자바에서는 Wrapper 클래스를 제공하게 되었다.
	하지만,  jDK 1.5 부터 레퍼런스 형과 기본 자료형이
	다음과 같이 형 변환이 가능하게 되었다.

	   int a = 10, b;
(객체) Integer ob;
(객체) ob = a;
		//--기본 자료형(int)이 Integer 형으로 자동 변환(오토 박싱)
		//  실제로는.....『ob = new Intger(a);』
	
		b = ob;
		//---Integer(객체)가 기본자료형 int 형으로 자동 형변환(오토 언박싱)
		//실제로는..... 『b = ob.intValue();』

	이는 JDK 1.5 이후 추가된 오토박싱/ 오토 언박싱이라는
	기능으로인해 가능해진 것이다.

	기본이 객체로 바껴서 담아지면 박싱   		기본이 박스안으로 자유x      
	객체가 기본자료형으로 바뀌면 언박싱			객체가 자유o


	*/

public class Test130
{
	public static void main(String[] args)
	{
		int a  = 10,b;
		Integer c;
		Object d;

		b = a;					//--int 형 데이터(자료) →  int 형 변수

		c = new Integer(0);		//객체 생성 구문

		//※ 레퍼런스 형(참조 타입) 기본 자료형(기본 타입)은 호환이 되지 않는다.
		//값 타입과 주소 타입이기때문에

		b = c;		//Integer 형 데이터(객체) → int 형 변수(오토 언박싱)

		b = c.intValue();	//객체의 메소드 호출을 통해 결과값 반환 (언박싱)
		

		d = new Object();		//객체 생성
		System.out.println("d.toString() : " + d.toString());
		//--==>>d.toString() : java.lang.Object@15db9742


		d = new Integer(10);	 //업 캐스팅			이게 왜 업캐스팅?????
		System.out.println("d.toString() : " + d.toString());
		//--==>>d.toString() : 10

		//오버라이딩 됐구나 ~~~~라고 생각 한다.
		//퍼즐조각을 수시로 꺼낼수 있어야한다.

		d = new Double(12.345); //업캐스팅			왜?? 태민
		System.out.println("d.toString() : " + d.toString());
		//--==>>d.toString() : 12.345

		d = 10;			//--오토 박싱
		System.out.println("d.toString() : " + d.toString());
		//--==>>d.toString() : 10

		
	}
}