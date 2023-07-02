import java.util.HashMap;
import java.util.Map;

public class NumberOne {
	public static void main(String[] args) 
	{
		String[] input = { "1622025201 REQUEST 10001 192.168.0.1", "1622025202 REQUEST 10002 192.168.0.2",
				"1622025203 REQUEST 10003 192.168.0.1", "1622025211 RESPONSE 10003", "1622025212 RESPONSE 10002",
				"1622025213 RESPONSE 10001", "1622025221 REQUEST 10004 192.168.0.2",
				"1622025223 REQUEST 10005 192.168.0.2", "1622025230 RESPONSE 10004",
				"1622025231 REQUEST 10006 192.168.0.3", "1622025236 RESPONSE 10006" };

		Map<String, Integer> ipCountMap = new HashMap<>();

		for (String inputResult : input) {
			String[] parts = inputResult.split(" ");
			if (parts.length >= 4 && parts[1].equals("REQUEST")) {
				String ip = parts[3];
				ipCountMap.put(ip, ipCountMap.getOrDefault(ip, 0) + 1);
			}
		}

		for (Map.Entry<String, Integer> entry : ipCountMap.entrySet()) {
			System.out.println(entry.getKey() + " (" + entry.getValue() + ")");
		}

		Map<String, Long> requestTimeMap = new HashMap<>();
		Map<String, Long> responseTimeMap = new HashMap<>();

		for (String log : input) {
			String[] parts = log.split(" ");
			if (parts.length >= 4) {
				String transactionId = parts[2];
				String ipAddress = parts[3];
				long timestamp = Long.parseLong(parts[0]);

				if (parts[1].equals("REQUEST")) {
					requestTimeMap.put(transactionId, timestamp);
				} else if (parts[1].equals("RESPONSE")) {
					responseTimeMap.put(transactionId, timestamp);
				}
			}
		}

		for (Map.Entry<String, Long> entry : responseTimeMap.entrySet()) {
			String transactionId = entry.getKey();
			long responseTimestamp = entry.getValue();

			if (requestTimeMap.containsKey(transactionId)) {
				long requestTimestamp = requestTimeMap.get(transactionId);
				long elapsedTime = responseTimestamp - requestTimestamp;
				String ipAddress = getIpAddress(input, transactionId);

				System.out.println(transactionId + " " + requestTimestamp + " " + elapsedTime + "sec");
			}
		}
	}

	private static String getIpAddress(String[] logs, String transactionId) {
		for (String log : logs) {
			String[] parts = log.split(" ");
			if (parts.length >= 4 && parts[2].equals(transactionId)) {
				return parts[3];
			}
		}
		return null;
	}
}
