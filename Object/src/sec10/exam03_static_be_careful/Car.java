package sec10.exam03_static_be_careful;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		// speed = 60;
		// run(); main은 static 메소드이기 때문에, 인스턴스 멤버를 바로 사용할 수 없음
		
		Car myCar = new Car(); // 메인 내에 객체 생성 후, 인스턴스 멤버 사용
		myCar.speed = 60;
		myCar.run();
	}
}
