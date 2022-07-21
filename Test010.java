/*자바의 개요 및 특징

퀴즈
사전에 부여된 반지름 정보를 통해
원의 넓이와 둘레를 구하는 프로그램을 구현한다.
	반지름 : 10
	원의 넓이 = 반지름 * 반지름 * 3.141592
	원의 둘레 = 반지름 * 2 * 3.141592

실행 예)
넓이 : xxxxx

*/

public class Test010
{
	public static void main(String[] args)
	{
		//내가 풀이한 내용
		/*int a = 10;
		double pi = 3.141592;
		double c = a*a*pi;
		double d = a*2*pi;


			System.out.println("넓이 : " + c);
			//넓이 : 314.1592
			System.out.println("둘레 : " + d);
			//둘레 : 62.83184	*/


			//주요 변수 선언
		int r = 10;  //반지름
		final double PI = 3.141592; //원주율 
		//--==> final 키워드 : 변수를 상수화~!~!
		//RAINBOW_COLOR    PI
		//APPLE_PRICE	
		double area, length;

		//연산 및 처리
		//원의 넓이 = 반지름 * 반지름 * 3.141592   한글형태로 적어놓기
		//원의 둘레 = 반지름 * 2 * 3.141592
		//원의 넓이 = 반지름 * 반지름 * 3.141592

		area = r * r * PI;
		length = r * 2 * PI;



		// 결과출력
		System.out.println("넓이 : " + area);
		System.out.println("둘레 : " + length);

		//System.out.printf("넓이 : %.3f\n",area);
		
		








	}
}