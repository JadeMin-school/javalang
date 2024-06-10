package Quest.Quest3;

class Bird extends Countable {
	public Bird(String name, int num) {
		super(name, num);
	}

	public void count() {
		System.out.println(name + "가 "+ num +"마리 있다.");
	}

	public void fly() {
		System.out.println(num + "마리 " + name + "가 날아간다.");
	}
}

class Tree extends Countable {
	public Tree(String name, int num) {
		super(name, num);
	}

	public void count() {
		System.out.println(name + "가 " + num + "그루 있다.");
	}

	public void ripen() {
		System.out.println(num + "그루 " + name + "에 열매가 잘 익었다.");
	}
}