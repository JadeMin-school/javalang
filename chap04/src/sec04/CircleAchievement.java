package sec04;

class Cinderella {
	double radius;

	double findArea() {
		return 3.14d * radius * radius;
	}

	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
	}
}

public class CircleAchievement {
	public static void main(String[] args) {
		Cinderella myCinderella = new Cinderella();

		myCinderella.radius = 10.0d;

		myCinderella.show(myCinderella.radius, myCinderella.findArea());
	}
}
