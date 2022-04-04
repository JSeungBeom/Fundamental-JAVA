package sec04.exam02_super;

// Airplane을 부모 클래스로 상속 받는 자식 클래스
public class SupersonicAirplane extends Airplane {
	// 필드
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2; // static final 타입의 상수 필드
	
	public int flyMode = NORMAL;
	
	@Override // 부모 클래스로부터 재정의(Override)되는 메소드
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		}
		else {
			// Airplane(부모 클래스) 객체의 fly() 메소드 호출 super.method()
			super.fly();
		}
	}
}
