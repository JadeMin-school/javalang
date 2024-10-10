package problem.problem01;

public class Test {
	static int countChar(String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c)
				count++;
		}
		
		return count;
	}

	public static void main(String[] args) {
		String s = "Hello, world!";
		char c = 'l';

		System.out.println(countChar(s, c));
	}
}
