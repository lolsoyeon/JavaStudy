/*=============================================
	- 클래스와 인스턴스 활용
===============================================*/

//1 ~3 사이의 난수를 발생기켜서
//가위, 바위, 보 게임 프로그램을 구현한다
//단, 클래스의 개념을 활용하여 처리 할 수있도록 한다.
//또한, 배열을 활용하여 처리할 수 있도록한다//
//최종적으로 RpsGame 클래스를 완성할 수 있도록 한다.

//※ 기준 데이터 → 1:가위, 2:바위, 3:보

//실행 예)
//1:가위, 2:바위, 3:보 중 입력(1~3) : 4
//1:가위, 2:바위, 3:보 중 입력(1~3) :-2 
//1:가위, 2:바위, 3:보 중 입력(1~3) : 2

//유저   : 바위
//컴퓨터 : 보

//승부 최종 결과 : 컴퓨터가 이겼습니다~!!!
//계속하려면 아무 키나 누르세요....
//내문제는 위에서 너무 순서대로 짜려고한다 메소드(기능)을 먼저 짜고 거기에 넣어주자.

import java.util.Scanner;
import java.util.Random;

class RpsGame
{
	private	int user;		
	private	int com;
	String[] str = {"가위", "바위" ,"보"};


	//컴퓨터의 가위바위보
	private void runcom()
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;			//0 1 2 → (+1)중요 → 1 2 3  
		
	}
	//유저의 가위바위보
	public void input()
	{
		//유저가 가위바위보 하기전에 컴퓨터 먼저 가위바위보
		runcom();
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("1:가위, 2:바위, 3:보 중 입력(1~3) : ");
			user = sc.nextInt();

		}
		while (user<1 || user>3);		//1보다  작으면서 동시에 3보다 작은수는 없다.
	}

	//중간결과 출력
	public void middle()
	{
		System.out.println();
		System.out.println(" - 유저 : " + str[user-1]);
		System.out.println(" - 컴퓨터 : " + str[com-1]);
	}

	//승부에 대한 최종 결과 연산
	public String result()
	{
		String result = "무승부 상황입니다~!";
		//(유저 ==가위 && 컴==보) || (유저== 바위 &&컴==가위) ||(유저 ==보 &&컴==바위)
		if ((user==1 && com==3) || (user== 2 &&com==1) ||(user ==3 &&com==2))
		{
			result = "당신이 승리했습니다";
		}
		////(유저 ==가위 && 컴==바위) || (유저== 바위 &&컴==보) ||(유저 ==보 &&컴=가위)
		else if ((user ==1 && com==2) || (user== 2 && com==3) ||(user==3 && com==1))
		{
			result = "컴퓨터가 승리했습니다";

		}
		return result;
	}

	public void print(String str)
	{
		System.out.printf("%n>>승부 최종결과 :  %s%n", str);
		
	}
}

public class Test102
{
	public static void main(String[] args)
	{

		RpsGame ob = new RpsGame();
		ob.input();
		ob.middle();
		String result = ob.result();
		ob.print(result);
		
	}
}

/*
		Scanner sc = new Scanner(System.in);
		int n;		//입력 받을 1 2 3 변수 선언


		String [] arr = {"가위", "바위" ,"보"};		//음식을 담은 배열 선언

		System.out.print("1:가위, 2:바위, 3:보 중 입력(1~3) : "); //입력메세지 출력
	
		n = sc.nextInt();		//사용자 입력

		if (n<1 && n>3)			//그 입력이 1~3에 속하지않는다면 계속 메세지 출력
		{

			System.out.println("1:가위, 2:바위, 3:보 중 입력(1~3) : ");
		}

		//	난수 인스턴스 생성
		Random rd = new Random();
		// 배열 인스턴스 생성  
		//String [] arr = new String[3];


		rd.nextInt(n);
		System.out.print("발생한 난수" ,n`);
		String arr [] = new String[arr.length];

		for (int i = 0;i<arr.length ;i++ )
		{
			System.out.printf("%2d",arr[i]);
		}
		
		
*/

/*
1:가위, 2:바위, 3:보 중 입력(1~3) : 2

 - 유저 : 바위
 - 컴퓨터 : 바위

>>승부 최종결과 :  무승부 상황입니다~!
계속하려면 아무 키나 누르십시오 . . .
*/