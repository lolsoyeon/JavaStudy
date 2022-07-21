/*
======================================================================

■■■자바 기본 프로그래밍■■■
-자바 기본 입출력 : System.out.printf()

=======================================================================
*/

public class Test016
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");		//\n 개행
		//--==>AAABBB
		System.out.println();		//개행
		//System.out.print();
		//--==>> 에러 발생 (컴파일에러)

		System.out.print("\n");		//개행
		//System.out.print(\n);
		System.out.printf("1234567890");
		System.out.printf("1234567890\n");		//\n 개행
		System.out.printf("1234567890%n");		//%n 개행
		//System.out.printf();
		//System.


		System.out.printf("%d + %d = %d%n", 10, 20, 30);
		//--==>> 10 + 20 = 30

		System.out.printf("%d\n", 123);
		System.out.printf("%10d\n", 123);
		System.out.printf("%8d\n", 1234);
		System.out.printf("%010d\n", 123);

		/*
	*123
       123
    1234
0000000123*/
		System.out.printf("%+d\n", 365);
		//==+365
		System.out.printf("+%d\n", 365);
		//==+365
		System.out.printf("%d\n", +365);

		//System.out.printf("%-d\n", 365);
		//==에러발생 (런타임 에러)
		System.out.printf("-%d\n", 365);
		System.out.printf("%d\n", -365);
		//==-365

		//System.out.printf("%d\n", 'A');
		//에러발생 (런타임 에러)

		System.out.printf("%c\n", "A");

		//System.out.printf("%c\n", "ABCD");
		//에러 발생 (런타임 에러)
		System.out.printf("%s\n", "ABCD");

		System.out.printf("%h\n", 365);
		//==16d 16진수
		System.out.printf("%o\n", 24);

		System.out.printf("%b\n" ,true);
		System.out.printf("%b\n" ,false);

		System.out.printf("%f\n", 123.23);
		//==실수f 
		System.out.printf("%.2f\n", 123.23);		//소수점 이하 2번째 까지 표현

		System.out.printf("%.2f\n", 123.231);
		//소수점 이하 두 번째  자리까지 표현
		System.out.printf("%.2f\n'", 123.235);
		//소수점 이하 두 번째  자리까지 표현
		//(소수점 이하 세 번째 자리 올림)

		System.out.printf("%8.2f\n", 123.236);
		//--==>>        (8자리 확보 ) 8은 총 자리개수
		//--==>>  123.24(소수점 포함, 반올림)
		System.out.printf("%2.2f\n", 123.236);
		//--==>>  2자리 확보 불가능 그래서 무시됨.

/*
BBB

12345678901234567890
1234567890
10 + 20 = 30
123
       123
    1234
0000000123
+365
+365
365
-365
-365
Exception in thread "main" java.util.IllegalFormatConversionException: c != java.lang.String
        at java.util.Formatter$FormatSpecifier.failConversion(Formatter.java:4302)
        at java.util.Formatter$FormatSpecifier.printCharacter(Formatter.java:2869)
        at java.util.Formatter$FormatSpecifier.print(Formatter.java:2757)
        at java.util.Formatter.format(Formatter.java:2520)
        at java.io.PrintStream.format(PrintStream.java:970)
        at java.io.PrintStream.printf(PrintStream.java:871)
        at Test016.main(Test016.java:58)
계속하려면 아무 키나 누르십시오 . . .


*/

	}
}