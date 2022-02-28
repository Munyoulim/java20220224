package chap03.lecture.method;

public class C03Method {
	public static void main(String[] args) {
		myMethod1(300); // interger 타입밖에 안됨
		myMethod1(900);
//		myMethod1(3.14); // 안됨
		myMethod1('가'); // char 타입은 자동형변환이 되서 가능
		
		int j = 999;
		myMethod1(j);
	}
	
	public static void myMethod1(int i) {
		System.out.println(i);
	}
}
