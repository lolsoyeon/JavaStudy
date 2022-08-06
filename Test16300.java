/*=============================================
   ■■■컬렉션(Collection)  ■■■ 2022-07-27
 ==============================================*/
//Test163 클래스를 완성하여 다음 기능을 가진 프로그램을 구현한다.

/*
실행 예)

	[ 메뉴 선택 ]============
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=========================
>> 메뉴 선택 (1~6) : 1

1번째 요소 입력 : 장현성
1번째 요소 입력 성공~!!!
요소 입력 계속(Y/N) : Y


2번째 요소 입력 : 엄소연
2번째 요소 입력 성공!!!
요소 입력 계속(Y/N) : N


	[ 메뉴 선택 ]============
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=========================
>> 메뉴 선택 (1~6) : 2

[벡터 전체 출력]
장현성
엄소연
벡터 전체 출력완료~!!


	[ 메뉴 선택 ]============
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=========================
>> 메뉴 선택 (1~6) : 3

>>검색할 요소 입력 : 장현성

[검색 결과 출력]
항목이 존재합니다.


	[ 메뉴 선택 ]============
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=========================
>> 메뉴 선택 (1~6) : 3

>>검색할 요소 입력 : 반보영

[검색 결과 출력]
항목이 존재하지 않습니다.



	[ 메뉴 선택 ]============
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=========================
>> 메뉴 선택 (1~6) : 4

>>삭제할 요소 입력 : 김보경

[삭제 결과 출력]
항목이 존재하지 않아 삭제할 수 없습니다.

	[ 메뉴 선택 ]============
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=========================
>> 메뉴 선택 (1~6) : 4

>>삭제할 요소 입력 : 장현성

[삭제 결과 출력]
장현성 항목이 삭제되었습니다.



	[ 메뉴 선택 ]============
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=========================
>> 메뉴 선택 (1~6) : 5

>>변경할 요소 입력 : 도규희

[변경 결과 출력]
변경한 대상이 존재하지 않습니다.

	[ 메뉴 선택 ]============
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=========================
>> 메뉴 선택 (1~6) : 5

>>변경할 요소 입력 : 엄소연
>>수정할 내용 입력 : 도규희

[변경 결과 출력]
변경이 완료 되었습니다.



	[ 메뉴 선택 ]============
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=========================
>> 메뉴 선택 (1~6) : 2

[벡터 전체 출력]
도규희
벡터 전체 출력완료~!!

	[ 메뉴 선택 ]============
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=========================
>> 메뉴 선택 (1~6) : 6

프로그램 종료~!~!
계속하려면 아무 키나 누르세요....

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;
import java.io.IOException;
import java.util.Collection;

class Menus		//완성
{
	public static final int E_ADD = 1;		//요소 추가
	public static final int E_DISP = 2;		//요소 출력
	public static final int E_FIND = 3;		//요소 검색
	public static final int E_DEL = 4;		//요소 삭제
	public static final int E_CHA = 5;		//요소 변경
	public static final int E_EXIT = 6;		//종료
}

public class Test16300
{

	//주요 속성 구성
	private static final Vector<Object> vt;		//자료 구조
	private static BufferedReader br;			//입력 시 활용
	private static Integer sel;					//선택 값
	private static String con;					//계속 진행 여부

	//static초기화 블럭
	static
	{

		//Vector 자료구조 생성
		vt = new Vector<Object>();

		//BufferedReader 클래스 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));
		

		//사용자 입력값 초기화
		sel = 1;
		con = "Y";
	}


	//메뉴 출력 메소드
	public static void menuDisp()
	{

		System.out.println();
		System.out.println("\t[ 메뉴 선택 ]============");
		System.out.println("\t1. 요소 추가");
		System.out.println("\t2. 요소 출력");
		System.out.println("\t3. 요소 검색");
		System.out.println("\t4. 요소 삭제");
		System.out.println("\t5. 요소 변경");
		System.out.println("\t6. 종료");
		System.out.println("\t========================");
		System.out.println();

		
	}
	//메뉴 선택 메소드
	public static void menuSelect() throws IOException, NumberFormatException
	{

		do
		{
			System.out.print(">> 메뉴 선택 (1~6) : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel> 6 );
		
	}

	//선택된 메뉴 실행에 따른 기능 호출 메소드
	public static void menuRun() throws IOException
	{
		/*
		vt.menuDisp();
		vt.menuSelect();
		vt.addElement();
		vt.dispElement();
		vt.findElement();
		vt.delElement();
		vt.chaElement();
		vt.exit();
		*/
		switch (sel)
		{
		//case Menus.E_ADD: addElement(); break;
		//case Munus.: addElement();break;
		//case Munus.E_DISP : addElement();break;

		case 1: addElement();break;
		case 2: dispElement();break;
		case 3: findElement();break;
		case 4: delElement();break;
		case 5: chaElement();break;
		case 6: exit();break;


		}

	}

	//자료구조 전체 추가(입력) 메소드
	public static void addElement() throws IOException
	{
		do
		{
			System.out.println();
			System.out.printf("%d번째 요소 입력 : ", vt.size()+1);

			String a = br.readLine();

			vt.addElement(a);

			System.out.printf("%d번째 요소 입력 성공~!!!", vt.size());
			System.out.print("요소 입력 계속(Y/N) : ");
			con = br.readLine();
		}
		while (con.equals("y") || con.equals("Y"));


	}

	//자료구조 전체 출력 메소드
	public static void dispElement()
	{
		System.out.print("[벡터 전체 출력]\n ");
			for (Object obj : vt )
			{
				System.out.println(obj);
			}
			System.out.println();
	}

	//자료구조 내 요소 검색 메소드
	public static void findElement() throws IOException
	{

		System.out.println(">>검색할 요소 입력 : ");
		String x = br.readLine();
		int i = vt.indexOf(x);

		System.out.println();
		System.out.println("[검색 결과 출력]");

		if (i<0)
		{	
			System.out.println("항목이 존재하지 않습니다.");
		}else 
			System.out.printf("%s 항목이 존재합니다.", x);
	}

	//자료구조 내 요소 삭제 메소드
	public static void delElement() throws IOException
	{
		/*
		if ( boolean contains != null)
		{
			boolean removeElement(Object obj)
			System.out.println("[삭제 결과 출력]");
			System.out.println("항목이 삭제되었습니다.");
		}
		else if 
			System.out.println("[삭제 결과 출력]");
			System.out.println("항목이 존재하지 않아 삭제할 수 없습니다.");
		
		String br = br.readLine();
			//v.contains(br)
			//--벡터 자료구조 v에 찾고자 하는 br 가 포함되어있다면...
			//→ index 위치 확인

			if (vt.contains(br))
			{
				 i = vt.indexOf(br);
		
				//①존재하는지의 여부를 확인하고
				//②어디에있는지 확인하고
				//③확인했으면 제거해라(삭제해라)
				 vt.remove(i);

				System.out.print(obj.getBr(), obj.get"삭제 후 전체 요소 출력 : ");
				for (Object obj : vt )
				{
					System.out.print(obj + " ");
				}
			}
		*/

		System.out.println();
		System.out.print(">> 삭제할 요소 입력 : ");
		String n = br.readLine();
		System.out.println();
		System.out.println("[삭제 결과 출력]");


		//존재 여부 체크 후 삭제
		if (vt.contains(n))						
		{
			int i = vt.indexOf(n);
			vt.remove(i);
			System.out.printf("%s 항목이 삭제되었습니다.",n);
		}
		else
			System.out.println("항목이 존재하지 않아 삭제할 수 없습니다.");
			System.out.println();
	}


	//자료구조 내 요소 수정(변경) 메소드
	public static void chaElement() throws IOException
	{
		System.out.print(">> 변경할 요소 입력 : ");
		String x = br.readLine();
		
		
		if (vt.contains(x))
		{
			int i = vt.indexOf(x);
			System.out.print(">> 수정할 내용 입력 : ");
			String y = br.readLine();
			
			vt.set(i,y);										

			System.out.println();
			System.out.println("[변경 결과 출력]");
			System.out.println("변경이 완료되었습니다.");
			
		}
		else
		{	System.out.println();
			System.out.println("[변경 결과 출력]");
			System.out.println("변경할 대상이 존재하지 않습니다. ");
		}
	}


	//프로그램 종료 메소드 → 완성
	public static void exit()
	{
		System.out.println("\n프로그램 종료~!!!");
		System.exit(-1);
	}

	//main() 메소드 → 완성
	public static void main(String[] args) throws IOException, NumberFormatException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
		
	}
}