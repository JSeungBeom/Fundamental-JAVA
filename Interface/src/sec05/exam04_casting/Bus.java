package sec05.exam04_casting;

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
