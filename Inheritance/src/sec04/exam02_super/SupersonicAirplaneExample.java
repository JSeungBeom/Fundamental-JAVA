package sec04.exam02_super;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		// 객체 생성
		SupersonicAirplane sa = new SupersonicAirplane();
		// Airplane의 메소드
		sa.takeOff();
		// SupersonicAirplane에서 재정의된 메소드 호출
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
