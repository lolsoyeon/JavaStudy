
import java.util.Scanner;
import java.util.Random;

public class RpsGame 
{
	private int user;
	private int admin = 0;
	private int price = 0;
	
	// 5만원 이상일때 게임 실행하기
	public void gameStart(int total)
	{
		price = total;
		while (true)
		{
			if (total >= 50000)
			{

			System.out.println("■■■ 50,000원 이상 구매시 참여 가능한 이벤트~!! ■■■");
			System.out.println();
			break;
			}
			else if (total < 50000)
			{
			System.out.printf("최종 결제 금액은 : %d\n", total);
			//결제창 호출();
			
			System.exit(-1);
			}

		}
	}

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
			System.out.print("(1)가위 (2)바위 (3)보 중 숫자를 입력하세요(1~3) : ");
			user = sc.nextInt();
		}
		while (user < 1 || user > 3);

	}

	// 중간 결과 출력
	public void middleCalc()
	{
		String[] str = {"가위","바위","보"};

		System.out.println();
		System.out.println(" ★구매자 : " + str[user-1]);
		System.out.println(" ★관리자 : " + str[admin-1]);
		System.out.println();
	}

	// 승부에 대한 최종 결과 연산
	public void resultCalc()
	{
		//int local_admin;
		// (유저=="가위"&& 컴퓨터=="가위")||(유저=="바위"&& 컴퓨터=="바위")||(유저=="보"&& 컴퓨터=="보")

		if ((user==1&& admin==3)||(user==2&& admin==1)||(user==3&& admin==2))
		{
		   System.out.println("승부 결과 : 당신이 승리했습니다~!!\n");
		   RandomBox();

		   if (admin == 1)
		   {
			   System.out.printf("최종 결제 금액은 : %d\n", price - 1000);
			  
		   }
		   else if (admin == 2)
		   {
			   System.out.printf("최종 결제 금액은 : %d\n", price - 3000);
			  
		   }
		   else if (admin == 3)
		   {
			   System.out.printf("최종 결제 금액은 : %d\n", price - 5000);
			 
		   }
		   else
			   System.out.println("오류입니다. 관리자에게 문의하세요.");
		   
		   /*
		   local_admin = RandomBox();
		   System.out.printf(">> 결과값 : %d",local_admin);
			*/
		}

		else if ((user==1&& admin==2)||(user==2&& admin==3)||(user==3&& admin==1))
		{
			System.out.println("승부 결과 : 당신이 졌습니다. 아쉽지만 다음기회에~!!\n");
			System.out.printf("최종 결제 금액은 : %d", price);
			System.out.println();
		}
		
		else if (user==admin)
		{
			System.out.println("승부 결과 : 무승부입니다. 아쉽지만 다음기회에~!!\n");
			System.out.printf("최종 결제 금액은 : %d", price);
			System.out.println();

		}
	}

	// 이겼을 때 랜덤박스 생성 메소드
	public int RandomBox()
	{ 
		runCom();
		Scanner sc;
		//= new Scanner(System.in);
		
		while (true)
		{
			sc = new Scanner(System.in);
			System.out.println(">> 랜덤박스를 열어주세요 : [1]  [2]  [3] \n");
			user = sc.nextInt();
			System.out.println();

			if (user >= 1 && user <= 3)
			{
				break;
			}
			else 
			{
				System.out.println("다시 열어주세요 (1~3)");
			}
		}
		
		
		/*
		String[] discount = {"1000", "3000","5000"};
		double random = Math.random();
		int num = (int)Math.round(random *(discount.length-1));
		 return();

		//System.out.println(discount[num]);
		System.out.printf("%s원 할인권 당첨 !!", discount[num]);
		System.out.println();
		*/
	

		if (admin == 1)
			  System.out.print("1000원 할인권 당첨 !!!\n");
			//System.out.println();
		
		else if (admin == 2)
			System.out.print("3000원 할인권 당첨 !!!\n");
			//System.out.println();
	
		else if (admin == 3)
			System.out.print("5000원 할인권 당첨 !!!\n");		
		else
			System.out.print("다시 입력해주세요.\n");
			 System.out.println();
		// 3 이상 입력시 똑같이 나옴
		return admin;

	}
			

}

/*
public class EventGame
{
	public static void main(String[] args)
	{
		RpsGame ob = new RpsGame();
		
	ob.gameStart();
	ob.input();
	ob.middleCalc();
	ob.resultCalc();
		

		}
	}
*/


