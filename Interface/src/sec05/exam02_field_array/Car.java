package sec05.exam02_field_array;

public class Car {
	// �������̽� Ÿ���� �迭�� ��ü���� ����
	Tire tires[] = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};

	void run() {
		// �������̽� Ÿ���� �迭 ��ü���� �޼ҵ� ����
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
