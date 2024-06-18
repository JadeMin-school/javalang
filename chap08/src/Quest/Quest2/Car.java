package Quest.Quest2;

import java.util.Date;

public class Car {
	private String model;
	public Date date;
	public String rider;


	public Car(String model, String rider) {
		this.model = model;
		this.date = new Date();
		this.rider = rider;
	}

	public boolean equals(Car car) {
		return car.model.equals(this.model);
	}

	public String toString() {
		return model;
	}
}
