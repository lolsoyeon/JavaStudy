
public class NumberThree {
	private static final int COLUMN_WIDTH = 10;

	public static void main(String[] args) {
		Object[][] records = new Object[][] 
				{ { "AAA", 1.23456, 123456 }, { "BBBBB", 12.3, 123 },{ "CCCC", 123.4, 1234 } };
		printTable(records);
	}

	public static void printTable(Object[][] records) {
		for (Object[] record : records) {
			for (Object data : record) {
				System.out.print(formatData(data) + " | ");
			}
			System.out.println();
		}
	}

	private static String formatData(Object data) {
		if (data instanceof String) {
			return alignLeft((String) data, COLUMN_WIDTH);
		} else if (data instanceof Number) {
			return alignRight(formatNumber((Number) data), COLUMN_WIDTH);
		}
		return "";
	}

	private static String alignLeft(String text, int width) {
		return String.format("| %-" + width + "s", text);
	}

	private static String alignRight(String text, int width) {
		return String.format("%" + width + "s", text);
	}

	private static String formatNumber(Number number) {
		if (number instanceof Integer || number instanceof Long) {
			return String.format("%d", number);
		} else if (number instanceof Double || number instanceof Float) {
			return String.format("%.2f", number);
		}
		return "";
	}
}
