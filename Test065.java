/*======================================================================
  ■■■실행 흐름의 컨트롤 (제어문)■■■
 =====================================================================*/


 //break;실습
 //break 키워드가 지니는 의미
 //멈춘다 + (그리고 빠져나간다)

 //다음과 같은 처리가 이루어지는 프로그램을 구현한다
 //단, 입력받는 정수는 1 ~ 100 범위 안에서만
 //가능 하도록 작성한다.


 //실행 예)

 //임의의 정수 입력 : -10

 //임의의 정수 입력 : 0

 //임의의 정수 입력 : 1022

 //임의의 정수 입력 : 10


 //>>1 ~10 까지의  합 : 55
 //계속하시겠습니까(Y/N)? : Y


 //>>1 ~100 까지의  합 : 5050
 //계속하시겠습니까(Y/N)? : N
 //계속하려면 아무 키나 누르세요..... → 프로그램 종료

//임의의 정수를 입력받는다. BufferedReader

//%d ~ %d 까지의 합 : s변수선언

//계속하시겠습니까(Y/N)? : 물어봐야함


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test065
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//check
		//누적합 변수의 초기화

		int n, s, i;
		char ch;

		// n : 사용자 입력값을 담아둘 변수 
		// s : 누적합 연산결과를 담아낼 변수 
		// i : 1 부터 1씩 사용자의 입력값까지 증가할 변수 //i++; if문?

		while (true)
		{
			//무한 반복 루프

			do
			{
				System.out.print("\n임의의 정수 입력 : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n<1 || n>100);

			// 테스트 (확인해보기)
			//System.out.println("유효한 정수 입력 완료~!~!");

			//누적합 변수의 초기화 위치
			
			s = 0;

			for (i=1; i<=n; i++)
			{
				s += i;		// 누적합 연산
			}

			//System.out.printf(">> 1 ~ d% 까지의 합 : %d\n", n, s);
			System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", n, s);
			


			System.out.print("계속하시겠습니까(Y/N)? : ");    //Y,y만 유의미 
			ch = (char)System.in.read();

			//==계속할지 말지에 대한 여부(의사표현)


			//그만 할래 빠져나감
			//if (ch=='N'|| ch=='n')	//N 또는 n 입력한거 맞아?

			//긍정 || 긍정 회로 → 부정 && 부정으로바뀜

			
									//Y 또는 y 입력한거 아닌거 맞아?
			if (ch!='Y' && ch!='y') //대문자와이도 아니면서 동시에 소문자 와이도 아니어야해 → 따라서 ||가 아님 
			{
				//반복문을 멈추고 빠져나갈 수 있는 코드 작성 필요
				//위와 같은 의사표현을 했다면
				//그동안 수행했던 반복문을 멈추고 빠져나가야한다.
				break;

				//멈춘다 + (그리고 빠져나간다.) check~!~!

			}//end if


			//엔터값 처리(\r\n)
			System.in.skip(2);   //엔터값 버려줘,,,,,

		}//end while()

	}//main()
	
}//class


/*
		System.out.print("임의의 정수 입력 : ");//말 먼저 하고 입력받자
		
		char ch = (char)System.in.read();				//\r \n skip(2)


		n = Integer.parseInt(br.readLine());
		



		System.out.print("%d ~ %d 까지의 합 : ",s);





		//char ch;
		//프로세스를 계속 진행할지 말지의 여부를 담아둘 변수

		/*do
		{
			System.out.print("\n임의의 정수 입력 : ");
			n = Integer.parseInt(br.readLine());
		}
		while (n<1 || n>100);

		// 테스트 (확인해보기)
		//System.out.println("유효한 정수 입력 완료~!~!");
		for (i=1;i<=n ;i++ )
		{
			s += i;		//누적합 연산

		}
		System.out.printf(">> 1 ~ d% 까지의 합 : %d\n",n ,s );
*/

