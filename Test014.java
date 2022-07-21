/*
======================================================================
■■■■■자바 기본 프로그래밍■■■■■
-변수와 자료형
-자바 기본 입출력 : BufferedReader 클래스

=======================================================================
*/
//사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
//이름과 총점을 출력하는 프로그램을 구현한다.


//실행 예)
//이름을 입력하시오 : 한은영
//국어 점수 입력 : 90
//영어 점수 입력 : 80
//수학 점수 입력 : 70

//====결과====
//이름 : 한은영
//총점 : 240


import.java.io.BufferedReader;
import.java.io.InputStreamReader;
import.java.io.IOException;


public class 
{
	public static void main(String[] args) throws IOException;
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		//InputStreamReader isr = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader new InputStreamReader(System.in);


		//주요 변수 선언
		String strName;
		int nKor, nEng, nMat;
		int nTot;
		String sterTemp;

		//연산 및 처리
		//사용자에게 안내 메세지 출력
		System.out.print("이름을 입력하시오 :");
		

		//사용자가 입력한 값(외부데이터)를 변수에 담아내기
		System.out.print("국어 점수 입력 : ");

		//사용자가 입력한 값 (외부 데이터)을 변수에 담아내기
		strTemp = br.readLine();

		//담아낸 데이터를 변환한 후 필요한 변수에 다시담기
		nKor = Integer.parseInt(strTemp);

		//사용자에게 안내 메세지 출력(수학 점수 입력 안내)
		System.out.print("영어 점수 입력 : ");

		//사용자가 입력한 값 (외부 데이터)을 변수에 담아내기
		strTemp = br.readLine();

		//담아낸 데이터를 변환한 후 필요한 변수에 다시 담기
		nEng = Integer.parseInt(strTemp);
		//사용자에게 안내 메세지 출력(수학 점수 입력 안내)
		System.out.print("수학 점수 입력 : ");

		//사용자가 입력한 값 (외부 데이터)을 변수에 담아내기
		strTemp = br.readLine();

		//담아낸 데이터를 변환한 후 필요한 변수에 다시 담기
		nMat = Integer.parseInt(strTemp);

		//- 각 점수 변수에 담겨있는 데이커(사용자가 입력한 데이터)들을
		//	종합하여 총점을 산출하고 그 결과를 총점 변수에 담아내기
		nTot = nKor + nEng + nMat;

		//결과 출력
		System.out.println("=====결과======");
		System.out.printf("이름 :%s\n",strName);
		System.out.printf("총점 : %d\n", nTot); 

		
	}
}
		/*
		//주요 변수 선언
		char a;
		int	b, c, d ;
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		c = Integer.parseInt(br.readLine());
		d = ();
		

		//연산 및 처리
		System.out.println("이름을 입력하시오");
		System.out.println("국어 점수 입력 :");
		System.out.println("영어 점수 입력 :");
		System.out.println("수학 점수 입력 :");

		//결과 출력
		System.out.printf("이름 : ");
		System.out.printf("총점 : "a,b,c);*/
