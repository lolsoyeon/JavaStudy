import java.util.List;
public class Sales
{
	List<Items> items;			
	int[] countItemList = new int[15];// �ε����� 0-14
	
	public Sales(List<Items> items)	// ������� Items�� ����Ʈ�� ������, List�ڷᱸ���� Items�� �޾ƿ�	
	{
		this.items = items;
	}

	public int getsumAll()
	{	
		int sumAll=0;

		for (int i=0; i<countItemList.length; i++)
		{
			int cnt = countItemList[i];
			sumAll += cnt * items.get(i).getPrice();
			
		}
		return sumAll;
	}
	

	public void countId(int itemId)
	{
		countItemList[itemId] += 1;
	}
	
	public void ranking()						//��ǰ �Ǹ� ��ŷ�� �ű� ��
	{	
		int max = 0;

		for (int i = 0; i<countItemList.length; i++)
		{
			if (max < countItemList[i])
			{
				max = countItemList[i];
			}	
		}
		for (int j = 0; j<countItemList.length; j++)
		{
			if (max == 0)
			{
				System.out.printf("���� �ȸ� ��ǰ�� �����ϴ�.%n");
				break;
			}
			else if (max == countItemList[j])
			{	
				if (j>= 0 && j<= 10)
				{
				System.out.printf("���� 1���� %s �Դϴ� %n", items.get(j).getName());
				}
			}
		}
	}
}