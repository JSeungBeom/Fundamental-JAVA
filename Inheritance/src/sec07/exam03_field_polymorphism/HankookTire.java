package sec07.exam03_field_polymorphism;

public class HankookTire extends Tire {
	// �ʵ�
	// ������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation); // Tire Ŭ������ �Ļ��� ȣ��
	}
	
	//�޼ҵ�
	@Override // Tire Ŭ������ roll() �޼ҵ带 ������
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		}
		else {
			System.out.println("*** " + location + " HankookTire ��ũ ***");
			return false;
		}
	}
}
