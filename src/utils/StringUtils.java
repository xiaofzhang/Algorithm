package utils;


public class StringUtils {
	public static String substring(String str, int start)
	{
		if (str == null) {
			return null;
		}
		if (start < 0) {
			start = str.length() + start;
		}
		if (start < 0) {
			start = 0;
		}
		if (start > str.length()) {
			return "";
		} else {
			return str.substring(start);
		}
	}

	public static String substring(String str, int start, int end)
	{
		if (str == null) {
			return null;
		}
		if (end < 0) {
			end = str.length() + end;
		}
		if (start < 0) {
			start = str.length() + start;
		}
		if (end > str.length()) {
			end = str.length();
		}
		if (start > end) {
			return "";
		}
		if (start < 0) {
			start = 0;
		}
		if (end < 0) {
			end = 0;
		}
		return str.substring(start, end);
	}
	public static String substringBefore(String str, String separator)
	{
		if (isEmpty(str) || separator == null) {
			return str;
		}
		if (separator.length() == 0) {
			return "";
		}
		int pos = str.indexOf(separator);
		if (pos == -1) {
			return str;
		} else {
			return str.substring(0, pos);
		}
	}

	public static String substringAfter(String str, String separator)
	{
		if (isEmpty(str)) {
			return str;
		}
		if (separator == null) {
			return "";
		}
		int pos = str.indexOf(separator);
		if (pos == -1) {
			return "";
		} else {
			return str.substring(pos + separator.length());
		}
	}

	public static String substringBeforeLast(String str, String separator)
	{
		if (isEmpty(str) || isEmpty(separator)) {
			return str;
		}
		int pos = str.lastIndexOf(separator);
		if (pos == -1) {
			return str;
		} else {
			return str.substring(0, pos);
		}
	}

	public static String substringAfterLast(String str, String separator)
	{
		if (isEmpty(str)) {
			return str;
		}
		if (isEmpty(separator)) {
			return "";
		}
		int pos = str.lastIndexOf(separator);
		if (pos == -1 || pos == str.length() - separator.length()) {
			return "";
		} else {
			return str.substring(pos + separator.length());
		}
	}

	public static String substringBetween(String str, String tag)
	{
		return substringBetween(str, tag, tag);
	}

	public static String substringBetween(String str, String open, String close)
	{
		if (str == null || open == null || close == null) {
			return null;
		}
		int start = str.indexOf(open);
		if (start != -1)
		{
			int end = str.indexOf(close, start + open.length());
			if (end != -1) {
				return str.substring(start + open.length(), end);
			}
		}
		return null;
	}
	public static boolean isEmpty(CharSequence cs)
	{
		return cs == null || cs.length() == 0;
	}

	public static boolean isBlank(CharSequence cs)
	{
		int strLen;
		if (cs == null || (strLen = cs.length()) == 0) {
			return true;
		}
		for (int i = 0; i < strLen; i++) {
			if (!Character.isWhitespace(cs.charAt(i))) {
				return false;
			}
		}

		return true;
	}
}
