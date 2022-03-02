package chap04.book;

public class C13ForMultiplicationTableExample {
	public static void main(String[] args) {
		// 2단 ~ 9단
		for (int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + " x " + n + " = " + (m * n));
			}
		}
		
		// 9단 ~ 2단
		// 9 x 9 = 81 ~~~~ 2 x 1 = 2
		for (int a = 9; a >= 2; a--) {
			System.out.println("*** " + a + "단 ***");
			for (int b = 9; b >= 1; b-- ) {
				System.out.println(a + " x " + b + " = " + (a * b));
			}
		}
	}
}
