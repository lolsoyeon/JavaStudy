import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) 
	{
		Map<String,Integer> map = new HashMap<>();	//<Ű �ڷ���, �� �ڷ���>

		map.put("A", 100);
		map.put("B", 101);
		map.put("C", 102);
		map.put("C", 103); //�ߺ��� key�� ������ ���� Ű,���� ������ ������ ������Ʈ

		System.out.println(map);
		System.out.println(map.get("A"));
		System.out.println(map.get("B"));
		System.out.println(map.get("C"));
	}
}