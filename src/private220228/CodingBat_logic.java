package private220228;

public class CodingBat_logic {

		// cigarParty
		public boolean cigarParty(int cigars, boolean isWeekend) {
			 
			 if (isWeekend) {
			   return cigars >= 40;
			 } else {
			   return cigars >= 40 && cigars <= 60;
			 }
			  
			}
		
		// dateFashion
		public int dateFashion(int you, int date) {
			  

			  if (you <= 2 || date <= 2) {
			    return 0;
			    
			  } else if(you >= 8 || date >= 8) {
			    return 2;
			  }
			  else {
			    return 1;
			  }
			}
		
		// squirrelPlay
		public boolean squirrelPlay(int temp, boolean isSummer) {
			  if (!isSummer && temp >= 60 && temp <= 90) {
			    return true;
			  } else if (isSummer && temp >= 60 && temp <=100) {
			    return true;
			  }
			  return false;
			}
		
		// caughtSpeeding
		public int caughtSpeeding(int speed, boolean isBirthday) {
			  
			  if((isBirthday&&speed<=65)||speed<=60){
			    return 0;
			    
			  } else if((isBirthday&&speed>=66&&speed<=85)||(speed>=61&&speed<=80)){
			    return 1;
			    
			  } else {
			    return 2;
			  }
			}
		
		// sortaSum
		public int sortaSum(int a, int b) {
			  if ((a + b) >= 10 && (a + b) <= 19) {
			    return 20;
			  } else {
			    return a + b;
			  }
			}
		
		// alarmClock (1)
		public String alarmClock(int day, boolean vacation) {
			  
			  if(day<=5&& day!=0 && !vacation ){
			  return "7:00";
			  
			  } else if((day==6 || day==0) && vacation){
			  return "off";
			  
			  } else{
			  return "10:00";
			  
			  }
			}
		
		// alarmClock (2)
		public String alarmClock(int day, boolean vacation) {
			String early;
			String late;

			if (vacation) {
				early = "10:00";
				late = "off";
			} else {
				early = "7:00";
				late = "10:00";
			}

			String result = "";
			switch (day) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				result = early;
				break;
			case 0:
			case 6:
				result = late;
			}

			return result;
		}
		
		// love6
		public boolean love6(int a, int b) {
			  
			  int sum = a + b;
			  int diff = (int)(Math.abs(a - b));
			  
			  if (a == 6 || b == 6 || sum == 6 || diff == 6) {
			    return true;
			  } else {
			    return false;
			  }
			}
		
		// in1To10 (1)
		public boolean in1To10(int n, boolean outsideMode) {
			  if ((n >= 1 && n <= 10) && !outsideMode) {
			    return true;
			  } else if ((n <= 1 || n >= 10) && outsideMode) {
			    return true;
			  } else {
			    return false;
			  }
			}
		// in1To10 (2)
		public boolean in1To10(int n, boolean outsideMode) {
			  if((n >= 1 && n <= 10) && !outsideMode){
			    return true;
			  } else if((n <= 1 || n >= 10) && outsideMode){
			    return true;
			  } else{
			    return false;
			  }
			  
			}
		
		// specialEleven
		public boolean specialEleven(int n) {
			  if (n % 11 == 0) {
			    return true;
			  } else if (n % 11 == 1) {
			    return true;
			  } else {
			    return false;
			  }
			}
		
		// more20 (1)
		public boolean more20(int n) {
			  return ((n - 1) % 20 == 0 || (n - 2) % 20 == 0);
			}
		
		// more20 (2)
		public boolean more20(int n) {
		int i = n % 3;
		  int j = n % 5;
		  if (i == 0 && j == 0){
		    return false;
		  } else if (i == 0 || j == 0){
		    return true;
		  } else {
		    return false;
		  }

		  // less20(1)
		  public boolean less20(int n) {
			  return (n + 1) % 20 == 0 || (n + 2) % 20 == 0;
		  	}
		  
		  // less20(2)
		  public boolean less20(int n) {
			  int i = (n + 1) % 20;
			  int j = (n + 2) % 20;
			  
			  if (i == 0 || j == 0) {
			    return true;
			  } else {
			    return false;
			  }
			}

	}
}
