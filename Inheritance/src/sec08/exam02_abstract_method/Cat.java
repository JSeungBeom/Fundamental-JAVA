package sec08.exam02_abstract_method;

public class Cat extends Animal {
	// 생성자
	public Cat() {
		this.kind = "포유류";
	}
	
	// abstract 메소드인 sound()를 자식 클래스에서 재정의하여 사용
	// abstract 클래스의 자식 클래스 객체를 생성하기 위해서는 반드시 abstract 메소드를 정의해야 한다.
	// abstract 메소드를 재정의 하지 않을 경우, 자식 클래스 또한 abstract 클래스이어야 한다.
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
