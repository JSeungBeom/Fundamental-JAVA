package sec06.exam01_interface_extends;

public class ImplementationC implements InterfaceC{
	// ���� �������̽��� ���� Ŭ������, ���� �������̽��� ��� ���� �������̽����� �߻� �޼ҵ带 �����ؾ� �Ѵ�.
	// InterfaceA�� �߻� �޼ҵ��� ��ü �޼ҵ�
	public void methodA() {
		System.out.println("ImplementationC-methodA() ����");
	}
	
	// InterfaceB�� �߻� �޼ҵ��� ��ü �޼ҵ�
	public void methodB() {
		System.out.println("ImplementationC-methodB() ����");
	}
	
	// InterfaceC�� �߻� �޼ҵ��� ��ü �޼ҵ�
	public void methodC() {
		System.out.println("ImplementationC-methodC() ����");
	}

}
