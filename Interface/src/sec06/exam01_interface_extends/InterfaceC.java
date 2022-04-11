package sec06.exam01_interface_extends;

// 인터페이스 간의 상속 public interface 하위 인터페이스 extends 상위 인터페이스들
public interface InterfaceC extends InterfaceA, InterfaceB{
	public void methodC();
}
