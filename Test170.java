/*=====================================================
  ■■■컬렉션(Collection)  ■■■ 2022-07-29  오후 3:35
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
○ Hashtable <K, V> 클래스

-  실제 해시테이블 구조를 객체 모델링 한 클래스로
	검색이 용이하기 때문에 사용 빈도가 높은 편에 속한다.

-	해시케이블이란 키(Key) 와 그에 상응하는 데이터(Value)로
	구분된 데이터 구조이다.

-  데이터를 저장하고 ,  검색하기 위해서 키(key)로 접근하며
	이 구조에서는 키 값을 부여하면 해당 데이터가 변환된다.

 -  또한,  Hashtable 클래스는 key 또는 value 의 값으로 null을 허용하지 않는다.

*/
import java.util.Hashtable;
public class Test170
{
	private static final String[] names
		={"조현하","민찬우","최나윤","고연수","정영준","반보영"};
	private static final String[] tels
		={"010-7202-6306","010-2546-0266","010-7236-0813","010-4016-6208","010-4151-5510","010-7193-4562"};



	public static void main(String[] args)
	{
		//Hashtable 자료구조 인스턴스 생성
		//<key,value> 
		Hashtable<String, String> ht = new Hashtable<String, String>();

		//ht 라는 Hashtable 자료구조에
		//배열(names,tels)에 담겨있는 데이터 요소로 담아내기
		//→ put(k,v);★★★
		for (int i = 0;i<names.length ;i++ )
		{
			 //ht.put("조현하", "010-7202-6306");★★★★★
			 ht.put(names[i], tels[i]); 

		}
			//ht 라는 Hashtable 자료구조에서
			//key 를 이용하여 데이터 검색
			//→ get(k); ★★★
			String findName1 = "정영준";	 //"정영춘"
			String str = ht.get(findName1);  //키넘기면 값줌

			if (str != null) 
			{
				System.out.println(findName1 + " 전화번호 : " + str);
			}


			//else
			//{
			//	System.out.println("띠용~!~!~!");//검색기능처럼 없으면 이렇게 구성
			//}
			System.out.println();

			//--==>>정영준 전화번호 : 010-4151-5510



			//ht라는 Hashtable 자료구조에 key 가 존재하는지 의 여부확인
			// → containsKey() ★★★
			
			String findName2 = "최동현";    //findNames2바꿔보자 
			if (ht.containsKey(findName2))
			{
				System.out.println(findName2 + " 데이터가 존재합니다");
			}
			else
				System.out.println(findName2 + " 데이터가 존재하지 않습니다");
			

			String findName3 = "최나윤";

			if (ht.containsKey(findName3))
			{
				System.out.println(findName3 + " 데이터가 존재합니다.");
			}
			else
			{
				System.out.println(findName3 + " 데이터가 존재하지 않습니다");
			}
			System.out.println();

			//ht라는 Hashtable 자료구조에 value 가 존재하는지 
			// contains() ★★★
			String findTel1 = "010-2546-0266";
			if (ht.contains(findTel1))
			{
				System.out.println(findTel1 + " 데이터가 존재합니다.");
			}
			else
			{
				System.out.println(findTel1 + "데이터가 존재하지 않습니다");
			}
			System.out.println();


			//ht라는 Hashtable 자료구조에 반보영 데이터삭제
			// 『remove()』 ★★★

			ht.remove("반보영");

			// remove() 메소드는 인자값으로 key 를 넘겨받지만
			//이 때, key 만 삭제되는 것이 아니다.
			// 해당 key 와 연결되어(매핑되어) 있는 value 도 함께 제거된다.

			//삭제(remove()) 이후 key 가 존재하는지 확인
			if (ht.containsKey("반보영"))
			{
				System.out.println("보영이가 존재합니다.");
			}
			else
				System.out.println("보영이가 어디갔어???");
			
			System.out.println();

			//삭제(remove()) 이후 value 가 존재하는지 여부
			if (ht.contains("010-7193-4562"))
			{
				System.out.println("보영이 전화번호가 존재합니다.");
			}
			else
				System.out.println("보영이가 전화번호가 존재하지않습니다.");
			
			System.out.println();
		
			// ※ null관련 처리  → null 아무것도없는 상태값
			//왜냐하면 Hashtable은 null허용하지않으니까
			//ht.put(null, null);				//--key, value 모두 null
			//에러발생( 런타임 에러)
			//--==>>NullPointerException
		
			//ht.put("도규희",null);			//value가 null
			//에러발생( 런타임 에러)	
			//--==>>NullPointerException

			//ht.put(null,"010-8903-1234");		//key가 null
			//에러발생( 런타임 에러)
			//--==>>NullPointerException

			//중복된 key 입력
			ht.put("민찬우", "010-1111-1111");
			System.out.println(ht.get("민찬우"));
			System.out.println();
			//--==>>010-1111-1111
			//중복된 key를 활용하여 데이터를 입력할 경우
			//기존 "010-2546-0266"에서 010-1111-1111 로 변경되었음을 확인
			


			//중복된 value 입력
			ht.put("김태민","010-7202-6306");
			System.out.println(ht.get("조현하"));
			//--==>>010-7202-6306
			System.out.println(ht.get("김태민"));
			//--==>>010-7202-6306

			//value는 중복된값이 입력되더라도 기존데이터에 아무런 영향을 미치지 않음
			//너는 값은 뭐 다를수있어 내가 변경해줄게 근데 키는 유일해

		}
}