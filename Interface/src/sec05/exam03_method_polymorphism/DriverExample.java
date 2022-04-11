package sec05.exam03_method_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); // 인터페이스 타입의 bus 객체가 매개 변수로 넘겨진다
		driver.drive(taxi); // 인터페이스 타입의 taxi 객체가 매개 변수로 넘겨진다
	}

}
