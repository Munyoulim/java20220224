package private220224;

public class Star {
	public static void main(String[] args) {
		String pyramid = " ";
		
		for (int i = 0; i < 7; i++) {
			for (int j = 6; j > i; j--) {
				pyramid += " ";
				
			}
			
			for (int k = 0; k < 2 * i - 1; k++) {
				pyramid += "*";
				
			}
			
			pyramid += "\n";
			
		}
	}
}
