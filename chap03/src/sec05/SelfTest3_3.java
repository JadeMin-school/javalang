package sec05;

public class SelfTest3_3 {
	public static void main(String[] args) {
		int x = 1;

		switch (x) {
			case 0:
				System.out.print(x);
			case 1:
				System.out.print(x + 1);
			case 2:
				System.out.print(x + 2);
			default:
				System.out.print(x + 3);
		}
	}
}
