package chap05.book;

public class C11AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };
		
		int sum = 0;
		for (int item : scores) {
			sum += item;
		}
		System.out.println("점수 총합 = " + sum);
		
		float avg = (float)sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	}
}
