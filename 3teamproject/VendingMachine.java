//속성 + 기능 클래스 선에서 강조
//합쳐서 쓰면 자료구조 필요(현재 단계에선 자료구조 고려 안함)
import java.util.Vector;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;


public class VendingMachine 
{	
	//주요 변수들 선언
	private Log log;
	private Vector<Items> items ;
	private int amount = 5;
	private int money;
	private int[] size;
	private Map<String, Integer> map;
	
	//"총 금액이 얼마인게 맞습니까 ?" profit 
	//밴딩 머신에서 재고 관리 및 돈 관리 ??????????????

	//System.out.println("S" + size[0]);

	public VendingMachine()
	{
		//List 인덱스로 이것들을 접근할 수 있게 됨
		items = new Vector<>();		//선언 이유
		items.add(new Clothes(1, "민소매", 5000, new int[]{5,5,5}));
		items.add(new Clothes(2, "반팔", 15000, new int[]{5,5,5}));
		items.add(new Clothes(3, "코트", 50000, new int[]{5,5,5}));
		items.add(new Clothes(4, "패딩", 100000, new int[]{5,5,5}));
		items.add(new Clothes(5, "히트텍상의", 10000, new int[]{5,5,5}));
		items.add(new Clothes(6, "반바지", 15000, new int[]{5,5,5}));
		items.add(new Clothes(7, "긴바지", 20000, new int[]{5,5,5}));
		items.add(new Clothes(8, "기모바지", 30000, new int[]{5,5,5}));
		items.add(new Clothes(9, "냉장고바지", 10000, new int[]{5,5,5}));
		items.add(new Clothes(10, "히트텍하의", 10000, new int[]{5,5,5}));
		items.add(new Accessories(11, "우산", 3000,amount));
		items.add(new Accessories(12, "모자", 15000,amount));
		items.add(new Accessories(13, "목도리", 15000,amount));
		items.add(new Accessories(14, "장갑", 10000,amount));
		items.add(new Accessories(15, "선글라스", 30000,amount));

		map = new HashMap<String, Integer>();

	}
	
	public Vector<Items> getItems() 
	{
		return this.items;
	}

	public Map<String, Integer> map getMap() 
	{
		return this.map;
	}
	
	public boolean buyC(int itemId,String s)
	{			//객체 접근
		//1번부터 10번인지 or 11~15번인지 한번 걸러야 함.
		this.items.get(itemId).setSize(s);
		this.items.saveSales(itemId, s);
		
		return true;
	}

	public boolean buyA(int itemId)
	{			//객체 접근
		//1번부터 10번인지 or 11~15번인지 한번 걸러야 함.
		this.items.get(itemId).setAmount();
		this.items.saveSales(ItemId);
		
		return true;
	}

	public boolean stockC(int itemId,String s)
	{			//객체 접근
		//1번부터 10번인지 or 11~15번인지 한번 걸러야 함.
		this.items.get(itemId).setSizestock(s);
		
		return true;
	}

	public boolean stockA(int itemId)
	{			//객체 접근
		//1번부터 10번인지 or 11~15번인지 한번 걸러야 함.
		this.items.get(itemId).setAmountstock();
		
		return true;
	}
	
}