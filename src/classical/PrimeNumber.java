package classical;

import utils.StringUtils;

//素数：只能被1与它本身整除
public class PrimeNumber {
	/**
	 * 判断一个数是否为素数
	 */
	public static boolean isPrimeNumber(int x) {
		if (x < 0) {			
			throw new IllegalArgumentException("You cannot enter a number less than zero.");
		} else if(x == 0 || x == 2) {
			return false;
		} else if (x == 1) {
			return true;
		} else {
			for (int i = 2; i <= Math.sqrt(x); i++) {
				if (x % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
	/**
	 * 得到一个范围内的所有素数
	 */
	public static String getPrimeNumber(int start,int end) {
		StringBuffer result = new StringBuffer();
		if (start >= 0 && end >= start) {			
			for (int i = start; i <= end; i++) {
				if (isPrimeNumber(i)) {
					result.append(i+", ");
				}
			}
			return StringUtils.substringBeforeLast(result.toString(), ",");
		} else {
			throw new IllegalArgumentException("Inconrect data input.");
		}
		
	}
}
