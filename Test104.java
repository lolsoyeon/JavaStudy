/*=====================================================================
	■■■메소드 중복 정의 (Method Overloading)■■■
	- 메소드 오버로딩(Method Overloading)이 가능한 형태와 불가능한 형태
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
	//public static void print(int j) {}	//--(X)  호출 할 때 print(20);
	public static void print(char c) {}		//가능은 한데 자동 형 변환 규칙을 check 충분히 고려하고 메소드를 정의해야한다.

	public static void pNorint(int i,int j ) {}
	public static void print(double d) {}	//똑같이 가능은한데 자동 형 변환 규칙을 check~!~!
	//public static void print(double d) {return 10.0;} //--(X) 리턴 자료형이 void 라서 문법적으로 안맞다.
	//public static double print(double e) {return 10.0;} //--(X) check~!

}