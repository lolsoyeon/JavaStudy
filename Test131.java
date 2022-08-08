/*=================================================================
   ■■■ 자바의 주요(중요) 클래스 ■■■ 2022-07-22
 - 자바에서 기본적으로 제공하는 주요 클래스들
 - Wrapper 클래스
==================================================================*/
public class Test131
{
	public static void main(String[] args)
	{
		boolean bi = true;

		Boolean wrapBi = new Boolean(bi);
		Boolean wBi = bi;				//----- 오토 박싱
										// 프리미티브 타입 bi를 객체에 대입한다 라는 상황
										
		int n = 300;
		Integer wrapN = new Integer(n);

		int n2 = wrapN;					//---- 오토 언박싱
										// 객체에 프리미티브 타입 을 대입한다.
								

		float f = 300.3f;
		Float wrapF = new Float(f);

		System.out.println(wrapBi.toString());
		System.out.println(wrapN.toString());
		System.out.println(wrapF.toString());
		// true
		// 300
		// 300.3

		System.out.println(wrapBi);
		System.out.println(wrapN);
		System.out.println(wrapF);
		// true
		// 300
		// 300.3

		// Integer 클래스
		String sn = "12";

		int ni = Integer.parseInt(sn);
		System.out.printf("ni : %3d\n", ni);

		ni = Integer.parseInt("0101",2);
		System.out.printf("ni : %3d\n",ni);

		ni = Integer.parseInt("12",8);
		System.out.printf("ni : %3d\n",ni);

		ni = Integer.parseInt("A",16);
		System.out.printf("ni : %3d\n",ni);

		sn = Integer.toBinaryString(20);		// static 클래스 메소드겠구나 정수겠구나 반환자료명은 String 인가보다~~
		System.out.printf("sn : %s\n",sn);
		sn = Integer.toOctalString(31);
		System.out.printf("sn : %s\n",sn);

		sn = Integer.toHexString(31);
		System.out.printf("sn : %s\n",sn);

		Integer num = new Integer(50);
		System.out.println("num.toString : "+ num.toString());

		int n3 = 345;
		Integer n4 = Integer.valueOf(n3);
		System.out.println("n4 : "+ n4);







	}
}