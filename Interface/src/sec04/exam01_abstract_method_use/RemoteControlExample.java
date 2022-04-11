package sec04.exam01_abstract_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;
		
		// Television 클래스에서 재정의된 메소드가 실행
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		// Audio 클래스에서 재정의된 메소드가 실행
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}

}
