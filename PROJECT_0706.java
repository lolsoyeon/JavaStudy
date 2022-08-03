import java.util.Scanner;
public class PROJECT_0706 {
	
	   static int minmoney = 7000; // 최하금액
	   // -------------------------------------------사용자 함수 
	   // 메뉴 출력 함수
	   static void menu(int[][] fpriceCnt, String[] flower) {
		 //int[][] fpriceCnt = { { 7000, 3 }, { 15000, 7 }, { 20000, 4 }, { 15000, 0 }, { 12000, 3 } }; // 상품가격&재고가
	      System.out.println(" ====================♥ Flower Machine ♥==================");
	      System.out.println("                 ♥ 사랑하는 사람에게 마음을 전하세요  ♥            \n");
	      System.out.println("                          [MENU]                          \n");
	      for (int i = 0; i < fpriceCnt.length; i++) {
	         System.out.print("["+(i + 1)+"]"+ flower[i] + " ");
	         System.out.print(fpriceCnt[i][0] + "원  ");
	      }
	      System.out.println("\n\n"); // 줄바꿈
	   }

	   // 금액 부족시 반환하는 함수
	   static int changeMoney(int money) {
	      if (money < minmoney) { // 최하금액보다 작으면
	         System.out.println("[ERROR!!] 금액이 부족합니다  o△o;");
			money = CashReturn(money); // 현금반환 함수호출
	      }
	      return money; 
	   }
		// 현금 반환하는 함수
		static int CashReturn(int money){
			int mCount[][] = { { 10000, 5000, 1000, 500, 100,10,1 } , {0,0,0,0,0,0,0} }; // 현금종류와 개수 이중배열
			// 반환 현금 카운팅
		   if (money > 0) { // 반환할 금액이 0보다 크면
	        	System.out.println(money+" 원 반환됩니다.");
	            for (int i = 0; money > 0;) { // 잔돈이 0이 될때까지 반복
	                if (money >= mCount[0][i] ) { // 10000..500..100원 단위 보다 작거나 같으면?
	                	mCount[1][i]++;	// 지폐 cnt++;
	                    money -= mCount[0][i]; // 저장된 지폐수만큼 잔돈 차감 
	                }
	                else {
	                	i++;
	                }
	            }//for1
	            // 총 몇장인지 출력
	            for (int i = 0; i < 5; i++) {//현금종류 개수만큼 반복
	                if (mCount[1][i]==0) { // 지폐마다 반환할 현금이 없다면, 되돌아간다.
	                    continue;
	                }
	                else { // 출력될 현금 안내
	                	System.out.println("  - "+mCount[0][i]+"원: "+mCount[1][i]+" 장(개) ");
	            }
	                
	        }//for2
            System.out.println("\n");// 줄정리
			
		}//if>0 
	        else {
	        	System.out.println("반환금액 =" + money+"\n"); // money 
	        }
		   
		   return money; // 남은 money 반환
		   
		}//CashReturn함수종료

	   // -------------------------------------------관리자 관련 함수
	   // 관리자 모드 메뉴 출력&메뉴번호 입력
	   final static int managerpw = 1004; // 관리자 비밀번호
	   
	   static void managerMenu() {
	      System.out.println("[1]상품변경  [2]가격변경  [3]재고관리  [4]관리자모드 종료");
	      System.out.print("관리 메뉴 선택 : ");
	   }
	   
