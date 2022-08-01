/*=====================================================
  ■■■컬렉션(Collection)  ■■■ 2022-07-29 
 ======================================================*/

// Set → HashSet,  TreeSet
// - 순서가 없다 (헝겊주머니)
// - 중복을 허용하지 않는 구조(기본)
/*
○ TreeSet<E> 클래스

 java.util.TreeSet<E> 클래스는
 Set 인터페이스를 상속한 SortedSet 인터페이스를 구현한 클래스로
 데이터를 추가하면 데이터들이 자동으로 오름차순 정렬이 된다.

대상이 객체일때 기준?
*/

//VO - Value Object					//비지니스 로직 포함
//DTO - Data Transfer Object		// a->b 건네기 손에있는것 
//DAO - Data Access Object			//어디어디에 넣어줘

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class GradeVO
{
	//주요 속성 구성
	private String hak;				//학번
	private String name;			//이름
	private int kor, eng, mat;		//국어, 영어 수학점수


	//생성자(사용자 정의 생성자) 5개의 매개변수를 가진 생성자
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	//default 생성자 자동 삽입되지않음

	//생성자(사용자 정의 생성자) 매개 변수없는 생성자
	//--매개변수가 존재하지 않는 생성자를 사용자정의 생성자로 구성하였기 때문에
	//	defaut 생성자가 자동으로 삽입되지 않을 것을 우려하여
	//	추가로 정의한 생성자
	GradeVO()
	{
		this("" ,"", 0, 0, 0);
	}

	//getter/setter

	public String getHak()
	{
		return hak;
	}
	public void setHak(String hak)
	{
		this.hak = hak;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getKor()
	{
		return kor;
	}
	public void setKor(int kor)
	{
		this.kor = kor;
	}
	public int getEng()
	{
		return eng;
	}
	public void setEng(int Eng)
	{
		this.eng = eng;
	}
	public int getMat()
	{
		return mat;
	}
	public void setMat(int mat)
	{
		this.mat = mat;
	}

	//추가 메소드 정의(총점 산출)
	public int getTot()
	{
		//return kor + eng + mat; ↓ 같은 구문
		return this.kor + this.eng + this.mat;
	}


	//만약에 평균 산출이면,,?????????? 성공
	public int getAvg()
	{
		return (this.kor + this.eng + this.mat)/3;
	}


}

class MyComparator<T> implements Comparator<T>
{
	//비교 메소드 재정의
	@Override
	public int compare(T o1, T o2) 
	{
			GradeVO s1 = (GradeVO)o1;
			GradeVO s2 = (GradeVO)o2;

			//학번 기준
			//return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
			//return Integer.parseInt("2206113") - Integer.parseInt(2205115)
			//return 2206113  - 2205115
			//return -2;  

			//학번 기준(오름차순)
			//return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());

			//학번기준 (내림차순) s1과 s2의 자리만 바꿔줌 
			//return Integer.parseInt(s2.getHak()) - Integer.parseInt(s1.getHak());
		
			//총점기준 오름차순
			//return s1.getTot()- s2.getTot();
			//return Integer.parseInt(s1.getTot()) - Integer.parseInt(s2.getTot());
			//return 240 - 210
			//return 30
			//총점기준 내림차순
			//return s2.getTot()- s1.getTot();


			//getName().charAt(0) - getName().charAt(0)

			//compareTo(String anotherString)

			// 호진T
			//return 정수형;
			return s1.getName().compareTo(s2.getName());
				 //---
			  //GradeVO
				  //-----------
				    //String
			

			//이름기준 (오름차순)
			//return s1.getName().compareTo(s2.getName());

			//이름기준 (내림차순)
			//return s2.getName().compareTo(s1.getName());
	}

}
public class Test169
{
	public static void main(String[] args)
	{
		//TreeSwt 자료구조 인스턴스생성
		TreeSet<String> set = new TreeSet<String>();

		//TreeSet자료구조 set 에 요소 추가 → add();
		set.add("귀멸의 칼날");
		set.add("명탐정 코난");
		set.add("하이큐");
		set.add("너의 이름은");
		set.add("포켓몬");
		set.add("센과 치히로의 행방불명");
		set.add("디지몬 어드벤처");
		set.add("이웃집 토토로");
		set.add("짱구는 못말려");
		set.add("아기공룡 둘리 얼음별 대모험");
		set.add("러브 라이브");
		

		//Iterator 를 활용한 set 요소 전체 출력

		Iterator<String> it = set.iterator();
		while (it.hasNext())
		{
			System.out.print(it.next() + ",");
		}
		System.out.println();


		//--요소를 문자열로 구성할 경우
		//	가나다 → 오름차순 정렬 확인
		//	적재 시 오름차순을 비교해서 적재한다.


		//TreeSet 자료구조 인스턴스 생성
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		//
		//					↓ 
		//
		//MyComparator클래스를 생성하여
		//compare() 메소드를 재정의한 후 다시 생성Comparator
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());

		//treeSet 자료구조 set2 에 요소 추가
		set2.add(new GradeVO("2206113", "도규희", 90, 80, 70));
		set2.add(new GradeVO("2206115", "최동현", 80, 70, 60));
		set2.add(new GradeVO("2206128", "김인교", 88, 78, 67));
		set2.add(new GradeVO("2206139", "조영관", 70, 60, 50));
		set2.add(new GradeVO("2206150", "민찬우", 99, 82, 72));

		//set2 자료구조 전체 출력

		/*System.out.print("set2 자료구조 출력");
		for (String s : set2)
		{
			System.out.print( ((GradeVO)s).get + " ");
		}
		System.out.println();
*/
	/*
		//Iterator 를 활용한 et2 자료구조 출력
		Iterator<GrradVO> it2 = set2.iterator();
		while (it2. hasNest())
		{
			System.out.print(it2.next() + " ");
		}
		System.out.println();
	*/
		//==>>에러 발생(런타임 에러)

		//System.out.print( ((GradeVO)s).get + " ");
		//
		//					↓ 
		//
		//MyComparator클래스를 생성하여
		//compare() 메소드를 재정의한 후 다시 구성

/*
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			System.out.print(it2.next() + " ");
		}
		System.out.println();
		//--=>> 
		//
							↓
*/
		//객체 자체를 직접 출력하는 것이 아니라
		//객체가 갖고있는 속성에 접근하여 출력할 수 있도록 처리해야함

/* 시도
		Enumeration<GradeVO> it2 = set2.elements(); //이터레이터 타입을 반환함
		while (it2.hasMoreElements())
		{
			System.out.print(it2.next());
		}
		System.out.println();
*/		


		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			GradeVO	vo = it2.next();
			System.out.printf("%7s %7s %4d %4d %4d %6d %6d\n"
							,vo.getHak(), vo.getName() 
							,vo.getKor(), vo.getEng() ,vo.getMat()
							,vo.getTot(), vo.getAvg());
		}
		System.out.println();


/*
		Iterator<GradeVO> it1 = set2.iterator();
		while (it1.hasNext())
		{
			GradeVO vo = it1.next();
			System.out.println(vo.getHak() +" "+ vo.getName() +" "+ vo.getKor() +" "+ vo.getEng() +" "+ vo.getMat());
		}
		System.out.println();
		
*/

/*		시도
		Iterator<GradeVO> it2 = set2.iterator();
		System.out.println("전체 요소 출력....①");
		for (int idx =0;idx<set2.size() ;idx++ )
		{
			System.out.print(it2.get(idx) + " ");
		}
		System.out.println();

*/

		/* 학번기준 (오름차순)
		2206113     도규희   90   80   70    240
		2206115     최동현   80   70   60    210
		2206128     김인교   88   78   67    233
		2206139     조영관   70   60   50    180
		2206150     민찬우   99   82   72    253
		*/

		/* 내림차순
		2206150     민찬우   99   82   72    253
		2206139     조영관   70   60   50    180
		2206128     김인교   88   78   67    233
		2206115     최동현   80   70   60    210
		2206113     도규희   90   80   70    240
		*/

		//총점 기준 (오름차순)


		//총점 기준 (내림차순)
		/*
		2206150     민찬우   99   82   72    253
		2206113     도규희   90   80   70    240
		2206128     김인교   88   78   67    233
		2206115     최동현   80   70   60    210
		2206139     조영관   70   60   50    180
		*/

		//이름기준 (오름차순)

		//2206128     김인교   88   78   67    233
		//2206113     도규희   90   80   70    240
		//2206150     민찬우   99   82   72    253
		//2206139     조영관   70   60   50    180
		//2206115     최동현   80   70   60    210

		//이름기준 (내림차순)

		//2206115     최동현   80   70   60    210
		//2206139     조영관   70   60   50    180
		//2206150     민찬우   99   82   72    253
		//2206113     도규희   90   80   70    240
		//2206128     김인교   88   78   67    233

	}
}