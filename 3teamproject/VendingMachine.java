//속성 + 기능 클래스 선에서 강조
//합쳐서 쓰면 자료구조 필요(현재 단계에선 자료구조 고려 안함)
import java.util.List;
import java.util.ArrayList;

public class VendingMachine
{	
	//주요 변수들 선언
	private Log log;
	private List<Items> items ;
	private int maximum = 5;
	private int money;
	private int[] size = {5,5,5};
	
	//System.out.println("S" + size[0]);

	public VendingMachine()
	{
		//List 인덱스로 이것들을 접근할 수 있게 됨
		items = new ArrayList<>();		//선언 이유
		items.add(new Clothes(1, "민소매", 5000, size));
		items.add(new Clothes(2, "반팔", 15000, size));
		items.add(new Clothes(3, "코트", 50000, size));
		items.add(new Clothes(4, "패딩", 100000, size));
		items.add(new Clothes(5, "히트텍상의", 10000, size));
		items.add(new Clothes(6, "반바지", 15000, size));
		items.add(new Clothes(7, "긴바지", 20000, size));
		items.add(new Clothes(8, "기모바지", 30000, size));
		items.add(new Clothes(9, "냉장고바지", 10000, size));
		items.add(new Clothes(10, "히트텍하의", 10000, size));
		items.add(new Accessories(11, "우산", 3000,maximum));
		items.add(new Accessories(12, "모자", 15000,maximum));
		items.add(new Accessories(13, "목도리", 15000,maximum));
		items.add(new Accessories(14, "장갑", 10000,maximum));
		items.add(new Accessories(15, "선글라스", 30000,maximum));
	}
	
	public List<Items> getItems() 
	{
		return this.items;
	}
	
	public boolean offer(int itemId,String s)
	{			//객체 접근
		//1번부터 10번인지 or 11~15번인지 한번 걸러야 함.
		this.items.get(itemId).setSize(s);
		
		return true;
	}
	/*

	System.out.print("메뉴 입력: ");
            int num = sc.nextInt();
            
            // 돈이 충분한가?
            if(money >= price[num-1]) {
                // 재고가 충분한가?
                if(stock[num-1] > 0) {
                    money = money - price[num-1];
                    stock[num-1]--;
                    profit += price[num-1];
                    System.out.println(box[num-1] + "이(가) 나왔다!");
                }
                else {
                    System.out.println("현재 재고가 없습니다!");
                    continue;
                }
            }
            else {
                System.out.println("잔액이 부족합니다!");
            }
            
            System.out.println("잔액 : " + money);
            
            // 모든 돈을 사용하면 이용 종료 후 초기화면 진입
            if(money == 0) {
                System.out.println("감사합니다! 다음에 또 이용해주세요!!");
                first = true;
                continue;
            }
	*/

}