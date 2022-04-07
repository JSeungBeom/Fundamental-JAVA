package sec08.exam01_abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone(); 추상 클래스 Phone의 객체를 생성할 수 없다.
		
		SmartPhone smartPhone = new SmartPhone("홍길동"); // SmartPhone 클래스의 객체 생성
		
		smartPhone.turnOn(); // 슈퍼 클래스의 메소드 호출
		smartPhone.internetSearch(); // SmartPhone 클래스의 메소드 호출
		smartPhone.turnOff();
	}

}
