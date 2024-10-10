package problem.problem03;

enum Direction {
	EAST("동"), WEST("서"), SOUTH("남"), NORTH("북");
	
	
	private String s;
	
	Direction(String s) {
		this.s = s;
	}
	
	public String toString() {
		return s;
	}
}

public class Test {
	public static void main(String[] args) {
		for (Direction d : Direction.values())
			System.out.print(d + " ");
	}
}
