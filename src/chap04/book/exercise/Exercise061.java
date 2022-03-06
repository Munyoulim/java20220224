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
		
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
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
		
		for(int i = 1; i <= 5; i++) {

		    // 공백 for문
		    for(int j = 1; j < i; j++) {
		        System.out.print(" ");
		    }
		    
		    // 별 for문
		    for(int k = 5; k >= i; k--) {
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
		
		for (int i = 0; i < 5; i++) {
			// 공백 for문
			for (int j = 0; j < (4 - i); j++) {
				System.out.print(" ");
			}
			// 별 for문
			for (int k = 0; k < (i + 1); k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}