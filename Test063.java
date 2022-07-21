/*======================================================================
  ■■■실행 흐름의 컨트롤 (제어문)■■■
 
  - 반복문 (for문)실습 및 '관찰'      

  ======================================================================*/

  //다중 for문(반복문의 중첩)을 활용한 별찍기 실습


  //과제○
  
  //다음과 같은 내용이 출력될 수 있도록
  //반복문의 중첩 구문을 작성하여 프로그램을 구현한다.


  //실행 예)

  /*
       
   *********
    *******
	 *****
	  ***
	   *

 */

 //분석 : Test062와 유사 순서 바꿔주기 생각
 //별   9 7 5 3 1 순서
 //공백 0 1 2 3 4 순서
 //큰 for 로 5번 반복 
 //작은 for 로 공백 별 공백 반복

public class Test063
{
	public static void main(String[] args)
	{
		//주요 변수선언
		int i,j;			//루프 변수 별을 담을 i, 공백을 담을 j

		//연산 및 처리,출력	
		for (i=0; i<6;i++ )		//5행을 반복
		{
			for (j=i; j>0; j--)		//반복 횟수만큼 공백 출력
			{
				System.out.print(" ");
			}
			for (j=5-i; j>0; j--)	//5번 반복 -횟수만큼 별 출력
			{
				System.out.print("*");
			}
			for (j=4-i; j>0 ;j--)	//4번 반복 -횟수만큼 별 출력
			{
				System.out.print("*");
			}

				System.out.println();

		}
		
	}
}

/*실행 결과

*********
 *******
  *****
   ***
    *

계속하려면 아무 키나 누르십시오 . . .

*/