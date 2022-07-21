/*
======================================================================

■■■자바 기본 프로그래밍■■■
-자바 기본 입출력 : System.util.Scanner

Scanner타입?
이름() 메소드 형태  메소드란? 기능,행위,동작 ->일을 시키기 위함
System.in 바이트타입
new InputStreamReader 번역기 
기능이많다해서 성능이 좋은것은아니다. 반비례 수준. ex)프린터기
throws IOException 는 안 해도됨 내부적으로 처리되어있음

=======================================================================
*/
//#java.util.Scanner
//	단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하여
//	디폴트(default)로 사용되는 단락문자는 '공백'이다.(공백에 따라 분할 다음, 다음 next)
//	작성된 다음 토큰은 next() 메소드를 사용
//  다른 형태(자료형)의 값으로 변환 할 수있다.

//import java.util.Scanner;

public class Test018
{
	public static void main(String[] args)
	{
		//주요 변수 선언
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String name;
		int kor, eng, mat, tot;

		//연산 및 처리
		//- 사용자에세 안내ㅡ 메세지 출력
		System.out.print("이름 국어 영어 수학 입력(공백구분) : ");
		// "김보경 90 80 70"

		// - 사용자가 입력한 데이터를 각 변수에 한 번에 담아내기
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;

		//결과 출력

		System.out.println();
		System.out.println(">>이름 : "+ name);
		System.out.println(">>총점 : "+ tot);


	}
}
/* 실행결과
이름 국어 영어 수학 입력(공백구분) : 엄소연
90 80
70

>>이름 : 엄소연
>>총점 : 240
계속하려면 아무 키나 누르십시오 . . .
*/