package private220228;

public class CodingBat_warmup {
		
	
		// sleepIn
		public boolean sleepIn(boolean weekday, boolean vacation) {
		  return !weekday || vacation;
		}
		
		// monkeyTrouble
		public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
			  
			  return !(aSmile ^ bSmile);
			}
		
		// sumDouble
		public int sumDouble(int a, int b) {
			  int sum = a + b;
			  
			  return (a == b) ? sum *2 : sum;
			}

		// diff21
		public int diff21(int n) {
			  int result = 21 - n;
			  
			  if (n > 21) {
			    result = -result * 2;
			  }
			  return result;
			}
		
		// parrotTrouble
		public boolean parrotTrouble(boolean talking, int hour) {
			  return (talking && (hour < 7 || hour > 20));
			}
		
		// makes10
		public boolean makes10(int a, int b) {
			 return  a == 10 || b == 10 || a + b == 10;
			}

		
}
