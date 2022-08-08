import java.util.List;
public class Sales
{
	List<Items> items;			
	int[] countItemList = new int[15];// 인덱스는 0-14
	
	public Sales(List<Items> items)	// 날라오는 Items가 리스트기 때문에, List자료구조의 Items를 받아옴	
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
	
	public void ranking()						//상품 판매 랭킹을 매길 것
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
				System.out.printf("현재 팔린 상품이 없습니다.%n");
				break;
			}
			else if (max == countItemList[j])
			{	
				if (j>= 0 && j<= 10)
				{
				System.out.printf("현재 1위는 %s 입니다 %n", items.get(j).getName());
				}
			}
		}
	}
}