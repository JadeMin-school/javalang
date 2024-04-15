package quest;

import java.util.Scanner;

public class Quest2 {
	public static void main(String[] args) {
		int result;
		int n;

		Scanner in = new Scanner(System.in);

		System.out.print("팩토리얼 값을 구할 정수 : ");
		n = in.nextInt();
		in.close();

		result = factorial(n);

		System.out.println(result);
	}

	public static int factorial(int x) {
		int r = 1;
		while (x > 0) {
			r *= x;
			x--;
		}

		return r;
	}

	public static int factorial(int x, int y) {
		int r = 1;
		while (x > y) {
			r *= y;
			y--;
		}

		return r;
	}
}
