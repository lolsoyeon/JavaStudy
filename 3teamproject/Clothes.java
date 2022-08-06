public class Clothes implements Items //상/하의  
{	
	int itemId;
	String name;
	int[] size;
    int price;
    long date;


	private VendingMachine machine;
	private HashMap<String,Integer> map;
	
	
	public Clothes(int itemId, String name, int price, int[] size)
	{
        this.itemId = itemId;
		this.name = name;
        this.price = price;
		this.size = size;
        this.date = System.currentTimeMillis();

	}
	
	public void getMap(VendingMachine vendingmachine)
	{
		this.machine = vendingmachine;
		map = this.machine.getMap();
	};

	public void add(){};							//부족한 재고를 파악해서 Maximum(10)까지 한번에 채워주는 기능을 담당하는 메소드
	public String getName(){return this.name;};		//Name을 리턴 하는 함수
	public int getPrice(){return this.price;};		//Price를 리턴 하는 함수
	public int getAmount(){							//Amount를 리턴 하는 함수
		int sum = this.size[0]+this.size[1]+this.size[2];						
		return  sum;
	};
	public void setAmount(){};											
	public int getId(){return this.itemId;};
	public int getSize(int s){return this.size[s];};
	public void setAmountstock(){};
	public void setSize(String s)
	{
		if (s.equals("S") ||s.equals("s"))
		{
			if (this.size[0]==0)
			{
				System.out.println("<<품절>> 구매 불가능 합니다.");
			}
			else
			this.size[0] = this.getSize(0)-1;
			
		}
		else if (s.equals("M")||s.equals("m"))
		{
			if (this.size[1]==0)
			{
				System.out.println("<<품절>> 구매 불가능 합니다.");
			}
			else
			this.size[1] = this.getSize(1)-1;

		}
		else if (s.equals("L")||s.equals("l"))
		{
			if (this.size[2]==0)
			{
				System.out.println("<<품절>> 구매 불가능 합니다.");
			}
			else
			this.size[2] = this.getSize(2)-1;

		}
		// 수량이 주는것인지 확인 하기 위한 테스트
		// System.out.println(this.size[0]+ " " +this.size[1] + " " +this.size[2]);
	};

	public void setSizestock(String s)
	{
		if (s.equals("S") ||s.equals("s"))
		{
		
			this.size[0] = this.getSize(0)+5;
			
		}
		else if (s.equals("M")||s.equals("m"))
		{
			
			this.size[1] = this.getSize(1)+5;
		}
		else if (s.equals("L")||s.equals("l"))
		{
			
			this.size[2] = this.getSize(2)+5;
		}
		// 수량이 주는것인지 확인 하기 위한 테스트
		// System.out.println(this.size[0]+ " " +this.size[1] + " " +this.size[2]);
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