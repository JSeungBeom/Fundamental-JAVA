package sec07.exam03_field_polymorphism;

public class HankookTire extends Tire {
	// 필드
	// 생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation); // Tire 클래스의 셍생자 호출
	}
	
	//메소드
	@Override // Tire 클래스의 roll() 메소드를 재정의
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		}
		else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}
}
