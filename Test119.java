/*==============================================
    ■■■ 클래스 고급 ■■■ 2022-07-20
	- 인터페이스(Interface)
===============================================*/
//
interface Demo
{
	public void write();
	public void print();

}
abstract class DemoImpl implements Demo
{
	@Override
	public void write()
	{
		System.out.print("write() 메소드 재정의...");
	}
}
//추상 클래스를 상속받는 추상 클래스
//
//
class DemoImplSub extends DemoImpl
{

	/*
	@Override
	public void write()
	{
		System.out.print("write() 메소드 재정의...");	
	}
	*/
	@Override
	public void print()
	{
		System.out.println("print() 메소드 재정의...");
	}
}
//
public class Test119
{
	public static void main(String[] args)
	{
		//Demo ob1 = new Demo();
		//인스턴스 생성불가  인터페이스
		//DemoImpl ob2 = new DemoImpl
		//인스턴스 생성불가 추상클래스라서

		DemoImplSub ob3 = new DemoImplSub();

		ob3.write();
		ob3.print();
		//write() 메소드 재정의...print() 메소드 재정의...


	}
