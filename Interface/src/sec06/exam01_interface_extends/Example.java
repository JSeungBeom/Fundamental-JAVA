package sec06.exam01_interface_extends;

public class Example {

	public static void main(String[] args) {
		ImplementationC imp1 = new ImplementationC();
		
		// interfaceA�� �ִ� �޼ҵ常 ���� ����
		InterfaceA ia = imp1;
		ia.methodA();
		System.out.println();
		
		// interfaceB�� �ִ� �޼ҵ常 ���� ����
		InterfaceB ib = imp1;
		ib.methodB();
		System.out.println();
		
		// ��� ��ӹ��� �������̽��� �޼ҵ带 ���� ����
		InterfaceC ic = imp1;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
