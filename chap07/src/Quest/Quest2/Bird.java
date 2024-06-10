package Quest.Quest2;

public class Bird implements Countable {
	String name;

	public Bird(String name) {
		this.name = name;
	}

	public void count() {
		System.out.println(name + "가 2마리 있다.");
	}

	public void fly() {
		System.out.println("2마리 " + name + "가 날아간다.");
	}
}

class Tree implements Countable {
	String name;

	public Tree(String name) {
		this.name = name;
	}

	public void count() {
		System.out.println(name + "가 5그루 있다.");
	}

	public void ripen() {
		System.out.println(name + "에 열매가 잘 익었다.");
	}
}