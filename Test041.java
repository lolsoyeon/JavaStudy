/*======================================================================

■■■실행 흐름의 컨트롤 (제어문)■■■
-switch문
  다중 선택문
======================================================================*/

/* 다중 선택문이라 하며, switch 문 다음의 수식 값에 따라
실행 순서를 여러 방향으로 분기할 때 사용하는 문장이다.

형식 및 구조
switch(수식)
{
	case 상수1 : 문장1; [break;]
	case 상수2 : 문장2; [break;]

	[default : 문장n+1; [break;]]
	
}

	switch 문의 『수식』 과 case 의 『상수』 는 
	byte, short, int, long 형 이어야 한다.
	+ 문자타입 (char)
	+ 문자열 (String)

case 문 뒤에 『break;』 가 없는 형태인 경우
다음 case문의 문장을 계속해서(이어서) 수행하게 된다. (→기본 모델)
『break;』가 존재 할 경우
해당 지점해서 수행을 멈춘 후 switch 문을 빠져나간다. (→일반 모델)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test041
{
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;
		int kor, eng, mat, tot;
		//double avg;
		int avg;
		//char gread;
		char gread='F';

		System.out.print("이름 입력 : ");
		name = Integer.parseInt(br.readLine());
		System.out.print("국어 점수 입력 : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어 점수 입력 : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학 점수 입력 : ");
		mat = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		//avg = tot /3.0;
		avg = tot / 3;


			switch(avg/10)
		{
			case 10 : case 9 :  gread='A'; break;
			case 8 : gread='B'; break;
			case 7 : gread='C'; break;
			case 6 : gread='D'; break;

			//default: grade='F'; break;

		}

/*
		switch(avg/10)
		{
			case 10 : gread='A'; break;
			case 9 : gread='A'; break;
			case 8 : gread='B'; break;
			case 7 : gread='C'; break;
			case 6 : gread='D'; break;

			//defeult: grade='F'; break;

		}
*/

/*
		switch(avg/10)
		{
			case 10 : gread='A'; break;
			case 9 : gread='A'; break;
			case 8 : gread='B'; break;
			case 7 : gread='C'; break;
			case 6 : gread='D'; break;
			case 5 : gread='F'; break;
			case 4 : gread='F'; break;
			case 3 : gread='F'; break;
			case 2 : gread='F'; break;
			case 1 : gread='F'; break;


		}

*/



/*
		switch(avg)
		{
			case 100 : 'A' [break;]
		}



		switch(avg>=90)
		{
			90 : 'A' [break;]

		}
		switch(avg>=80)
		{
			80 : 'B' [break;]
		}
		switch
*/
/*
		if(avg>=90)   switch문으로?
		{
			gread='A'
		}
		else if(avg>=80)
		{
			gread='B'
		}
		else if(avg>=70)
		{
			gread='C'
		}
		else if(avg>=60)
		{
			gread='D'
		
		}
		else
			gread='F'



*/


		System.out.println();
		System.out.printf(">>당신의 이름은 %s 입니다.\n", name);
		//System.out.printf(">>총점은 %d, 평균은 %f입니다.\n",tot,avg);
		System.out.printf(">>총점은 %d, 평균은 %d입니다.\n",tot,avg);
		System.out.printf(">>등급은 %c  입니다.\n", gread);







	}
}