	   // 관리자 모드 메뉴선택, 내용변경 함수
	   static Boolean MaNager(int[][] fpriceCnt, String[] flower) {
	      Scanner sc = new Scanner(System.in);
	      System.out.print("관리자 비밀번호 입력 : "); // 관리자 비밀번호 = 1004
	      int pswd = sc.nextInt();
	      if (pswd == managerpw) {
	         System.out.println("[ 관리자 모드 ] 에 입장하셨습니다 :D ");
	      } else {
	         System.out.println("[Error] 비밀번호가 틀렸습니다.\nXXXXXX 접근불가 XXXXXX\n");
	         return true; // 관리자모드종료
	      }
	      
	      // 관리할 상품 선택  변수
	      int productNum;
	      
	      // 메뉴번호 유효성검사
	      while(true) { 
	    	   System.out.print("\n관리할 상품번호 입력 : ");
		       productNum = sc.nextInt();
		       if(1 <= productNum && productNum <= 5) { // 1~5까지
		    	   break;
		       }
		       System.out.println("잘못된 입력입니다. 다시 입력해주세요!( 1~5 )\n");
	      }
	     
	      System.out.println("\n[ " + flower[productNum-1] + " ] 상품이 선택되었습니다.\n");
	      
	      // 상품관리 메뉴 선택 함수
	      int cateGoryNum; // 카테고리 넘버
	      
	      // "관리자 종료"할 때까지 반복
	      while(true) { 
	    	  managerMenu();
		      cateGoryNum = sc.nextInt(); // 카테고리 입력
	      //카테고리 번호 유효성검사
	      while(true) {
		      if(1 <= cateGoryNum && cateGoryNum <= 4) { // 1~4까지
		    	  break;
		      }
		      System.out.println("잘못된 입력입니다. 다시 입력해주세요!( 1~4 )\n");
	      }
	      if (cateGoryNum < 4) { // 종료가 아니라면
	         if (cateGoryNum == 1) { // 상품변경
	            System.out.print("변경할 상품명 : ");
	            flower[productNum-1] = sc.next();
	            System.out.println(flower[productNum-1] + "(으)로 상품이 변경되었습니다.\n");
	         }
	         else if (cateGoryNum == 2) { // 상품가격변경
	            System.out.println("현재 " + flower[productNum-1] + "의 금액은 " + fpriceCnt[productNum-1][0] + "원 입니다.\n");
	            System.out.print("변경할 금액을 입력해주세요 : ");
	            fpriceCnt[productNum-1][0] = sc.nextInt();
	            System.out.println(fpriceCnt[productNum-1][0] + "원 으로 금액이 변경되었습니다.\n");
	         } else if (cateGoryNum == 3) { // 재고관리
	            System.out.println("현재 " + flower[productNum-1] + "의 잔여재고는 " + fpriceCnt[productNum-1][1] + "개  입니다.\n");
	            System.out.print("추가하실 상품 수를 입력해주세요 : ");
	            int add = sc.nextInt(); // 추가 재고 수
	            fpriceCnt[productNum-1][1] += add;
	            System.out.println("입고 완료되었습니다.\n현재 재고 :  " + fpriceCnt[productNum-1][1] + "개  입니다.\n");
	         }
	      } // 1~3카테고리

		  public static void main(String[] args)
		{
				Scanner sc = new Scanner(System.in);
	         // 배열준비
	         String[] flower = { "안개꽃", "수국", "장미", "해바라기", "카네이션" };
	         int[][] fpriceCnt = { { 7000, 3 }, { 15000, 7 }, { 20000, 4 }, { 15000, 0 }, { 12000, 3 } }; // 상품가격&재고가
	         //[S]★★★[T]★★★[A]★★★★[R]★★★★[T]★★★★★★★★★★★                                                                                              // 저장되어있는
	        while (true) {       // 관리자 모드 사용후 사용자 모드 반영을 위해 반복문 사용                            // 이중배열
	         // 사용자모드 와 관리자모드 나눠서 진행
	         System.out.println(" [1]사용자모드   [2]관리자모드  [3]프로그램 종료");
	         System.out.print("메뉴 선택 :  ");
	         int modeSelect = sc.nextInt(); // 사용자 모드 와 관리자 모드 선택

	         if (modeSelect == 2) {
	            // [함수호출]
	            if (MaNager(fpriceCnt, flower)) {
	               System.out.println("관리자모드를 종료합니다 :▶\n");
	               continue;
	            }
	         } else if (modeSelect == 1) { // "사용자 모드" 코드 생략
             } else if (modeSelect == 3) {
	         		System.out.println("\n                  프로그램을 종료합니다 :D\n이용해주셔서 감사합니다  ∪u∪♥ 다음에 또 이용해주세요 ♡  ");
					break;
				}else {
					System.out.println("\n                 잘못된 입력입니다 :-( \n          다시 입력해주세요  1 / 2 / 3\n");

				} // 모드 종료 

			  }
	
		  }//main
	   }
}