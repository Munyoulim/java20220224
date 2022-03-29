package chap13.book.exercise.p02;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String> container1 = new Container<String>();
		container1.setContent("홍길동");
		String str = container1.getContent();
		
		Container<Integer> container2 = new Container<Integer>();
		container2.setContent(6);
		int value = container2.getContent();
	}
}

class Container<T> {
	private T content;
	
	public T getContent() {
		return content;
	}
	
	public void setContent(T content) {
		this.content = content;
	}
}
