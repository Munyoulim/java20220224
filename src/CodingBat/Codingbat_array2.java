package CodingBat;

public class Codingbat_array2 {
	public static void main(String[] args) {
		
		// sum67
		public int sum67(int[] nums) {
			 int sum = 0;
			 
			 int i = 0;
			 
			 while (i < nums.length) {
			   
			   if (nums[i] == 6) {
			     while (nums[i] != 7) {
			       i++;
			     }
			   } else {
			     sum += nums[i];
			   }
			   i++;
			 }
			 return sum;
			}
		
		// lucky13
		public boolean lucky13(int[] nums) {
			  
			  boolean found = false;
			  
			  for (int i = 0; i < nums.length; i++) {
			    if (nums[i] == 1 || nums[i] == 3) {
			      return found;
			    }
			  }
			  return found = true;
			}
		
		// sum28
		public boolean sum28(int[] nums) {
			  
			  boolean found = true;
			  int sum = 0;
			  
			  for (int i = 0; i < nums.length; i++) {
			    if (nums[i] == 2) {
			      sum +=2;
			    }
			    if (sum == 8) {
			      return found;
			    }
			  }
			  return false;
			}
		
		// has22 (1) 
		public boolean has22(int[] nums) {


			 boolean found = false;
			 
			  for (int i = 0; i < nums.length; i++) {
			      if (nums[i] == 2 && i > 0 && nums[i-1] == 2) {
			      found = true;
			        }
			      
			}
			  return found;
			}
	}
}
