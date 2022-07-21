/*======================================================================
■■■■■자바 프로그래밍■■■■■
-변수와 자료형
-자바 기본 입출력 : System.in.read()


=======================================================================*/
/*
System.in.read() 메소드는 (입력 대기열로부터) 한 문자만 가져온다.
단, 입력받은 하나의 문자를 문자 그대로 가져오는것이 아니라.
ASCII Code 값으로 반환한다.모든 키 값을 아스키코드로 반환 함*/

//실행 예)
//한 문자 입력      : A
//한 자리 정수 입력 : 9

//>> 입력한 문자 : A
//>> 입력한 정수 : 9
//계속하려면 아무 키나 누르세요......

import java.io.IOException;
import java.io.InputStreamReader;

public class Test015
{
	public static void main(String[] args) throws IOException
	{
		//주요 변수 선언
		char ch;		//입력받은 문자를 담을 변수
		int n;			
		//추가 변수 선언
		//char temp;     //임시로 추가 선언한 변수

		//연산 및 처리
		//-사용자에게 안내 메세지
		System.out.print("한 문자 입력      : ");
		ch = (char)System.in.read();			
		        //경로   //메소드이름

		//입력 대기열에 남아있는 \r 과 \n 을 스킵 (건너뛰기)  필요!
		System.in.skip(2);
		//--매개변수(2)에 의해 두 글자를 읽어내지 않고 건너뛴다.(버린다.)
		System.out.print("한 자리 정수 입력 : ");
		//n = System.in.read();
		//temp = (char)System.in.read;
		n = System.in.read();
		// 1 - 49
		// 2 - 50
		// 3 - 51
		// 9 - 57

		//입력받은  n 의 값을 48만큼 감소시켜라~~~!!
		//복합대입 연산자 
		//a +;
		n -= 48;


		//결과 출력
		System.out.println();
		System.out.println(">> 입력한 문자 : " + ch);
		//System.out.println("<<입력한 정수 : " + n);
		//System.out.println(">> 입력한 정수 : "+ temp);
		System.out.println(">> 입력 한 정수 : " + n);


		//System.in.read();		는 문자 1개만 데려온다
		//엔터는 (\r+\n)  순서는??? 



		/* //주요 변수 선언
		char ch;	//문자형
		int nA;
		InputStreamReader isr 

		//연산 및 처리
		System.out.println("문자 하나 입력하세요");	//A
		ch = (char)System.in.read();		//65  int 타입인데 자동형변환 규칙 위배
		
															
														//따라서 강제 형변환
		isr = 
		System.out.println("한 자리 정수 입력하세요");

		nA = System.in.read();


		//결과 출력
		System.out.println(ch);
		System.out.println(nA);
		*/
		

	}
}

		/*//주요 변수 선언
		char ch;				//문자형


		//연산 및 처리
		System.out.println("문자 하나 입력하세요");	//A
		ch = (char)System.in.read();						//65  int 타입인데 자동형변환 규칙 위배
															//따라서 강제 형변환


		/*결과 출력
		한 문자 입력      : A
한 자리 정수 입력 : 7

>> 입력한 문자 : A
>> 입력 한 정수 : 7
계속하려면 아무 키나 누르십시오 . . .*/