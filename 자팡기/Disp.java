import java.util.Scanner;
public class Disp
{
	public static void main(String[] args)
	{


	Scanner sc = new Scanner(System.in);
	n = sc.readLine();
	System.out.println("\t=========[관리자 모드 입니다.]==================");
	System.out.println("\t1. 재고 변경");
	System.out.println("\t2. 매출 확인");
	System.out.println("\t3. 랭킹");
	System.out.println("\t4. 가격 변경");
	System.out.println("\t5. 판매 모드 변경");
	System.out.println("\t6. 종료");
	System.out.println("\t=========================================");
	System.out.println("\t메뉴 변경(1~6) : \n" + n);

	}
}