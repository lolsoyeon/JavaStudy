public class Clothes implements Items //��/����  
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

	public void add(){};							//������ ��� �ľ��ؼ� Maximum(10)���� �ѹ��� ä���ִ� ����� ����ϴ� �޼ҵ�
	public String getName(){return this.name;};		//Name�� ���� �ϴ� �Լ�
	public int getPrice(){return this.price;};		//Price�� ���� �ϴ� �Լ�
	public int getAmount(){							//Amount�� ���� �ϴ� �Լ�
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
				System.out.println("<<ǰ��>> ���� �Ұ��� �մϴ�.");
			}
			else
			this.size[0] = this.getSize(0)-1;
			
		}
		else if (s.equals("M")||s.equals("m"))
		{
			if (this.size[1]==0)
			{
				System.out.println("<<ǰ��>> ���� �Ұ��� �մϴ�.");
			}
			else
			this.size[1] = this.getSize(1)-1;

		}
		else if (s.equals("L")||s.equals("l"))
		{
			if (this.size[2]==0)
			{
				System.out.println("<<ǰ��>> ���� �Ұ��� �մϴ�.");
			}
			else
			this.size[2] = this.getSize(2)-1;

		}
		// ������ �ִ°����� Ȯ�� �ϱ� ���� �׽�Ʈ
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
		// ������ �ִ°����� Ȯ�� �ϱ� ���� �׽�Ʈ
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