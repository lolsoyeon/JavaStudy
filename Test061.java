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
       *
	  **
	 ***
	****
   *****

 */

//분석
//반복 5번
//오른쪽 부터 찍어야 한다.

public class Test061
{
	public static void main(String[] args)
	{
		//주요 변수선언 및 초기화
		int i, j, k;		//루프 변수 선언 i는 큰 웅~ ,k는 공백 쑝쑝, j는 *쑝쑝

		for (i=1; i<=5;i++)	//5줄의 반복 출력 따라서 1부터 ,5포함
 		{
			for (j=4; j>=i;j--)	//첫줄에 공백 4개이며 반복마다 1개씩 공백이 줄어든다.
			{

				System.out.print(" ");//초기 값을 1로시작해서 공백 4번 출력
			}
			for (k=1; k<=i ;k++)	//첫 줄에 별2 한개 출력, 반복마다 1개씩 별이 늘어남
			{
				System.out.print("*");//웅~공백4별1→웅~공백3별2→웅~공백2별3→웅~공백1별4 웅~별5개
			}

			System.out.println();	//첫 for문 반복 마다 개행 진행! 따라서 개행 5번 
		}

	}


}
		

		/*실행 결과
    *
   **
  ***
 ****
*****
계속하려면 아무 키나 누르십시오 . . .

		*/
