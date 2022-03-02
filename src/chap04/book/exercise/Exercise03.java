package chap04.book.exercise;

public class Exercise03 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 100; i *= 3) {
			sum += i;
		}
		System.out.println(sum);
	}
}

// for (int i = 1; i <= 100; i++) {
//		if (i % 3 == 0) {
//			...
//		}