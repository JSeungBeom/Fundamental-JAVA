package sec03_exam02_noname_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// 익명 구현 객체, 이름 없는 구현 클래스를 선언과 동시에 객체 생성
		// 인터페이스의 추상 메소드들을 모두 재정의하여야 히고, 추가적으로 필드와 메소드 선언 가능하나 익명 객체 안에서만 사용 가능
		// 추가 선언된 필드와 메소드는 인터페이스 변수로 접근이 불가
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {
				/*실행문*/
			}
			public void turnOff() {
				/*실행문*/
			}
			public void setVolume(int volume) {
				/*실행문*/
			}
		};
	}

}
