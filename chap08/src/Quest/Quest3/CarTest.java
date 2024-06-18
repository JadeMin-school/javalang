package Quest.Quest3;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car("그랜저", "홍길동");
		Car yourCar = new Car("그랜저", "홍길동");

		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");


		if (myCar.equals(yourCar))
			System.out.println(MessageFormat.format("자동차 모델이 둘 다 [{0}]로 동일하다.", myCar));

		StringTokenizer st = new StringTokenizer(
				MessageFormat.format(
						"날짜: {0} 자동차 모델 {1} 운전자 {2}",
						sdf.format(myCar.date), myCar, myCar.rider
				),
				" "
		);
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}