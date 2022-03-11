package Private;

public class Star {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {

		    // 공백 j for문
		    for (int j = 9; j > i; j--) {
		        System.out.print(" ");
		    }
		    // 별 j for문
		    for (int j = 1; j <= 2 * i - 1; j++) {
		        System.out.print("*");
		    }
		    // 공백 j for문
		    for (int j = 9; j > i; j--) {
		        System.out.print(" ");
		    }
		    
		    System.out.println("");
		    
		}
	}
}
