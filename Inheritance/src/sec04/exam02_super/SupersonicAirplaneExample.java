package sec04.exam02_super;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		// ��ü ����
		SupersonicAirplane sa = new SupersonicAirplane();
		// Airplane�� �޼ҵ�
		sa.takeOff();
		// SupersonicAirplane���� �����ǵ� �޼ҵ� ȣ��
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
