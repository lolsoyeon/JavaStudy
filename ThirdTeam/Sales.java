import java.util.List;
public class Sales
{
	List<Items> items;			
	int[] countItemList = new int[15];
	
	public Sales(List<Items> items)					//List�ڷᱸ���� Items�� �޾ƿ�
	{
		this.items = items;
	}

	public int getsumAll()							//���� ���� ���ϱ� ���� �Լ� ����
	{	
		int sumAll=0;

		for (int i=0; i<countItemList.length; i++)
		{
			int count = countItemList[i];
			sumAll += count * items.get(i).getPrice();
			
		}
		return sumAll;
	}
	

	public void countId(int itemId)					//������ �ϳ� �ȸ������� ������ ����Ʈ�� �ϳ��� ����� ��
	{
		countItemList[itemId] += 1;
	}

	
public void ranking()                  //��ǰ �Ǹ� ��ŷ�� �ű� ��
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


/*
		for (int i=0; i<countItemList.length; i++)		
		{
			for (int j=0; j<countItemList.length; j++)	
			{
				if (countItemList[i] > countItemList[j])
				{
			
					countItemList[j]++;
				}	
				
				else if(countItemList[i] > countItemList[j]) 
				{
					countItemList[i]++;
				}
			}
		System.out.printf("���� %d ���� %s �Դϴ�%n",(i+1) ,items.get(i).getName());
		
*/

	/*
	public void ranking()							//��ǰ �Ǹ� ��ŷ�� �ű� ��
	{	
		int max=0;

		for (int i=0; i<countItemList.length; i++)
		{
			if (max < countItemList[i])
			{
				max = countItemList[i];
			}	
		}
		for (int j=0; j<countItemList.length; j++)
		{
			if (max == countItemList[j])
			{	
				
				System.out.printf("���� 1���� %s �Դϴ� %n", items.get(j).getName());
			}
		}

	}
	*/