package sec07.exam05_method_polymorphism;

// Vehicle Ŭ������ ��ӹ޴� Taxi Ŭ����
public class Taxi extends Vehicle {
	@Override // Vehicle�� run() �޼ҵ带 �������̵�
	public void run() {
		System.out.println("�ýð� �޸��ϴ�.");
	}
}
