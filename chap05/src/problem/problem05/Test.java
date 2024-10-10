package problem.problem05;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("숫자를 10개 입력하세요.");
		int[] arr = new int[10];
		String[] count = new String[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		for (int i = 0; i < count.length; i++) {
			count[i] = "";

			if (arr[i] >= 0 && arr[i] <= 9) {
				count[i] += "*";
			}
			if (arr[i] >= 10 && arr[i] <= 19) {
				count[i] += "*";
			}
			if (arr[i] >= 20 && arr[i] <= 29) {
				count[i] += "*";
			}
			if (arr[i] >= 30 && arr[i] <= 39) {
				count[i] += "*";
			}
			if (arr[i] >= 40 && arr[i] <= 49) {
				count[i] += "*";
			}
			if (arr[i] >= 50 && arr[i] <= 59) {
				count[i] += "*";
			}
			if (arr[i] >= 60 && arr[i] <= 69) {
				count[i] += "*";
			}
			if (arr[i] >= 70 && arr[i] <= 79) {
				count[i] += "*";
			}
			if (arr[i] >= 80 && arr[i] <= 89) {
				count[i] += "*";
			}
			if (arr[i] >= 90 && arr[i] <= 99) {
				count[i] += "*";
			}
		}
	
		System.out.println("0 ~ 9 : " + count[0]);
		System.out.println("10 ~ 19 : " + count[1]);
		System.out.println("20 ~ 29 : " + count[2]);
		System.out.println("30 ~ 39 : " + count[3]);
		System.out.println("40 ~ 49 : " + count[4]);
		System.out.println("50 ~ 59 : " + count[5]);
		System.out.println("60 ~ 69 : " + count[6]);
		System.out.println("70 ~ 79 : " + count[7]);
		System.out.println("80 ~ 89 : " + count[8]);
		System.out.println("90 ~ 99 : " + count[9]);
	}
}
