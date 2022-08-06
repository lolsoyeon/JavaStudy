public class Accessories implements Items
{
	int itemId;
	String name;
	int amount;
    int price;
    long date;


	private VendingMachine machine;
	private HashMap<String,Integer> map;

	
	public Accessories(int itemId, String name, int price, int amount)
	{
        this.itemId = itemId;
		this.name = name;
        this.price = price;
		this.amount = amount;
        this.date = System.currentTimeMillis();
	}
	
	public void getMap(VendingMachine vendingmachine)
	{
		this.machine = vendingmachine;
		map = this.machine.getMap();
	}

	public void add(){};							//부족한 재고를 파악해서 Maximum(10)까지 한번에 채워주는 기능을 담당하는 메소드
	public String getName(){return this.name;};		//Name을 리턴 하는 함수
	public int getPrice(){return this.price;};		//Price를 리턴 하는 함수
	public int getAmount(){	return  this.amount;};
													//Amount를 리턴 하는 함수					
										
	public int getId(){return this.itemId;};

	public int getSize(int n){return 0;};
	public void setSize(String s){}; 
    public void setSizestock(String s){}; 


	public void setAmount(){
		
			if (this.amount==0)
			{
				System.out.println("<<품절>> 구매 불가능 합니다.");
			}
			else
			this.amount = this.amount-1;
	
	};

	public void setAmountstock(){
		
			this.amount = this.amount+5;
	
	};

	public void saveSales(String name, String size)
	{
		
		String product = name + "_" + size;
		Boolean bIsKey;
		Integer stock;

		bIsKey = map.containsKey(product);

		if (bIsKey)
		{
			// 수량 ++
			stock = map.get(product) + 1;
			map.put(product, stock);
		}
		else
		{
			// 키 선언, 값 stock

			map.put(product, 1);
		}
		

	};
	
	public void saveSales(String name)
	{
		
		String product = name;
		Boolean bIsKey;
		Integer stock;

		bIsKey = map.containsKey(product);

		if (bIsKey)
		{
			// 수량 ++
			stock = map.get(product) + 1;
			map.put(product, stock);
		}
		else
		{
			// 키 선언, 값 stock

			map.put(product, 1);
		}
		

	};
}