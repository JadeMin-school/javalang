package sec04.bound;

import sec03.*;

class Cup<T extends Beverage> {
	private T beverage;

	public T getBeverage() {
		return beverage;
	}
	public void setBeverage(T beverage) {
		this.beverage = beverage;
	}
}

public class BoundedTypeDemo {
	public static void main(String[] args) {
		Cup<Beer> c1 = new Cup<>();
		Cup<Boricha> c2 = new Cup<>();
//		Cup<String> c3 = new Cup<>();
		//     ^ String은 Beverage의 자식 타입이 아니므로
		//       Cup<String> 타입을 사용하면 컴파일 오류가 발생한다.
	}
}
