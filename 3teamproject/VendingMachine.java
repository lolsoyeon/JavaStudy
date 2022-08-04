//�Ӽ� + ��� Ŭ���� ������ ����
//���ļ� ���� �ڷᱸ�� �ʿ�(���� �ܰ迡�� �ڷᱸ�� ��� ����)
import java.util.List;
import java.util.ArrayList;

public class VendingMachine
{	
	//�ֿ� ������ ����
	private Log log;
	private List<Items> items ;
	private int maximum = 5;
	private int money;
	private int[] size = {5,5,5};
	
	//System.out.println("S" + size[0]);

	public VendingMachine()
	{
		//List �ε����� �̰͵��� ������ �� �ְ� ��
		items = new ArrayList<>();		//���� ����
		items.add(new Clothes(1, "�μҸ�", 5000, size));
		items.add(new Clothes(2, "����", 15000, size));
		items.add(new Clothes(3, "��Ʈ", 50000, size));
		items.add(new Clothes(4, "�е�", 100000, size));
		items.add(new Clothes(5, "��Ʈ�ػ���", 10000, size));
		items.add(new Clothes(6, "�ݹ���", 15000, size));
		items.add(new Clothes(7, "�����", 20000, size));
		items.add(new Clothes(8, "������", 30000, size));
		items.add(new Clothes(9, "��������", 10000, size));
		items.add(new Clothes(10, "��Ʈ������", 10000, size));
		items.add(new Accessories(11, "���", 3000,maximum));
		items.add(new Accessories(12, "����", 15000,maximum));
		items.add(new Accessories(13, "�񵵸�", 15000,maximum));
		items.add(new Accessories(14, "�尩", 10000,maximum));
		items.add(new Accessories(15, "���۶�", 30000,maximum));
	}
	
	public List<Items> getItems() 
	{
		return this.items;
	}
	
	public boolean offer(int itemId,String s)
	{			//��ü ����
		//1������ 10������ or 11~15������ �ѹ� �ɷ��� ��.
		this.items.get(itemId).setSize(s);
		
		return true;
	}
	/*

	System.out.print("�޴� �Է�: ");
            int num = sc.nextInt();
            
            // ���� ����Ѱ�?
            if(money >= price[num-1]) {
                // ��� ����Ѱ�?
                if(stock[num-1] > 0) {
                    money = money - price[num-1];
                    stock[num-1]--;
                    profit += price[num-1];
                    System.out.println(box[num-1] + "��(��) ���Դ�!");
                }
                else {
                    System.out.println("���� ��� �����ϴ�!");
                    continue;
                }
            }
            else {
                System.out.println("�ܾ��� �����մϴ�!");
            }
            
            System.out.println("�ܾ� : " + money);
            
            // ��� ���� ����ϸ� �̿� ���� �� �ʱ�ȭ�� ����
            if(money == 0) {
                System.out.println("�����մϴ�! ������ �� �̿����ּ���!!");
                first = true;
                continue;
            }
	*/

}