import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class UserMode implements Mode
{
	List<Items> items;
	//private VendingMachine machine;		//������ �ڷῡ�� private���� ���� �س��� ����������?
	VendingMachine machine;
	Scanner sc = new Scanner(System.in);
	int coin = 0;
	int remain = 0;
	RpsGame ob;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public UserMode(VendingMachine vendingmachine) { // ����ִ� ��ü�� ��Ʈ�� �ϱ����� �Ѱ��ְ� �ް� ��
		machine = vendingmachine;		//this.machine=vendingmachine; items = this.machine.getItems();
		items = machine.getItems();			//	VendingMachine�� �ִ� Items�� �����´�  ����ִ� ��ü�� ��Ʈ�� �ϱ����� �Ѱ��ְ� �ް� ��
	} // ������										�̰� ������ ������ ��忡�� �ѱ� �� �� ����  �� �����ڿ��� �޾� �� ���� ����
	

	public void display(){
		items = machine.getItems();	//	VendingMachine�� �ִ� Items�� �����´�	//this.machine.getItems();
		System.out.println("==============================================================================================================================");
		System.out.println("�Ƿ���ȭ ���Ǳ� �Դϴ�. (��ȣ:��ǰ(���))");
		System.out.println("\t\t\t\t\t\t[����]");
		for (int i=0; i<5; i++)
			{
			/*System.out.println((i+1)+"."+items.get(i).getName()+"      "+"("+items.get(i).getPrice()+")"+"  - "
			+"(S:"+items.get(i).getSize(0)+" M:"+items.get(i).getSize(1)+" L:"+items.get(i).getSize(2)+")");*/
			Clothes item = (Clothes)items.get(i) ; //�ٿ� ĳ����
			//������ Size�� ������ Clothes���� �����ͼ� ���
			System.out.printf("%2d. %s(%d) - (S:%d M:%d L:%d)", (i+1),  item.getName(), item.getPrice(), item.getSize(0), item.getSize(1), item.getSize(2));
			if (i==2)
			{
				System.out.println(); continue;
			}
			else if (i==4)
			{
				continue;
			}
			System.out.print("         >> "); 
		}
		System.out.println();

		System.out.println();
		System.out.println("\t\t\t\t\t\t[����]");
		for (int i=5; i<10; i++)
		{
			Clothes item = (Clothes)items.get(i) ;
			System.out.printf("%2d. %s(%d) - (S:%d M:%d L:%d)", (i+1),  item.getName(), item.getPrice(), item.getSize(0), item.getSize(1), item.getSize(2));
			if (i==7)
			{
				System.out.println(); continue;
			}
			else if (i==9)
			{
				continue;
			}
			else if (i==5)
			{
				System.out.print("       >> "); continue;
			}

			else if (i==6)
			{
				System.out.print("        >> "); continue;
			}
			
			System.out.print("   >> "); 
		}
		System.out.println();
		
		System.out.println();
		System.out.println("\t\t\t\t\t\t[��ȭ]");
		for (int i=10; i<15; i++)
		{	
			//��ȭ�� �ִ� ģ�����̱� ������ ���� �ٿ�ĳ�����ؼ� �ҷ��� �ʿ䰡 ����
			System.out.printf("%2d. %s(%d) - (%d)", (i+1),  items.get(i).getName(), items.get(i).getPrice(), items.get(i).getAmount() );
			if (i==12)
			{
				System.out.println(); continue;
			}
			else if (i==11)
			{
				System.out.print("                    >> "); continue;
			}
			else if (i==14)
			{
				continue;
			}
			System.out.print("			>> ");
		}
		System.out.println();
		System.out.println("==============================================================================================================================");
	}	//�޴����� ������� �Ѵ�
	public boolean select() throws IOException {
		int itemId;
		boolean flag = true;
		do {
			System.out.print("������ �����Ͻðڽ��ϱ�?");
			String check = sc.next();
			if (check.equals("java006$"))
			{
				return false;
			}
			else 
			{
				itemId = Integer.parseInt(check);
			}
			if (itemId > 0 && itemId <= 15) {
				//items.get(itemId).getAmount();		//S/M/L����
				coin += machine.getInsert();
				while (coin < machine.getItemIdPrice(itemId-1)){
					System.out.println("�ݾ��� �����մϴ�. �ݾ��� �� �������ּ���.");
					coin += machine.getInsert();
				}
				//this.machine.buy(itemId - 1);
				//this.machine.setTotal(this.machine.getItemIdPrice(itemId-1));	// 
				//this.machine.getSales().countId(itemId-1);						//��ŷ  
				machine.buy(itemId - 1);
				machine.setTotal(this.machine.getItemIdPrice(itemId-1));
				machine.getSales().countId(itemId-1);
				System.out.println();
				System.out.print("�߰� ���� �Ͻðڽ��ϱ�? (Y/N) : ");
				String check2 = sc.next();
				if (check2.equals("N") || check2.equals("n")) {
					remain += receipt();
					if(remain > 0){
						display();
					}else{
						flag = false;
					}
				} else {
					flag = true;
				}
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			}
		}while (flag) ;
		return true;
	}  //�Է��� �ް� �Է¿� ���� ���������� ��� ȣ��

	public int receipt() throws IOException{
		ob = new RpsGame(this.machine.getSales());
		while (true)
			{
			String user ;
			
			System.out.printf(">>> ������� �����Ͻ� ��ǰ�� �� �ݾ��� %d �Դϴ�.", machine.totalReturn());
			// ���� �ݾ� �ذ��ϱ�
			System.out.println();
			System.out.print("���� �Ͻðڽ��ϱ�? (Y/N) : ");
			
			user = sc.next();
			// y �Է½� �̺�Ʈ�� �Ѿ��
			if (user.equals("y") || user.equals("Y"))
			{
				int discount = 0;
				boolean start = ob.gameStart(machine.totalReturn());		// ���� ���� �޼� �� �̺�Ʈ ���
				if (start)
				{
					ob.input();
					ob.middleCalc();
					discount = ob.resultCalc();
				}

				System.out.printf("���� ���� �ݾ��� : %d�Դϴ�.\n",machine.totalReturn()-discount);
				remain = machine.pay(machine.totalReturn()-discount);
				machine.returnRemainMoney(remain);
				System.out.print("����ȭ������ ���ư����� �ƹ�Ű�� �Է��ϼ���.......");
				String anykey = br.readLine();
				return 0;
			}
			else if (user.equals("n") || user.equals("N"))
			{
				remain += machine.totalReturn();
				System.out.print("����ȭ������ ���ư����� �ƹ�Ű�� �Է��ϼ���.......");
				String anykey = br.readLine();
				return remain;
			}
		
		 }
	   } // �߰� ���� , �հ� �޼ҵ�

}
	

