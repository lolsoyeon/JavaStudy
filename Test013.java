
/*퀴즈
- 삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
이 삼각형의 넓이를 구하는 프로그래을 구현한다.

실행 예)
삼각형 넓이 구하는 프로그램
- 삼각형의 밑 변 입력 : 3
- 삼각형의 높이 입력 : 5

>>밑변이 3, 높이가 5인 삼각형의 넓이 : xxxx

//※문제 인식 및 분석(분석 먼저)
//	삼각형의 넓이 = 밑변 +높이 / 2
//	사용자로부터 데이터를 입력받아 처리 →BufferedReader 활용
//	BufferedReader 를 여러 개 사용? 한 개 사용 해도된다.



*/

import java.io.BufferedReader;  //설계도 확인용
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{   
		
		//주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
											//바이트 기반을 문자로 번역//(바이트기반 신호 얻어냄)


		//BufferedReader 인스턴스 생성

		//주요 변수 선언  , 밑변 높이 넓이
		int a; //밑변   //int underLength, height;
		int b; //높이
		double area; //넓이는 실수 형태 check~!~!

		//a = Integer.parseInt(br.readLine());
		//b = Integer.parseInt(br.readLine());

		//연산 및 처리
		//▷사용자에게 안내 메세지 출력
		//System.out.println("■삼각형 넓이 구하는 프로그램■");
		//System.out.print("삼각형의 밑 변 입력 : ");
		//▷사용자가 입력한 데이터를 정수 형태로 변환한 후
		//      변수  underLength 에 담아내기
		//underLegnth = Integer.parseInt(br.readLine());
		//▷다시 사용자에게 안내 메세지 출력
		//System.out.print("삼각형의 높이 입력 : ");
		//▷사용자가 입력한 데이터(문자열)를 정수 형태로 변환 한후
		//   변수 height 에 담아내기
		//▷삼각형의 구하는 연산 처리

		//area = underLength * height / 2; 정수 기반 연산 (몫을 취하고 나머지는 버림)
		//		 정수형 / 정수형  / 2.0;   실수 기반 연산
/*실수 자료형이 결과값으로 나오는 과정에서
실수기반의 연산이 필요한 상황이다.
정수형 2 가 아닌 실수형으로 2.0으로 나눗셈 연산을 수행하게되면
이 연산은 실수기반으로 처리한다.*/

		//area =(double)(underLength * height/ 2);  (X2)

		//결과 출력
			
			//System.out.println();개행
			//System.out.print();  에러 발생 (컴파일 에러)
			


			System.out.println("■삼각형 넓이 구하는 프로그램■");
			//a = Integer.parseInt(br.readLine());

			System.out.print("삼각형의 밑 변 입력 : ");
			a = Integer.parseInt(br.readLine());


			//b = Integer.parseInt(br.readLine());
			System.out.print("삼각형의 높이 입력 : ");
			b = Integer.parseInt(br.readLine());

			area = a * b * 0.5;
			System.out.printf("밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.1f\n", a ,b, area);
								



			/*■삼각형 넓이 구하는 프로그램■
삼각형의 밑 변 입력 :
5
삼각형의 높이 입력 :
5
밑변이 5, 높이가 5인 삼각형의 넓이 : 12.5*/




/*  System.out.println("삼각형 넓이 구하는 프로그램");
			System.out.println("삼각형의 밑 변 입력 : "+ a);
			System.out.println("삼각형의 높이 입력"+ b);

			System.out.printf();*/

		



	}
}