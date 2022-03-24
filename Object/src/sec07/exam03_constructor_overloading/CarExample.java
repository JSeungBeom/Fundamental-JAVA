package sec07.exam03_constructor_overloading;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용"); // model 필드 초기화
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		
		Car car3 = new Car("자가용", "빨강"); // model, color 필드 초기화
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		
		Car car4 = new Car("택시", "검정", 200); // model, color, maxSpeed 필드 초기화
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		// 생성자의 parameter에 따라 오버로딩된 생성자 중, 어떤 생성자가 호출될지 결정
		
	}	
}
