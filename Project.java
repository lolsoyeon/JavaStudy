import java.util.Scanner;

public class Project
{
	public static final int MAX = 10;
	//메뉴의 최대 갯수 ==10

	//전역변수 선언
	static String[] box = new String[MAX];
	static int[] price = new int[MAX];
	static int[] stock = mew int[MAX];
	static int count = 3; 메뉴의  갯수
	static int admin = 1004; //관리자 메뉴로 가는 비밀번호
	static profit = 0; //총 수익
	static Scanner sc = new Scanner(System.in);


	//처음 자판기를 초기화 하는 메소드
	public static void initialize()
	{
		box[0] = "장미";
		price[0] = 500;
		stock[0] = 3;
		box[1] = "프리지아";
		price[1] = 1000;
		stock[1] = 3;
		box[2] = "국화";
		price[2] = 3000;
		stock[2] = 3;
	}

	//관리자 페이지를 담당하는 함수
	public static void admin()
	{
		while(true)
		{
			 System.out.println("==========================");
			 System.out.println("관리자 페이지 입니다.");
			 System.out.println("1: 메뉴변경 2 :가격변경 3: 재고추가 4: 메뉴추가 5: 수익 확인 (종료는 -1)");
			 System.out.println("번호를 입력하세요: ");
			
			int num = sc.nextInt();
			 System.out.println("==========================");



			if(num == 1)
			{
				System.out.print("변경하실 메뉴의 번호를 입력하세요(1~" + count + ") :");
				int i = sc.nextInt();
				System.out.print(box[i-1] + "를(을) 무엇으로 바꾸시겠습니까? : ");
				sc.nextLine();
				String name = sc.next();
				System.out.print(name + "의 가격은 얼마입니까?");
				int v = sc.nextInt();
				System.out.print(name + "의 재고를 몇 개 등록하시겠습니까? :");
				int n = sc.nextInt();

				box[i-1] = name;
				price[i-1] = v;
				stock[i-1] = n;
				System.out.print("메뉴 변경이 완료 되었습니다!");
			}
			//2. 가격변경
			else if (num == 2)
			{
				System.out.print("가격을 변경하실 메뉴의 번호를 입력하세요(1~" + count + "):");
				int i = sc.nextInt();

			}

		}
	}

