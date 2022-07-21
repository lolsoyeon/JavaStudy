/*======================================================
    	■■■ 정렬(Sort) 알고리즘 ■■■   2022-07-19
=======================================================*/
/*
○ 정렬
	: 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순, 내림차순)

○	정렬의 목적
	: 데이터 처리 과정의 편의성이나 가독성을 높이기 위함 
	→ 보기 좋게....검색하기 위함 

○ 정렬의 종류
 : 선택 정렬, 버블 정렬, 삽입 정력, 힙 정렬, 퀵 정렬, 쉘 정렬..........

*/
 
//선택 정렬(Selection Sort)  하나를 지정해두고 나머지를 돌아가면서 비교 
							//n회전이 끝나면 그 n번째는 픽스

//실행 예)
//Source Data : 52 42 12 62 60
//Source Data : 12 42 52 60 62

public class Test107
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};
		/*
		42, 52, 12, 62, 60
		==  --  
		12, 52, 42, 62, 60
		==		--  
		12, 52, 42, 62, 60
		==			--  
		12, 52, 42, 62, 60
		==				--  
		------------------------------------1회전 (웅~)

		12, 42, 52, 62, 60
			==  --
		12, 42, 52, 62, 60
			==      --
		12, 42, 52, 62, 60
			==			--
		------------------------------------2회전 (웅~)

		12, 42, 52, 62, 60
				==	--
		12, 42, 52, 62, 60
				==		--
		------------------------------------3회전 (웅~)
		12, 42, 52, 60, 62
					==	--
		------------------------------------4회전 (웅~)
		*/
		int i, j;

		System.out.print("Source Data : ");
		/*

		for (i = 0; i<a.length ;i++ )
		{
			System.out.print(a[i] + " ");

		}
		System.out.println();
		*/

		//향상된 for 문 (foreach 구문)
		for ( int n : a)		//int n변수선언 : 자료구조 a를 털거야
		{
			System.out.print(n + " ");
		}
		System.out.println();

		//Selection Sort	
		for (i = 0;i<a.length-1 ; i++)		//기준이된다 마지막은 아님
											//웅웅		비교기준데이터(0   1   2  3)
		{									//						  1234 234 34 4 
			for (j=i+1;j<a.length ;j++ )	//쑝쑝		비교대상데이터
			{
				if (a[i] > a[j])			//오름차순 정렬
				//if (a[i]<a[j])		//내림차순
				{
					
					// 자리바꾸기
					a[i]= a[i] ^ a[j];
					a[j] =a[j] ^ a[i];
					a[i]= a[i] ^ a[j];
				}
			}
		}

		System.out.print("Source Data : ");
/*
		for (i = 0; i<a.length ;i++ )
		{
			System.out.print(a[i] + " ");

		}
		System.out.println();
*/
		for (int n : a )
		{
			System.out.print(n + " ");
		}
		System.out.println();

	}
		
}
/*
Source Data : 52 42 12 62 60
Source Data : 12 42 52 60 62
계속하려면 아무 키나 누르십시오 . . .
*/

/*
		for (int i = 0;i<a.length ;i++ )
		{

			System.out.print("Source Data : "+ a[i]);
		}
		for (int i = 0 i<;a.length ;i++ )
		{
			if (i[0]>i[1])
			{
				i[0] = i[0] ^ i[1]
			}
			else if (i[1]> i[2])
			{
				i[1] = i[1] ^ i[2]
			}
			else if (i[2]> i[3])
			{
				i[3] = i[2] ^ i[3]
			}
			else if (i[3]> i[4])
			{
				i[4] = i[3] ^ i[4]
			}
*/