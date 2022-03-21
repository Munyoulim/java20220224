package chap09.book.s090303;

public class Outter {
	// 자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
//		arg = 100;
//		localVariable = 100;
		
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	// 자바 8 이후
	// 로컬클래스 내에서 사용된 매개변수와 로컬변수는 모두 final 특성을 가지고 있다.
	public void method2(int arg) {
		int localVariable = 1; // final 특성을 가지고 있음 (생략해도)
//		arg = 100;
//		localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
