package sec04;

import java.util.ArrayList;
import sec03.*;

public class GenericInheritanceDemo {
	public static void beverageTest(ArrayList<Beverage> list) { }
	
	public static void main(String[] args) {
		ArrayList<Beverage> list1 = new ArrayList<>();
		list1.add(new Beer());
		beverageTest(list1);
		
		ArrayList<Beer> list2 = new ArrayList<>();
		list2.add(new Beer());
//		beverageTest(list2);
		// ArrayList<Beer>는 ArrayList<Beverage>의 자식 타입이 아니다.
		// 따라서 컴파일 오류가 발생한다.
	}
}
