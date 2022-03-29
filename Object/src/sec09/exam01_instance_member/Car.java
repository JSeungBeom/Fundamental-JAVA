package sec09.exam01_instance_member;

public class Car {
	String model;
	int speed;
	// 필드
	
	Car(String model){
		this.model = model;
	} // this로 필드의 model과 parameter model을 구분
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
		}
	}
	// 메소드
}
