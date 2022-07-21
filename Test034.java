/*
======================================================================

■■■실행 흐름의 컨트롤 (제어문)■■■
-if문
-if ~else 문
  
======================================================================
*/
//1.프로그램을 작설 할때 주어진 조건에 따라
//	분기 방향을 정하기위해 사용하는 제어문에는
// if문, if~else문, 조건 연산자,복합 if문(if문 중첩)
//	,switch 문이있다

//2. if문은 if 다음의 조건이 참일경우
//	특정 문장을 수행하고자 할 때 사용되는 구문이다.

//사용자로부터 임의의 정수를 입력받아
//다음과 같은 판결 결과를 출력하는 프로그램을 구현한다.


//2의 배수 / 3의배수 / 2와 3의배수 / 2와 3의 배수아님


//실행 예)

//임의의 정수 입력 : 4
//4 → 2의 배수
//계속하려면 아무 키나 누르세요...

//임의의 정수 입력 : 9
//9 → 3의 배수
//계속하려면 아무 키나 누르세요...

//임의의 정수 입력 :12
//12 → 2와 3의 배수
//계속하려면 아무 키나 누르세요...

//임의의 정수 입력 :17
//17 → 2와 3의 배수 아님
//계속하려면 아무 키나 누르세요...



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test034
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//주요 변수 선언
			int n;
			

			//연산 및 처리
			System.out.print("임의의 정수 입력 : ");
			n = Integer.paresInt(br.readLine());


			//결과 출력
			if (n%2==0 && n%3==0)
			{
				System.out.println(n +"→2와 3의배수");

			}
			else if (n%2==0)
			{
				System.out.println(n + "→2의 배수");
			}
			else if (n%3==0)
			{
				System.out.println(n + "→ 3의 배수");
			}
			else if (n%2!=0 || n%3!=0)
			{
				
				System.out.println(n + "→2와 3의 배수 아님");
			}
			else
			{
				
				System.out.println(n + "→판정 불가");
			}
			

			
		
	}
}
/*
			System.out.print("임의의 정수 입력 : ");
			a = Integer.parseInt(br.readLine());

			if (a%3==0 && a%2==0)
			{
				System.out.println(a + " → 2와 3의배수");
			}
			else if (a%2==0)
			{
				System.out.println(a +" → 2의배수 ");
			}
			else if (a%3==0)
			{
				System.out.println(a + " → 3의 배수");
			}
			else				//나머진 다 아니야 보다는 체크하자
			{
				System.out.println(a + "→2와 3의 배수아님");
*/