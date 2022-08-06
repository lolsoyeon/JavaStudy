/*=============================================
   ■■■ 컬렉션(Collection)  ■■■ 2022-07-28
 ==============================================*/
 /*
 List → Vector, ArrayList, LinkedList,.....
 - 순서가 있음
 - 배열과 유사
 - 중복을 허용

 ○ ArrayList 클래스 사용 빈도 많음 대표적

 - ArratList 와 Vector 클래스는 
	List 를 크기 변경이 가능한 배열로 구현한 것으로
	차이점은 Vcetor 클래스의 객체는 기본적으로 동기화 되지만,
	ArrayList 는 그렇지 않다는 점이다.

 - 비동기화 컬렉션은 동기화 된 컬렉션보다 더 나은 성능을 제공하며
  스레드들이 컬렉션을 공유하지않는 프로그램에서는
  일반적으로 ArrayList 를 Vector 보다 더 선호하며,
  Array 는 동기화를 고려하지 않은 Vector처럼 동작함으로써
  스레드 동기화에 따르는 부담을 가지지 않기 때문에
  Vector 보다 더 빠르게 실행된다.

  - null 을 포함한 모든 요소를 허용하며
  List 인터페이스를 구현하는 것 외에 리스트에 격납하기위해
  내부적으로 사용되는 배열의 사이즈를 조작하는 메소드를 제공한다.

 */
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.ListIterator;
public class Test165

{
	public static void main(String[] args)
	{
		// ArratList 자료구조 인스턴스생성
		 //ArrayList<String> list = new ArrayList<String>();	//
		 //Vector<String> list = new Vector<String>();			// 안되는 코드들
		// List<String> list = new Vector<String>();			// 왜 안될까??

		List<String> list1 = new ArrayList<String>();

		// list1 자료구조에 요소 추가 → add()
		list1.add("범죄도시2");
		list1.add("탑건2");
		list1.add("마녀2");
		
		List<String> list2 = new ArrayList<String>(list1);
		// list2 에 요소 추가 add()

		list2.add("인셉션");
		
		List<String> list3 = new ArrayList<String>();

		// list 3에 list2의 전체요소 추가 addAll()
		list3.addAll(list2);		//반복문안쓰고 한 번 넘기면 추가가된다


		// "탑건2" 앞에 "레미제라블" 추가해보기

		// ①"탑건" 찾기 indexOf() → 위치 인덱스 반환
		int n = list3.indexOf("탑건2");
		// --==>>n : 1

		// ② 탑건2 찾은 인덱스 위치 레미제라블 삽입
		list3.add(n,"레미제라블");

		// System.out.println("n : " + n);
		// insertElementAt()
		//      0                          1
		// --==>>[범죄도시2, 레미제라블, 탑건2, 마녀2, 인셉션]
		// list3.insertElementAt("레미제라블",1);
		// list3.set(1,"레미제라블"); 탑건대신 들어감
		// list3.clear();


		// list3.add(1, "레미제라블"); 내가한것 성공!~!~!


		// 출력 → 더미네이터 확인
		System.out.println(); 
		System.out.println("========================");
		System.out.println(list1);
		// --==>>[범죄도시2, 탑건2, 마녀2]
		System.out.println(list2);
		// --==>>[범죄도시2, 탑건2, 마녀2, 인셉션]
		System.out.println(list3);
		// --==>>[]

		// -addAll()사용후
		// --==>>[범죄도시2, 탑건2, 마녀2, 인셉션]
		System.out.println("========================");

		// 출력 → listIterator() 메소드 활용하여 출력

		 ListIterator<String> li= list3.listIterator();

		 while (li.hasNext())
		 {
			 System.out.print(li.next() + " ");
		 }
		System.out.println();

		// --==>>
		
		// 출력 → 역순으로 접근
		 while (li.hasPrevious())
		 {
			System.out.print(li.previous() + " ");
		 }
		System.out.println();
		// ==>>인셉션 마녀2 탑건2 레미제라블 범죄도시2

		
	}
}