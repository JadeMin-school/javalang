package problem.problem04;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("URL을 입력하세요 : ");
			String url = scanner.nextLine();

			if (url.equals("bye"))
				break;
			
			if (url.endsWith("com"))
				System.out.println(url + "은 'com'으로 끝납니다.");
			if (url.contains("java"))
				System.out.println(url + "은 'java'를 포함합니다.");
		}
	}
}
