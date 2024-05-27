package quest.quest2;

class Girl {
	private String name;

	void show() {
		System.out.println("그녀는 자바 초보자이다.");
	}

	Girl(String name) {
		this.name = name;
	}

	Girl() {
		this("그녀");
	}
}

class GoodGirl extends Girl {
	void show() {
		System.out.println("그녀는 자바를 잘 안다.");
	}
}

class BestGirl extends GoodGirl {
	void show() {
		System.out.println("그녀는 자바를 무지하게 잘 안다.");
	}
}

public class GirlTest {
	public static void main(String[] args) {
		Girl g1 = new Girl();
		Girl g2 = new GoodGirl();
		GoodGirl gg = new BestGirl();

		g2.show();
		gg.show();
	}
}
