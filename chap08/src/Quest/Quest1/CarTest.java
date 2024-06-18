package Quest.Quest1;

import java.text.MessageFormat;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car("그랜저");
		Car yourCar = new Car("그랜저");

		System.out.println(
				MessageFormat.format(
						"내 자동차는 [{0}], 너 자동차는 [{1}]로 모델이 {2}",
						myCar, yourCar, myCar.equals(yourCar) ? "같다." : "다르다."
				)
		);
	}
}