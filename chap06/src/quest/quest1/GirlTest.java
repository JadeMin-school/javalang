package quest.quest1;

class Girl {
	public void show() {}
}

class GoodGirl {
	public void show() {
		System.out.println("그녀는 자바를 잘 안다.");
	}
}

class BestGirl extends GoodGirl {
	public void show() {
		System.out.println("그녀는 자바를 무지하게 잘 안다.");
	}
}

public class GirlTest {
}
