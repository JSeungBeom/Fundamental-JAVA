package sec07.exam05_method_polymorphism;

// Vehicle Ŭ������ ��� �޴� Bus Ŭ����
public class Bus extends Vehicle {
	@Override // Vehicle�� run() �޼ҵ带 �������̵�
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
}
