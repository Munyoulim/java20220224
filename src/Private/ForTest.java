package Private;

public class ForTest {
	public static void main(String[] args) {
		String str = "abc.xyzxyz";
		int len = str.length();
//		System.out.println(len);
		for (int i = 0; i < len; i++) {
//			str.substring(i, i+3);
			
			System.out.println(i + ", " + (i+3));
			
		}
	}
}
