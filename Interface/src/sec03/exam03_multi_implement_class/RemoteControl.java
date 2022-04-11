package sec03.exam03_multi_implement_class;

public interface RemoteControl {
	// 상수 필드, 컴파일 과정에서 public static final 키워드가 자동으로 추가
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 10;
	
	// 추상 메소드, 컴파일 과정에서 public abstract 키워드가 자동으로 추가
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 디폴트 메소드, 실행 블록을 포함하고 있으며 재정의하지 않더라도 사용이 가능
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}
		else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// 정적 메소드, 인터페이스 자체에서 실행이 가능한 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
}
