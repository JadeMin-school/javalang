package Quest.Quest2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Car {
	public String model;
	public String date;
	public String rider;

	public Car(String model, String date, String rider) {
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");

		this.model = model;
		try {
			this.date = sdf.format(sdf.parse(date));
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
		this.rider = rider;
	}

	public boolean equals(Car car) {
		return car.model.equals(this.model);
	}

	public String toString() {
		return model;
	}
}
