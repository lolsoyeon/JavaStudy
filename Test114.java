/*==============================================
    	■■■ 클래스 고급 ■■■
		- 상속(Inheritance) 2022-07-20
===============================================*/
/*
메소드 오버라이딩(Method Overriding)의 특징
- 메소드 이름, 리턴타입, 파라미터 수나 타입이 완전 일치해야한다.
- 반드시 상.속 관계가 있어야한다.
-	재정의된 하위 클래스의 메소드 접근제어지시자는
	상위클래스의 메소드 접근제어 지시자보다 범위가 크거나 같아야한다.
	예를들어, 상위클래스 메소드의 접근제어 지시자 『protected』  인경우
	하위클래스가 이 메소드를 오버라이딩(Overriding) 하는경우
	접근제어지시자는 『public』또는 『protected』이어야 한다.
- 『static 』,『final』 ,『private』 메소드는 오버라이딩(Overriding) 할 수 없다.
//   언니    최종버전이야 

- Exception 의 추가가 불가능하다.
즉, 상위 메소드가 가지고있는 기존 예외 사항에
새로운 Exception 을 추가하는 것은 불가능 하다는것이다.

자바에서는 예외조차도 하나의 객체다 즉, 하나의 케이스로 생각한다.
*/

//부모 클래스(상위 클래스  super class)
class SuperTest114
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write()메소드 : " + a + ": "  + b +" : "+ c);
	}

}


//자식 클래스
class SubTest114 extends SuperTest114
{

	/*
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write()메소드 : " + a + ": "  + b " +: "+ c);
	}
	*/
	protected int b = 100;		//

	public void print()
	{
		//System.out.println("sub print() 메소드 : " + a + " : " + b + ": " + c);
		//-==>>컴파일 에러 발생
		//슈퍼클래스에서 선언된 변수 a에는 접근 할 수 없다.
		//private변수이기때문에

		System.out.println("Sub print()메소드 : " + b + " : " + c);
		System.out.println("Sub print()메소드 : " + b);
		System.out.println("Sub print()메소드 : " + this.b); //그 클래스 SubTest114.b
		System.out.println("Sub print()메소드 : " + super.b);//extends 한 SuperTest114.b

		//--==>> Sub print()메소드 : 100 : 20
		//--==>> Sub print()메소드 : 100
		//--==>> Sub print()메소드 : 100
		//--==>> Sub print()메소드 : 10
		//변수 b 는 접근방법에 따라 다른 b 로 접근 및 출력이 이루어진다.
		//슈퍼클래스에서 선언된 b, 서브클래스에서 선언된 b

		System.out.println("Sub print()메소드 : " + c);
		System.out.println("Sub print()메소드 : " + this.c);	//SubTest114.c
		System.out.println("Sub print()메소드 : " + super.c);	//SuperTest114.c
		//--==>> Sub print()메소드 : 20
		//--==>> Sub print()메소드 : 20
		//--==>> Sub print()메소드 : 20
		//변수 c는 접근하는데 아무런 제약과 제한이없다.
		//슈퍼클래스에서 선언된 c

	} //end print()
	@Override
	public void write()
	{
		//System.out.println("Sub write() 메소드 : "  + a + ": "+ b + " : "  + c );

		//--슈퍼 클래스에서 선언된 변수 a에는 접근할 수없다. (print() 메소드와 마찬가지)
		//-> private 변수이기 때문에
		System.out.println("Sub write() 메소드 : " + b + " : "  + c );
		//--==> Sub write() 메소드 : 100 : 20


	}
}

//main()메소드를 포함하는 외부의 다른 클래스
public class Test114
{
	public static void main(String[] args)
	{
		//하위 클래스(SubTest114)인스턴
		SubTest114 ob = new SubTest114();

		ob.print();

		ob.write();
		//--==>> Super write()메소드 : 5: 10 : 20
		//Sub write() 메소드 : 100 : 20
		System.out.println("-------------------------구분선");


		System.out.println(ob.b);  
		//--==>>100 
		System.out.println(((SuperTest114)ob).b); 
		//--==>>10 
		//※ 슈퍼 부름 (부모 위치로 올려버렸다)

		ob.write();

		((SuperTest114)ob).write();
	}
}