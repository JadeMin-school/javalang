package sec01;

import java.util.*;

public class UnChecked1Demo {
	public static void main(String[] args) {
		String s = "Time is money";
		StringTokenizer st = new StringTokenizer(s);

		while (st.hasMoreTokens()) {
			System.out.print(st.nextToken() + "+");
		}
		System.out.print(st.nextToken());
	}
}
