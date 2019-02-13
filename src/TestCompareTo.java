
public class TestCompareTo {
	public static void main(String[] args) {
		String string1 = "dog";
		String string2 = "cat";
		String string3 = "cat";
		System.out.println(string1.compareTo(string2));
		System.out.println(string2.compareTo(string3));
		System.out.println(string2.compareTo(string1));
	}

}
	