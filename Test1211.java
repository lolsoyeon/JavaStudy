/*==============================================
    ■■■ 클래스 고급 ■■■ 2022-07-21
	- 인터페이스(Interface)
===============================================*/

//실습 문제
//성적 처리 프로그램을 구현한다.
//단, 인터페이스를 활용할 수있도록한다.

//실행 예)
//인원 수 입력(1~10) : 11
//인원 수 입력(1~10) : 0
//인원 수 입력(1~10) : 2

//1번째 학생의 학법 이름 입력(공백 구분) : 2207123 최동현
//국어 영어 수학 점수 입력   (공백 구분) : 90 100 85
//2번째 학생의 학법 이름 입력(공백 구분) : 2208225 최나윤
//국어 영어 수학 점수 입력   (공백 구분) : 85 70 65


//2207123 최동현 90 100 85 총점xxx 평균xx.xx
//				 수 수 우
//2207123 최나윤 85 70 65  총점xxx 평균xx.xx
//				 수 수 우

//계속하려면 아무 키나 누르세요...


//속성만 존재하는 클래스 → 자료형 활용
import java.util.Scanner; 
class Record							//1클
{
	String hak,name;		//학번,이름
	int kor, eng, mat;		//국,영,수 점수
	int tot;				//총점
	double avg;				//평균
}

//인터페이스
interface Sungjuk					//1인
{
	public void set();
	public void input();
	public void print();
}

//문제 해결 과정에서 설계해야할 클래스 인터페이스를 구현하는 클래스

class SungjukImpl implements Sungjuk			//2클
{
	private int inwon;
	private Record[] rec;

	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
				System.out.print("인원 수 입력(1~10) : ");
				inwon = sc.nextInt();
		

		}
		while (inwon<0 || inwon>10);
		rec = new Record[inwon];

	}
	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		//inwon = sc.nextInt();

		for(int i =0;i<inwon;i++)
		{
		rec[i] = new Record();

		System.out.printf(" %d 번째 학생의 학번 이름 입력(공백 구분) : ", (i+1));
		rec[i].hak = sc.next();
		rec[i].name = sc.next();
		System.out.print("국어 영어 수학 점수 입력   (공백 구분) : ");
		rec[i].kor = sc.nextInt();
		rec[i].eng = sc.nextInt();
		rec[i].mat = sc.nextInt();

		rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
		rec[i].avg = rec[i].tot / 3.0;
		}
		
	}
	@Override
	public void print()
	{
		for (int i = 0;i<inwon ;i++ )
		{
			System.out.printf("%s %s  %d %d %d  %d %.2f%n",rec[i].hak, rec[i].name ,
				rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot ,rec[i].avg);
			System.out.printf(" \t \t %s %s %s%n" ,panjung(rec[i].kor) ,panjung(rec[i].eng) ,panjung(rec[i].mat));
		}
	}

	//내부적으로 등급에 대한 판정을 수행할 메소드
	private String panjung(int score)
	{
		int[] rank = {90, 80, 10, 60};

		if (score >=rank[0])
		{
			return "수";
		}
		else if (score>=rank[1])
		{
			return "우";
		}
		else if (score>=rank[2])
		{
			return "미";
		}
		else if (score>=rank[3])
		{
			return "양";
		}
		else
			return "가";
	
	}//판정 끝
}


//main() 메소드를 포함하는 외부의 다른 클래스

public class Test1211			//3클
{
	public static void main(String[] args)
	{
		SungjukImpl ob0 = new SungjukImpl();
		Sungjuk ob = (Sungjuk)ob0;

		//문제 해결 과정에서 작성해야항 ob 구성및 객체 생성

		ob.set();
		ob.input();
		ob.print();
	}
	
}