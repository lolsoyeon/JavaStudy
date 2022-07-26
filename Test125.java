/*==============================================
   ■■■ 클래스 고급 ■■■ 2022-07-21
	- 중첩 클래스
===============================================*/

/*
○Annonymous클래스(익명의 클래스 : 무명의 클래스)

 - AWT 나 안드로이드 이벤트 처리에서 일반적으로 사용
 - 상위 클래스 메소드를 하나 정도 재정의 할 필요성이 있을때 사용
 - 클래스의 객체가 필요하면 또 다시 클래스를 생성해야 하는
   번거로움으로 인해 빈번하게 객체 생성이 필요한 경우
   익명의 클래스를 생성하여 처리 할 수 있다.

○ 형식 및 구조
	new 상위 클래스의 생성자()
	{
		접근제어 지시자 자료형 메소드()
		{
			.....;
		}
	};			 ← check ~!!세미 콜론
*/

//import java.leng.*;
class Test3		//extends Object
{
	/*Object의 멤버들~!!!

	public String toString()
	{

	}
	*/
	public Object getString()
	{
		return new Object()
		{
			@Override
			public String toString()
			{
				return "익명의 클래스.....";
			}
		};		//← 세미콜론 주의~!~!(미 작성시 에러)

	}

}

public class Test125	//extends Object
{	
	/*
	object 의 멤버들 상속~!!!
	*/
	public static void main(String[] args)
	{	
		Test3 ob1 = new Test3();

		System.out.println(ob1.toString());
		//--==>>Test3@15db9742

		System.out.println(ob1.getString());
		//--==>>익명의 클래스.....
	}

}