/*==============================================
    ■■■ 클래스 고급 ■■■ 2022-07-20
	- 인터페이스(Interface)
===============================================*/

//인터페이스
interface ADemo
{
	public void write();
}
//인터페이스
interface BDemo
{
	public void print();
}

//인터페이스는 2개 이상을 구현(implements) 할 수 있다
// → 클래스에서는 다중 상속이 되지 않는 부분을 보완(보충)하는 개념.

//클래스
//class Demolpml
//class demoLmpl exteds ADemo,BDemo 
//class demoLmpl implements ADemo,BDemo
//	↓
//추상클래스 - 두 인터페이스를 구현하는 추상 클래스
//abstract class DemoImpl implements ADemo,BDemo
//클래스 - 두 인터페이스를 구현하는 클래스(두 인터페이스의 모든 메소드를 Overriding)

class DemoImpl implements ADemo,BDemo
{
	//JDK 1.5(5.0)에서는 인터페이스 메소드를
	//오버라이딩 할 때
	//@Override 어노테이션 을 사용할 수 없다.
	//JDK1.6이후부터 적용가능한 문법이다.
	//단, 상속받은 클래스의 메소드를 오버라이딩 할때에는
	//JDK 1.5에서도 어노테이션 사용이 가능하다.
	@Override
	public void write()
	{
		System.out.println("ADemo 인터페이스 메소드 write()....");
	}
	@Override
	public void print()
	{
		System.out.println("BDemo 인터페이스 메소드 print()....");
		
	}

}

public class Test118
{
	public static void main(String[] args)
	{
	
		//ADemo ob = new ADemo;		//인터페이스 인스턴스 생성불가
		//BDemo ob = new BDemo
		

		//ADemo BDemo 인터페이스를 구현한
		//클래스 기반의 인스턴스 생성
		DemoImpl ob1 = new DemoImpl();

		ob1.write();
		ob1.print();

		//업 캐스팅
		ADemo ob2 = new DemoImpl();
		BDemo ob3 = new DemoImpl();


		//ob2.print();
		//-->>에러 발생(컴파일 에러)
		//ob3.write();
		//-->>에러 발생(컴파일 에러)

		
		ob3.print();
		ob2.write();
		//--==>>BDemo 인터페이스 메소드 print()....



		((BDemo)ob2).print();
		//-->> BDemo 인터페이스 메소드 print()....
		((ADemo)ob3).write();
		//-->> ADemo 인터페이스 메소드 write()....
		//--	DemoImpl클래스가 두 인터페이스를 모두 구현했기 때문에
		//		이와같은 처리가 가능하다.
		//		만약 ,DemoImpl클래스가 두 인터페이스들 중 한 인터페이스만 구현했디면
		//		이 구문은 런타임 에러 (ClassCastException)가 발생하는 구문이다.

		//다운캐스팅
		((DemoImpl)ob3).write();
		//--==>>ADemo 인터페이스 메소드 write()....
	}
}