package chap04.book.exercise;

public class Exercise061 {
	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (i+1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// *****
		// ****
		// ***
		// **
		// *
		
		for (int a = 1; a <= 6; a++) {
			for (int b = 6; b >= a; b--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// *****
		//  ****
		//   ***
		//    **
		//     *
		
		for(int c = 1; c <= 5; c++) {

		    // 공백 for문
		    for(int d = 1; d < c; d++) {
		        System.out.print(" ");
		    }
		    
		    // 별 for문
		    for(int e = 5; e >= c; e--) {
		        System.out.print("*");
		    }
		    
		    System.out.println("");
		}
		System.out.println();
		
		
		//     *
		//    **
		//   ***
		//  ****
		// *****
		
		for (int f = 0; f < 5; f++) {
			// 공백 for문
			for (int j = 0; j < (4 - f); j++) {
				System.out.print(" ");
			}
			// 별 for문
			for (int k = 0; k < (f + 1); k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}