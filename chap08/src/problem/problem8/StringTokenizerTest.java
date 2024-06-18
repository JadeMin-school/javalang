package problem.problem8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("입력 : ");
		String input = scanner.nextLine();
		scanner.close();

		StringTokenizer st = new StringTokenizer(input, " ");
		String[] words = new String[st.countTokens()];

		System.out.println("단어 개수 : " + st.countTokens());

		for (int i=0; st.hasMoreTokens(); i++)
			words[i] = st.nextToken();

		Arrays.sort(words);

		System.out.print("정렬된 토큰 : ");
		for (String word : words)
			System.out.print(word + ", ");
	}
}
