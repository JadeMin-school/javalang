package Quest.Quest2;

import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car("그랜저", "06-07-2017", "홍길동");
		Car yourCar = new Car("그랜저", "06-07-2017", "홍길동");

		if (myCar.equals(yourCar))
			System.out.println(MessageFormat.format("자동차 모델이 둘 다 [{0}]로 동일하다.", myCar.model));
		System.out.println(MessageFormat.format("날짜: {0}, 자동차 모델=[{1}], 운전자({2})", myCar.date, myCar.model, myCar.rider));
	}
}