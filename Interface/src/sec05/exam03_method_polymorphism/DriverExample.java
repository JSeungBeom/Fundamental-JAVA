package sec05.exam03_method_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); // �������̽� Ÿ���� bus ��ü�� �Ű� ������ �Ѱ�����
		driver.drive(taxi); // �������̽� Ÿ���� taxi ��ü�� �Ű� ������ �Ѱ�����
	}

}
