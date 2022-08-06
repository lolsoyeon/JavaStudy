/*=====================================================
  ■■■컬렉션(Collection)  ■■■ 2022-07-28 오후 5:58
 ======================================================*/

/*
○ List 인터페이스
- 순서가 있다,  배열과 유사, 중복 허용
- 주요 구현 클래스
	ㆍVector(동기화지원)
	ㆍArrayList(동기화 지원하지않음)
	ㆍLinkedList(체인, 링크, 결합, 큐)
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Test166
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();	
		list.add("서울");
		list.add("부산");
		list.add("대전");
		list.add("대구");
		list.add("광주");
		list.add("울산");
		list.add("세종");

		System.out.println(list);
		//--==>>[서울, 부산, 대전, 대수, 광주, 울산, 세종]

		System.out.println("전체 갯수 : " + list.size());

		//0~7번 까지 
		System.out.println("첫 번째 요소 : " + list.get(0));
	
		//마지막 요소 출력
		System.out.println("마지막 요소 :  "+ list.get(list.size()-1));


		///처음 위치에 "한국" 추가
		 list.add(0, "한국");
		 System.out.println(list);


		 //처음 위치의 데이터를 "대한민국" 으로 변경

		 list.set(0,"대한민국");
		 System.out.println(list);


		 //"서울 "존재여부 확인
		 if (list.contains("서울"))
		 {
			 System.out.println("서울이 존재합니다");
		 }


		//"서울"이 몇번째 인덱스에 위치하는지 확인
		int n = list.indexOf("서울");
		System.out.println("n : "+ n);

	
		//대한민국 지우기
		//list.remove("대한민국");		//-(O)
		list.remove(0);					//-(O)
		System.out.println(list);


		//list 의 전체 요소 출력
	
		System.out.println("전체 요소 출력....①");
		for (int idx =0;idx<list.size() ;idx++ )
		{
			System.out.print(list.get(idx) + " ");
		}
		System.out.println();
		//--==>>전체 요소 출력....①
		//서울 부산 대전 대구 광주 울산 세종


		System.out.println("역순 출력...①");

		for (int idx=list.size()-1;idx>=0 ;idx-- )
		{
			System.out.print(list.get(idx)+" ");
		}
		System.out.println();


		System.out.println("전체 출력....②");
		for (String s : list )
		{
			System.out.print(s + " ");
		}
		System.out.println();


		System.out.println("전체 출력.....③");
		Iterator<String> it = list.iterator();
		while (it.hasNext())
		{
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println();



		System.out.println("전체 출력......④");
		ListIterator<String> li = list.listIterator();
		while (li.hasNext())
		{
			System.out.print(li.next() + " ");
		}
		System.out.println();



		System.out.println("역순 출력.....②");
		while (li.hasPrevious())
		{
			String s = li.previous();
			System.out.print(s + " ");
		}
		System.out.println();

	}
}