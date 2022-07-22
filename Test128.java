/*=================================================================
   ■■■ 자바의 주요(중요) 클래스 ■■■ 2022-07-21 2022-07-22
 - 자바에서 기본적으로 제공하는 주요 클래스들
 - Object 클래스   ==비교연산자
==================================================================*/

//import java.
class Test
{
	/*
	.....
	*/
	private int a  = 10;
	public void write()
	{
		System.out.println("a : " + a);
	}
	
}
public class Test128 //extends Object
{
	

	public static void main(String[] args)
	{
		Test ob1 = new Test();
		Test ob2 = new Test();

		System.out.println("10 == 9 : "+ (10 == 9));
		//--==>>10 == 9 : false

		int a = 10;
		int b = 10;

		System.out.println("a == b : "+ (a == b));
		//--==>>a == b : true

		System.out.println("ob1 == ob2 : " + (ob1 == ob2));
		//--==>>ob1 == ob2 : false       
		//※ 객체(Object)들을 비교하는 과정에서 사용하는『 == 』연산자는
		//	크기를 비교하는것이 아니라 객체의 주소를 비교.

		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println();

		
		System.out.println("ob1             : " + ob1);
		
		System.out.println("ob1.toString()  : "+ ob1.toString());
		//ob1             : Test@15db9742
		//ob1.toString()  : Test@15db9742
		System.out.println("ob2           : "   + ob2);
		System.out.println("ob2.toString()  : "+ ob2.toString());
		//ob2           : Test@6d06d69c
		//ob2.toString()  : Test@6d06d69c

		//클래스명@해시코드
		// ※ 해시코드(hashcord)
		// :	자바 내부적으로 객체를 구분하기 위해 사용하는것
		//		메모리의 주소값으로 생각하면 절대로 안된다.
		
		//※ 객체가 같으면 hashcord(해시코드) 가 같지만
		//	  hashcord(해시코드)가 같다고해서 같은 객체는 아니다.









	}
}