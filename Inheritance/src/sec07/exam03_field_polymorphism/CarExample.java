package sec07.exam03_field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car(); // Car 객체 생성
		
		for(int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			//  다형성을 이용하여, 타이어의 수명이 다하면 Tire 클래스를 상속 받는 타이어들로 필드를 Up-casting 
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞으론쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("------------------------------------");
		}
	}

}

