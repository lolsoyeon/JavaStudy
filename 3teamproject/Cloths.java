//item 인터페이스고
//cloths 상/하의 implements   악세사리 잡화 implements items

public class Cloths implements Items
{	
	int itemId;
	String name;
	int[] size;
    int price;
    long date;
	int profit;
	

	public Cloths(int itemId, String name, int price, int[] size)
	{
        this.itemId = itemId;
		this.name = name;
        this.price = price;
		this.size = size;
        this.date = System.currentTimeMillis();
	}

	public void add(){};							//부족한 재고를 파악해서 Maximum(10)까지 한번에 채워주는 기능을 담당하는 메소드
	public String getName(){return this.name;};		//Name을 리턴 하는 함수
	public int getPrice(){return this.price;};		//Price를 리턴 하는 함수
	public int getAmount(){							//Amount를 리턴 하는 함수
		int sum = this.size[0]+this.size[1]+this.size[2];						
		return  sum;
	};												
	public int getId(){return this.itemId;};
	public int getSize(int s){return this.size[s];};
	public void setSize(String s){
		if (s=="S"||s=="s")
		{
			this.size[0] = this.getSize(0)-1;
		}
		else if (s=="M"||s=="m")
		{
			this.size[1] = this.getSize(1)-1;
		}
		else if (s=="L"||s=="l")
		{
			this.size[2] = this.getSize(2)-1;
		}
		System.out.println(this.size[0]+ " " +this.size[1] + " " +this.size[2]);
	}

}