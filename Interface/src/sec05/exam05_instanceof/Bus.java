package sec05.exam05_instanceof;

public class Bus implements Vehicle {
	// �߻� �޼ҵ��� ��ü �޼ҵ�
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
	
	// Bus�� �޼ҵ�
	public void checkFare() {
		System.out.println("��������� üũ�մϴ�.");
	}
}
