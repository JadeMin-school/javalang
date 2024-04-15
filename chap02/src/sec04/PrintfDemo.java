package sec04;

public class PrintfDemo {
	public static void main(String[] args) {
		int i = 97;
		String s = "Java";
		double f = 3.14f;
		
		
		
		// 10진수
		System.out.printf("%d\n", i);
		
		// 8진수
		System.out.printf("%o\n", i);
		
		// 16진수
		System.out.printf("%x\n", i);
		
		// 문자 ("c"har)
		System.out.printf("%c\n", i);
		
		

		// 5자리까지 채우기 (padding)
		// 빈자리는 공백 처리
		System.out.printf("%5d\n", i);
		
		// -5자리까지 채우기 (padding)
		// 빈자리는 공백 처리
		System.out.printf("%-5d\n", i);

		// 5자리까지 채우기 (padding)
		// 빈자리는 0으로 채우기
		System.out.printf("%05d\n", i);
		
		
		
		// 문자"열" ("s"tring)
		System.out.printf("%s\n", s);
		
		// 5자리까지 채우기 (padding)
		// 빈자리는 공백 처리
		System.out.printf("%5s\n", s);
		
		// -5자리까지 채우기 (padding)
		// 빈자리는 공백 처리
		System.out.printf("%-5s\n", s);

		
		
		// 10진수 실수 ("f"loat)
		System.out.printf("%f\n", f);
		
		// 지수
		System.out.printf("%e\n", f);
		
		// 4자리까지 채우기 (padding)
		// 빈자리는 공백 처리
		// 소수점 이하 1자리
		System.out.printf("%4.1f\n", f);
		
		// 4자리까지 채우기 (padding)
		// 빈자리는 0으로 채우기
		// 소수점 이하 1자리
		System.out.printf("%04.1f\n", f);
		
		// -4자리까지 채우기 (padding)
		// 빈자리는 공백 처리
		// 소수점 이하 1자리
		System.out.printf("%-4.1f\n", f);
	}
}