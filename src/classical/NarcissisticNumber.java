package classical;

import java.util.ArrayList;
import java.util.List;
//自幂数
//一位：独身数
//两位：没有
//三位：水仙花数
//四位：四叶玫瑰数
//五位：五角星数
//六位：六合数
//七位：北斗七星数
//八位：八仙数
//九位：九九重阳数
//十位：十全十美数
public class NarcissisticNumber {
	public static boolean isNarcissisticNumber(int x) {
		if (x <= 0) {
			throw new IllegalArgumentException("You cannot enter a number less than or equal to zero.");
		}
		List<Integer> list = disassembleNumber(x);
		int length = list.size();
		int result = 0;
		for (Integer integer : list) {
			result += Math.pow(integer, length);
		}
		if (result == x) {
			return true;
		} else {
			return false;
		}
	}
	public static List<Integer> disassembleNumber(int x) {
		List<Integer> list = new ArrayList<Integer>();
		int num = x;
		if (x == 0) {
			return null;
		} else {
			while (num >= 10) {
				list.add(num%10);
				num = num/10;
			}
			list.add(num);
			return list;
		}
	}
}
