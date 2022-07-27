/*=============================================
   ■■■컬렉션(Collection)  ■■■ 2022-07-27
 ==============================================*/

/*
○ 큐 (Queue)
 큐 (Queue) 는 선입선출의 FIFO(First Input, First Output)구조로
 먼저 입력된 자료를 먼저 출력하며
 Queue 인터페이스를 구현한 클래스는 큐와 관련한 다양한 기능을 제공한다.

 ※ Queue 인터페이스 인스턴스 생성하기 위해서는
 new 연산자를 이용하여 Queue 인터페이스를 구현한(implements)
 클래스의 생성자를 호출한다.

 e)Queue ob = new LinkedList();
 				 ------------
				  하위클래스


 ○ 주요 메소드

	- E element()
  	큐의 head 요소를 반환하며 삭제하지않는다.

	- boolean offer(E o)
	지정된 요소를 큐에 삽입한다.

	 - E peek()
	큐의 head(출구 바로직전)요소를 반환하고 삭제하지않으며
	큐 자료구조가 empty 인경우 null 을 반환한다.

	- E poll()
	큐의 head요소를 반환하고 삭제하며
	큐 자료구조가 empty 인경우 null 을 반환한다.

	-E remove()
	큐의 head 요소를 반환하고 삭제한다.
*/

import java.util.Queue;
import java.util.LinkedList;
public class Test156
{
	public static void main(String[] args)
	{
		//Queue 자료구조 생성
		//Queue myQue = new Queue();		//--(X)
		Queue<Object> myQue = new LinkedList<Object>();

		//myQue는 큐타입??????

		//데이터 준비
		String str1 = "최동현";
		String str2 = "정영준";
		String str3 = "김태민";
		String str4 = "조현하";

		//myQue 라는 큐 자료구조에 데이터 추가
		 myQue.offer(str1);
		 myQue.offer(str2);
		 myQue.offer(str3);
		//myQue.offer(str4);
		 boolean test = myQue.offer(str4); 

		 System.out.println("test : " + test);
		 //--==>> test : true


		//테스트
		System.out.println(myQue);						//객체를 그.대.로.넘김
		//--==>> [최동현, 정영준, 김태민, 조현하]		//--더미 보여지기만함

		//Queue 자료구조 myQue 에서
		//요소를 제거하지않고 head 요소 반환

		System.out.println("값1 : " + (String)myQue.element());
		System.out.println("값2 : " + (String)myQue.element());
		System.out.println("값3 : " + (String)myQue.element());

		//값1 : 최동현
		//값2 : 최동현
		//값3 : 최동현
		System.out.println();

		String val;

/*
		//① 

		//peek()
		//-- 큐의 head 요소 반환. 제거 안함.
		//   큐가 empty 일경우 null을 반환.★

		while (myQue.peek() != null)
		{
			//poll()
			//-- 큐의 head요소 반환 .제거함.
			//   큐가 empty 일 경우 null을 반환
			val = (String)myQue.poll();

			System.out.println("요소 : " + val);

		}
		System.out.println();
		//--==>>요소 : 최동현
		//		요소 : 정영준
		//		요소 : 김태민
		//		요소 : 조현하

*/
		
/*
		//peek()
		//-- 큐의 head 요소 반환. 제거 안함.
		//   큐가 empty 일경우 null을 반환.★

		while (myQue.poll() != null)
		{
			//poll()
			//-- 큐의 head요소 반환 .제거함.
			//   큐가 empty 일 경우 null을 반환
			val = (String)myQue.poll();

			System.out.println("요소 : " + val);

		}
		System.out.println();
		//--==>>요소 : 정영준
		//		요소 : 조현하
*/

/*
		//②
		while (true)			//무한루프
		{
			val = (String)myQue.poll();

			if (val == null)
				break;				//쓰고싶은데 생각이 안남

			else
				System.out.println("요소 : " + val);

		}
		System.out.println();

		/*
		요소 : 최동현
		요소 : 정영준
		요소 : 김태민
		요소 : 조현하

*/
		//③
		while (!myQue.isEmpty())
		{
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);
		}
		System.out.println();
/*
		//--==>>요소 : 최동현
		//		요소 : 정영준
		//		요소 : 김태민
		//		요소 : 조현하
*/


	}
}