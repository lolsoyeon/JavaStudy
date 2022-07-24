/*===============================================
						배열
	- 배열의 선언과 초기화
===============================================*/

/*
○ 배열의 개요
	
	1. 배열이란 크기와 성격이 같은 일련의 원소들이 모여 공동의 집합 구조를 갖는 자료의 집합체를 의미하는 것으로,
	   『동질적인 성격을 가진 자료들』에 대해 개별적으로 자료형(Data Type)을 부여하지 않고
	   하나의 이름을 가지고 일괄적으로 처리할 목적으로 사용된다.

	2. 자바에서의 배열은 다음과 같은 순서에 의해 사용된다.
	   배열 선언 → 배열에 메모리 할당 → 배열 요소 접근(배열 요소의 사용)

○ 형식 및 구조

	자료형[] 변수명;
	변수명 = new 자료형[요소크기];
	변수명[인덱스] = 값;

	Ex)
	int[] arr;
	arr = new int[3];
	arr[0] = 1;
	arr[1] = 2;
	arr[2] = 3;
*/



//자료형이 무엇인가?
// -> 원시 자료형 = 8개 -> 따라가면 값이 있다
// -> 레퍼런스 자료형 = 주소를 따라가게 되어있다.

//배열이 무엇인가??
// -> (Java 기준) 동일한 자료형을 하나의 자료구조에 담아 해당 값들을 index로 구분하기 위함.

//배열을 어떻게 선언하는가?
//방의 갯수가 3개인 String 자료형의 배열을 선언하시오.
//temp?배열 내에 "철수", "짱구", "유리"를 순서대로 할당하시오.
public static void main(String[] args) {
	String temp[] = new String[3];

	temp[0] = "철수";
	temp[1] = "짱구";
	temp[2] = "유리";

	temp[] = {"철수", "짱구", "유리"};
	
}
/*
0 0 0
            //세로 //가로
String temp2[5][2];

00 00 00 00 00

0 0 0 0 0
0 0 0 0 0

temp2[1][2]



*/







							//방의 갯수
		int[] arr = new int[100];

		// 0부터 시작
		arr[0] = 0;
		arr[1] = 1;
		...
		arr[99] = 99;


		//무한루프
		for(;;){
			System.out.println("테스트");
		}

		while() {

		}


		String ssangYongMember[] = {"멋쟁이", "전공자", "비전공자", "철수", "영희"};

		for(int i =0;i<ssangYongMember.length;i++) {
			System.out.println(ssangYongMember[i]);
		}

		//쌍용멤버가 있다.
		//해당 멤버 중 인덱스가 홀수인 인원의 이름만 표시하시오.
		for(int i=1; i<ssangYongMember.length; i=i+2) {
			System.out.println(ssangYongMember[i]);
		}

		//쌍용멤버가 있다.
		//해당 멤버 중 인덱스가 0이거나 짝수인 인원의 이름만 표시하시오.


		/*
			생각해야 할 것 = 이 요구사항을 코드로 구현하려면 어떻게 해야될까?
					       = 이 요구사항이 내가 방금 배운거랑 무슨 연관성이 있을까?
						   = 순서가 어떻게 되어야 할까?

			[설계]
			1. for문 내에서 시작 변수인 i를 0으로 할당한다.
			2. i의 조건식은 배열인 arr의 length보다 작아야 한다.
			3. 증감식에서 2씩 증가 시켜준다.
			4. 배열의 인덱스에 생성해준 변수인 i를 넣어준다.
			
		
		*/
		for(int i=0; i<arr.length(); i=i+2) {
			System.out.println(arr[i]);
		}










public class Test079
{
	public static void main(String[] args)
	{
		// 배열 선언
		int[] arr;

		// 메모리 할당
		arr = new int[10];

		// 배열은 선언과 동시에 메모리 할당 및 초기화가 가능
		int[] arr2 = new int[10];
		int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		// int arr4[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};			→ 가능

		// 배열 요소 접근(사용)
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;

		// 값을 할당하지 않은 나머지 배열 공간은 자동으로 초기화
		//	→ 0 (int형 배열)


		int num = 10;
		System.out.println("num : " + num);
		// → num : 10

		System.out.println("arr : " + arr);
		// → arr : [I@15db9742
		// -- 배열을 출력하기 위해 배열 변수를 일반 변수처럼 사용하여 출력하는 구문으로 작성하게 되면,
		//	  배열의 각 방에 들어있는 데이터가 출력되는 것이 아니라 우리가 알아볼 수 없는 코드가 출력된다.
		// -- ★ 출력되는 값은 메모리의 주소값 X ★
		//		 ∵ 자바는 메모리 주소값에 사용자가 직접 접근하는 것을 허용하지 않는다.

		System.out.println("arr[0] : " + arr[0]);
		// → arr[0] : 1
		System.out.println("arr[1] : " + arr[1]);
		// → arr[1] : 2
		System.out.println("arr[2] : " + arr[2]);
		// → arr[2] : 3

		System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]
								  + " " + arr[5] + " " + arr[6] + " " + arr[7] + " " + arr[8] + " " + arr[9]);
		// → 1 2 3 0 0 0 0 0 0 0

		// 반복문을 활용하여 배열에 담긴 데이터 전체 출력
		for (int i=0; i<10; i++)
		{
			// 테스트
			// System.out.println("i : " + i);

			// 테스트
			// System.out.printf("%2d", arr[i]);

			System.out.printf("arr 배열의 %d번째 방 : %2d\n", i, arr[i]);
			/*
				arr 배열의 0번째 방 :  1
				arr 배열의 1번째 방 :  2
				arr 배열의 2번째 방 :  3
				arr 배열의 3번째 방 :  0
				arr 배열의 4번째 방 :  0
				arr 배열의 5번째 방 :  0
				arr 배열의 6번째 방 :  0
				arr 배열의 7번째 방 :  0
				arr 배열의 8번째 방 :  0
				arr 배열의 9번째 방 :  0
			*/
		}
		System.out.println();
	}
}