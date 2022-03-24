package sec07.exam04_other_contructor_call;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용"); // model 필드 초기화, this() 메소드로 color는 null, maxSpeed는 0으로 초기화
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		
		Car car3 = new Car("자가용", "빨강"); // model, color 필드 초기화, this() 메소드로 maxSpeed는 0으로 초기화
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		
		Car car4 = new Car("택시", "검정", 200); // model, color, maxSpeed 필드 초기화
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
	}
}
