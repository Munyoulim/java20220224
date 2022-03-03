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
		
		// nearHundred (1)
		public boolean nearHundred(int n) {
			  return (n >= 90 && n <= 110) || (n >= 190 && n <= 210);
			}
		
		// nearHundred (2)
		public boolean nearHundred(int n) {
			  return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
			}
		
		// posNeg (1)
		public boolean posNeg(int a, int b, boolean negative) {
			  if (negative) {
			    return (a < 0 && b <0);
			  } else {
			    return ((a > 0 && b < 0) || (a < 0 && b > 0));
			  }
			}
		
		// notString
		public String notString(String str) {

			String front = "";

			if (str.length() >= 3) {
				front = str.substring(0, 3);
			}

			if (front.equals("not")) {
				return str;
			} else {
				return "not" + str;
			}

		}
		
}
