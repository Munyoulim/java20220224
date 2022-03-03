package chap04.lecture.forloop;

public class C05NestedFor {
	public static void main(String[] args) {
		
		for (int j = 0; j < 5; j++) {
			
			for (int i = 0; i < 3; i++) {
				System.out.println(i);
			}
		}
		
		//
		System.out.println("연습2");
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 5; j++) {
				System.out.println(i + ", " + j);
			}
		}
	}
}
	
	 
		
// 중첩 for문이라는게, 바깥쪽 for문이 첫번째 값이 만족이 되면 중첩 for문 조건이 실행이 되는데
// 그 조건이 실행이 되고나서 다시 또 바깥쪽 for문의 두번째 값 만족 -> 또다시 중첩 for문 조건 실행

