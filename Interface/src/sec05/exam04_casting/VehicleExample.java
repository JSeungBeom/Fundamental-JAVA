package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		// Bus ��ü�� Vehicle �������̽� Ÿ������ up-casting
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		// vehicle.checkFare(); // �������̽� Ÿ���� Bus ��ü�� bus�� �޼ҵ忡 ������ �Ұ�
		
		Bus bus = (Bus) vehicle; // �������̽� Ÿ���� bus ��ü�� down-casting(����Ÿ�Ժ�ȯ)
		
		bus.run();
		bus.checkFare(); // ���� �� ��ȯ ���� ���� �޼ҵ忡 ���� ����
	}

}
