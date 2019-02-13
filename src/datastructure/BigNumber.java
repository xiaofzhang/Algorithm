package datastructure;

public class BigNumber {
	public static String bigNumberSum(String bigNumA,String bigNumB) {
		int maxLength = bigNumA.length() > bigNumB.length() ? bigNumA.length() : bigNumB.length();
		int [] arrayA = new int[maxLength + 1];
		for (int i = 0; i < bigNumA.length(); i++) {
			arrayA[i] = bigNumA.charAt(bigNumA.length()-1-i) - '0';
		}
		int [] arrayB = new int[maxLength + 1];
		for (int i = 0; i < bigNumB.length(); i++) {
			arrayB[i] = bigNumB.charAt(bigNumB.length()-1-i) - '0';
		}
		int [] result = new int[maxLength + 1];
		for (int i = 0; i < result.length; i++) {
			int temp = result[i];
			temp += arrayA[i];
			temp += arrayB[i];
			if (temp >= 10) {
				temp = temp - 10;
				result[i+1] = 1;
			}
			result[i] = temp;
		}
		StringBuilder sb = new StringBuilder();
		boolean findFirst = false;
		for (int i = result.length - 1; i >= 0; i--) {
			if (!findFirst) {
				if (result[i] == 0) {
					continue;
				}
				findFirst = true;
			}
			sb.append(result[i]);
		}
		return sb.toString();
	}
}
