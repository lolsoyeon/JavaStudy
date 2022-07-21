/*==============================================
    	■■■ 정렬(Sort) 알고리즘 ■■■
===============================================*/
/*
○ 정렬
	: 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순, 내림차순)

○	정렬의 목적
	: 데이터 처리 과정의 편의성이나 가독성을 높이기 위함 
	→ 보기 좋게....검색하기 위함 

○ 정렬의 종류
 : 선택 정렬, 버블 정렬, 삽입 정력, 힙 정렬, 퀵 정렬, 쉘 정렬..........

*/
 
//버블 정렬(거품 정렬, Bubble Sort)  

//실행 예)
//Source Data : 52 42 12 62 60
//Source Data : 12 42 52 60 62
//계속하려면 아무 키나 누르세요..
public class Test108
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};
		/*
		42, 52, 12, 62, 60
		==  --

		42, 12, 52, 62, 60
			==  --

		42, 12, 52, 62, 60
				==  --	

		42, 12, 52, 60, 62
					==  --
		----------------------------1회전	돌고나면 맨 끝자리수가 픽스
		12, 42, 52, 60, 62
		==  --
		12, 42, 52, 60, 62
			==  --
		12, 42, 52, 60, 62	
				==	--
		---------------------------2회전
		12, 42, 52, 60, 62	
		==  --
		12, 42, 52, 60, 62	
		    ==  --
		---------------------------3회전

		12, 42, 52, 60, 62	
		==  --
		---------------------------4회전

		*/

		int i, j ;
		System.out.print("Source Data : ");
		for (int n : a )
		{
			System.out.print( n + "   ");
	
		System.out.println();


		//Bubble Sort			비교기준을 정하고 대상은 무조건 다음꺼
		for (i = 1; i< a.length; i++ )	//i →1    2   3  4 뒤에서 비교 대상을 하나씩 추가
		{	for (j=0; j<a.length-1; j++ )//j →0123 012 01 0 - 비교 기준 자리
			{
				if (a[j]>a[j+1])		//오름차순
				//if (a[j]>a[j+1])		//내림차순
				{
					//자리 바꿈
					a[j] = a[j] ^ a[j+1];
					a[j+1] = a[j+1] ^ a[j];
					a[j] = a[j] ^ a[j+1];
				}
			}
			
		}
		System.out.print("Source Data : ");

		for (int n : a )
		{
			System.out.print(n + "   ");
		}
		System.out.println();
	}
}
/* 처음 내가 한것
	int i, j ;
		System.out.print("Source Data : ");
		for (int n : a )
		{
			System.out.print( n + "   ");
		}
		System.out.println();
		//Bubble Sort
		for (i = 0; i+1< a.length;i++ )		//비교 기준 데이터
		{	
			for (j =i+1; j+1<a.length ;j++ )	//비교 대상 데이터
			{
				if (a[i]>a[j])
				{
					a[i] = a[i] ^ a[j];
					a[j] = a[j] ^ a[i];
					a[i] = a[i] ^ a[j];
				}

			}
		}
		System.out.print("Source Data : ");

		for (int n : a )
		{
			System.out.print(n + "   ");
		}
		System.out.println();
		
*/
/*
Source Data : 52   42   12   62   60
Source Data : 12   42   52   60   62
계속하려면 아무 키나 누르십시오 . . .

*/