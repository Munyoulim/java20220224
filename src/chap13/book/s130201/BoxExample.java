package chap13.book.s130201;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		String name = (String) box.get();
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();
		
		// 이렇게 Object 타입을 사용하면 모든 종류의 자바 객체를 저장할 수 있다는 장점은 있지만
		// 저장할때 타입 변환이 필요하고,
		// 읽어올때도 타입 변환이 필요하기 때문에
		// 이러한 타입 변환이 빈번해지면
		// 전체 프로그램 성능에 좋지 못한 결과를 가져올 수 있다.
		
		// 그렇다면 모든 종류의 객체를 저장하면서 타입 변환이 발생하지 않는 방법은 없을까?
		// 해결책은 제네릭에 있다.
	}
}
