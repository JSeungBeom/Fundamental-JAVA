package sec05.exam02_field_array;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		// tires[]�� ��ҵ��� �ٸ� ��ü�� ����
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		
		myCar.run();
	}

}
