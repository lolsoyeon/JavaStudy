/*=====================================================================
	����޼ҵ� �ߺ� ���� (Method Overloading)����
	- �޼ҵ� �����ε�(Method Overloading)�� ������ ���¿� �Ұ����� ����
=======================================================================*/

public class Test104
{
	public static void main(String[] args)
	{
		print(3.14);

		double result = print(3.14);
		
	}
	public static void print()  {}
	//public static void print()  {}		//--(X)
	public static void print(int i) {}
	//public static void print(int j) {}	//--(X)  ȣ�� �� �� print(20);
	public static void print(char c) {}		//������ �ѵ� �ڵ� �� ��ȯ ��Ģ�� check ����� ����ϰ� �޼ҵ带 �����ؾ��Ѵ�.

	public static void pNorint(int i,int j ) {}
	public static void print(double d) {}	//�Ȱ��� �������ѵ� �ڵ� �� ��ȯ ��Ģ�� check~!~!
	//public static void print(double d) {return 10.0;} //--(X) ���� �ڷ����� void �� ���������� �ȸ´�.
	//public static double print(double e) {return 10.0;} //--(X) check~!

}