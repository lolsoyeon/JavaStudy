/*=============================================
   ■■■컬렉션(Collection)  ■■■ 2022-07-27
 ==============================================*/
//Vector v = new Vector();
//--비어있는 Vector 자료구조 v 생성

//Vector v = new Vector(8);
//--8개의 초기 elements 를가진 Vector 자료구조 v 생성
//	이 자료구조를 활용하는 과정에서
//	8개가 모두 채워지게되면 (모자라게 되면) 자동으로 확장된다.

//Vector v = new Vector(3,5); 
//--3개의 초기 elements 를가진 Vector 자료구조 v 생성
//	이 자료구조를 활용하는 과정에서
//	3개가 모두 채워지게되면 (모자라게 되면) 자동으로 5개 증가(확장)된다.

//※ 벡터는 데이터 요소로서 정수형, 실수형, 문자열 ...등을
//	담아내는것이 가능하다.(→ 가능해졌다.)
//   → 데이터 안정성 확보 check~!~!

//MyVector 클래스 설계 → Vector 클래스 상속


//이것저것 자료형이 담긴건 instanceof 기억하기~!~!
import java.util.Iterator;
import java.util.Vector;

class MyVector extends Vector<Object>
{
	//Object obj;
	//생성자
	MyVector()
	{
		//Vector(슈퍼클래스) 생성자 호출
		//super();
		//→Vector();
		super(1,1);
		//첫 번째 인자 : 주어진 용량
		//두 번째 인자 : 증가량

	}
	void addInt(int i)
	{
		addElement(new Integer(i));
	}
	void addFloat(float f)
	{
		addElement(new Float(f));
	}
	void addString(String s)
	{
		addElement(s);
	}
	void addCharArray(char[] a)
	{
		addElement(a);
	}

	void addObject(Record rec)
	{
		addElement(rec);
	}

	void write()
	{
		/*
		//Iterator<Object> it = new v.iterator();
		//Iterator<Object> it = super.iterator();
		Iterator<Object> it = this.iterator();

		while (it.hasNext())
		{
			//rec = (Object)it.next();
			//System.out.print(rec + " ");
			System.out.println(it.next());

		}

		*/

		/*
		Object o;
		int length = size();

		System.out.println("벡터 요소 갯수" + length);

		for (int i =0;i<length ;i++ )
		{
			o = elementAt(i);
			System.out.println(o);
		}
		*/
		Object o;
		int length = size();

		System.out.println("벡터 요소 갯수" + length);

		for (int i =0;i<length ;i++ )
		{
			o = elementAt(i);
			//『instanceof』 연산자

			//-- 처리해야하는 대상의 객체 타입 확인
			if (o instanceof char[])
			{
				//System.out.println("문자 배열 : "+ o);
				//System.out.println("문자 배열 : " + o.toString());
				System.out.println("문자 배열 : " + String.copyValueOf((char[])o));
			}
			else if (o instanceof String)
			{
				System.out.println("문자열: "+ o.toString());
			}
			else if (o instanceof Integer)
			{
				System.out.println("정수형 : "+ o);
			}
			else if (o instanceof Float)
			{
				System.out.println("실수형 : "+ o);
			}
			else
				System.out.println("타입 확인 불가~!~!");
		}


	}
}


public class Test159
{
	public static void main(String[] args)
	{
		MyVector v = new MyVector();

		int digit = 5;
		float real = 3.14f;
		String s = new String("안녕하세요");
		char[] letters = {'s','t','u','d','y'};

		v.addInt(digit);
		v.addFloat(real);
		v.addString(s);
		v.addCharArray(letters);

		v.write();
		
	}
}

/*
실행결과 
벡터 요소 갯수4
정수형 : 5
실수형 : 3.14
문자열: 안녕하세요
문자 배열 : study
계속하려면 아무 키나 누르십시오 . . .

*/