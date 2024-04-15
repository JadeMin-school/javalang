package quest;

import java.util.Scanner;

public class Quest1 {
	public static void main(String[] args) {
		int result = 1;
		int n;

		Scanner in = new Scanner(System.in);

		System.out.print("팩토리얼 값을 구할 정수 : ");
		n = in.nextInt();
		in.close();

		while (n > 0) {
			result *= n;
			n--;
		}

//		while (true) {
//			if (n <= 0)
//				break;
//
//			result *= n;
//			n--;
//		}

		System.out.println(result);
	}
}