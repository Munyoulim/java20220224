package Private;

public class Exam220315 {
	public static void main(String[] args) {
	int[] a = new int[2];
	int[] b = a;
	
	a[0] = 7;
	a[1] = 3;
	System.out.println(b[0] + b[1]);
	}
}
