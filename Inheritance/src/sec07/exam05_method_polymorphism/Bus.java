package sec07.exam05_method_polymorphism;

// Vehicle 클래스를 상속 받는 Bus 클래스
public class Bus extends Vehicle {
	@Override // Vehicle의 run() 메소드를 오버라이딩
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}
