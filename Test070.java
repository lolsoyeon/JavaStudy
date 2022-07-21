/*===============================================
  ■■■클래스와 인스턴스■■■
  - 직사각형 클래스 설계 실습
=================================================*/

/*직사각형의 넓이와 둘레 계산 → 클래스로 표현

클래스의 정체성 → 직사각형의 설계도
클래스위 속성   → 가로, 세로, (넓이, 둘레, 부피, 무게, 재질, 색깔....... )
클래스의 기능   → 넓이 계산, 둘레 계산, 가로 세로 입력, 결과 출력,(.......)

객체를 구성     → 데이터(속성, 상태) + 기능(동작, 행위)
							↓                ↓
클래스 설게     →		   변수       +     메소드

class 직사각형
{
	//데이터 (속성, 상태) →변수 (순서 의미 없음)
	int 가로, 세로;

	//기능 (동작, 행위)   → 메소드 (순서 의미 없음)
	가로세로입력()
	{
	}
	둘레계산()
	{
	}
	넓이계산()
	{
	}
	결과출력()
}
*/
import java.util.Scanner;

class Rect					//직사각형 클래스 설계
{
	//데이터 (속성, 상태) →변수 (순서 의미 없음)
	int w, h;               //가로, 세로;

	//기능 (동작, 행위)   → 메소드 (순서 의미 없음)

	void input()					//가로세로입력()		리턴자료형이 void 
									//어떤 값을 놓고오냐? 출력하고 ㄴㄴ값을 담기만했다.
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("가로 입력 : ");	
		w = sc.nextInt();

		System.out.println("세로 입력 : ");
		h = sc.nextInt();

	}
	int calLength()			//둘레 계산() → (가로+세로)*2
	{
		int result;
		result = (w + h) * 2;

		return result;		//나를 호출한곳에 result를 반환하겠다. 
							//return (w + h) * 2
							//둘레라는 값을 줘ㅏ야한다?????
	}
	int calArea()			//넓이 계산() → 가로 * 세로 
	{
		//주요 변수 선언
		int result;

		//연산 및 처리→ 선언한 변수들에 값 담아내기
		result = w * h;

		//최종결과 반환
		return result;

	}
	void print (int a, int l) //같은 int 더라도 따로 써야함

	//결과 출력() → 가로 : xx 세로 : xx 넓이 :xx 둘레 :xx 
	{
		//가로 : 10
		//세로 : 20
		//넓이 : 
		//둘레 : 
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("넓이 : " + a);
		System.out.println("둘레 : "+ l);
	}
   
}

//※ 하나의 자바 파일(.java)에 여러 클래스를(class)를 설계할 수 있다.
//	 하지만 public class 는 이 파일 내에서 하나만 올 수 있다.
//	 파일을 저장 할 때 이름은
//   이 public class 의 이름으로 지정해야한다.
//   일반적으로는(실무적으로는) 하나의 파일에 하나의 클래스를 설계한다.
//   또한, 여러 개의 클래스가 설계된 파일을 컴파일하게 되면
//   내부에 설계된 클래스의 수 만큼 클래스 파일(.class)이 파생된다.

public class Test070
{
	public static void main(String[] args)
	{
		// Rect 클래스 기반의 인스턴스 생성해야한다
		 Rect ob = new Rect();
		 // 입력 메소드 호출
		 ob.input();
		 
		 // 넓이 연산 메소드 호출
		 int area = ob.calArea();

		 // 둘레 연산 메소드 호출			받아야해서 선언하고 담는다.
		 int length = ob.calLength();		//calLength

		 // 출력 메소드 호출
		 ob.print(area, length);			//이름이 키티가 아니어도된다.
	}
}