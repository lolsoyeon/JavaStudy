import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Vector;
import java.util.Scanner;

public class AdminMode implements Mode
{	
	public static BufferedReader br;
	public static Integer sel;
	VendingMachine vendingmachine = new VendingMachine();
	UserMode user = new UserMode(vendingmachine);
	boolean flag;

	private VendingMachine machine;
	Vector<Items> items;
	
	//static
	public AdminMode()
	{ 	
		//this.vendingmachine = vendingmachine;
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	@Override
	public void display() 
	{
		System.out.println("===================[관리자 모드]===================");
		System.out.println("1.재고 추가");
		System.out.println("2.매출 확인"); 
		System.out.println("3.랭킹");
		System.out.println("4.화폐 수량");
		System.out.println("5.판매 모드 변경");
		System.out.println("6.종료");
		System.out.println("===================================================");
		System.out.print("필요한 작업을 입력해주세요(1~6) : ");

	}
	
	@Override
		public boolean selecting(){return true;};

	@Override
	public void select() throws IOException, NumberFormatException
	{	
		sel = Integer.parseInt(br.readLine());
		if (sel<1 || sel>6)
		{
			System.out.println("잘못 입력 하셨습니다");
			System.out.println("다시 입력 해주십시오");
			System.out.println();
		}
		else if (sel==1)
		{
			do
			{
				user.display();
				flag = this.stockup();
			}
			while (flag);
		}

		else if (sel==2)
		{
			//매출 확인 기능
		}

		else if (sel==3)
		{
			//
		}

		else if (sel==4)
		{
			//
		}

		else if (sel==5)
		{
			
			do
			{
				user.display();
				flag = user.selecting();
			}
			while (flag);	//판매자 모드도 돌고 계속 돌아야하는데... 나올땐 어떻게 빠져나올지.......
			
		}
		else if (sel==6)
		{	
			exit();

		}
	}

	

	public static void exit()
	{	
		System.out.println("프로그램을 종료합니다.");
		System.exit(-1);		
	}

	public boolean stockup() throws IOException		//입력을 받고 입력에 따른 내부적으로 기능 호출
	{	
		Scanner sc = new Scanner(System.in);
		boolean flag =true;
		System.out.print("재고 추가할 항목을 고르세요 ");
		String size = null;

		int itemId = sc.nextInt();
		if (itemId == 99)
		{	
			flag = false;
			return flag;
		}
		if (itemId>0 && itemId<=10)
		{	
			System.out.print("재고 추가할 사이즈를 입력해주세요(S/M/L) : ");
			size = sc.next();
			this.vendingmachine.stockC(itemId-1, size);
			//boolean valid = this.machine.buyC(itemId-1, size);
		}

		else if (itemId>10 && itemId<=15)
		{
			this.vendingmachine.stockA(itemId-1);
			//boolean valid = this.machine.buyA(itemId-1);
		}
		
		//1~10번까지는 사이즈도 물어봐줘서 입력받을 수 있게 해줌

		//11~15번까지는 물어볼 필요 없이 바로 진행
		
		//vendingmachine.buy(int n ←1~15번에 해당하는 번호);
		
		return true;
		}

}
	
	//재고와 잔돈의 기능을 해당하는 클래스를 불러오겠다
	
//1. (재고 클래스에서 재고 관련 기능 호출)
	 //①관리자모드에서 재고를 추가하고 갈필요 없이 처음 세팅 값을 주고 시작한다.
	 //②관리자모드에서 재고를 추가할 때는 (부족한 항목에 대해서) 한번에 맥스 값을 주도록 설정

	
//2. (매출 클래스에서                  매출 관련 기능 호출)


//3. (랭킹 클래스에서 매출 관련 기능 호출)


//4. (잔돈 클래스에서 화폐 수량과 관련된 기능 호출)


//5.  판매 모드 변경
	 //(UserMode();)



//6.  시스템 종료(System.exit(-1);)