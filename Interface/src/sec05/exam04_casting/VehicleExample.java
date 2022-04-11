package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		// Bus 객체를 Vehicle 인터페이스 타입으로 up-casting
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		// vehicle.checkFare(); // 인터페이스 타입의 Bus 객체는 bus의 메소드에 접근이 불가
		
		Bus bus = (Bus) vehicle; // 인터페이스 타입의 bus 객체를 down-casting(강제타입변환)
		
		bus.run();
		bus.checkFare(); // 강제 형 변환 이후 구현 메소드에 접근 가능
	}

}
