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

	public void add(){};							//������ ��� �ľ��ؼ� Maximum(10)���� �ѹ��� ä���ִ� ����� ����ϴ� �޼ҵ�
	public String getName(){return this.name;};		//Name�� ���� �ϴ� �Լ�
	public int getPrice(){return this.price;};		//Price�� ���� �ϴ� �Լ�
	public int getAmount(){	return  this.amount;};
													//Amount�� ���� �ϴ� �Լ�					
										
	public int getId(){return this.itemId;};

	public int getSize(int n){return 0;};
	public void setSize(String s){}; 
    public void setSizestock(String s){}; 


	public void setAmount(){
		
			if (this.amount==0)
			{
				System.out.println("<<ǰ��>> ���� �Ұ��� �մϴ�.");
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
			// ���� ++
			stock = map.get(product) + 1;
			map.put(product, stock);
		}
		else
		{
			// Ű ����, �� stock

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
			// ���� ++
			stock = map.get(product) + 1;
			map.put(product, stock);
		}
		else
		{
			// Ű ����, �� stock

			map.put(product, 1);
		}
		

	};
}