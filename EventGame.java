
import java.util.Scanner;
import java.util.Random;

class RpsGame 
{
	private int user;
	private int admin;

	// 컴퓨터의 가위바위보
	private void runCom()
	{
		Random rd = new Random();
		admin = rd.nextInt(3)+1;			//- (3)이면 012 이니까 +1을 해서 123 순서로 만든다.
	}

	// 유저의 가위바위보
	public void input()
	{
		// 유저가 가위바위보 하기 전에... 컴퓨터(주최측) 먼저 가위바위보
		runCom();

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:가위 2:바위 3:보 중 입력(1~3) : ");
			user = sc.nextInt();
		}
		while (user < 1 || user > 3);

	}

	// 중간 결과 출력
	public void middleCalc()
	{
		String[] str = {"가위","바위","보"};

		System.out.println();
		System.out.println(" - 유저		:" + str[user-1]);
		System.out.println(" - 컴퓨터	:" + str[admin-1]);
	}

	// 승부에 대한 최종 결과 연산
	public void resultCalc()
	{

		// (유저=="가위"&& 컴퓨터=="가위")||(유저=="바위"&& 컴퓨터=="바위")||(유저=="보"&& 컴퓨터=="보")

		if ((user==1&& admin==3)||(user==2&& admin==1)||(user==3&& admin==2))
		{
		   System.out.println("승부 결과 : 당신이 승리했습니다~!!");
		   RandomBox();

		}

		else if ((user==1&& admin==2)||(user==2&& admin==3)||(user==3&& admin==1))
		{
			System.out.println("승부 결과 : 당신이 졌습니다. 아쉽지만 다음기회에~!!");
		}
		
		else if (user==admin)
		{
			System.out.println("승부 결과 : 무승부입니다. 아쉽지만 다음기회에~!!");
		}
	}

	// 이겼을 때 랜덤박스 생성 메소드
	public int RandomBox()
	{ 
		int arr[] = new int[]{1000, 2000, 3000};
		runCom();
		Scanner sc = new Scanner(System.in);
		System.out.println(">> 랜덤박스를 고르세요 : 1  2  3");
		user = sc.nextInt();
		

		  if (admin == 1)
			  System.out.printf("%s 원 할인권 당첨 !",arr[0]);
		  else if (admin == 2)
			System.out.printf("%s 원 할인권 당첨 !",arr[1]);
		  else 
			System.out.printf("%s 원 할인권 당첨 !",arr[2]);
			  System.out.println();
	}

}

	// 결과 출력
	/*
	public void print(String str)
	{
		System.out.printf("\n>> 승부 결과 : %s\n" ,str);
	}
	*/


public class EventGame
{
	public static void main(String[] args)
	{
		RpsGame ob = new RpsGame();
		
	ob.input();
	ob.middleCalc();
	ob.resultCalc();

	//ob.print(result);
		

	}
}



