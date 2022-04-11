package sec06.exam01_interface_extends;

public class ImplementationC implements InterfaceC{
	// 하위 인터페이스의 구현 클래스는, 하위 인터페이스의 모든 상위 인터페이스들의 추상 메소드를 구현해야 한다.
	// InterfaceA의 추상 메소드의 실체 메소드
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");
	}
	
	// InterfaceB의 추상 메소드의 실체 메소드
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");
	}
	
	// InterfaceC의 추상 메소드의 실체 메소드
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
	}

}
