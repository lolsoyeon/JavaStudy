/*=================================================================
   ■■■ 자바의 주요(중요) 클래스 ■■■	2022-07-26 오전 10:23
 - 자바에서 기본적으로 제공하는 주요 클래스들
 - Random 클래스
==================================================================*/

/*
○ java.util.Random 클래스는

여러 형태의 난수를 발생시켜 제공하는 클래스이다
Math 클래스의 정적 메소드인 Random()메소드도 난수를 제공하는 메소드이지만
0.0 ~ 1.0 사이의 실수 형태만 발생하게 되므로
필요한 여러 형태의 난수를 만들어내기 위해서는 추가적인 연산을 수행해야 한다.
그래서 자바는 여러 형태의 난수를 발생시켜주는
전용 클래스인 Random 클래스를 별도로 제공하고 있다.

*/

//로또 번호 생성(난수 발생 프로그램)

//프로그램이 실행되면 기본적으로 로또를
//5게임 수행하는 프로그램을 구현한다.

// 실행 예)
// 3 4 12 24 31 41
// 1 2 8 36 41 42
// 4 9 12 13 22 30
// 5 10 13 14 22 40
// 22 31 36 40 43 44
// 계속하려면 아무 키나 누르세요........

import java.util.Random;
import java.util.Arrays;

class Lotto
{
	//배열 변수 선언 및 메모리 할당 로또 번호를 담아줄 배열방 6칸
	private int[] num;

	//생성자
	Lotto()
	{
		num = new int[6];  //일반적으로는 생성자에서 구성한다 or 초기화 블럭
	}

	//getter 직접 접근을 못해서만듦   게터세터 공부하기
	public int[] getNum()
	{
		return num;
	}

	//6개의 난수를 발생시키는 메소드 정의
	public void start()
	{
		//random 클래스 인스턴스 생성
		Random rd = new Random();
		int n;
		int cnt = 0;


		jump:

		while (cnt<6)		// 0 1 2 3 4 5 
		{
			n = rd.nextInt(45) + 1;			//0 ~ 44 →사이의 『+1』 → 1 ~45

			for (int i =0;i<cnt ;i++ )		//cnt →4 / i →0123
			{
				if (num[i]==n)
				{
					continue jump;		// 자신을 감싸는 가장 가까운 반복문 기준
				}

				// num[cnt++] = n;		// 위치가 잘못된 상황
			}
			num[cnt++] = n;				// 위치 변경~!!!  check~!!!
		}
		//정렬 메소드 호출
		sorting();

	}	
	//정렬 메소드 정의
	private void sorting()			//리턴자료형?
	{
		Arrays.sort(num);
	}
}



public class Test146
{
	public static void main(String[] args)
	{
		Lotto lotto = new Lotto();

		//기본 5 게임
		for (int i = 1; i<=5; i++)
		{
			//로또게임수행
			lotto.start();

			for (int n : lotto.getNum())
			{
				System.out.printf("%4d ", n);
			}
			System.out.println();
		}	
		
	}
}
/*
public void start()
	{
		//random 클래스 인스턴스 생성
		Random rd = new Random();

		for (int j = 0;j<5 ;j++ )			//5게임 진행하는동안
		{
			
			for (int i = 1;i<45+1 ;i++ )		//1부터 45 까지의 정수중 6개 출력? 
			{
				num [i] = rd.next(45)+1;
			}

		System.out.println();		//개행
		}	
*/

/*	친구가 한 것

		for (int k = 0;k<5 ;k++ )			//5게임 진행하는동안
		{
			
			for (int i = 0;i<6 ;i++ )		//1부터 45 까지의 정수중 6개 출력? 
			{
				num [i] = (int)(Math.random()*45)+1;
				System.out.print(num[i] + " ");
			}
			for (int j =0;j<i ;i++ )
			{
				if (num[i] == num[j])
				{
					i++;
				}
					break;
			}

*/