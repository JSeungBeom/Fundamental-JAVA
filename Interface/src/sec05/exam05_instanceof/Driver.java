package sec05.exam05_instanceof;

public class Driver {
	public void drive(Vehicle vehicle) {
		// vehicle�� Bus ��ü�� �����ϰ� �ִ��� Ȯ���ϴ� instanceof Ű����'
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle; // Bus ��ü�� �����ϰ� �ִٸ� ���� Ÿ�� ��ȯ
			bus.checkFare(); // ���� Ÿ�� ��ȯ ��, bus�� �޼ҵ� ����
		}
		vehicle.run();
	}
}
