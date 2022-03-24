package sec07.exam01_constructor_declaration;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("검정", 3000);
		// Car 클래스의 myCar 객체를 생성하며, 생성자의 parameter 초기화
		// Car myCar = new Car()과 같은 객체 생성은 불가능
	}
}
