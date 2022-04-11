package sec03.exam03_multi_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		// RemoteControl 타입의 SmartTelevision 객체 선언
		// RemoteControl 인터페이스 내의 메소드만 사용이 가능
		RemoteControl rc = tv; 
		// Searchable 타입의 SmartTelevision 객체 선언
		// Searchable 인터페이스 내의 메소드만 사용이 가능
		Searchable searchable = tv;
		rc.turnOn();
		searchable.search("youtube");
		rc.turnOff();
	}

}
