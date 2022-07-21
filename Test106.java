/*==============================================
	■■■주민등록번호 유효성 검사■■■
================================================*/
/*
○ 주민등록번호 검증 공식
	① 마지막 자리를 제외한 앞자기 수를 규칙에 맞고 곱한다.

	123456-1234567	(주민번호)
	****** *******	------------각자리수 곱하기
	234567 892345 (각 자리에 곱해질 수)


	② 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다.
	7 5 0 6 1 5 - 1 8 6 2 1 3 3
	* * * * * *   * * * * * * 
	2 3 4 5 6 7   8 9 2 3 4 5 
	===========================
	14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12  +6 + 4 + 15
	==217
	③ 더해진 결과값을 11로 나누어 나머지를 취한다. sum%%11==0

		19
      ------------
	11|217
	   11
	   --------
	   107
	    99
       ------
	     8 ---8이 나머지(O)

	④ 11에서 나머지 8을뺀 결과값을 구한다.

	11 - 8 → 3
	③의 처리과정에서 나머지가 0인경우 11 - 0 → 11
				   	나머지가 0인경우   11 - 1 → 10
	이를 다시 10으로 나누어 나머지를 취한다.  11 → 1
											  10 → 0

	⑤④의 연산결과가 주민번호를 구성하는 마지막 숫자와
	일치하는지의 여부를 비교하여 확인한다.

	일치   → 유효한 주민번호
	불일치 → 잘못된 주민번호
	
*/

//실행 예)
//주민번호입력(XXXXXX-XXXXXXX) : 123456-12345678 → 입력개수 초과
//>>입력 오류~!!
//계속하려면 아무 키나 누르세요......
//실행 예)
//주민번호입력(XXXXXX-XXXXXXX) : 123456-123456 → 입력개수 미달
//>>입력 오류~!!
//계속하려면 아무 키나 누르세요......

//주민번호입력(XXXXXX-XXXXXXX) : 750615-1252085 → 유효한 주민번호
//>>정확한 주민번호~!!!
//계속하려면 아무 키나 누르세요......

//주민번호입력(XXXXXX-XXXXXXX) : 750615-1252086 → 잘못된 주민번호
//>>잘못된 주민번호~!!!
//계속하려면 아무 키나 누르세요......

//※ 문제 해결을 위한 추가 팁~!

//배열.length			→ 배열의 길이(배열 방의갯수) 반환
//문자열.length()		→ 문자열의 길이 반환(빈칸까지)
//문자열.substring()	→ 문자열 추출
//문자열.substring(m, n)→ 문자열 m번째 위치에서 n-1번째 위치까지 추출(인덱스는 0부터)
//문자열.substring(m)	→ 문자열 m번째 위치에서 문자열의 끝까지 추출(인덱스는 0부터)

import java.util.Scanner;
public class Test106   //2022-07-18 , 2022-07-19 
{
	public static void main(String[] args)
	{
/*
		String strTemp = "김태민";
		System.out.println(strTemp.length());
		//-->> 3
		strTemp = "동해물과 백두산이";
		System.out.println(strTemp.length());
		//-->>9

		strTemp = "study-hard";
		System.out.println(strTemp.length());

		strTemp = "ABCDEFGHIJKLNMOPQRSTUVWXYZ";
		System.out.println(strTemp.length());	//	26
		System.out.println(strTemp.substring(13, 17));

		//MOPQ
		//MOPQRSTUVWXYZ

		//System.out.println(strTemp.substring(13, 57));
		//--==>>StringIndexOutOfBoundsException(컴파일에러)

		System.out.println(strTemp.substring(13));
	
		Scanner sc = new Scanner(System.in);
*/
		//입력받은 주민번호
		String strTemp;
		
		//곱해지는 수의 배열
		int [] x = {2,3,4,5,6,7,8,9,2,3,4,5};

		int tot = 0;		//곱해지는수의 누적합을 담을 tot

		System.out.print("주민번호입력(14자리XXXXXX-XXXXXXX) : ");
		strTemp = sc.next();
	
			if (strTemp.length()<14 || strTemp.length()>15)
			{
				System.out.print(">>입력오류~!~!");
			}



			//else if (strTemp.length()==14)
			//{
			//	System.out.print("정확한 주민번호~!!!");
			//}
			System.out.println();
			for (int i = 0;i<x.length ;i++ )
			{
				if (i == 6)
					continue;

				tot += x[i] * Integer.parseInt(strTemp.substring(i,(i+1)));
			}
			int su = 11 - tot % 11;
			//테스트
			//System.out.print(su);
			if (su>=10)
			{
				su%=10;
			}

			if (su == Integer.parseInt(strTemp.substring(13)))
			{
				System.out.println(">>정확한 주민번호~!!!");
					
			}
			else
				System.out.println(">>잘못된 주민번호~!!!");
					
		

//주민번호입력(XXXXXX-XXXXXXX) : 750615-1252086 → 잘못된 주민번호
//잘못된 주민번호~!!!
//계속하려면 아무 키나 누르세요......
		
	}
}

/*
		String strTemp;
		
		//곱해지는 수의 배열
		int x = {2,3,4,5,6,7,8,9,2,3,4,5};

		int tot = 0;		//곱해지는수의 누적합을 담을 tot

		System.out.print("주민번호입력(14자리XXXXXX-XXXXXXX) : ");
		strTemp = sc.next();
	
			if (strTemp.length()<14 || strTemp.length()>15)
			{
				System.out.print(">>입력오류~!~!");
			}



			//else if (strTemp.length()==14)
			//{
			//	System.out.print("정확한 주민번호~!!!");
			//}
			System.out.println();
			for (int i = 0;i<x.length ;i++ )
			{
				for (int j = 0;j<7 ;j++ )
				{
					System.out.print(strTemp.substring(i,j));
				}
			}

			for (int i =8 ;i<14 ;i++ )
			{
				for (int j = 8;j<14 ;j++ )
				{
					System.out.print(strTemp.substring(i,j));
				}
*/