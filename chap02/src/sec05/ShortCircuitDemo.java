package sec05;

public class ShortCircuitDemo {
	public static void main(String[] args) {
		int x = 0, y = 1;
		System.out.println((x < 1) || (y-- < 1));
		System.out.println("x = " + x + ", y = " + y);
		
		x = 0;
		y = 1;
		System.out.println((x < 1) | (y-- < 1));
		System.out.println("x = " + x + ", y = " + y);
	}
}