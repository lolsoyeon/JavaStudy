//자바의 개요 및 특징
//-변수와 자료형
//-키워드 및 식별자


public class Test004
{
	public static void main(String[] args)
	{
		double hight = 172.8;
		int age = 25;
		char degree = 'A';

		//     식별자 

		String name = "엄소연";

		// String name = "김호진";	
		//--스코프 영역 안에서 변수명은 식별자~~!!!

		//String #name = "김태민"

		//$와 _를 제외한 다른 특수문자는 변수의 이름으로 활용x  
		//단, 규칙대로만 사용하자.

		String tel = "01012345678";
		//String _tel = "01012345678";
		//int tel  = 01012345678;(x)
		String 주소 = "경기도 남양주시";
		//--문법적으로 한글 단어를 변수명으로 사용가능하지만
		//실무적인 측면에서는 절대 한글단어 사용 x
		System.out.println("name : "+ name);
		System.out.println("_tel: " + tel);
		System.out.println("주소 : " + 주소);


	}
}

/*name : 엄소연
_tel: 01012345678
주소 : 경기도 남양주시
계속하려면 아무 키나 누르십시오 . . .*/


