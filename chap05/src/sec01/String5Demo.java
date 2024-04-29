package sec01;

public class String5Demo {
	public static void main(String[] args) {
		String version = String.format("%s %d", "JDK", 14);
		System.out.println(version);

		String fruit = String.join(", ",
				"apple", "banana", "cherry", "durian");
		System.out.println(fruit);

		String pi = String.valueOf(3.14);
		System.out.println(pi);
	}
}