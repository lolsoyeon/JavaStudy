public interface Items					//Item�� �ΰ��� ������ ������ ���� ����� �Ӽ��� �̾Ƽ� �������̽��� ������� ó���� ������ (������ / ��ȭ)
{										//Item ��� �����ǿ� ��ȭ�� �� ����
	public abstract String getName();	//Name�� ���� �ϴ� �Լ�
	public abstract int getPrice();		//Price�� ���� �ϴ� �Լ�
	public abstract int getAmount();	//Amount�� ���� �ϴ� �Լ�
	public abstract void setAmount();   //Amount�� ���� �ϴ� �Լ�(-1 ����)
	public abstract void fill();        // 5���� �߰�

}

