package sec04.exam01_overriding;

// Calculator를 상속받는 Computer 클래스
public class Computer extends Calculator {
	// 메소드
	@Override // Override annotation : 컴파일러에게 부모 클래스의 메소드 선언부와 동일한 지 검사
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
