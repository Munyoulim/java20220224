package private220303;

public class Array01 {
	public static void main(String[] args) {
		int[] arr1 = { 3, 9, 7, 1, 2, 0 };
		
		// for문 사용
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		// 각 값을 두배로
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] *= 2;
			System.out.println(arr1[i]);
		}
		
		String[] arr2 = {"a", "b", "c", "d", "e"};
        // 순서대로 출력
        // 반대로 출력
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		for (int i = arr2.length-1; i >= 0; i--) {
			System.out.println(arr2[i]);
		}

         String[] arr3 = {"hello", "bye", "home", "academy"};
        // 반대로 출력 academy / home / bye / hello
         for (int i = arr3.length-1; i >= 0; i--) {
        	 System.out.println(arr3[i]);
         }

        
         int[] arr4 = {3, 7, 2, 1, 0, 99, 2};
        // 코드 작성 : 모든 값을 더해 출력
         int sum = 0;
         for (int i = 0; i < arr4.length; i++) {
        	 sum += arr4[i];
         }
         System.out.println(sum);

        
	}
}
