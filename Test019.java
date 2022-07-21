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

csv 데이터1, 데이터2, 데이터3
콤마로 구분된 데이터
==================================================================
*/
//#java.util.Scanner
//	단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하여
//	디폴트(default)로 사용되는 단락문자는 '공백'이다.(공백에 따라 분할 다음, 다음 next)
//	작성된 다음 토큰은 next() 메소드를 사용
//  다른 형태(자료형)의 값으로 변환 할 수있다.


public class Test019
{
	public static void main(String[] args)
	{
		//주요 변수 선언
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;

		//연산 및 처리
		System.out.print("이름,국어,영어,수학 입력(,구분) : ");
		//이름,국어,영어,수학 입력(,구분) : 고연수,90,80,70
		//String temp	 = sc.next();

		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");

		//sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//				 ---------먼저 처리
		//							  .구분자사용();
		//				"고연수,90,80,70"
		//										   "\s*,\s*"

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;


		//결과 출력

		System.out.println("\n>> 이름 : " + name);
		System.out.println(">> 총점 : " + tot);

	}
}