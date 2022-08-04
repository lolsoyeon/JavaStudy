import java.util.Scanner;

public class Clothes implements Items //��/����
{	
	int itemId;
	String name;
	int[] size;
	int price;
	long date;
	Scanner sc = new Scanner(System.in);

	public Clothes(int itemId, String name, int price, int[] size) {
        this.itemId = itemId;
		this.name = name;
        this.price = price;
		this.size = size;
        this.date = System.currentTimeMillis();
	} //������
	//public void Test(){};
	//���� �������̽����� �ʿ���� ������ �� �ųĴ� ����
	//�������̽��� Test��� �޼ҵ尡 ��� �� �� �ִ�
	// = �������̽����� ���ָ� �ȴ�.


	public String getName(){return this.name;};		//Name�� ���� �ϴ� �Լ�
	public int getPrice(){return this.price;};		//Price�� ���� �ϴ� �Լ�
	public int getAmount(){							//Amount�� ���� �ϴ� �Լ�

		System.out.print("����� �Է����ּ���(S/M/L) : ");
		String s = sc.next();
		if (s.equalsIgnoreCase("s")))
		{
			return this.size[0];
		}
		else if (s.equalsIgnoreCase("m"))
		{
			return this.size[1];
		}
		else if (s.equals("L")||s.equals("l"))
		{
			return this.size[2];
		}
		else{
			System.out.print("�� �� �Է��ϼ̽��ϴ�. ");
			return 0 ; // ���Է� �ް� ��
		}
	} //Amount�� ���� �ϴ� �Լ�
	public void setAmount(){

		System.out.print("����� �Է����ּ���(S/M/L) : ");
		String s = sc.next();
		if (s.equals("S") ||s.equals("s"))
		{
			if (this.size[0]==0)
			{
				System.out.println("<<ǰ��>> ���� �Ұ��� �մϴ�.");
			}else{
				this.size[0] -= 1 ;
			}
		}
		else if (s.equals("M")||s.equals("m"))
		{
			if (this.size[1]==0)
			{
				System.out.println("<<ǰ��>> ���� �Ұ��� �մϴ�.");
			}else{
				this.size[1] -= 1 ;
			}
		}
		else if (s.equals("L")||s.equals("l"))
		{
			if (this.size[2]==0)
			{
				System.out.println("<<ǰ��>> ���� �Ұ��� �մϴ�.");
			}else{
				this.size[2] -= 1 ;
			}
		}
		else{
			System.out.print("�߸� �Է��ϼ̽��ϴ�. ");
		}
	} //Amount�� ���� �ϴ� �Լ�(-1 ����)
	public void fill(){
		System.out.print("����� �Է����ּ���(S/M/L) : ");
		String s = sc.next();

		if (s.equals("S") ||s.equals("s"))
		{

			this.size[0] += 5;

		}
		else if (s.equals("M")||s.equals("m"))
		{

			this.size[1] += 5;
		}
		else if (s.equals("L")||s.equals("l"))
		{

			this.size[2] += 5;
		}
		//System.out.println(this.size[0]+ " " +this.size[1] + " " +this.size[2]);
	} // 5���� �߰�
	public int getSize(int num){
		return this.size[num] ;
	}
}
