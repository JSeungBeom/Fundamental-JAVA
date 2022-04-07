package sec07.exam05_method_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver(); // Driver ��ü ����
		
		Bus bus = new Bus(); // Bus ��ü ����
		Taxi taxi = new Taxi(); // Taxi ��ü ����
		
		driver.drive(bus); // Bus Ŭ�������� overriding�� run() �޼ҵ� ȣ��
		driver.drive(taxi); // Taxi Ŭ�������� overriding�� run() �޼ҵ� ȣ��
	}

}
