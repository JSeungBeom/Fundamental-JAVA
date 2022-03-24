package sec06.exam01_field_declaration;

public class CarExample {

	public static void main(String[] args) {
			Car myCar = new Car(); // default 생성자를 갖는 Car 클래스의 myCar 객체 생성
			
			System.out.println("제작회사 : " + myCar.company);
			System.out.println("모델명 : " + myCar.model);
			System.out.println("색깔 : " + myCar.color);
			System.out.println("최고속도 : " + myCar.maxSpeed);
			System.out.println("현재속도 : " + myCar.speed);
			// Car 클래스에 접근하여, 필드 값들을 읽는다
			
			myCar.speed = 60; // 필드 값을 변경
			System.out.println("수정된 속도 : " + myCar.speed);
	}

}
