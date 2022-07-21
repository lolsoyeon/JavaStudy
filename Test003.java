/*자바기본 프로그래밍
*/


public class Test003
{
	public static void main(String[] args)
	{
		//변수 선언
		int a;

		// 10을 a라는 변수에 대입해라라는 의미!!!!(변수 초기화)
		a = 10;    
 
		//변수 선언 및 초기와 (선언과 대입을 한 번에 처리)
		int b = 20;

		//int a = 30;

		//변수 선언
		int c;

			//
			//System.out.println(c);
			//--==>>에러 발생(컴파일 에러)

			c = a + b;
			// c = 10+20;
			// c = 30;
			// 변수 c에 30 대입해라,

			// 결과 출력
			System.out.println(c);
			// --==>>30
			// 
			//System.out.printin(a b c);
			//--==>>에러 발생 (컴파일 에러)

			//결과 출력
			System.out.println(a + " " + b + " " + c);
							//(" 10 20 30"
			//						문자열임 따라서 결합시킨다.
			System.out.println("a 의 값은 " + a + "입니다");
			System.out.println("b 의 값은 " + b + "입니다");
			System.out.println("c 의 값은 " + c + "입니다");
			
	}
}

//실행결과
/*
30
10 20 30
a 의 값은 10입니다
b 의 값은 20입니다
c 의 값은 30입니다*/