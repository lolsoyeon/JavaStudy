
/*
======================================================================

■■■실행 흐름의 컨트롤 (제어문)■■■
-if문
-if ~else 문
  
======================================================================
*/
//사용자로부터 임의의 정수 5개를 입력받아
//짝수별, 홀수별 합계를 출력하는 프로그램을 구현한다,
//단, Scanner 를 활요ㅇ하여 데이터를 입력 받을 수 있도록 한다.

//실행 예)
//임의의 정수 5개 입력 (공백 구분) : 1 2 3 4 5 

// >>짝수의 합은 6이고, 홀수의 합은 9 입니다.
// 계속하려면 아무 키나 누르세요....


import java.util.Scanner;   //Scaaner는 IOE필요없음

public class Test038
{
	public static void main(String[] args)
	{
		//주요변수 선언

		//누적합을 담아 낼 변수 초기화 check~!
		Scanner sc= new Scanner(System.in);
		int evenSum=0;	//짝수의 합을 담을 변수(누적합) 누적합이라서 0 즉 초기화 시킨다.
		int oddSum=0;		//홀수의 합을 담아 낼 변수(누적합)
		int a, b ,c ,d ,e;
		// 사용자로부터 입력받은 다섯 개의 정수를 담아 낼 변수 선언


		//연산 및 처리
		System.out.print("임의의 정수 5개 입력 (공백 구분) : "); // 1 2 3 4 5 
		a = sc.nextInt();
		b = sc.nextInt();
		C = SC.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();

		if(a % 2 ==0)  //a가 짝수 일때 evenSum 을 a만큼 증가
		
			//evenSum 을 a만큼 증가  (~만큼 증가)라는 말은 기준 값이 있어야한다.
			evenSum += a;

		
		else if	//             홀수 일때 addSum을 a만큼 증가
			oddSum += a;
			//evenSum 을 1만큼 증가
		if(b % 2 ==0)  //a가 짝수 일때 evenSum 을 a만큼 증가
			evenSum += b;
			//evenSum 을 1만큼 증가

		else if //             홀수 일때 addSum을 a만큼 증가
			oddSum += b;
			//evenSum 을 1만큼 증가
		if(c % 2 ==0)  //a가 짝수 일때 evenSum 을 a만큼 증가
			evenSum += c;
			//evenSum 을 1만큼 증가

		else if	//             홀수 일때 addSum을 a만큼 증가
			oddSum += c;
			//evenSum 을 1만큼 증가
		if(d % 2 ==0)  //a가 짝수 일때 evenSum 을 a만큼 증가
			evenSum += d;
			//evenSum 을 1만큼 증가

			oddSum += d;
		else if	//             홀수 일때 addSum을 a만큼 증가

			//evenSum 을 1만큼 증가
		if(e % 2 ==0)  //a가 짝수 일때 evenSum 을 a만큼 증가
			evenSum += e;
			//evenSum 을 1만큼 증가

		
		else	//             홀수 일때 addSum을 a만큼 증가
			oddSum += e;
			//evenSum 을 1만큼 증가

		System.out.printf("\n >> 짝수의 합은 %d이고,  홀수의 합은 %d 이다.\n",evenSum, oddSum);

		
	}
}




/*
		Scanner sc = new Scanner(System.in)
		int a, b, c, d ,e;
		String strResult;

		System.out.print("임의의 정수 5개 입력 (공백 구분) : ");

		sc = new Scanner(sc.next()).useDilmiter("\\r*,\\r*");

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();

		String strResult;

		if(a % 2 ==0)
		{
			
		}

*/