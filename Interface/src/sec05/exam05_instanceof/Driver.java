package sec05.exam05_instanceof;

public class Driver {
	public void drive(Vehicle vehicle) {
		// vehicle이 Bus 객체를 참조하고 있는지 확인하는 instanceof 키워드'
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle; // Bus 객체를 참조하고 있다면 강제 타입 변환
			bus.checkFare(); // 강제 타입 변환 후, bus의 메소드 실행
		}
		vehicle.run();
	}
}
