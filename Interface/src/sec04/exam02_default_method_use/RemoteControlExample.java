package sec04.exam02_default_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		// 인터페이스의 default 메소드가 실행
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		// Audio 클래스에서 재정의한 메소드가 실행
		rc.setMute(true);
	}

}
