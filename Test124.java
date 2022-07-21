/*==============================================
   ■■■ 클래스 고급 ■■■ 2022-07-21
	- 중첩 클래스
===============================================*/

//outer
class InnerOuterTest
{
	static int a = 10;
	int b = 20;


	//inner
	class InnerNested
	{
		int c = 30;

		void write()	//outer 의 write() 메소드
		{
			System.out.println("inner 의 write()......");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
		}
	}

	void write()		//outer의 write()메소드
	{
		System.out.println("outer의 write()....."); 

		InnerNested ob1 = new InnerNested();
		ob1.write();		//inner의 wrute()메소드 호출
	}
}
public class Test124
{
	public static void main(String [] args)
	{
		
		//InnerOuterTest(outer)클래스기반 인스턴스생성
		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write();			//outer의 write()메소드 호출
		//--==>>
		//outer의 write().....
		//inner 의 write()......
		//a : 10
		//b : 20
		//c : 30
		

		//InnerNested(inner)클래스 시반 인스턴스생성
		//InnerNested ob3 = new InnerNested();
		//--==>>에러발생(컴파일오류)
		
		//Test122와 비교해보기~!~!
		//클래스를통해 InnerOuterTest.InnerNested 클래스 기반 인스턴스생성
		//InnerOuterTest.InnerNested ob4 = new InnerOuterTest.InnerNested();
		//--==>>에러발생(컴파일오류)

		//※ 중첩 내부 클래스(static 중첩 클래스)와는 달리
		//	외부 클래스의 인스턴스(객체)를 사용하지않고
		//	단독으로 내부 클래스의 인스턴스를 생성하는 것은 불가능하다.
		//	내부 클래스의 객체를 생성하는 것이 가능하다.
		//	→ 외부 클래스의 객체를 사용하면
		//	내부 클래스의 객체를 생성하는것이 가능하다.

		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();
		ob5.write();
		//inner 의 write()......
		//a : 10
		//b : 20
		//c : 30
		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		ob6.write();
		//a : 10
		//b : 20
		//c : 30
		//outer클래스명.inner클래스명 참조변수 = new outer생성자().new inner생성자();

		//cf) static → 중첩 클래스
		//outer 클래스명.inner클래스명 참조변수명 = new outer클래스명.inner생성자();

}