public interface Items					//Stock�̶�� �ɷ� Item�� �ΰ��� ������ ������ ���� (������  /  ��ȭ)
{														// Item ��� �����ǿ� ��ȭ�� �� ����
	
	public abstract void add();			//������ ��� �ľ��ؼ� Maximum(10)���� �ѹ��� ä���ִ� ����� ����ϴ� �޼ҵ�
	public abstract String getName();	//Name�� ���� �ϴ� �Լ�
	public abstract int getPrice();		//Price�� ���� �ϴ� �Լ�
	public abstract int getAmount();	//Amount�� ���� �ϴ� �Լ�
	public abstract int getId();		//(�ǸŸ�忡�� 1,2,3,4,5���� �ش��ϴ�) Id�� ���� �ϴ� �Լ�
	public abstract int getSize(int n);		
	public abstract void setSize(String s); 
	public abstract void setAmount();
	public abstract void setSizestock(String s); 
	public abstract void setAmountstock();
	public abstract void getMap();
	public abstract void saveSales(String name, String size);
	public abstract void saveSales(String name);
	

}

