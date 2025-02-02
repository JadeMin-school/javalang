package sec02;

import java.util.*;

class Fruit {
	String name;

	public Fruit(String name) {
		this.name = name;
	}

	public boolean equals(Object o) {
		if (o instanceof Fruit)
			return ((Fruit) o).name.equals(name);
		return false;
	}

	public int hashCode() {
		return name != null ? name.hashCode() : 0;
	}

	public String toString() {
		return String.format("Fruit(%s)", name);
	}
}

public class HashSet2Demo {
	public static void main(String[] args) {
		Set<Fruit> fruits = new HashSet<>();
		fruits.add(new Fruit("사과"));
		fruits.add(new Fruit("사과"));
		System.out.println(fruits.size());
		System.out.println(fruits);
	}
}
