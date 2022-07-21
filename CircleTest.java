
/*===============================================
  ■■■클래스와 인스턴스■■■
 -  클래스 설계는 답이 없어서 어렵다
=================================================*/

//Test071.java와 세트~!~!

//원의 넓이와 둘레구하기
//원의 넓이와 둘레를 구할 숭 있는 클래스를 설계한다.
//클래스명 : circleTest CircleTest.java
//BufferedaRead 의 readLine()

//원의 넓이 = 반지름 * 반지름 * 3.141592
//원의 둘레 = 반지름 * 2 * 3.141592

//실행 예)
//반지름 입력 : xxx 

//>>반지름이 xxx인 원의
//>>넓이 : xxx.xxx
//>>둘레 : xxxx.xxx
//계속하려면 아무 키나 누르세요......


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest{  

	//주요 속성(데이터) → 멤버 변수

	int r;						//반지름을 담을변수

	final double PI = 3.141592;	//원주율(변수의 상수화)

	//주요 기능(동작, 행위) → 멤버 메소드
	//반지름 입력 기능 → 메소드 정의

	void input() throws IOException           //메소드의 이름은 동사로 추천
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("반지름 입력 : ");

		r = Integer.parseInt(br.readLine());	//r을 초기화 시킬수 있어야한다.
	}

	//넓이 계산 기능 → 메소드 정의     생각 1.메소드의 이름 2. 메소드안에서 어떤작업들을 시킬까?
	double calArea()
	{
		//원의 넓이 = 반지름 * 반지름 * 3.141592
		return r * r * PI;
		
	}
	//둘레 계산 기능 → 메소드 정의
	double calLength()
	{
		//원의 둘레 = 반지름 * 2 * 3.141592
		double result;				//???

		result = r * 2 * PI;

		return result;
	}
	//결과 출력 기능 → 메소드 정의

	void print(double a, double l)			//이름 달라도됨
	{
		
		/*>>반지름이 xxx인 원의
		>>넓이 : xxx.xxx
		>>둘레 : xxxx.xxx*/
		System.out.printf(">>반지름이 xxx인 원의\n" , r);
		System.out.printf(">>넓이 : ", a);
		System.out.printf(">>둘레 : " , l);
		
	}

}//end class

/*	
	double calLength()
	{
		double result;
		result = r * 2 * PI;	//원의 둘레 = 반지름 * 2 * 3.141592
		return result;
	}

	double calAarea()
	{
		double result;

		result = r * r * PI;     //원의 넓이 = 반지름 * 반지름 * 3.141592

		return result;

	}

		void print(int a, int b)
	{
		System.out.printf("반지름음 %d인 원의 " + r);
		System.out.println(">>넓이 : " + a);
		System.out.println(">>둘레 : " + b); 
	}

			*/

//>>반지름이 xxx인 원의
//>>넓이 : xxx.xxx
//>>둘레 : xxxx.xxx
//계속하려면 아무 키나 누르세요......

			


/*내가 한것 

	int r;			//반지름을 담을변수
	//int area;		//넓이를 담을 변수
	//int length;		//둘레를 담을 변수

	final double PI = 3.141592;
	
		int input() throws IOException

		{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("반지름 입력 : ");

		r = Integer.parseInt(br.readLine());
		

		//연산 및 처리

		//출력
		
		double calLength()
		{
			double result;
			result = r * 2 * PI;	//원의 둘레 = 반지름 * 2 * 3.141592
			return result;
		}

		double calAarea()
		{
			double result;

			result = r * r * PI;     //원의 넓이 = 반지름 * 반지름 * 3.141592

			return result;
	
		}

			void print(int a, int b)
		{
			System.out.printf("반지름음 %d인 원의 " + r);
			System.out.println(">>넓이 : " + a);
			System.out.println(">>둘레 : " + b); 
		}


			
		}
//>>반지름이 xxx인 원의
//>>넓이 : xxx.xxx
//>>둘레 : xxxx.xxx
//계속하려면 아무 키나 누르세요......

			

}//end class

*/