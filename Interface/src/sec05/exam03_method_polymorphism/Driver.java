package sec05.exam03_method_polymorphism;

public class Driver {
	// 매개변수의 타입이 인터페이스인 경우, vehicle의 객체에 따라 메소드 실행 결과가 달라짐
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}
