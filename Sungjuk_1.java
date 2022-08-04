/*===================================================================
	 	클래스와 인스턴스
	- 클래스와 인스턴스 활용
===================================================================*/

// 학생별로 국어점수, 영어점수, 수학점수를 입력받아
// 총점, 평균을 계산하는 프로그램을 구현
// 단, 클래스의 개념을 활용하여 작성할 수 있도록 한다.
// 또한 이 과정에서 배열을 적극적으로 활용할 수 있도록 한다
// 클래스 설계는 다음의 가이드 라인을 따라 진행할 수 있도록 한다.

// 2. Sungjuk 클래스
//		- 인원수를 입력받아, 입력받은 인원 수 만큼
//		  이름, 국어점수, 영어점수, 수학점수를 입력받고
//		  총점과 평균을 산출하는 클래스로 설계할 것
//		- 속성 : 인원수, Record 타입의 배열
//		- 기능 : 인원수 입력, 상세 데이터 입력, 총점 및 평균 연산, 결과 출력
import java.util.Scanner;
public class Sungjuk
{
	//주요 속성 구성

	int inwom;		//인원 수
	Recore[] rec;   //Record 배열 학생 한 명당 Record 배열 방 한 개 활용
					//Record를 기반으로 생성된 객체만 담아낼수있는 배열

	//주요 메소드 정의(기능 구성)
	//① 인원 수 입력
	public void set()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("인원 수 입력(1~100) : ");
			imwon = sc.nextInt();
		}
		while (inwon<1 || imwon>100);

		//check~!~!
		//inwon개수만큼의 빈그릇 생성
		//Record 클래스를 기반으로 생성된 객체(인스턴스)를 담을 수 있는 
		//배열방을 inwon만큼 생성할 것이지
		//Record 클래스의 인스턴스를 생성 한 것은 아니다.
		rec = new Record[inwon];			//초대한 인원수 만큼의 그릇을 만들었음
		
	}
	//② 상세 데이터 입력(총점 및 평균 연산하고 산출 기능 포함) 
	public void input()//사용자한테 안내하고 받음
	{
		Scanner sc = new Scanner(System.in); //for (int i = 0; i<rec.length ;i++ )

		String[] title = {"국어 점수 : ", "영어 점수 : ","수학 점수 : "};

		//인원 수 만큼 반복 → 인원 수에 기반하여 만들어진 배열의 길이만큼 반복
		for (int i = 0;i<inwon ; i++)
		{
			//check~!~!
			//Record 클래스 기반의 인스턴스 생성
			rec[i] = new Record();

			System.out.printf("%d번째 학생의 이름 입력 : ",(i+1));
			rec[i].name = sc.next();
/*
			System.out.print("국어점수 : ");
			rec[i].kor = sc.nextInt();
*/
			/*
			System.out.print("국어점수 : ");  이 형태보다 편하게 쓰려고 배열에 담아둔다.
			rec[i].score[0] = sc.nextInt();
			System.out.print("영어점수 : ");
			rec[i].score[1] = sc.nextInt();
			System.out.print("수학점수 : ");
			rec[i].score[2] = sc.nextInt();
			*/
			for (int j = 0;j<title.length ;j++ )      // j<title[3]같은가? 0 1 2 
			{

				//안내메세지출력 나 엄청못함 근데방금함
				System.out.print(tilte[j]);

				//사용자가 입력한 데이터를 스코어(score) 배열에 담아내기

				//title[j] = sc.next();
				rec[i].score[j] = sc.nextInt(); //score[0] 국어점수
												//score[1] 영어점수
												//score[2] 수학점수

				//궁어 영어 수학 점수 데이처를 반복적으로 입력받는 동안
				//총점에 대한 누적 산출
				rec[i].tot += rec[i].score[j];
			}
			//평균 산출하기
			rec[i].avg = rec[i].tot / 3.0;
		}//end outer for

	}//end input

	//③ 결과출력
	// 장현성 90 80 70 240 xx.xx   2
	// 정미경 92 82 72 xxx xx.xx   1
	// 조영관 82 72 62 xxx xx.xx   3

	public void print()
	{
		//내부석차 산출 메소드 호출
		rec.rank();

	{
		System.out.println();
		//학생 한 명 당 반복 출력 구문구성
		for (int i = 0;i<imwon ;i++ )	//for(int i = 0; i<rec.length; i++)
		{
			//이름 출력
			System.out.printf("%5s", rec[i],name);

			//성적(국어, 영어, 수학) 반복 출력
			for (intj = 0;j<3 ;j++ )
			{
				System.out.printf("%4d", rec[i].score[j]);
			}

			//총점 평균
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f",rec[i].avg);


			//check~!~!
			//석차 출력 구문 추가~!
			System.out.printf("%5d", rec[i].rank);
		}
		System.out.println();
		
	}
	//④ 석차 산출 메소드 추가
	//	- 산출 과정에서 연산에 필요한 데이터가 이미 존재하는 상황 → 매개변수 필요없음
	//	Record 배열의 rank 속성 초기화 기능 수행 → 반환자료형 void
	// 클래스 내부에서 활용할 메소드로 정의 → 접근제어 지시자 private

	private void ranking()
	{
		//모든 학생들의 등수(석차, rank)를 1로 초기화
		for (int i = 0;i<inwon ;i++ )
		
			rec[i].rank = 1;

		//등수 산출→5명을 예로들면 
		for (int i =0; i<inwon-1;i++ )		//웅 → 비교기준 →0   1    2   3 
		{
			for (int j = i+1;j<inwon; j++)		//왜 인원까지일까???
												//쑝→ 비교대상 1234 234  34  4
			{
				if (rec[i].avg> rec[j].avg) //비교기준의 평균이 비교 대상의 평균보다 크다면 
				{
					rec[j].rank++;	//비교 대상의 rank를 1만큼 증가
				}
				else if (rec[j].avg > rec[i].avg)
				//비교대상의 평균이 비교기준의 평균보다 크다면
				{
					rec[i].rank++:	//비교기준의 rank 를 1만큼 증가
				}
			}
		}
		
	}

}