/*================================================
   ■■■컬렉션(Collection) ■■■ 2022-07-27  ★
 =================================================*/

//자료구조 객체 선언 및 생성 시
//사용자 정의 클래스 활용
//→ 자료형
/*
컬렉션 객체증여 JDBC DB 

*/
//클래스 → 사용자정의 자료형으로 활용
import java.util.Vector;
class MyData
{
	//주요 속성 구성 → 주요변수 선언(멤버 변수)
	private String name;			//이름
	private int age;				//나이

	//getXxx() → getter
	//setXxx() → setter

	//getter / setter 구성
	public String getName()		//게터세터 만드는규칙 배움
	{
		return name;
	}

	public void setName(String name)	//세팅시키니까 같아야 한다
	{
		this.name = name;				//세터가 해야 할 일끝 
	}




	public int getAge()				//age의 getter 
	{
		return age;
	}

	public void setAge(int age)		//age의 setter
	{
		this.age = age;				//초기화 하는형태
		
	}
	//생성자 (매개변수 2개인 생성자) → 사용자 정의 생성자
	public MyData(String name , int age)
	{
		this.name = name;
		this.age = age;
	}
	//사용자정의 생성자가 구성될 경우
	//defaut 생성자가 자동으로 삽입되지 않기 때문에
	//형태의 생성자를 사용자정의 생성자로
	//추가구성게되는것이 일반적인 클래서 설게과정
	//(반드시 설계해야한다는 문법적인규칙은 없암)

	//생성자(매개변수 없는 생성자)
	public MyData()
	{
		this("",0);
		name = "";
		age = 0;
	}

}

public class Test162
{
	public static void main(String[] args)
	{
		//벡터 자료구조 생성
		Vector<MyData> v = new Vector<MyData>(); //<MyData>객체를 담아서 쓸거야

		//벡터 자료구조 v 에
		//정영준 13세 / 정미경 7세 /한은영 3세
		//담아내기

		//①
		MyData st1 = new MyData();
		st1.setName("정영준");
		st1.setAge(13);
		v.add(st1);

		MyData st2 = new MyData();
		st1.setName("정미경");
		st1.setAge(7);
		v.add(st2);

		MyData st3 = new MyData();
		st1.setName("한은영");
		st1.setAge(3);
		v.add(st3);   

		//②
		MyData st1 = new MyData("정영준", 13);
		v.add(st1);
		MyData st2 = new MyData("정미경", 7);
		v.add(st2);
		MyData st3 = new MyData("한은영", 3);
		v.add(st3);

		//③
		v.add(new MyData("정영준",13));
		v.add(new MyData("정미경",7));
		v.add(new MyData("한은영",3));




		//for (int a : arr )
		//{
		//	System.out.print(a + " ");
		//}
		//System.out.println();


//벡터 자료구조 v 에
		//정영준 13세 / 정미경 7세 /한은영 3세
		//담아내기

/*
		//내가 한것
		String[] names = {"정영준 13세/","정미경 7세/","한은영 3세 /"};
		//int[] arr = {13, 7, 3};

		System.out.print("요소 출력: ");
		for (String s : names )
		{
			System.out.print(s + " ");
		}
		System.out.println();
*/

	}
}