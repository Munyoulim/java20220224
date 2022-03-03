package private220303;

public class ArrayMaxMinExample {
	public static void main(String[] args) {
		
		int[] arr1 = { 3, 9, 7, 1, 2, 0 };
		
		int max = arr1[0];
		int min = arr1[0];
		
		for (int i = 1; i < arr1.length; i++) {
			if (arr1[i] > max) {
				max = arr1[i];
			} else if (arr1[i] < min) {
				min = arr1[i];
			}
		}
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);
	}
}
