package sec06.exam01_interface_extends;

public class Example {

	public static void main(String[] args) {
		ImplementationC imp1 = new ImplementationC();
		
		// interfaceA에 있는 메소드만 실행 가능
		InterfaceA ia = imp1;
		ia.methodA();
		System.out.println();
		
		// interfaceB에 있는 메소드만 실행 가능
		InterfaceB ib = imp1;
		ib.methodB();
		System.out.println();
		
		// 모든 상속받은 인터페이스의 메소드를 실행 가능
		InterfaceC ic = imp1;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
