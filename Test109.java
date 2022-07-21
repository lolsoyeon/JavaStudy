/*==============================================
    	■■■ 정렬(Sort) 알고리즘 ■■■
===============================================*/
//향상된 버블 정렬(Bubble Sort)

//※ 앞에서 본 Selection Sort(Test107)나 Bubble Sort(Test108)의 성능은 같다.
//	(→성능의 추정 근거 : 반복문을 수행한 횟수)
//	하지만, 향상된 Bubble Sort 대상 데이터의 구조에 따라서
//	일반 Bubble Sort 나 Selection Sort에 비해 성능이 좋을 수 있다.

// 원본데이터 : 61 15 20 22 30
//				15 20 22 30 61 1회전 (스왑발생→ true) →  다음 회전 진행○
//				15 20 22 30 61 2회전 (스왑발생→ flase) → 다음 회전 진행 X 

//1회전 수행 ....2회전 수행...을 해보니
//2회전에서 스왑 (자리바꿈) 이 전혀 일어나지 읺았기 때문에
//불필요한 추가 연산(더 이상의 회전)이 은 무의미한 것으로 판한하여 수행하지 않는다.

//실행 예)
//Source Data : 10 50 20 30 40
//Sorted Data : 10 20 30 40 50
//계속하려면 아무 키나 누르세요..
public class Test109
{
	public static void main(String[] args)
	{
		int [] a =  {10, 50, 20 ,30, 40};
		/*
		10 50 20 30 40
		== --
		10 20 50 30 40
		   == --
		10 20 30 50 40
		      == --
		10 20 30 40 50
				 == --

		-----------------------1회전

		10 20 30 40 50
	    == --
		10 20 30 40 50
		   == --
		10 20 30 40 50
	          == --
		----------------------2회전 → 스왑 발생하지 않음
				  X

				  X
		----------------------3회전 → X
		     
				  X
		----------------------4회전 → X

		*/
		int i,j;
		System.out.print("Source Data : ");

		for (int n : a)
		{
			System.out.print(n + "  ");
		}
		System.out.println();


		//향상된 Bubble Sort 구현 
		//스왑이 일어났는지 안일어났는지 체크하는 장치가 필요
		boolean flag;
		int pass = 0;
		do												//웅
		{
			flag = false;//이번 회전에서 자리 바꿈이 일어나지 않을것이다...
			pass++;
			//자리바꿈 ??
			//flag = true; ??

			for (i = 0; i<a.length-pass;i++ )		//쑝
			{
				//테스트
				//System.out.print("쑝");
				if (a[i] > a[i+1])
				{
					//자리바꿈 
					a[i] = a[i] ^ a[i+1];
					a[i+1] = a[i+1] ^ a[i];
					a[i] = a[i] ^ a[i+1];

					flag =true;
					//단 한 번이라도 스왑이 발생하게 되면
					//flag 변수는 true로 변경~!~!
				}
			}
		}
		while (flag);		//못해도 1번은 돌아봐야 비교가능
		//--flag 변수가 false라는 것은
		//	회전이 구분적으로 발생하는 동안 스왑이 일어나지 않은경우로
		//	더이상의 반복문 수행은 무의미 한 것으로 판단 가능~!
	

		System.out.print("Source Data : ");

		for (int n: a)
		{
			System.out.print(n + "  ");
		}
		System.out.println();
	
		

		/* 내가 한 것 
			for (i = 1;i<a.length ;i++ )
		{
			for (j = 0; j<a.length-1;j++)
			{
				
				if (a[i] == a[j])
				{
					continue;
				}
				
				if (a[i]<a[j])
				{
					a[i] = a[i] ^ a[j];
					a[j] = a[j] ^ a[i];
					a[i] = a[i] ^ a[j];
				}
				
			}
		}
		*/
	}
}
