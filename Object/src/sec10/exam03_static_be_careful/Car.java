package sec10.exam03_static_be_careful;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		// speed = 60;
		// run(); main�� static �޼ҵ��̱� ������, �ν��Ͻ� ����� �ٷ� ����� �� ����
		
		Car myCar = new Car(); // ���� ���� ��ü ���� ��, �ν��Ͻ� ��� ���
		myCar.speed = 60;
		myCar.run();
	}
}
