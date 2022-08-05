import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;

public class Report
{
	List<String> reports;
	
	public Report()
	{
		this.reports = new ArrayList<String>();
	}
	public void write(String item)
	{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String log = (reports.size() + 1) + ". "+item + "1��" +
		df.format(System.currentTimeMillis());
		reports.add(log);
	}

	public void print()
	{
		System.out.println("======  ������� ���� �̷�  =======");
		for (String report :reports)
		{
			System.out.println(report);
		}
		System.out.println("=================================");
	}
}