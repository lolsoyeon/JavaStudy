/*===================================
   ■■■컬렉션(Collection)  ■■■ 2022-07-27
 ====================================*/

import java.util.Stack;
//import java.util.StringTokenizer;

public	class Test155
{
	//정적 문자열 배열 선언 및 초기화
	private static final String[] colors = {"검정","노랑","초록","파랑","빨강","연두"};


	//생성자
	public Test155()
	{

		//st 라는 Stack자료구조 생성
		//제네릭을 활용하여 자료구조에 담기는 데이터 표현 → 『<String>』
		Stack<String> st = new Stack<String>();

		//st라는 Stack 자료구조에 데이터 (colors) 담기
		//st = colors;  //(X)

		//StringTokenizer str = new StringTokenizer(colors,"," );

		//colors = new String[st.countTokens()];
/*
		st.push(colors[0]);  //st.add(colors[0]);
		st.push(colors[1]);  //st.add(colors[1]);
		st.push(colors[2]);  //st.add(colors[2]);
		st.push(colors[3]);  //st.add(colors[3]);
		st.push(colors[4]);  //st.add(colors[4]);
		st.push(colors[5]);  //st.add(colors[5]);

		for (int i = 0;i<colors.length ;i++ )
		{
			st.push(colors[i]);		//st.add(colors[i]);
		
		}

*/
		for (String color : colors)
		{
			st.push(color);		//st.add(color); 
		}

		st.push("보라");

		//st.push(10);		//제네릭<String>했기때문에발생
		//st.push(10.0);
		//--==>>에러 발생(컴파일 에러)
		//--제네릭 표현식을 통해 선언하고 있는
		//	String 이 아닌 다른 자료형(int 나 double)을
		//	스택자료 구조 st에 push()하려고 했기 때문에...
		
		popStack(st);


	}
	//출력 메소드
	private void popStack(Stack<String>st)			//??매개변수타입
	{
			System.out.print("pop : ");

			while (!st.empty())		//isEmpty()
			{

				System.out.print(st.pop() + " ");
			}
			System.out.println();
	}

	public static void main(String[] args)
	{
		new Test155();
			
	}
}

/* 실행 결과
pop : 연두 빨강 파랑 초록 노랑 검정
계속하려면 아무 키나 누르십시오 . . .



		for (String color : colors)
		{
			st.push(color);		//st.add(color); 
		}

		st.push("보라");		// 추가적재

pop : 보라 연두 빨강 파랑 초록 노랑 검정
계속하려면 아무 키나 누르십시오 . . .



*/