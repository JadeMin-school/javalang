package sec03;

public class Computer implements Controllable {
	@Override
	public void turnOn() {
		System.out.println("Computer를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Computer를 끕니다.");
	}
}
