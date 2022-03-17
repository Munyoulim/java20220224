package chap08.book.s080302;

import chap08.book.s080205.*;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {}
			public void turnOff() {}
			public void setVolume(int volume) {}
		};
	}
}
