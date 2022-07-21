
/*
======================================================================

■■■실행 흐름의 컨트롤 (제어문)■■■
-if문
-if ~else 문
  
======================================================================
*/
//1.프로그램을 작설 할때 주어진 조건에 따라
//	분기 방해ㅑㅇ을 정하기위해 사용하는 재어문에는
//IF문, if~else문, 조건 연산자,복합 if문(if문 중첩)
//	,switch 문이있다

//2. if문은 if 다음의 조건이 참일경우
//	특정 문장을 수행하고자 할 때 사용되는 구문이다.

//사용자로부터 임의의 정수 세 개를 입력받아
//작은수에서 큰수 순으로 출력하는 프로그램을 구현한다.


//실행 예)
//첫 번째 정수 입력 : 753
//두 번째 정수 입력 : 42
//세 번째 정수 입력 : 127


//>> 정렬 경과 42 127 753
//계속하려면 아무 키나 누르세요...


/* 정렬 =  비교 , 자리바꿈
	8		  20		75					123  87  65
	------비교								---  ---
	-----			  ----					87 123  65
			------------					---     ---
											65  123  87
												--- ---
											65  87  123

*/

//1.  첫 번째 정수 VS 두 번째 정수 크기비교
// -> 첫 번째 정수가 두 번째 정수보다 크다면 ....자리 바꿈
//2. 첫 번째 정수 VS 세 번째 정수 크기비교
// ->  첫 번째 정수가 두 번째 정수보다 크다면 ....자리 바꿈

//3. 두 번째 정수 VS 세번째 정수 크기비교
// ->  두 번째 정수가 세 번째 정수보다 크다면 ... 자리바꿈  많이 해 봐야한다.


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test037
{
	public static void main(String[] args) throws IOException

	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b ,c; //사용자가 입력하는 임의의 정수를 담아둘 변수

		System.out.print("첫 번째 정수  :");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수  :");
		b = Integer.parseInt(br.readLine());
		System.out.print("세 번째 정수  :");
		c = Integer.parseInt(br.readLine());

//1.  첫 번째 정수 VS 두 번째 정수 크기비교
// -> 첫 번째 정수가 두 번째 정수보다 크다면 ....자리 바꿈
		if(a > b ) //자리바꿈 a 와 b
		{
			a=a^b;
			b=b^a;
			a=a^b;
			//자리바꿈
		}

		if(a > c)
		{
			c=c^a;
			a=a^c;
			c=c^a;
		}

		if(b > c)
		{
			b=b^c;
			c=c^b;
			b=b^c;
		}
		System.out.printf("\n>> 정렬 결과 : d%, %d, %d\n" , a, b, c);


	}
}

//else if () 수행을 하면 안쳐다봐서 독립적은  if로 물어봄
//2. 첫 번째 정수 VS 세 번째 정수 크기비교
// ->  첫 번째 정수가 두 번째 정수보다 크다면 ....자리 바꿈

//3. 두 번째 정수 VS 세번째 정수 크기비교
// ->  두 번째 정수가 세 번째 정수보다 크다면 ... 자리바꿈



/*
	int a, b, c;
		
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("세 번째 정수 입력 : ");
		c = Integer.parseInt(br.readLine());


		if( a > b )   //a, b, c 가같다면?    // if(a<=b<=c)?

		{
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}

		if( b > c)

		{
			b = b ^ c;
			c = c ^ b;
			b = b ^ c;
		}

		if( a > b)

		{
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}


/*
		else if()
		{

		}



		System.out.printf(">> 정렬 결과 : %d ,%d ,%d" ,a ,b ,c);
*/





