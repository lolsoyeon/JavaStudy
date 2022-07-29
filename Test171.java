/*=====================================================
  ■■■컬렉션(Collection)  ■■■ 2022-07-29  
 ======================================================*/

//Map → Hashtable, HashMap

/*
○ java.util.Map 인터페이스는
	키(Key)를 값(Value)에 매핑(mapping) 하며
	동일한 키를 등록할 수 없고, 유일해야 하며,
	각 키는 한 개의 값만을 매핑해야 한다.
	즉, 하나의 키에 대응하는 하나의 값을 갖는 자료구조이다.    ★쌍
*/

/*
HashMap<K, V>클래스
 - Hashtable 클래스와 마찬가지로 Map인터페이스에서 상속받은
 HashMap클래스의 기능은 Hashtable과 동일하지만
 Sychronization 이 없기때문에 동시성 문제가 없다면
 (즉, 멀티 스레드 프로그램이 아닌경우 라면)
 HashMap을 사용하는 것이 성능을 향상시킬수 있다.

 - 또한, HashMap은 Hashtable 클래스와 달리 null ★ 을 혀용한다.

*/
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test171
{
	public static void main(String[] args) throws IOException
	{
		//HashMap 자료구조 인스턴스생성
		//HashMap<String, String> map = new HashMap<Stirng,String>();
		Map<String,String> map = new HashMap<String, String>();
		
		//map 이라는 Hashtable 자료구조에 요소 추가
		// → put(); ★★★★
		map.put("영화","범죄도시");
		map.put("드라마","이태원클라스");
		map.put("만화","슬램덩크");

		//테스트()→ 더미확인
		System.out.println(map);
		//--==>>{드라마=이태원클라스, 영화=범죄도시, 만화=슬램덩크}
		//--데이터 매핑 구조 확인
		//--데이터 요소 격납 순서가 추가 순서와 관계 없음
		//어차피 식별은 key로 한다~~~~~~~~~~~~~~~~

		//※ null관련 처리
		// 아래의 데이터 입력 유형에 따라 모든 종류의 데이터 입력이 가능하지ㅏㄴ
		//마지막 null을 key로 매핑된 "모나리자"가
		//최초 null을 key로 매핑하는 null을 덮어쓰는 상황이 발생하게된다.
		//즉, HashMap은 null을 하나의 고유한 key로 간주한다.(인식한다.)

		//key와 value 모두 null
		map.put(null,null);

		//테스트
		System.out.println(map);
		//--==>>{null=null, 드라마=이태원클라스, 영화=범죄도시, 만화=슬램덩크}
		//		---------

		//value가 null
		map.put("동화",null);
		//테스트 더미확인
		System.out.println(map);
		//--==>>{null=null, 드라마=이태원클라스, 영화=범죄도시, 동화=null, 만화=슬램덩크}
		//														----------

		//key가 null ~~~~~~~~~~~~~~~~~~
		map.put(null,"모나리자");
		//테스트
		System.out.println(map);
		//--==>>{null=모나리자, 드라마=이태원클라스, 영화=범죄도시, 동화=null, 만화=슬램덩크}
		//		--------------										---------


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp;
		for (String str;(str = br.readLine()) != null; )
		{
			temp = str.split(",");
			if (temp.length< 2)
			{
				System.out.print("카테고리, 타이틀(컴마구분) : ");
				continue;
			}
			map.put(temp[0].trim(), temp[1].trim());
			System.out.println(map);


		}


	}
}