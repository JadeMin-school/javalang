package sec04;

import java.util.*;

public class ShuffleDemo {
	public static void main(String[] args) {
		List<Character> list = new ArrayList<>();

		for (char c = 'A'; c <= 'G'; c++)
			list.add(c);

		System.out.println("최초 리스트 :\t" + list);
		Collections.rotate(list, 3);
		System.out.println("돌린 리스트 :\t" + list);
		Collections.shuffle(list);
		System.out.println("섞은 리스트 :\t" + list);
	}
}
