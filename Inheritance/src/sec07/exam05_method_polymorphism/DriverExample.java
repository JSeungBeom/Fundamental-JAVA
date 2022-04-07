package sec07.exam05_method_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver(); // Driver 객체 생성
		
		Bus bus = new Bus(); // Bus 객체 생성
		Taxi taxi = new Taxi(); // Taxi 객체 생성
		
		driver.drive(bus); // Bus 클래스에서 overriding된 run() 메소드 호출
		driver.drive(taxi); // Taxi 클래스에서 overriding된 run() 메소드 호출
	}

}
