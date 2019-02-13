package classical;

import utils.StringUtils;

/**
 * 斐波那契数列
 */
public class FibonacciSequence {
	/**
	 * 0,1,1,2,3,5,8,13,21...
	 */
	private static int sequence(int x) {
		if (x == 0) {
			return 0;
		} else if (x == 1 || x == 2) {
			return 1;
		} else {
			return sequence(x - 1) + sequence(x - 2);
		}	
	}
	/**
	 * 获得一个有n项的斐波那契数列
	 */
	public static String getSequence(int n) {
		n = n-1;
		if (n < 0) {			
			throw new IllegalArgumentException("You cannot enter a number less than zero.");
		}
		StringBuffer sequence = new StringBuffer();
		for (int i = 0; i <= n; i++) {
			sequence.append(sequence(i)+", ");
		}
		return StringUtils.substringBeforeLast(sequence.toString(), ",");
	}
	
}
