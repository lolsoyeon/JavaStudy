/*==============================================
    	■■■ 정렬(Sort) 알고리즘 ■■■
===============================================*/

//○ 과제
//	사용자로부터 여러 학생의 성적 데이터를 입력받아
//	점수가 높은 학생부터 낮은 순으로 등수를 부여하여 (내림차순)
//	결과를 출력하는 프로그램을 구현한다.
//	단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록한다.

//실행 예)
//인원 수 입력 : 5
//이름 점수 입력(1, 공백 구분) : 장현성 90
//이름 점수 입력(2, 공백 구분) : 정미경 80
//이름 점수 입력(3, 공백 구분) : 최동현 85
//이름 점수 입력(4, 공백 구분) : 조현하 75
//이름 점수 입력(5, 공백 구분) : 박원석 95
/*
---------------
1등 박원석 95
2등 장현성 90
3등 최동현 85
4등 정미경 80
5등 조현하 75
---------------
계속하려면 아무 키나 누르세요.....

*/
/*
1. 인원 수 입력 : 먼저 안내하고 int inone; 점수는 score = 0;초기화 해놓고,,,,이름도 그냥 배열에???
2. Scanner 사용하여 사용자로 부터int inone; 후 입력받는다
2-1. 사용자로부터 받은 inone 수만큼 이름 점수 입력 반복해야해서 for문 사용예정
3. 입력받은 이름을 배열로 구성하고 점수를 배열로 총 2개 배열 구성해서 
4. 선택 정렬을 통해 값을 비교 한다 ^ , 내림차순== 작으면 바꾼다. 
5. 출력한다
5-1.랭킹을 하는방법 고민......그냥 숫자 부여

6 문제

*/
//import java.io.IOException;
import java.util.Scanner;
public class Test110
{
	public static void main(String[] args) //throws IOException
	{
		int inone;
		System.out.print("인원 수 입력 : ");
		Scanner sc = new Scanner(System.in);
		inone = sc.nextInt();

		//인원수 만큼의 이름 배열구성
		String[] names = new String[inone];
		//인원수 만큼의 점수 배열 구성
		int[] score = new int [inone];
	
		//이름 점수 입력받기
		for (int i = 0;i<inone ;i++ )
						//=부등호 포함되면 안된다 why?넘어버림
		{
			System.out.printf("이름 점수 입력(%d, 공백 구분) : ",(i+1));

			//입력을 받으면서 동시에 배열에 담는다
			names[i] = sc.next(); //or sc.next();

			score[i] = sc.nextInt();
		}
		//-----------------------------------------------이까지하면 3번 완료
		//score[i]의 값을 비교해야하는데  내림차순 작으면 바꾼다
		/*
		90 80 85 75 95		0 1
		== --
		90 80 85 75 95		0 2
		==    --
		90 80 85 75 95      0 3
		==       --
		95 80 85 75 90		0 4  
		==          --
		-------------------1회전
		95 85 80 75 90
		   == --
		95 85 80 75 90
		   ==    --
		95 90 80 75 85
		   ==       --
		-------------------2회전
		95 90 80 75 85
		      == --
		95 90 85 75 80
		      ==    --
		-------------------3회전 완료
		95 90 85 80 75
		         == --
		
		비교기준 0         1    2   3
		비교대상 1 2 3 4   234  34  4
		
		*/
		for (int i = 0;i<score.length-1 ;i++ )		//비교 기준
		{
			for (int j =i+1;j<score.length ;j++)		//비교 대상
			{
				if (score[i]<score[j])
				{
					score[i] = score[i] ^ score[j];
					score[j] = score[j] ^ score[i];
					score[i] = score[i] ^ score[j];

					String m;		//이름도 바꿔줘야함
					m = names[i];
					names[i] = names[j];
					names[j]= m;


				}
			}
		}
		
		//--------------------출력만 남은상황
		System.out.println();
		System.out.println("---------------");
		for (int i = 0;i<score.length ;i++ )
		{
			System.out.printf("%d등 %s %d%n", i+1, names[i], score[i]);
		}
		System.out.println("---------------");
		System.out.println();

/* 실행결과
인원 수 입력 : 5
이름 점수 입력(1, 공백 구분) : 장현성 90
이름 점수 입력(2, 공백 구분) : 정미경 80
이름 점수 입력(3, 공백 구분) : 최동현 85
이름 점수 입력(4, 공백 구분) : 조현하 75
이름 점수 입력(5, 공백 구분) : 박원석 95

---------------
1등 박원석 95
2등 장현성 90
3등 최동현 85
4등 정미경 80
5등 조현하 75
---------------

계속하려면 아무 키나 누르십시오 . . .

*/
	}
}