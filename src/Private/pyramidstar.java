package Private;

public class pyramidstar {
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
		
		for(int i = 0; i < 9; i++){
		    for(int k = -1; k < i ; k++){
		        pyramid += " ";
		    	
		    }
		    
		    for(int j = 8; j > 2 * i - 1; j--){
		        pyramid += "*";
		    	
		    }
		    
		    pyramid += "\n";
		    
		} System.out.println(pyramid);
	}
}




