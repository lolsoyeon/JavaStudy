//퀴즈
//직사각형의 넓이와 둘레를 구하는 프로그램을 작성한다.
//가로 : 10, 세로: 20
//넓이: 가로*세로
//둘레: 가로*2+세로*2
//넓이 = 가로*세로
//둘레 = (가로+세로)*2

public class Test011
{
	public static void main(String[] args)
	{
		//int a = 10;
		//int b = 20;
		//int h, v;

		//h = a*b;
		//v = a*2 + v*2;

			//System.out.println("넓이 : "+ h);
			//System.out.println("둘레 : "+ v);
			//주요변수 선언 및 초기화

		int a=10, b=20;
		int x, y;
		x = a * b;
		y = (a + b )* 2;


		//결과출력
		System.out.printf("넓이 : %d\n",x);
		System.out.printf("둘레 : %d\n",y);

		//넓이 : 200
		//둘레 : 60



	}
}
