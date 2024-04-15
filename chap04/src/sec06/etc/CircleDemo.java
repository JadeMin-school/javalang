package sec06.etc;

class Circle {
	private double radius;

	public Circle(double r) {
		radius = r;
	}
}

public class CircleDemo {
	public static void main(String[] args) {
		Circle myCircle = new Circle(10.0d);
//		Circle myCircle = new Circle();
	}
}