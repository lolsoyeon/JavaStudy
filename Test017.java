/*
======================================================================

■■■자바 기본 프로그래밍■■■
-자바 기본 입출력 : System.util.Scanner

Scanner타입?
이름() 메소드 형태
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


import java.util.Scanner;
//throws IOException;
public class Test017
{
	public static void main(String[] args) 
	{
		//Scanner 클래스 기반의 인스턴스 생성
		Scanner sc = new Scanner(System.in);  //문자열 변수
		//주요 변수 선언
		String name;
		int kor, eng, mat;
	

		//연산 및 처리
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();

		//테스트(확인)
		//System.out.println("입력한 이름 : " + name);

		System.out.print("국어 점수 입력 : ");
		//kor = Integer.paresInt(br.readLine());
		//KOR = Integer.paresInt()

		kor = sc.nextInt();

		System.out.print();kor = sc.nextInt("영어 점수 입력 : ");
		eng = sc.nextInt();
		System.out.print();kor = sc.nextInt("수학 점수 입력 : ");
		mat = sc.nextInt();
		//문자열 결합 연산자


		System.out.println();
		System.out.println(">>이름  : " = name);
		//System.out.println(">>총점  : " + kor + eng + mat);
		System.out.println(">>총점  : " +  (kor + eng + mat));





	}
}