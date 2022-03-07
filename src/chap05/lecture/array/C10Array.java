package chap05.lecture.array;

public class C10Array {
	public static void main(String[] args) {
		int[] a = {3, 4, 5, 7};
		int[] b = a; // 참조값 복사
		
		b[0] = 9;
		System.out.println(a[0]);
		
		// a에 영향을 안미치고 값 설정
		int[] c = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		c[0] = 30;
		System.out.println(a[0]);
		System.out.println(c[0]);
		
		int[][] d = {{3,21,3},{1,6,2}};
		int[][] e = new int[d.length][d[d.length-1].length];
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				e[i][j] = d[i][j];
			}
		}		
		e[0][1] = 50;
		System.out.println(d[0][1]);
		System.out.println(e[0][1]);
		System.out.println(d[0][1]==e[0][1]); // true
				
	}
}
