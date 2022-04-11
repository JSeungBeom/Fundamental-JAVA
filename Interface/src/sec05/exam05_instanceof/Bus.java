package sec05.exam05_instanceof;

public class Bus implements Vehicle {
	// 추상 메소드의 실체 메소드
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	// Bus의 메소드
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}
