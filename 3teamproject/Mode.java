import java.io.IOException;
public interface Mode
{
	public abstract void display();							//�޴����� ������� �Ѵ� 
	//public abstract void select()throws IOException;		//�����ڸ�忡�� �����ϴ� ���... �Է��� �ް� �����ϴ� ����� ������ ����
	public abstract boolean select()throws IOException;		
}
