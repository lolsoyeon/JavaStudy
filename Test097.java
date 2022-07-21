/*===============================================
						�迭
	- �迭�� ����
===============================================*/

// Test 096.java ���ϰ� ��

// �迭 ������ ���翡�� ������ ����, �ּҰ� ���� �� ���� ���°� ����

//		�ּҰ� ���� �� ���� ����
//		������ �����ϸ� ���纻�� ������ ��ġ�� �Ǵ� ���� ���
//		(�ڹ��� �迭 �� �ƴ϶� ��� ������ �����Ϳ� �ش��ϴ� ���� ���)

//		������ ���� �� ���� ����
//		���� ��ҷ� ����ִ� ���� ���� ����
//		������ �����ص� ���纻�� ������ ��ġ�� �ʴ� ���� ���

// ������ ����:

public class Test097
{
	public static void main(String[] args)
	{
		int[] nums = {10, 20, 30, 40, 50};		// �迭 ����

		int[] copys1 = nums;					// ���� ���� (�ּҰ� ����)

		int[] copys2 = copyArray(nums);			// ���� ���� (����� ���� �޼ҵ� ȣ��)

		int[] copys3 = (int[])nums.clone();		// ���� ���� (�ڹ� ���� �� clone() �޼ҵ�)

		// ���� �迭 ����� ���� �߻�
		nums[1] = 2000;

		// ��� Ȯ��
		for (int i=0; i<nums.length; i++)
			System.out.printf("%5d", nums[i]);
		System.out.println();

		for (int i=0; i<copys1.length; i++)
			System.out.printf("%5d", copys1[i]);
		System.out.println();

		for (int i=0; i<copys2.length; i++)
			System.out.printf("%5d", copys2[i]);
		System.out.println();

		for (int i=0; i<copys3.length; i++)
			System.out.printf("%5d", copys3[i]);
		System.out.println();
	}

	// �Ű������� int �迭 Ÿ���� �Ѱܹ޾� �迭�� ������ ��,
	// ������ �迭�� ��ȯ�ϴ� ����� ���� �޼ҵ� ����
	public static int[] copyArray(int[] os)
	{
		// �Ű������� �Ѱܹ��� �迭(os)
		// ��, ���� �迭 ��ŭ�� �迭��(�޸� ����)�� Ȯ��
		// ������ �迭 ����
		int[] result = new int[os.length];

		// ������ ���� �迭(os)�� ����ִ� ��ҵ��� ���� �迭(result)�� ��Ƴ���
		// result = os; (X)

		for (int i=0; i<os.length; i++)
		{
			result[i] = os[i];
		}

		// ������ �迭(result) ��ȯ
		return result;
	}
}

/*
	   10 2000   30   40   50
	   10 2000   30   40   50
	   10   20   30   40   50
	   10   20   30   40   50
*/


