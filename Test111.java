/*==============================================
    	■■■ 클래스 고급 ■■■
		- 상속(Inheritance)
===============================================*/
/*
	○ 상속(Inheritance)이란

	새로 설계(생성)하고자 하는 클래스가
	이미 설계되어 있는 다른 클래스의 기능과 중복되는 경우
	이미 설계된 클래스의 일부분이나 전체 구조를 공유할 수 있도록 하는 기능을 의미한다.

	즉, 상속은 객체를 좀 더 쉽게 만들 수 있는
	고수준의 재사용성(reusability)을 확보하고
	객체간의 관계를 구성함으로써
	객체 지향의 또 다른 특징인 『다형성』의 문법적 토대가 된다.

	◈ 사실 실제로는 가이드라인으로 자주 적용된다! 오류 다수 발생되서 다시 만들 확률 높음

	상속은 기존 프로그램의 클래스 내용을 공유함으로써
	중복된 코드들을 재작성할 필요 없이
	반복적이고 세부적인 작업을 처리하지 않기 때문에
	프로그램을 작성하는 시간을 절약 할 수있고
	유지보수를 편리하게 할 수 있으며,
	프로그램의 길이도 짧아지게 된다.

	또한, 이미 작성된 프로그램들은 앞서 테스트되었기 때문에
	오류를 줄일 수 있어 현재 작성 중인 프로그램에만 전념할 수있다.

※주의할 점

	자바는 『다.중.상.속』을 지원 하지 않기 때문에
	두 개 이상의 클래스로부터 상속받을 수 없다.

	자바는『단.일.상.속』만 지원한다.

	접근제어 지시자 protected가 붙어있으면 99퍼센트 상속에의한거다~!
*/
//부모 클래스 == 상위 클래스 == 슈퍼(Super) 클래스 == 물려주는 클래스 == 상속하는 클래스

class SuperTest111
{
	protected double area;
	
	//생성자
	SuperTest111()
	{
		System.out.println("Super class...");
	}

	void write(String title)
	{
		System.out.println(title + " - " + area);
	}
}

//자식 클래스 == 하위 클래스 == 서브(Sub) 클래스 == 물려받는 클래스 == 상속받는 클래스
public class Test111 extends SuperTest111 //우리 아버지가 SuperTest111이다.
										//SuperTest112 예외 없이 부모는 하다
{
	/*
	protected double area;		//부모로부터 물려받은 area

	//※ 생성자는 상속의 대상에서 제외된다~!!!! check~! 
	
	
	void write(String title)	//부모로부터 물려받음 write() 메소드
	{
		System.out.println(title + " - " + area);
	}
	*/

	//사용자 정의 생성자가 없으면 자동으로 삽입되는 default생성자
	//		↓
	//사용자 정의 생성자
	public Test111()
	{
		
		//※ 생성자 내부에서 또다른 생성자 호출하는 문법
		//	-	가능하다. 단, 생성자 내부에서 가장 먼저 실행되어야 한다.

		super();

		//	텅~ 비어있다~!				//--( X )
		//		↓
		//부모 클래스 생성자 호출구문   //--(○ )
		//SuperTest111();				//--( X )
		//this 비슷한거 super

		System.out.println("Sub class...");

		//super(); //생성자는 생성자 내부에서 부를 수 있다 단, 맨 먼저 처리해야한다.

	}

	public void actionCircle()
	{
		int r = 10;
		area = r * r *3.141592;
		//this.area = r * r *3.141592;
		//super.area = r * r *3.141592;

		//ex)책이 한권인데 어떤걸지칭해도 그 책
		write("원");
	}

	public void actionRect()
	{
		int w = 20,h =5;
		area = w* h;
		write("사각형");

	}

	public static void main(String[] args)
	{
		//Test111 클래스(자식)기반 인스턴스생성
		Test111 ob = new Test111(); 
		//--==>>Super class...
		//--==>>Sub class...

		ob.actionCircle();
		//--==>>원 - 314.1592

		ob.actionRect();
		//--==>>사각형 - 100.0
	}
}
/*
Super class...
Sub class...
원 - 314.1592
사각형 - 100.0
계속하려면 아무 키나 누르십시오 . . .


*/