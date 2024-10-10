package sec03;

import sec03.generic.Cup;

public class GenericClass2Demo {
	public static void main(String[] args) {
		Cup<Beer> c = new Cup<Beer>();
		
		c.setBeverage(new Beer());
		Beer b1 = c.getBeverage();
		
//		c.setBeverage(new Boricha()); // Beer 타입의 Cup 객체에 Boricha 객체를 담을 수 없다. 따라서 컴파일 오류가 발생한다.
		b1 = c.getBeverage();
	}
}
