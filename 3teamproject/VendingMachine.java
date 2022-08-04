//�Ӽ� + ��� Ŭ���� ������ ����
//���ļ� ���� �ڷᱸ�� �ʿ�(���� �ܰ迡�� �ڷᱸ�� ��� ����)
//��money�� coin�̶�� �����̸� �����ؾ��ԡ� 
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine
{
	public MoneyInsert moneyinsert;
	//�ֿ� ������ ����
	private List<Items> items ;
	private int amount = 5;
	private int total = 0;
	private Sales sales;

	//�ݾ� ����ֱ� ���� �׽�Ʈ
	//"�� �ݾ��� ���ΰ� �½��ϱ� ?" profit 
	//��� �ӽſ��� ��� ���� �� �� ���� ??????????????
	//System.out.println("S" + size[0]);
	
	//�ٽ�
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
		moneyinsert  = new MoneyInsert() ;
		sales = new Sales(items);
	}
	public List<Items> getItems() {return this.items;}
	public boolean buy(int itemId) {
		// �� üũ ����
		this.items.get(itemId).setAmount();
		return true ;
	}
	public int pay(int totalprice) {
		// �� üũ ����
		int remain = this.moneyinsert.setSum_coin(totalprice);
		
		return remain;
	}

	public boolean stock(int itemId){
		this.items.get(itemId).fill();
		return true ;
	}
	public int getItemIdPrice(int itemId){
		return this.items.get(itemId).getPrice();
	}
	public int getInsert(){
		int coin = moneyinsert.insert_coin();
		return coin ;
	}
	public int totalReturn(){return total;}
	public void setTotal(int price){total += price ;}

	public String getName(int itemId){
		return this.items.get(itemId).getName();
	}

	public Sales getSales()
	{
		return this.sales;
	}
	
	public void returnRemainMoney(int remain)
	{
		moneyinsert.returnMoney(remain);
		total = 0;
	}
}
