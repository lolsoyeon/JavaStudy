import java.io.IOException;
public interface Mode
{
	public abstract void display();						//�޴����� ������� �Ѵ� 
	public abstract void select()throws IOException;	//�Է��� �ް� �Է¿� ���� ���������� ��� ȣ��

}