package sec05.exam02_field_array;

public class Car {
	// 인터페이스 타입의 배열로 객체들을 관리
	Tire tires[] = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};

	void run() {
		// 인터페이스 타입의 배열 객체들의 메소드 실행
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
