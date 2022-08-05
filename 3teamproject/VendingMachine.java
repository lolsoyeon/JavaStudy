//�Ӽ� + ��� Ŭ���� ������ ����
//���ļ� ���� �ڷᱸ�� �ʿ�(���� �ܰ迡�� �ڷᱸ�� ��� ����)
import java.util.List;
import java.util.ArrayList;

public class VendingMachine 
{	
	//�ֿ� ������ ����
	private Log log;
	private List<Items> items ;
	private int amount = 5;
	private int money;
	private int[] size;
	//"�� �ݾ��� ���ΰ� �½��ϱ� ?" profit 
	//��� �ӽſ��� ��� ���� �� �� ���� ??????????????

	//System.out.println("S" + size[0]);

	public VendingMachine()
	{
		//List �ε����� �̰͵��� ������ �� �ְ� ��
		items = new ArrayList<>();		//���� ����
		items.add(new Clothes(1, "�μҸ�", 5000, new int[]{5,5,5}));
		items.add(new Clothes(2, "����", 15000, new int[]{5,5,5}));
		items.add(new Clothes(3, "��Ʈ", 50000, new int[]{5,5,5}));
		items.add(new Clothes(4, "�е�", 100000, new int[]{5,5,5}));
		items.add(new Clothes(5, "��Ʈ�ػ���", 10000, new int[]{5,5,5}));
		items.add(new Clothes(6, "�ݹ���", 15000, new int[]{5,5,5}));
		items.add(new Clothes(7, "�����", 20000, new int[]{5,5,5}));
		items.add(new Clothes(8, "������", 30000, new int[]{5,5,5}));
		items.add(new Clothes(9, "��������", 10000, new int[]{5,5,5}));
		items.add(new Clothes(10, "��Ʈ������", 10000, new int[]{5,5,5}));
		items.add(new Accessories(11, "���", 3000,amount));
		items.add(new Accessories(12, "����", 15000,amount));
		items.add(new Accessories(13, "�񵵸�", 15000,amount));
		items.add(new Accessories(14, "�尩", 10000,amount));
		items.add(new Accessories(15, "���۶�", 30000,amount));
	}
	
	public List<Items> getItems() 
	{
		return this.items;
	}
	
	public boolean buyC(int itemId,String s)
	{			//��ü ����
		//1������ 10������ or 11~15������ �ѹ� �ɷ��� ��.
		this.items.get(itemId).setSize(s);
		
		return true;
	}

	public boolean buyA(int itemId)
	{			//��ü ����
		//11~15������ �ѹ� �ɷ��� ��.
		this.items.get(itemId).setAmount();
		
		return true;
	}
	
}