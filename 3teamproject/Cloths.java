//item �������̽���
//cloths ��/���� implements   �Ǽ��縮 ��ȭ implements items

public class Cloths implements Items
{	
	int itemId;
	String name;
	int[] size;
    int price;
    long date;
	

	public Cloths(int itemId, String name, int price, int[] size)
	{
        this.itemId = itemId;
		this.name = name;
        this.price = price;
		this.size = size;
        this.date = System.currentTimeMillis();
	}

	public void add(){};							//������ ��� �ľ��ؼ� Maximum(10)���� �ѹ��� ä���ִ� ����� ����ϴ� �޼ҵ�
	public String getName(){return this.name;};		//Name�� ���� �ϴ� �Լ�
	public int getPrice(){return this.price;};		//Price�� ���� �ϴ� �Լ�
	public int getAmount(){							//Amount�� ���� �ϴ� �Լ�
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
		System.out.println(this.size[0]+ " " + this.size[1] + " " +this.size[2]);
	}

}