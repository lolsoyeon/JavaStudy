/*
======================================================================

�����ڹ� �⺻ ���α׷��֡���
-�ڹ� �⺻ ����� : System.out.printf()

=======================================================================
*/

public class Test016
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");		//\n ����
		//--==>AAABBB
		System.out.println();		//����
		//System.out.print();
		//--==>> ���� �߻� (�����Ͽ���)

		System.out.print("\n");		//����
		//System.out.print(\n);
		System.out.printf("1234567890");
		System.out.printf("1234567890\n");		//\n ����
		System.out.printf("1234567890%n");		//%n ����
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
		//==�����߻� (��Ÿ�� ����)
		System.out.printf("-%d\n", 365);
		System.out.printf("%d\n", -365);
		//==-365

		//System.out.printf("%d\n", 'A');
		//�����߻� (��Ÿ�� ����)

		System.out.printf("%c\n", "A");

		//System.out.printf("%c\n", "ABCD");
		//���� �߻� (��Ÿ�� ����)
		System.out.printf("%s\n", "ABCD");

		System.out.printf("%h\n", 365);
		//==16d 16����
		System.out.printf("%o\n", 24);

		System.out.printf("%b\n" ,true);
		System.out.printf("%b\n" ,false);

		System.out.printf("%f\n", 123.23);
		//==�Ǽ�f 
		System.out.printf("%.2f\n", 123.23);		//�Ҽ��� ���� 2��° ���� ǥ��

		System.out.printf("%.2f\n", 123.231);
		//�Ҽ��� ���� �� ��°  �ڸ����� ǥ��
		System.out.printf("%.2f\n'", 123.235);
		//�Ҽ��� ���� �� ��°  �ڸ����� ǥ��
		//(�Ҽ��� ���� �� ��° �ڸ� �ø�)

		System.out.printf("%8.2f\n", 123.236);
		//--==>>        (8�ڸ� Ȯ�� ) 8�� �� �ڸ�����
		//--==>>  123.24(�Ҽ��� ����, �ݿø�)
		System.out.printf("%2.2f\n", 123.236);
		//--==>>  2�ڸ� Ȯ�� �Ұ��� �׷��� ���õ�.

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
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/

	}
}