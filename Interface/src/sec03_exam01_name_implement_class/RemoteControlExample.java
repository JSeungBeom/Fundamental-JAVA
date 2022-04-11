package sec03_exam01_name_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television(); // 인터페이스 RemoteControl 타입의 Television 객체 생성, 재정의 된 메소드 사용
		rc = new Audio(); // 인터페이스 RemoteControl 타입의 Audio 객체 생성, 재정의 된 메소드 사용
	}

}
