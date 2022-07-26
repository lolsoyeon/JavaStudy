/*===============================================
						배열
	- 배열의 선언과 초기화
	- 배열의 기본적 활용
===============================================*/

// ○ 과제
//	  사용자로부터 임의의 정수를 임의의 갯수만큼 입력받아
//	  입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을구현
//	  단, 배열을 활용하여 구현할 수 있도록 한다.

// 실행 예)
// 입력할 데이터의 갯수   : 12
// 데이터 입력(공백 구분) : 74 65 13 91 54 22 86 45 13 99 11 38

// >> 가장 큰 수 → 99
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;

public class Test083
{
	public static void main(String[] args)
	{
		// 변수 선언
		int n;												// -- 데이터 갯수 (= 배열의 길이)
		int max=0;											// -- 최대값
		
		Scanner sc = new Scanner(System.in);

		// 사용자 입력 값 - 데이터 갯수
		System.out.print("입력할 데이터의 갯수   : ");
		n = sc.nextInt();

		// 배열의 배열 선언 및 메모리 할당
		int[] arr = new int[n];

		// 사용자 입력 값 - 데이터 입력
		System.out.print("데이터 입력(공백 구분) : ");
		
		// 배열의 배열 초기화
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		// 크기 비교
		for (int i=0; i<arr.length; i++)
		{
			if (max-arr[i]<0)
				max = arr[i];
		}
		
		// 결과 출력
		System.out.println();
		System.out.printf(">> 가장 큰 수 → %d%n", max);
	}
}

// 최종 결과
/*
	입력할 데이터의 갯수   : 12
	데이터 입력(공백 구분) : 75 65 13 91 54 22 86 45 13 99 11 38

	>> 가장 큰 수 → 99
	계속하려면 아무 키나 누르십시오 . . .
*/