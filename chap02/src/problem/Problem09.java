package problem;

import java.util.Scanner;

public class Problem09 {
	public static void main(String[] args) {
		int a, b, c;
		boolean pass = false;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("전공 이수 학점 : ");
		a = in.nextInt();
		
		System.out.print("교양 이수 학점 : ");
		b = in.nextInt();
		
		System.out.print("일반 이수 학점 : ");
		c = in.nextInt();

		in.close();
		
		if (
				a + b + c >= 140 &&
				a >= 70 &&
				(
					(b >= 30 && c >= 30) ||
					(b + c >= 80)
				)
			) {
			System.out.println("졸업 가능");
		} else {
			System.out.println("졸업 불가능");
		}
		
//		System.out.println(
//			a + b + c >= 140 &&
//			a >= 70 &&
//			(b >= 30 && c >= 30) || (b + c >= 80) ?
//					"졸업 가능"
//					:
//					"졸업 불가능"
//		);
	}
}