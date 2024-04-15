package quest;

import java.util.Scanner;

public class Quest2 {
	public static void main(String[] args) {
		int a;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		a = in.nextInt();
		
		in.close();
		
		System.out.println(a % 2 == 0 ? "짝수" : "홀수");
	}
}