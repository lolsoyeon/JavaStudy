/*=====================================================
  ■■■자바의 기본 입출력(I/O)  ■■■ 2022-08-01
 ======================================================*/

//Reader Witer 실습

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.IOException;

public class Test176
{
	public void process(InputStream is)		//System.in 전달 ~!
	{
		int data;

		System.out.println("문자열 입력(종료: ctrl+z)");

			try
			{
			//매개변수 is라는 바이트 기반객체(InputStream)를
			//문자 스트림으로 변환하여
			//(→ InputStreamReader 가 수행)
			//Reader 타입의 rd 에서 참조할 수 있도록 처리
			Reader rd = new InputStreamReader(is);				//System.in 
			//문자 기반 입력 스트림 rd~!

			//바이트 기반 스트림인 자바 가본 출력 스트림(System.out)을
			//문자 스트림으로 변환하며
			//(→ OutputStreamWriter 가 수행)
			//Writer 타입의 wt에서 참조할 수 있도록 처리
			Writer wt = new OutputStreamWriter(System.out);
			//뮨자 기반 출력 스트림 wt~!

				while ((data = rd.read()) != -1)
				{
					wt.write(data);		//--내보내는 스트림(물줄기) 에 data를 기록
					wt.flush();			//--기록한 스트림(물줄기)를 밀어 내보냄
				}

			}
			catch (IOException e)
			{
				System.out.println(e.toString());
				
			}
	}
	public static void main(String[] args)
	{
		Test176 ob = new Test176();
		ob.process(System.in);
	}
}

/*실행결과

문자열 입력(종료: ctrl+z)
12345
12345
SAASFDASDASD
SAASFDASDASD
가다낭낭
가다낭낭
ㅊㅊㅊㅊㅊㅊ^Z
ㅊㅊㅊㅊㅊㅊ
^Z
계속하려면 아무 키나 누르십시오 . . .
*/