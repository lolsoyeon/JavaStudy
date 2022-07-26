/*=================================================================
   ■■■ 자바의 주요(중요) 클래스 ■■■	2022-07-26 오전 10:23
 - 자바에서 기본적으로 제공하는 주요 클래스들
 - Math 클래스
==================================================================*/

/*
○ java.lang.Math 클래스는

수학(Math)과 관련된 유용한 속성 함수들을 제공하는 클래스로
생성자가 있긴 하지만.......『private』 으로 선언되어있기 때문에
외부에서 객체(인스턴스)를 생성할 수 없다. ★
단, 모든 메소드가 static 으로 정의되어 있으므로
객체를 생성하지않고 바로 접근하여 사용하는것이 가능하다.
//Math.

java.lang.Math 클래스의 주요 상수 및 매소드

- public static final double E = 2.71...;
: 자연 로그 상숭

- public static final double PI = 3.141592...;
 : 원주율 (Ω)

 - public static double sin(double a)
 - public static double cos(double a)
 - public static double tan(double a)
 : sin a cos a tan a값을 반환한다(삼각함수)

- public static double asin(double a)
- public static double acos(double a)
- public static double atan(double a)
: asin(a), acos()  값을 반환한다.(삼각함수의 역함수)

- public static double toRadians(double angdeg)
: 각도 를 라디안으로 바꾸어 반환한다
- public static double toDegrees(double angrad)
: 라디안을 각도로 바꾸어 반환한다.

- public static double exp(double a)
: e의 a승을 구하여 반환한다.

- public static double log(double a)
: 로그 값을 구하여 반환한다.

- public static double sqrt(double a)
: a의 제곱근을 구하여 반환한다.

- public static double ceil(double a)
: a보다 크거나 같은 정수를 반환한다. (올림의 개념)

- public static double floor(double a) (절삭의 재념)
: a의 b승을 구하여 반환한다.

- public static double exp(double a, double b)
: 

*/

public class Test145
{
	public static void main(String[] args)
	{
		System.out.println("원주율 : " + Math.PI);
		System.out.println("2의 제곱근  : " + Math.sqrt(2));



		System.out.println("파이에 대한 Degree : " + Math.toDegrees(Math.PI));
		System.out.println("2 파이에 대한 Degree : " + Math.toDegrees(2.0*Math.PI));

		//각도를 라디안으로 변환

		double radian45 = Math.toRadians(45);

		System.out.println("각도 45 : " + radian45 );
		System.out.println("싸인 45 : " + Math.sin(radian45) );
		System.out.println("코싸인 45 : " + Math.cos(radian45) );
		System.out.println("탄젠트 45 : " + Math.tan(radian45) );

		//--==>>각도 45 : 0.7853981633974483
		//		싸인 45 : 0.7071067811865475
		//		코싸인 45 : 0.7071067811865476
		//		탄젠트 45 : 0.9999999999999999


		System.out.println("로그 25 : " + Math.log(25));
		//--==>>로그 25 : 3.2188758248682006

		System.out.println("2의 4승 : " + Math.pow(2,4));
		//--==>>2의 4승 : 16.0

		System.out.println("0.0 ~ 1.0사이의 난수 : " + Math.random());
		//--==>>0.0 ~ 1.0사이의 난수 : 0.2684717965002765
		//		0.0 ~ 1.0사이의 난수 : 0.8836932420107225

	
	}
}