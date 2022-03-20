package chap09.book.exercise.p05;

public class Anonymous {
	Vehicle field = new Vehicle() {

		@Override
		public void run() {
			System.out.println("11111");
		}
	};
			
	void method1() {
		Vehicle localVar = new Vehicle() {

			@Override
			public void run() {
				System.out.println("22222");
			}
			
		};
		
		localVar.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}
}
