/*=====================================================
  ＝＝＝切郊税 奄沙 脊窒径(I/O)  ＝＝＝ 2022-08-01
 ======================================================*/

//Reader Witer 叔柔

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.IOException;

public class Test176
{
	public void process(InputStream is)		//System.in 穿含 ~!
	{
		int data;

		System.out.println("庚切伸 脊径(曽戟: ctrl+z)");

			try
			{
			//古鯵痕呪 is虞澗 郊戚闘 奄鋼梓端(InputStream)研
			//庚切 什闘顕生稽 痕発馬食
			//(≧ InputStreamReader 亜 呪楳)
			//Reader 展脊税 rd 拭辞 凧繕拝 呪 赤亀系 坦軒
			Reader rd = new InputStreamReader(is);				//System.in 
			//庚切 奄鋼 脊径 什闘顕 rd~!

			//郊戚闘 奄鋼 什闘顕昔 切郊 亜沙 窒径 什闘顕(System.out)聖
			//庚切 什闘顕生稽 痕発馬悟
			//(≧ OutputStreamWriter 亜 呪楳)
			//Writer 展脊税 wt拭辞 凧繕拝 呪 赤亀系 坦軒
			Writer wt = new OutputStreamWriter(System.out);
			//甲切 奄鋼 窒径 什闘顕 wt~!

				while ((data = rd.read()) != -1)
				{
					wt.write(data);		//--鎧左鎧澗 什闘顕(弘匝奄) 拭 data研 奄系
					wt.flush();			//--奄系廃 什闘顕(弘匝奄)研 腔嬢 鎧左蛙
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

/*叔楳衣引

庚切伸 脊径(曽戟: ctrl+z)
12345
12345
SAASFDASDASD
SAASFDASDASD
亜陥涯涯
亜陥涯涯
ずずずずずず^Z
ずずずずずず
^Z
域紗馬形檎 焼巷 徹蟹 刊牽淑獣神 . . .
*/