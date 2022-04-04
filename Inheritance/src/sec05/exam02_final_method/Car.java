package sec05.exam02_final_method;

public class Car {
	// 필드
	public int speed;
	
	// 메소드
	public void speedUp() {
		speed += 1;
	}
	
	// final 메소드, 자식 클래스에서 재정의 할 수 없는 메소드
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
} 
/*
final 필드 : 수정 불가 필드
final 클래스 : 부모로 사용 불가한 클래스
final 메소드 : 자식이 재정의할 수 없는 메소드
*/